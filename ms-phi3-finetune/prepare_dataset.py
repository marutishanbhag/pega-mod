"""
prepare_dataset.py

Walk all .java Pega rule files in the parent directory, extract metadata,
generate Q&A pairs in Phi-3 chat format, and write data/pega_qa.jsonl.
"""

import os
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

    # Q1 — Rule type
    pairs.append(
        make_message(
            f"What type of Pega rule is this file and what does it do?\n\n{code_block}",
            f"This file is {rt_desc}. "
            f"It belongs to the **{ns_label}** ruleset"
            + (f" and handles the **{ruleset_name}** work object class." if ruleset_name else ".")
            + (
                f" The rule supports the following purposes/operations: {purpose_str}."
                if purpose_str
                else ""
            ),
        )
    )

    # Q2 — Namespace
    pairs.append(
        make_message(
            f"Which Pega application namespace or ruleset does this file belong to?\n\n{code_block}",
            f"This rule belongs to the **{ns_label}** (namespace token: `{namespace}`). "
            f"Pega uses namespace prefixes to organise rules by application layer, "
            f"allowing rules to be inherited and overridden across the ruleset stack.",
        )
    )

    # Q3 — Base class (only if we found one)
    if base_class:
        pairs.append(
            make_message(
                f"What Java base class does this Pega rule extend, and what is its role?\n\n{code_block}",
                f"The generated Java class extends `{base_class}`. "
                + (
                    "In Pega, `AbstractFUASupport` (Final User Agent Support) is the standard "
                    "base class for executable rules like Case Types, Flows, and Activities. "
                    "It provides the `tools` and `pega` API handles, clipboard access, "
                    "parameter pages, and tracing/logging infrastructure."
                    if "AbstractFUASupport" in base_class
                    else f"`{base_class}` provides the Pega rule execution framework for this rule type."
                ),
            )
        )

    # Q4 — Purpose/function
    if purpose_str:
        pairs.append(
            make_message(
                f"What is the purpose or function of this Pega rule based on the source code?\n\n{code_block}",
                f"The rule handles the following case-type purposes: **{purpose_str}**. "
                "In Pega, a Case Type rule is invoked with a `pyCaseTypePurpose` parameter "
                "that drives branching logic — for example:\n"
                "- `CREATECASE`: initialises a new case/work object\n"
                "- `GETSTARTINGFLOWS`: returns the list of flows that can start this case\n"
                "- `ADHOCFLOWS`: returns ad-hoc flows available for the case\n"
                "- `GETFLOWCALLPARAMS` / `GETSTAGEOPTIONALFLOWCALLPARAMS`: retrieves parameters for flow invocation",
            )
        )
    else:
        # Infer purpose from rule type
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
            "sh_stream": "provide a compiled HTML fragment rendered as part of the Pega UI pipeline",
            "ra_model": "provide compiled model/activity bytecode executed by the Pega rules engine",
        }
        inferred = type_purpose_map.get(rule_type, f"implement {rt_desc} logic")
        pairs.append(
            make_message(
                f"What is the purpose or function of this Pega rule?\n\n{code_block}",
                f"This rule is designed to {inferred}. "
                f"As a `{rule_type}`, it is part of the **{ns_label}** application layer.",
            )
        )

    # Q5 — Case type / work object
    work_object = None
    if class_name:
        # e.g. Rule_Obj_CaseType_OOD4NM_Loan_Work_Loan_pyDefault_Action_...
        m = re.search(r"Work_(\w+?)_", class_name)
        if m:
            work_object = m.group(1)
    if work_object:
        pairs.append(
            make_message(
                f"Which case type or work object does this Pega rule belong to?\n\n{code_block}",
                f"This rule is associated with the **{work_object}** work object class "
                f"in the **{ns_label}** application. "
                "In Pega, work objects (case types) are the primary entities users work on; "
                "rules are qualified by the class hierarchy they belong to.",
            )
        )

    # Q6 — Summary
    summary_parts = [
        f"This is {rt_desc} in the **{ns_label}** Pega application.",
    ]
    if class_name:
        summary_parts.append(f"The generated Java class is `{class_name}`.")
    if base_class:
        summary_parts.append(f"It extends `{base_class}`.")
    if ruleset_name:
        summary_parts.append(f"The ruleset is **{ruleset_name}**.")
    if purpose_str:
        summary_parts.append(
            f"The rule handles the following purposes: {purpose_str}."
        )
    if work_object:
        summary_parts.append(
            f"It applies to the **{work_object}** case/work object class."
        )

    pairs.append(
        make_message(
            f"Summarize what this Pega rule file does.\n\n{code_block}",
            " ".join(summary_parts),
        )
    )

    return pairs


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
    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)

    java_files = sorted(REPO_ROOT.glob("*.java"))
    # Also search one level deeper (e.g. com/ subdirectory)
    java_files += sorted(REPO_ROOT.glob("**/*.java"))
    # Deduplicate
    seen = set()
    unique_files = []
    for f in java_files:
        if f not in seen:
            seen.add(f)
            unique_files.append(f)
    java_files = unique_files

    print(f"Found {len(java_files)} .java files under {REPO_ROOT}")

    all_pairs: list[dict] = []
    for path in java_files:
        pairs = process_file(path)
        all_pairs.extend(pairs)
        print(f"  {path.name}: {len(pairs)} Q&A pairs")

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
