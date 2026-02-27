"""
prepare_dataset.py

Walk all .java Pega rule files in the parent directory, extract metadata,
generate Q&A pairs in Phi-3 chat format, and write data/pega_qa.jsonl.

Flags:
  --include-raw-files   Also add every .java file as a code-in-context
                        "study this file" example (code memorisation).
"""

import argparse
import re
import json
import pathlib
from datasets import Dataset

# ── Constants ─────────────────────────────────────────────────────────────────

SCRIPT_DIR = pathlib.Path(__file__).parent
REPO_ROOT = SCRIPT_DIR.parent
OUTPUT_DIR = SCRIPT_DIR / "data"
OUTPUT_FILE = OUTPUT_DIR / "pega_qa.jsonl"

SYSTEM_PROMPT = (
    "You are a Pega platform expert. You have deep knowledge of Pega rule types, "
    "rulesets, case types, flows, activities, and the Java source code that Pega "
    "generates for each rule. Answer questions clearly and accurately."
)

# Rule type → human-readable description
RULE_TYPE_DESCRIPTIONS = {
    "Rule_HTML_Section": "an HTML Section rule that defines a reusable UI panel/section displayed on a harness",
    "Rule_HTML_Harness": "an HTML Harness rule that defines a full-page UI layout (portal harness)",
    "Rule_Obj_Flow": "a Flow rule that defines the process/workflow for a case type — including stages, flow actions, and routing",
    "Rule_Obj_CaseType": "a Case Type rule that defines the structure, stages, and lifecycle of a Pega case/work object",
    "Rule_Obj_FlowAction": "a Flow Action rule that defines a user-facing step/form within a flow (what fields are shown and submitted)",
    "Rule_Obj_Activity": "an Activity rule that defines server-side procedural logic (equivalent to a Java method or stored procedure)",
    "Rule_Obj_Model": "a Model rule (Data Transform or Decision rule) that sets default field values or makes decisions",
    "Rule_PortalSkin": "a Portal Skin rule that defines the visual styling/theme for a Pega portal",
    "Rule_Obj_Report_Definition": "a Report Definition rule that defines a report query for listing and filtering case data",
    "Rule_Declare_Index": "a Declare Index rule that defines a database index for fast property lookups",
    "sh_stream": "a compiled stream/HTML fragment used internally by Pega UI rendering",
    "ra_model": "a compiled model/activity rule used by the Pega rules engine",
}

# Namespace keywords → human-readable application name
NAMESPACE_MAP = {
    "LTM_Enrollment": "LTM Enrollment application",
    "LTM_Onboarding": "LTM Onboarding application",
    "LTM_BFS": "LTM BFS (Back-office Financial Services) application",
    "OOD4NM_Loan": "OOD4NM Loan application",
    "OLFHF9_Onboaring": "OLFHF9 Onboarding application",  # note: 'Onboaring' is intentional typo in source
    "OFON2J_ProcessO": "OFON2J ProcessO (Onboarding Process) application",
}

# ── Helpers ────────────────────────────────────────────────────────────────────


def detect_rule_type(filename: str) -> str:
    """Return the canonical rule-type prefix from the filename."""
    for prefix in [
        "Rule_HTML_Harness",
        "Rule_HTML_Section",
        "Rule_Obj_CaseType",
        "Rule_Obj_FlowAction",
        "Rule_Obj_Flow",
        "Rule_Obj_Activity",
        "Rule_Obj_Model",
        "Rule_PortalSkin",
        "Rule_Obj_Report_Definition",
        "Rule_Declare_Index",
        "sh_stream",
        "ra_model",
    ]:
        if filename.startswith(prefix):
            return prefix
    return "Unknown"


def detect_namespace(filename: str) -> str:
    """Return the application namespace token from the filename."""
    for ns in NAMESPACE_MAP:
        if ns in filename:
            return ns
    # Fallback: pull second/third segment from Rule_* filenames
    parts = filename.split("_")
    if len(parts) >= 4 and parts[0] == "Rule":
        return "_".join(parts[3:5])
    return "Unknown"


def extract_class_info(source: str):
    """
    Return (class_name, base_class) from the public class declaration.
    """
    m = re.search(
        r"public\s+class\s+(\w+)\s+extends\s+([\w.]+)",
        source,
    )
    if m:
        return m.group(1), m.group(2)
    return None, None


def extract_purpose(source: str) -> str | None:
    """
    Extract the purpose string from code like:
        purpose.equals("CREATECASE")
    or
        mRuleSet = "Loan";  (for CaseType, purpose comes from getPurpose / purpose param)
    """
    purposes = re.findall(r'purpose\.equals\("([^"]+)"\)', source)
    if purposes:
        return ", ".join(sorted(set(purposes)))
    m = re.search(r'mCaseTypeHandle\s*=\s*"([^"]+)"', source)
    if m:
        return None  # purpose inferred from rule type
    return None


def extract_ruleset_name(source: str) -> str | None:
    m = re.search(r'mRuleSet\s*=\s*"([^"]+)"', source)
    return m.group(1) if m else None


def meaningful_snippet(lines: list[str], max_lines: int = 80) -> str:
    """
    Skip boilerplate (package, copyright block, imports) and return
    up to max_lines of the substantive class body.
    """
    in_comment = False
    body_lines = []
    past_imports = False

    for line in lines:
        stripped = line.strip()
        if stripped.startswith("/*"):
            in_comment = True
        if in_comment:
            if "*/" in stripped:
                in_comment = False
            continue
        if stripped.startswith("//"):
            continue
        if stripped.startswith("package ") or stripped.startswith("import "):
            past_imports = True
            continue
        if past_imports or stripped.startswith("public class"):
            body_lines.append(line.rstrip())
            if len(body_lines) >= max_lines:
                break

    return "\n".join(body_lines)


# ── Q&A Generation ─────────────────────────────────────────────────────────────


def make_message(user_content: str, assistant_content: str) -> dict:
    return {
        "messages": [
            {"role": "system", "content": SYSTEM_PROMPT},
            {"role": "user", "content": user_content},
            {"role": "assistant", "content": assistant_content},
        ]
    }


def generate_qa_pairs(
    filename: str,
    rule_type: str,
    namespace: str,
    class_name: str | None,
    base_class: str | None,
    purpose_str: str | None,
    ruleset_name: str | None,
    snippet: str,
) -> list[dict]:
    pairs = []

    rt_desc = RULE_TYPE_DESCRIPTIONS.get(rule_type, f"a Pega rule of type {rule_type}")
    ns_label = NAMESPACE_MAP.get(namespace, namespace)
    base_label = base_class or "AbstractFUASupport (Pega internal base)"

    code_block = f"```java\n{snippet}\n```"

    # Derive work object from class name
    work_object = None
    if class_name:
        m = re.search(r"Work_(\w+?)_", class_name)
        if m:
            work_object = m.group(1)

    # Infer purpose text
    type_purpose_map = {
        "Rule_HTML_Section": "render a reusable UI section/panel that can be embedded in harnesses and other sections",
        "Rule_HTML_Harness": "render a full portal page layout, assembling sections into a complete screen",
        "Rule_Obj_Flow": "orchestrate the process steps, assignments, and routing for a case lifecycle",
        "Rule_Obj_FlowAction": "define the form layout and field data submitted at a single flow step",
        "Rule_Obj_Activity": "execute server-side procedural logic such as data retrieval, validation, or integration calls",
        "Rule_Obj_Model": "set default field values or run decision logic when a case is created or updated",
        "Rule_PortalSkin": "apply visual CSS-based styling/theming to a Pega operator portal",
        "Rule_Obj_Report_Definition": "define the columns, filters, and sorting for a case list report",
        "Rule_Declare_Index": "maintain a database index on a property for efficient rule resolution and reporting",
        "sh_stream": "provide a compiled HTML fragment rendered as part of the Pega UI rendering pipeline",
        "ra_model": "provide compiled model/activity bytecode executed by the Pega rules engine",
    }
    inferred_purpose = type_purpose_map.get(rule_type, f"implement {rt_desc} logic")

    # ── Q1: Rule type ──────────────────────────────────────────────────────────
    pairs.append(make_message(
        f"What type of Pega rule is this file and what does it do?\n\n{code_block}",
        f"This file is {rt_desc}. "
        f"It belongs to the **{ns_label}** ruleset"
        + (f" and handles the **{ruleset_name}** work object class." if ruleset_name else ".")
        + (f" The rule supports the following purposes: {purpose_str}." if purpose_str else ""),
    ))

    # ── Q2: Namespace ──────────────────────────────────────────────────────────
    pairs.append(make_message(
        f"Which Pega application namespace does this rule belong to?\n\n{code_block}",
        f"This rule belongs to the **{ns_label}** (namespace token: `{namespace}`). "
        f"Pega uses namespace prefixes to organise rules by application layer, "
        f"allowing rules to be inherited and overridden across the ruleset stack.",
    ))

    # ── Q3: Base class ─────────────────────────────────────────────────────────
    if base_class:
        pairs.append(make_message(
            f"What Java base class does this Pega rule extend and what does it provide?\n\n{code_block}",
            f"The generated class extends `{base_class}`. "
            + (
                "In Pega, `AbstractFUASupport` is the standard base for executable rules "
                "(Case Types, Flows, Activities). It provides the `tools` and `pega` API handles, "
                "clipboard access, parameter pages, and tracing infrastructure."
                if "AbstractFUASupport" in base_class
                else f"`{base_class}` provides the Pega rule execution framework for this rule type."
            ),
        ))

    # ── Q4: Purpose / function ─────────────────────────────────────────────────
    if purpose_str:
        pairs.append(make_message(
            f"What is the purpose of this Pega rule based on the source code?\n\n{code_block}",
            f"This Case Type rule handles the following purposes: **{purpose_str}**.\n"
            "In Pega, a Case Type rule branches on `pyCaseTypePurpose`:\n"
            "- `CREATECASE`: initialises a new case/work object\n"
            "- `GETSTARTINGFLOWS`: returns flows that can start the case\n"
            "- `ADHOCFLOWS`: returns ad-hoc flows available for the case\n"
            "- `GETFLOWCALLPARAMS`: retrieves parameters for flow invocation",
        ))
    else:
        pairs.append(make_message(
            f"What is the purpose or function of this Pega rule?\n\n{code_block}",
            f"This rule is designed to {inferred_purpose}. "
            f"As a `{rule_type}`, it is part of the **{ns_label}** application layer.",
        ))

    # ── Q5: Work object / case type ────────────────────────────────────────────
    if work_object:
        pairs.append(make_message(
            f"Which case type or work object does this Pega rule belong to?\n\n{code_block}",
            f"This rule is associated with the **{work_object}** work object class "
            f"in the **{ns_label}** application. "
            "In Pega, work objects are the primary entities users work on and rules are "
            "qualified by the class hierarchy they belong to.",
        ))

    # ── Q6: Summary ────────────────────────────────────────────────────────────
    summary_parts = [f"This is {rt_desc} in the **{ns_label}** Pega application."]
    if class_name:
        summary_parts.append(f"The generated Java class is `{class_name}`.")
    if base_class:
        summary_parts.append(f"It extends `{base_class}`.")
    if ruleset_name:
        summary_parts.append(f"The ruleset is **{ruleset_name}**.")
    if purpose_str:
        summary_parts.append(f"It handles the following purposes: {purpose_str}.")
    if work_object:
        summary_parts.append(f"It applies to the **{work_object}** work object class.")
    pairs.append(make_message(
        f"Summarize what this Pega rule file does.\n\n{code_block}",
        " ".join(summary_parts),
    ))

    # ── Q7: How to enhance / extend ────────────────────────────────────────────
    enhance_map = {
        "Rule_Obj_CaseType": (
            f"To enhance this Case Type rule in the **{ns_label}** application, you could:\n"
            "1. Add a new stage by defining a new `STAGE_*` purpose branch in the `perform()` method\n"
            "2. Add SLA/goal/deadline logic by handling the `GETDEADLINES` purpose\n"
            "3. Add optional flows by populating the `ADHOCFLOWS` list\n"
            "4. Add new flow call parameters in `GETFLOWCALLPARAMS`"
        ),
        "Rule_Obj_Flow": (
            f"To enhance this Flow rule in the **{ns_label}** application, you could:\n"
            "1. Add a new flow action step by inserting a new assignment/flow action connector\n"
            "2. Add a decision shape to conditionally route cases to different paths\n"
            "3. Add a subprocess call to reuse logic from another flow\n"
            "4. Add an SLA to the flow to enforce time-based routing"
        ),
        "Rule_HTML_Section": (
            f"To enhance this HTML Section rule in the **{ns_label}** application, you could:\n"
            "1. Add new UI fields by including additional property references\n"
            "2. Add conditional visibility using when rules on field/section visibility\n"
            "3. Add a repeating grid/table for list-type data\n"
            "4. Add client-side validation using Pega validate rules"
        ),
        "Rule_HTML_Harness": (
            f"To enhance this Harness rule in the **{ns_label}** application, you could:\n"
            "1. Add new sections by embedding additional Rule_HTML_Section references\n"
            "2. Add a navigation tab for multi-step harness layouts\n"
            "3. Add dynamic layouts that show/hide sections based on case status\n"
            "4. Add breadcrumb navigation for better UX"
        ),
        "Rule_Obj_Activity": (
            f"To enhance this Activity rule in the **{ns_label}** application, you could:\n"
            "1. Add error handling with try/catch blocks and `putMessages` for user feedback\n"
            "2. Add additional steps to call external REST/SOAP services\n"
            "3. Add clipboard page operations to manipulate case data\n"
            "4. Add commit/rollback logic for transactional data changes"
        ),
        "Rule_Obj_Report_Definition": (
            f"To enhance this Report Definition in the **{ns_label}** application, you could:\n"
            "1. Add additional columns to display more case properties\n"
            "2. Add filter conditions to narrow down results\n"
            "3. Add sorting by a date or status field\n"
            "4. Add aggregate functions (COUNT, SUM) for summary reports"
        ),
    }
    enhancement = enhance_map.get(rule_type,
        f"To enhance this `{rule_type}` rule in the **{ns_label}** application, consider:\n"
        "1. Reviewing the rule for opportunities to add error handling\n"
        "2. Adding logging for better traceability\n"
        "3. Refactoring repeated logic into shared utility rules\n"
        "4. Adding unit test cases to validate rule behaviour"
    )
    pairs.append(make_message(
        f"How would you enhance or extend this Pega rule?\n\n{code_block}",
        enhancement,
    ))

    # ── Q8: How to create a similar rule ──────────────────────────────────────
    create_map = {
        "Rule_Obj_CaseType": "To create a similar Case Type rule in Pega: open App Studio → Case Types → New, define stages and steps, configure starting flows, and set SLAs.",
        "Rule_Obj_Flow": "To create a similar Flow rule: open Dev Studio → Records → Process → Flow → New, draw shapes (assignments, decisions, subprocesses), connect with connectors, and save.",
        "Rule_HTML_Section": "To create a similar Section rule: open Dev Studio → Records → User Interface → Section → New, add fields using the UI designer or directly edit the HTML/XML.",
        "Rule_HTML_Harness": "To create a similar Harness rule: open Dev Studio → Records → User Interface → Harness → New, embed sections and configure the layout.",
        "Rule_Obj_Activity": "To create a similar Activity rule: open Dev Studio → Records → Technical → Activity → New, add steps selecting methods like Property-Set, Call, or Obj-Save.",
        "Rule_Obj_Report_Definition": "To create a similar Report Definition: open Dev Studio → Records → Intelligence → Report Definition → New, select the class, add columns and filters.",
        "Rule_PortalSkin": "To create a similar Portal Skin: open Dev Studio → Records → User Interface → Portal Skin → New, define CSS variables and upload theme assets.",
    }
    how_to_create = create_map.get(rule_type,
        f"To create a similar `{rule_type}` rule in Pega: open Dev Studio → Records, "
        f"navigate to the appropriate rule type category, click New, fill in the class "
        f"(`{work_object or 'Work-'}`) and ruleset (`{ruleset_name or namespace}`), and configure the rule."
    )
    pairs.append(make_message(
        f"How would you create a new rule similar to this one in Pega?\n\n{code_block}",
        how_to_create,
    ))

    # ── Q9: Filename explanation ───────────────────────────────────────────────
    pairs.append(make_message(
        f"Explain the naming convention of this Pega rule file: `{filename}`",
        f"Pega generates Java class files with names that encode the full rule key:\n"
        f"- **Rule type**: `{rule_type}` — indicates this is {rt_desc}\n"
        f"- **Namespace**: `{namespace}` — the application ruleset (`{ns_label}`)\n"
        + (f"- **Work object**: `{work_object}` — the case/work object class this rule applies to\n" if work_object else "")
        + f"- **Timestamp**: the suffix (e.g. `_20260221T064320_702_GMT`) is the rule version/checkin timestamp\n"
        f"- **Action/Stream suffix**: `_Action_` = the rule's action/execution form; `_Stream_` = the HTML stream form"
    ))

    # ── Q10: Relationship to other rules ──────────────────────────────────────
    relation_map = {
        "Rule_Obj_CaseType": (
            f"This Case Type rule in **{ns_label}** is the central orchestrator. It works with:\n"
            "- **Flow rules** (`Rule_Obj_Flow`) which it invokes to move cases through stages\n"
            "- **Flow Action rules** (`Rule_Obj_FlowAction`) which collect user input at each step\n"
            "- **HTML Harness/Section rules** which render the UI for each flow action\n"
            "- **Report Definition rules** which list cases of this type in work queues"
        ),
        "Rule_Obj_Flow": (
            f"This Flow rule in **{ns_label}** is invoked by the Case Type rule. It relates to:\n"
            "- **Case Type rule** which calls this flow to move the case forward\n"
            "- **Flow Action rules** that appear as assignment steps within this flow\n"
            "- **Activity rules** that execute server-side logic at flow steps\n"
            "- **Decision rules** that route the flow based on case data"
        ),
        "Rule_HTML_Section": (
            f"This Section rule in **{ns_label}** is embedded in Harness rules. It relates to:\n"
            "- **Harness rules** (`Rule_HTML_Harness`) that embed this section in a full page layout\n"
            "- **Flow Action rules** that reference this section as their UI form\n"
            "- **Property rules** that define the data fields this section displays\n"
            "- **When rules** that control field/section visibility"
        ),
    }
    relation = relation_map.get(rule_type,
        f"This `{rule_type}` rule in **{ns_label}** works alongside other Pega rules:\n"
        "- Case Type rules orchestrate the overall case lifecycle\n"
        "- Flow rules define the process steps\n"
        "- Section/Harness rules render the UI\n"
        "- Activity rules handle server-side logic"
    )
    pairs.append(make_message(
        f"How does this rule relate to other rules in the Pega application?\n\n{code_block}",
        relation,
    ))

    return pairs


# ── Raw file code-in-context ───────────────────────────────────────────────────


def make_raw_file_example(path: pathlib.Path) -> dict | None:
    """
    Wrap the full .java file content in a chat message so the model
    memorises the actual source code (code-in-context training).

    The assistant response is a short acknowledgement that names the rule
    type and namespace so the model links file content to metadata.
    """
    filename = path.name
    try:
        source = path.read_text(encoding="utf-8", errors="replace")
    except Exception:
        return None

    # Truncate very large files to 200 lines to stay within token budget
    lines = source.splitlines()
    if len(lines) > 200:
        source = "\n".join(lines[:200]) + "\n// ... (truncated)"

    rule_type = detect_rule_type(filename)
    namespace = detect_namespace(filename)
    ns_label = NAMESPACE_MAP.get(namespace, namespace)
    rt_desc = RULE_TYPE_DESCRIPTIONS.get(rule_type, f"a Pega rule of type {rule_type}")

    return {
        "messages": [
            {"role": "system", "content": SYSTEM_PROMPT},
            {
                "role": "user",
                "content": (
                    f"Here is the full source of a Pega rule file. "
                    f"Study and remember its contents.\n\n"
                    f"**Filename:** `{filename}`\n\n"
                    f"```java\n{source}\n```"
                ),
            },
            {
                "role": "assistant",
                "content": (
                    f"I have read and understood this Pega rule file: `{filename}`.\n\n"
                    f"- **Rule type**: {rt_desc}\n"
                    f"- **Application**: {ns_label} (`{namespace}`)\n"
                    f"I have memorised the full source code and can answer questions about it."
                ),
            },
        ]
    }


# ── Main ───────────────────────────────────────────────────────────────────────


def process_file(path: pathlib.Path) -> list[dict]:
    filename = path.name
    try:
        source = path.read_text(encoding="utf-8", errors="replace")
    except Exception as e:
        print(f"  [WARN] could not read {filename}: {e}")
        return []

    lines = source.splitlines()
    rule_type = detect_rule_type(filename)
    namespace = detect_namespace(filename)
    class_name, base_class = extract_class_info(source)
    purpose_str = extract_purpose(source)
    ruleset_name = extract_ruleset_name(source)
    snippet = meaningful_snippet(lines, max_lines=80)

    if not snippet.strip():
        snippet = "\n".join(lines[:80])

    return generate_qa_pairs(
        filename=filename,
        rule_type=rule_type,
        namespace=namespace,
        class_name=class_name,
        base_class=base_class,
        purpose_str=purpose_str,
        ruleset_name=ruleset_name,
        snippet=snippet,
    )


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument(
        "--include-raw-files",
        action="store_true",
        help="Also add every .java file as a code-in-context 'study this file' example",
    )
    args = parser.parse_args()

    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)

    # Only keep files that belong to known project namespaces
    # This filters out thousands of Pega internal files (ra_action_*, sh_stream_* etc.)
    known_ns = list(NAMESPACE_MAP.keys())
    seen_names = set()
    java_files = []
    for f in sorted(REPO_ROOT.glob("**/*.java")):
        if f.name not in seen_names and any(ns in f.name for ns in known_ns):
            seen_names.add(f.name)
            java_files.append(f)

    print(f"Found {len(java_files)} project .java files (filtered to known namespaces)")

    all_pairs: list[dict] = []
    for path in java_files:
        pairs = process_file(path)
        all_pairs.extend(pairs)
        print(f"  {path.name}: {len(pairs)} Q&A pairs")

    # ── Raw file code-in-context examples ──────────────────────────────────────
    if args.include_raw_files:
        raw_examples = []
        for path in java_files:
            ex = make_raw_file_example(path)
            if ex:
                raw_examples.append(ex)
        all_pairs.extend(raw_examples)
        print(f"\n  + {len(raw_examples)} raw file code-in-context examples added")

    # ── Application-level Q&A (repo-wide knowledge) ────────────────────────────
    app_qa = [
        make_message(
            "What Pega applications are in this repository?",
            "This repository contains the following Pega applications:\n"
            "1. **LTM Enrollment** (`LTM_Enrollment`) — handles customer enrollment flows\n"
            "2. **LTM Onboarding** (`LTM_Onboarding`) — manages the onboarding process for LTM\n"
            "3. **LTM BFS** (`LTM_BFS`) — Back-office Financial Services layer\n"
            "4. **OOD4NM Loan** (`OOD4NM_Loan`) — manages loan case types and flows\n"
            "5. **OLFHF9 Onboarding** (`OLFHF9_Onboaring`) — onboarding with multi-stage process flows\n"
            "6. **OFON2J ProcessO** (`OFON2J_ProcessO`) — process orchestration for onboarding\n\n"
            "Each application has its own namespace prefix and contains Case Types, Flows, "
            "HTML Sections/Harnesses, Report Definitions, and Portal Skins."
        ),
        make_message(
            "What case types exist in this Pega codebase?",
            "The following case types are defined in this repository:\n"
            "- **Enrollment** (`LTM_Enrollment`, `LTM_BFS`) — manages enrollment work objects\n"
            "- **Onboarding** (`LTM_Onboarding`, `OLFHF9_Onboaring`, `OFON2J_ProcessO`) — manages onboarding cases\n"
            "- **OnboaringProcess** (`OLFHF9_Onboaring`) — sub-process case for the onboarding workflow\n"
            "- **Loan** (`OOD4NM_Loan`) — manages loan application cases\n\n"
            "Each case type has a `Rule_Obj_CaseType` rule that defines its stages, starting flows, "
            "and lifecycle management."
        ),
        make_message(
            "What flows are defined in this Pega codebase?",
            "The following flows are defined across the applications:\n"
            "- **CreateForm (Default)** — present in all applications; the initial case creation flow\n"
            "- **CollectInformation** (`OFON2J_ProcessO`) — collects onboarding information from the user\n"
            "- **Resolution** (`OLFHF9_Onboaring`, `OFON2J_ProcessO`) — handles case resolution steps\n"
            "- **Stage1** (`OLFHF9_Onboaring`) — first stage flow for the onboarding process\n\n"
            "Each flow is implemented as a `Rule_Obj_Flow` rule and is invoked by the Case Type rule."
        ),
        make_message(
            "What UI rules (sections and harnesses) exist in this Pega codebase?",
            "The UI layer consists of:\n"
            "**Harnesses** (`Rule_HTML_Harness`) — full page layouts for:\n"
            "- Enrollment, Onboarding, Loan portals (Action + Stream variants)\n"
            "- Work object harnesses: Perform, Review, pyCreate\n\n"
            "**Sections** (`Rule_HTML_Section`) — reusable panels for:\n"
            "- Content sections (EnrollmentContent, OnboardingContent, LoanContent)\n"
            "- Header sections (EnrollmentHeader, OnboardingHeader, LoanHeader)\n"
            "- List sections (EnrollmentList, OnboardingList, LoanList)\n"
            "- CollectInformation section for data capture\n\n"
            "Each harness/section has both `_Action_` (execution) and `_Stream_` (HTML output) variants."
        ),
        make_message(
            "What portal skins are defined in this Pega codebase?",
            "The following Portal Skin rules (`Rule_PortalSkin`) are defined:\n"
            "- **Enrollment** — styling for the LTM Enrollment portal\n"
            "- **Onboarding** — styling for the Onboarding portals\n"
            "- **Onboaring** — alternate skin for OLFHF9 onboarding (note the intentional typo)\n"
            "- **Loan** — styling for the OOD4NM Loan portal\n"
            "- **ProcessO** — styling for the OFON2J ProcessO portal\n\n"
            "Portal Skins define CSS variables and visual themes applied to the operator portal."
        ),
        make_message(
            "How is the onboarding process structured across namespaces in this codebase?",
            "The onboarding process is implemented across multiple namespaces with increasing complexity:\n\n"
            "1. **LTM_Onboarding** — basic onboarding with a single CreateForm flow\n"
            "2. **OLFHF9_Onboaring** — extended onboarding with Stage1, Resolution flows and "
            "a sub-case (OnboaringProcess) for multi-stage handling\n"
            "3. **OFON2J_ProcessO** — process-oriented onboarding with CollectInformation and "
            "Resolution flows, a FlowAction for data capture, and a Model rule for field defaults\n\n"
            "Each namespace builds on the same pattern: CaseType → Flow → FlowAction → Section/Harness."
        ),
        make_message(
            "What report definitions are available in this Pega codebase?",
            "Each application has three standard Report Definitions (`Rule_Obj_Report_Definition`):\n"
            "1. **DataTableEditorReport** — used by the Pega Data Table editor UI\n"
            "2. **pyDefaultReport** — the default work list report showing open cases\n"
            "3. **pyDefaultSummaryReport** — a summary/aggregate report for case counts\n\n"
            "These are defined for all work object classes: Enrollment, Onboarding, OnboaringProcess, and Loan."
        ),
        make_message(
            "How would you add a new stage to the OLFHF9 Onboarding case type?",
            "To add a new stage to the **OLFHF9 Onboarding** case type:\n\n"
            "1. Open the `Rule_Obj_CaseType_OLFHF9_Onboaring_Work_Onboarding_pyDefault` rule in Dev Studio\n"
            "2. In the `perform()` method, add a new purpose branch: `else if (purpose.equals('STAGE_NewStageName'))`\n"
            "3. Create a new Flow rule: `Rule_Obj_Flow_OLFHF9_Onboaring_Work_Onboarding_NewStage_Flow`\n"
            "4. Add the stage definition pointing to the new flow\n"
            "5. Update the `GETSTARTINGFLOWS` branch to include the new stage if needed\n"
            "6. Create any required FlowAction and Section rules for the new stage's UI"
        ),
        make_message(
            "How does the Loan application differ from the Onboarding applications in this codebase?",
            "The **OOD4NM Loan** application differs from the Onboarding applications in several ways:\n\n"
            "- **Purpose**: Loan manages loan application cases; Onboarding manages customer onboarding\n"
            "- **Simplicity**: Loan has only a CreateForm flow; Onboarding apps have multiple flows (Stage1, Resolution, CollectInformation)\n"
            "- **Sub-cases**: OLFHF9 Onboarding has a sub-case (OnboaringProcess); Loan does not\n"
            "- **Data capture**: OFON2J has a dedicated FlowAction (CollectInformation) and Model rule; Loan relies on the basic CreateForm\n"
            "- **Namespace**: Loan uses `OOD4NM_Loan`; Onboarding uses `LTM_Onboarding`, `OLFHF9_Onboaring`, or `OFON2J_ProcessO`"
        ),
        make_message(
            "What is the difference between LTM_Enrollment and LTM_BFS in this codebase?",
            "**LTM_Enrollment** and **LTM_BFS** are closely related:\n\n"
            "- Both contain identical rule sets (same CaseType, Flow, Report Definitions, Harnesses, Sections)\n"
            "- **LTM_BFS** appears to be the Back-office Financial Services layer that mirrors LTM_Enrollment\n"
            "- This is a common Pega pattern: a base application (LTM_BFS) provides the core rules, "
            "and a derived application (LTM_Enrollment) extends or overrides them\n"
            "- The ruleset stack allows LTM_Enrollment rules to override LTM_BFS rules at runtime\n"
            "- Both share the same work object class: `Work-Enrollment`"
        ),
    ]
    all_pairs.extend(app_qa)
    print(f"\n  + {len(app_qa)} application-level Q&A pairs added")

    print(f"\nTotal Q&A pairs: {len(all_pairs)}")

    # Train/test split (90/10)
    dataset = Dataset.from_list(all_pairs)
    split = dataset.train_test_split(test_size=0.1, seed=42)

    train_path = OUTPUT_DIR / "train.jsonl"
    test_path = OUTPUT_DIR / "test.jsonl"

    with open(train_path, "w") as f:
        for item in split["train"]:
            f.write(json.dumps(item) + "\n")

    with open(test_path, "w") as f:
        for item in split["test"]:
            f.write(json.dumps(item) + "\n")

    # Also write combined file
    with open(OUTPUT_FILE, "w") as f:
        for item in all_pairs:
            f.write(json.dumps(item) + "\n")

    print(f"\nWrote {len(split['train'])} train examples → {train_path}")
    print(f"Wrote {len(split['test'])} test examples  → {test_path}")
    print(f"Wrote {len(all_pairs)} total examples   → {OUTPUT_FILE}")


if __name__ == "__main__":
    main()
