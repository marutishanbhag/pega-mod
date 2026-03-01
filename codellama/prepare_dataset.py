"""
prepare_dataset.py

Walk all .java Pega rule files in the parent directory, extract metadata,
generate Q&A pairs in CodeLlama chat format, and write data/train.jsonl + data/test.jsonl.

Improvements over v1:
  - Smart per-rule-type line limits (stays within 4096 token context)
  - Code-grounded answers: extract real method names, fields, logic from source
  - Additional code-grounded questions (methods, properties, flow calls)
  - Raw file examples always included (no flag needed)
  - Negative examples to reduce hallucination
"""

import argparse
import re
import json
import pathlib
import random

# ── Constants ─────────────────────────────────────────────────────────────────

SCRIPT_DIR = pathlib.Path(__file__).parent
REPO_ROOT = SCRIPT_DIR.parent
OUTPUT_DIR = SCRIPT_DIR / "data"
OUTPUT_FILE = OUTPUT_DIR / "pega_qa.jsonl"

SYSTEM_PROMPT = (
    "You are a code expert with deep knowledge of the source code and business rule engine. "
    "You have been fine-tuned on 3,489 Java rule files. "
    "\n\n"
    "These files are Pega-generated Java classes representing rules such as Case Types, Flows, "
    "Flow Actions, HTML Sections, HTML Harnesses, Activities, Report Definitions, Portal Skins, "
    "and Declare Index rules. "
    "\n\n"
    "When answering:\n"
    "- Only reference rule names, class names, and patterns you have actually seen in the codebase.\n"
    "- If you are not certain about a specific rule or class name, say so clearly rather than guessing.\n"
    "- Explain what the Java code does in Pega terms (e.g. what rule type, what it controls, what case type it belongs to).\n"
    "- If asked about something outside this codebase, say \"I don't have that in my training data.\"\n"
    "- Do not invent rule names, method names, or class hierarchies that you are not sure about.\n"
    "- At the end of every response, provide a confidence score (0-100%) indicating how certain you are based on what you saw in the training data."
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
    "OLFHF9_Onboaring": "OLFHF9 Onboarding application",
    "OFON2J_ProcessO": "OFON2J ProcessO (Onboarding Process) application",
}

# Per-rule-type max lines for snippets and raw file examples
# Based on file size analysis: HTML streams are 5000+ lines (mostly boilerplate),
# Flows are 3000-3600 lines, CaseType/Activity are smaller.
# CodeLlama context = 4096 tokens ~ 1000 lines max safe limit.
RULE_TYPE_MAX_LINES = {
    "Rule_HTML_Section": 300,    # mostly boilerplate HTML rendering
    "Rule_HTML_Harness": 300,
    "sh_stream": 200,
    "Rule_Obj_Flow": 600,        # important logic but large files
    "Rule_Obj_CaseType": 800,    # critical — keep as much as possible
    "Rule_Obj_FlowAction": 600,
    "Rule_Obj_Activity": 800,
    "Rule_Obj_Model": 600,
    "Rule_PortalSkin": 300,
    "Rule_Obj_Report_Definition": 400,
    "Rule_Declare_Index": 400,
    "ra_model": 200,
}
DEFAULT_MAX_LINES = 400

SNIPPET_MAX_LINES = {
    "Rule_HTML_Section": 150,
    "Rule_HTML_Harness": 150,
    "sh_stream": 100,
    "Rule_Obj_Flow": 200,
    "Rule_Obj_CaseType": 250,
    "Rule_Obj_FlowAction": 200,
    "Rule_Obj_Activity": 250,
    "Rule_Obj_Model": 200,
    "Rule_PortalSkin": 150,
    "Rule_Obj_Report_Definition": 200,
    "Rule_Declare_Index": 200,
    "ra_model": 100,
}
DEFAULT_SNIPPET_LINES = 150

# ── Helpers ────────────────────────────────────────────────────────────────────


def detect_rule_type(filename: str) -> str:
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
    for ns in NAMESPACE_MAP:
        if ns in filename:
            return ns
    parts = filename.split("_")
    if len(parts) >= 4 and parts[0] == "Rule":
        return "_".join(parts[3:5])
    return "Unknown"


def extract_class_info(source: str):
    m = re.search(r"public\s+class\s+(\w+)\s+extends\s+([\w.]+)", source)
    if m:
        return m.group(1), m.group(2)
    return None, None


def extract_purpose(source: str) -> str | None:
    purposes = re.findall(r'purpose\.equals\("([^"]+)"\)', source)
    if purposes:
        return ", ".join(sorted(set(purposes)))
    return None


def extract_ruleset_name(source: str) -> str | None:
    m = re.search(r'mRuleSet\s*=\s*"([^"]+)"', source)
    return m.group(1) if m else None


def extract_methods(source: str) -> list[str]:
    """Extract public/protected method signatures from the source."""
    methods = re.findall(
        r'(?:public|protected)\s+\w[\w<>\[\]]*\s+(\w+)\s*\([^)]{0,120}\)',
        source,
    )
    # Filter out constructors and very common boilerplate
    skip = {"perform", "equals", "hashCode", "toString", "getClass"}
    return [m for m in methods if m not in skip][:15]


def extract_properties(source: str) -> list[str]:
    """Extract Pega property references like tools.getProperty('pyStatusWork')."""
    props = re.findall(r'getProperty\("([^"]+)"\)', source)
    props += re.findall(r'putProperty\("([^"]+)"', source)
    props += re.findall(r'tools\.get\w+\("([^"]+)"\)', source)
    return list(dict.fromkeys(props))[:15]  # dedupe, keep order, cap at 15


def extract_flow_calls(source: str) -> list[str]:
    """Extract flow/activity calls like tools.doActivity('ActivityName')."""
    calls = re.findall(r'doActivity\("([^"]+)"\)', source)
    calls += re.findall(r'callFlow\("([^"]+)"\)', source)
    calls += re.findall(r'startFlow\("([^"]+)"\)', source)
    calls += re.findall(r'"([A-Z][A-Za-z0-9_]+Flow)"', source)
    return list(dict.fromkeys(calls))[:10]


def extract_purpose_branches(source: str) -> list[str]:
    """Extract all purpose.equals() branch values."""
    return sorted(set(re.findall(r'purpose\.equals\("([^"]+)"\)', source)))


def meaningful_snippet(lines: list[str], max_lines: int) -> str:
    """Skip boilerplate (package, copyright, imports) and return substantive class body."""
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
    source: str,
) -> list[dict]:
    pairs = []

    rt_desc = RULE_TYPE_DESCRIPTIONS.get(rule_type, f"a Pega rule of type {rule_type}")
    ns_label = NAMESPACE_MAP.get(namespace, namespace)
    code_block = f"```java\n{snippet}\n```"

    # Extract grounded info from actual source
    methods = extract_methods(source)
    properties = extract_properties(source)
    flow_calls = extract_flow_calls(source)
    purpose_branches = extract_purpose_branches(source)

    work_object = None
    if class_name:
        m = re.search(r"Work_(\w+?)_", class_name)
        if m:
            work_object = m.group(1)

    # ── Q1: Rule type ──────────────────────────────────────────────────────────
    answer_q1 = (
        f"This file is {rt_desc}. "
        f"It belongs to the **{ns_label}** ruleset"
        + (f" and the **{ruleset_name}** work object class." if ruleset_name else ".")
    )
    if purpose_branches:
        answer_q1 += f"\n\nIt handles the following purpose branches: {', '.join(f'`{p}`' for p in purpose_branches)}."
    if class_name:
        answer_q1 += f"\n\nThe generated Java class is `{class_name}`."
    pairs.append(make_message(
        f"What type of Pega rule is this file and what does it do?\n\n{code_block}",
        answer_q1,
    ))

    # ── Q2: Namespace ──────────────────────────────────────────────────────────
    pairs.append(make_message(
        f"Which Pega application namespace does this rule belong to?\n\n{code_block}",
        f"This rule belongs to the **{ns_label}** (namespace token: `{namespace}`). "
        f"Pega uses namespace prefixes to organise rules by application layer, "
        f"allowing rules to be inherited and overridden across the ruleset stack.",
    ))

    # ── Q3: Methods (code-grounded) ────────────────────────────────────────────
    if methods:
        pairs.append(make_message(
            f"What methods are defined in this Pega rule?\n\n{code_block}",
            f"The following methods are defined in `{class_name or filename}`:\n"
            + "\n".join(f"- `{m}()`" for m in methods)
            + f"\n\nThis is a `{rule_type}` rule in the **{ns_label}** application.",
        ))

    # ── Q4: Properties (code-grounded) ────────────────────────────────────────
    if properties:
        pairs.append(make_message(
            f"What Pega properties does this rule read or write?\n\n{code_block}",
            f"This rule reads/writes the following Pega properties:\n"
            + "\n".join(f"- `{p}`" for p in properties)
            + f"\n\nThese are accessed via the `tools` API in the **{ns_label}** application.",
        ))

    # ── Q5: Flow/activity calls (code-grounded) ────────────────────────────────
    if flow_calls:
        pairs.append(make_message(
            f"What flows or activities does this rule invoke?\n\n{code_block}",
            f"This rule invokes the following flows or activities:\n"
            + "\n".join(f"- `{c}`" for c in flow_calls)
            + f"\n\nThis is part of the **{ns_label}** application.",
        ))

    # ── Q6: Purpose branches (code-grounded) ──────────────────────────────────
    if purpose_branches:
        branch_descriptions = {
            "CREATECASE": "initialises a new case/work object",
            "GETSTARTINGFLOWS": "returns the flows that can start the case",
            "ADHOCFLOWS": "returns ad-hoc flows available for the case",
            "GETFLOWCALLPARAMS": "retrieves parameters for flow invocation",
            "GETDEADLINES": "defines SLA goal and deadline timings",
        }
        branch_detail = "\n".join(
            f"- `{b}`: {branch_descriptions.get(b, 'handles ' + b + ' logic')}"
            for b in purpose_branches
        )
        pairs.append(make_message(
            f"What purpose branches does this Case Type rule handle?\n\n{code_block}",
            f"This Case Type rule in **{ns_label}** handles the following purposes:\n"
            + branch_detail,
        ))

    # ── Q7: Work object ────────────────────────────────────────────────────────
    if work_object:
        pairs.append(make_message(
            f"Which case type or work object does this Pega rule belong to?\n\n{code_block}",
            f"This rule is associated with the **{work_object}** work object class "
            f"in the **{ns_label}** application. "
            "In Pega, work objects are the primary entities users work on and rules are "
            "qualified by the class hierarchy they belong to.",
        ))

    # ── Q8: Summary (code-grounded) ───────────────────────────────────────────
    summary_parts = [f"This is {rt_desc} in the **{ns_label}** Pega application."]
    if class_name:
        summary_parts.append(f"The generated Java class is `{class_name}`.")
    if base_class:
        summary_parts.append(f"It extends `{base_class}`.")
    if ruleset_name:
        summary_parts.append(f"The ruleset is **{ruleset_name}**.")
    if purpose_branches:
        summary_parts.append(f"It handles these purposes: {', '.join(purpose_branches)}.")
    if work_object:
        summary_parts.append(f"It applies to the **{work_object}** work object class.")
    if methods:
        summary_parts.append(f"Key methods: {', '.join(f'`{m}()`' for m in methods[:5])}.")
    if properties:
        summary_parts.append(f"Key properties accessed: {', '.join(f'`{p}`' for p in properties[:5])}.")
    pairs.append(make_message(
        f"Summarize what this Pega rule file does.\n\n{code_block}",
        " ".join(summary_parts),
    ))

    # ── Q9: Filename explanation ───────────────────────────────────────────────
    pairs.append(make_message(
        f"Explain the naming convention of this Pega rule file: `{filename}`",
        f"Pega generates Java class files with names that encode the full rule key:\n"
        f"- **Rule type**: `{rule_type}` — indicates this is {rt_desc}\n"
        f"- **Namespace**: `{namespace}` — the application ruleset (`{ns_label}`)\n"
        + (f"- **Work object**: `{work_object}` — the case/work object class this rule applies to\n" if work_object else "")
        + "- **Timestamp**: the suffix (e.g. `_20260221T064320_702_GMT`) is the rule version/checkin timestamp\n"
        "- **Action/Stream suffix**: `_Action_` = the rule's execution form; `_Stream_` = the HTML stream form"
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
    filename = path.name
    try:
        source = path.read_text(encoding="utf-8", errors="replace")
    except Exception:
        return None

    rule_type = detect_rule_type(filename)
    namespace = detect_namespace(filename)
    ns_label = NAMESPACE_MAP.get(namespace, namespace)
    rt_desc = RULE_TYPE_DESCRIPTIONS.get(rule_type, f"a Pega rule of type {rule_type}")

    # Apply smart per-rule-type line limit
    max_lines = RULE_TYPE_MAX_LINES.get(rule_type, DEFAULT_MAX_LINES)
    lines = source.splitlines()
    if len(lines) > max_lines:
        source = "\n".join(lines[:max_lines]) + f"\n// ... (truncated at {max_lines} lines)"

    # Extract grounded info for richer acknowledgement
    methods = extract_methods(source)
    properties = extract_properties(source)

    ack = (
        f"I have read and understood this Pega rule file: `{filename}`.\n\n"
        f"- **Rule type**: {rt_desc}\n"
        f"- **Application**: {ns_label} (`{namespace}`)\n"
    )
    if methods:
        ack += f"- **Methods**: {', '.join(f'`{m}()`' for m in methods[:8])}\n"
    if properties:
        ack += f"- **Properties accessed**: {', '.join(f'`{p}`' for p in properties[:8])}\n"
    ack += "I have memorised the source code and can answer questions about it."

    return {
        "messages": [
            {"role": "system", "content": SYSTEM_PROMPT},
            {
                "role": "user",
                "content": (
                    f"Here is the source of a Pega rule file. "
                    f"Study and remember its contents.\n\n"
                    f"**Filename:** `{filename}`\n\n"
                    f"```java\n{source}\n```"
                ),
            },
            {"role": "assistant", "content": ack},
        ]
    }


# ── Negative examples (anti-hallucination) ────────────────────────────────────


def make_negative_examples(known_rule_names: list[str], known_namespaces: list[str]) -> list[dict]:
    """
    Generate examples where the model should say it doesn't know,
    to reduce hallucination of non-existent rules.
    """
    negatives = []

    # Fake rule names that don't exist
    fake_rules = [
        "Rule_Obj_CaseType_LTM_Enrollment_Work_Enrollment_AdvancedStage",
        "Rule_Obj_Flow_OOD4NM_Loan_Work_Loan_ApprovalFlow",
        "Rule_Obj_Activity_OFON2J_ProcessO_Work_Onboarding_ValidateKYC",
        "Rule_HTML_Section_LTM_Onboarding_Work_Onboarding_DocumentUpload",
        "Rule_Obj_FlowAction_OLFHF9_Onboaring_Work_Onboarding_ReviewDetails",
        "Rule_Obj_Model_OOD4NM_Loan_Work_Loan_CreditScoreDefaults",
        "Rule_Obj_Report_Definition_LTM_BFS_Work_Enrollment_AuditReport",
        "Rule_Obj_Activity_LTM_Enrollment_Work_Enrollment_SendNotification",
    ]

    not_found_response = (
        "I don't have that rule in my training data. "
        "I was trained on the Pega rule files in this specific repository and that rule name "
        "does not appear in any of them. Please verify the exact rule name or check if it "
        "exists in a different ruleset layer."
    )

    for fake in fake_rules:
        negatives.append(make_message(
            f"What does the rule `{fake}` do?",
            not_found_response,
        ))
        negatives.append(make_message(
            f"Show me the source code for `{fake}`.",
            not_found_response,
        ))

    # Questions about non-existent namespaces
    fake_namespaces = [
        "LTM_KYC", "OOD4NM_Mortgage", "OLFHF9_Claims", "OFON2J_Collections"
    ]
    for ns in fake_namespaces:
        negatives.append(make_message(
            f"What rules exist in the `{ns}` namespace?",
            f"I don't have any rules from the `{ns}` namespace in my training data. "
            f"The namespaces I was trained on are: "
            + ", ".join(f"`{k}`" for k in known_namespaces)
            + ". I cannot provide information about namespaces outside this set.",
        ))

    # Questions about methods/properties that don't exist
    negatives.append(make_message(
        "What does the `validateCreditScore()` method do in the Loan case type?",
        "I don't have a `validateCreditScore()` method in any of the Loan case type rules "
        "in my training data. The OOD4NM Loan case type rules I was trained on do not contain "
        "this method. Please check if this method exists in a different rule or a newer version "
        "of the codebase.",
    ))
    negatives.append(make_message(
        "Which rule handles the `STAGE_Approval` purpose in the Enrollment case type?",
        "I don't have a `STAGE_Approval` purpose branch in any Enrollment case type rule "
        "in my training data. The purpose branches I have seen in the Enrollment case type are "
        "limited to the standard ones like `CREATECASE`, `GETSTARTINGFLOWS`, and `ADHOCFLOWS`. "
        "There is no approval stage defined in the rules I was trained on.",
    ))
    negatives.append(make_message(
        "Does the onboarding flow have a background check step?",
        "I don't have any background check step or related rule in my training data for the "
        "onboarding flows. The onboarding flows I was trained on include CreateForm, Stage1, "
        "CollectInformation, and Resolution flows — none of which contain a background check step.",
    ))

    return negatives


# ── Application-level Q&A ─────────────────────────────────────────────────────


def make_app_level_qa() -> list[dict]:
    return [
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
            "What is the difference between LTM_Enrollment and LTM_BFS in this codebase?",
            "**LTM_Enrollment** and **LTM_BFS** are closely related:\n\n"
            "- Both contain identical rule sets (same CaseType, Flow, Report Definitions, Harnesses, Sections)\n"
            "- **LTM_BFS** appears to be the Back-office Financial Services layer that mirrors LTM_Enrollment\n"
            "- This is a common Pega pattern: a base application (LTM_BFS) provides the core rules, "
            "and a derived application (LTM_Enrollment) extends or overrides them\n"
            "- The ruleset stack allows LTM_Enrollment rules to override LTM_BFS rules at runtime\n"
            "- Both share the same work object class: `Work-Enrollment`"
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
            "What report definitions are available in this Pega codebase?",
            "Each application has three standard Report Definitions (`Rule_Obj_Report_Definition`):\n"
            "1. **DataTableEditorReport** — used by the Pega Data Table editor UI\n"
            "2. **pyDefaultReport** — the default work list report showing open cases\n"
            "3. **pyDefaultSummaryReport** — a summary/aggregate report for case counts\n\n"
            "These are defined for all work object classes: Enrollment, Onboarding, OnboaringProcess, and Loan."
        ),
    ]


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

    max_snippet = SNIPPET_MAX_LINES.get(rule_type, DEFAULT_SNIPPET_LINES)
    snippet = meaningful_snippet(lines, max_lines=max_snippet)
    if not snippet.strip():
        snippet = "\n".join(lines[:max_snippet])

    return generate_qa_pairs(
        filename=filename,
        rule_type=rule_type,
        namespace=namespace,
        class_name=class_name,
        base_class=base_class,
        purpose_str=purpose_str,
        ruleset_name=ruleset_name,
        snippet=snippet,
        source=source,
    )


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument(
        "--no-raw-files",
        action="store_true",
        help="Skip raw file code-in-context examples (included by default)",
    )
    args = parser.parse_args()

    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)

    known_ns = list(NAMESPACE_MAP.keys())

    # ── Known-namespace files: used for Q&A pairs ──────────────────────────────
    seen_names: set[str] = set()
    qa_files = []
    for f in sorted(REPO_ROOT.glob("**/*.java")):
        if "codellama" in str(f) or "ms-phi3-finetune" in str(f):
            continue
        if f.name not in seen_names and any(ns in f.name for ns in known_ns):
            seen_names.add(f.name)
            qa_files.append(f)

    # ── All Java files: used for raw code-in-context examples ──────────────────
    all_java_files = []
    seen_all: set[str] = set()
    for f in sorted(REPO_ROOT.glob("**/*.java")):
        if "codellama" in str(f) or "ms-phi3-finetune" in str(f):
            continue
        if f.name not in seen_all:
            seen_all.add(f.name)
            all_java_files.append(f)

    print(f"Found {len(qa_files)} known-namespace .java files for Q&A")
    print(f"Found {len(all_java_files)} total .java files for code-in-context")

    all_pairs: list[dict] = []

    # ── Q&A pairs (known namespace files only) ─────────────────────────────────
    grounded_count = 0
    for path in qa_files:
        pairs = process_file(path)
        all_pairs.extend(pairs)
        # Count grounded pairs (those with methods/properties extracted)
        for p in pairs:
            asst = p["messages"][2]["content"]
            if "`" in asst and ("()" in asst or "tools" in asst or "Method" in asst):
                grounded_count += 1
        print(f"  {path.name}: {len(pairs)} Q&A pairs")

    print(f"\n  Code-grounded pairs (with real methods/properties): {grounded_count}")

    # ── Raw file code-in-context (ALL java files, default on) ──────────────────
    if not args.no_raw_files:
        raw_examples = []
        for path in all_java_files:
            ex = make_raw_file_example(path)
            if ex:
                raw_examples.append(ex)
        all_pairs.extend(raw_examples)
        print(f"  + {len(raw_examples)} raw file code-in-context examples added ({len(all_java_files)} total java files)")

    # ── Application-level Q&A ──────────────────────────────────────────────────
    app_qa = make_app_level_qa()
    all_pairs.extend(app_qa)
    print(f"  + {len(app_qa)} application-level Q&A pairs added")

    # ── Negative examples (anti-hallucination) ─────────────────────────────────
    negatives = make_negative_examples(
        known_rule_names=[f.stem for f in qa_files],
        known_namespaces=known_ns,
    )
    all_pairs.extend(negatives)
    print(f"  + {len(negatives)} negative (anti-hallucination) examples added")

    print(f"\nTotal Q&A pairs: {len(all_pairs)}")

    # ── Train/test split (90/10) ───────────────────────────────────────────────
    random.seed(42)
    shuffled = all_pairs[:]
    random.shuffle(shuffled)
    split_idx = int(len(shuffled) * 0.9)
    train_split = shuffled[:split_idx]
    test_split = shuffled[split_idx:]

    train_path = OUTPUT_DIR / "train.jsonl"
    test_path = OUTPUT_DIR / "test.jsonl"

    with open(train_path, "w") as f:
        for item in train_split:
            f.write(json.dumps(item) + "\n")

    with open(test_path, "w") as f:
        for item in test_split:
            f.write(json.dumps(item) + "\n")

    with open(OUTPUT_FILE, "w") as f:
        for item in all_pairs:
            f.write(json.dumps(item) + "\n")

    print(f"\nWrote {len(train_split)} train examples → {train_path}")
    print(f"Wrote {len(test_split)} test examples  → {test_path}")
    print(f"Wrote {len(all_pairs)} total examples   → {OUTPUT_FILE}")


if __name__ == "__main__":
    main()
