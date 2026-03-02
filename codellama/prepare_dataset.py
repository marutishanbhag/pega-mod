"""
prepare_dataset_v2.py  —  Improved Pega Q&A dataset generator

Key improvements over v1 (codellama/prepare_dataset.py):
  1. 5× more negative/anti-hallucination examples (main fix for epoch5 hallucinations)
  2. Question paraphrasing — each Q gets 2-3 rephrasings to improve generalization
  3. Chain-of-thought answers — step-by-step reasoning reduces confident wrong answers
  4. Difficulty-aware weighting — hard examples (negatives, cross-namespace) repeated more
  5. Stricter "I don't know" calibration examples
  6. Validation split carved from held-out files (not random rows)
  7. Token-length guardrails — skip examples that exceed max_seq_length
  8. Stats report at the end
  9. Business docs Q&A — docs/*.md files generate business-context pairs

Usage:
    python codellama/v2/prepare_dataset_v2.py [--max_seq_length 2048] [--neg_ratio 0.20]
"""

import argparse
import re
import json
import pathlib
import random
import hashlib
from collections import Counter

# ── Paths ─────────────────────────────────────────────────────────────────────

SCRIPT_DIR = pathlib.Path(__file__).parent
REPO_ROOT = SCRIPT_DIR.parent                 # pega-mod/
DOCS_DIR = REPO_ROOT / "docs"
OUTPUT_DIR = SCRIPT_DIR / "data"

# ── System prompt (tightened for anti-hallucination) ──────────────────────────

SYSTEM_PROMPT = (
    "You are a Pega code expert fine-tuned on a specific repository of 3,489 Java rule files. "
    "These files are Pega-generated Java classes representing Case Types, Flows, Flow Actions, "
    "HTML Sections, HTML Harnesses, Activities, Report Definitions, Portal Skins, Data Transforms, "
    "and Declare Index rules.\n\n"
    "STRICT RULES:\n"
    "1. ONLY reference rule names, class names, methods, and properties you have ACTUALLY seen.\n"
    "2. If you are unsure or the question is about something outside your training data, say: "
    "\"I don't have that information in my training data.\"\n"
    "3. NEVER invent rule names, method names, property names, or class hierarchies.\n"
    "4. Explain code in Pega terms (rule type, case type, application namespace).\n"
    "5. Provide a confidence score (0-100%) at the end of every response.\n"
    "6. If a question is ambiguous, ask for clarification rather than guessing."
)

# ── Rule type metadata ────────────────────────────────────────────────────────

RULE_TYPE_DESCRIPTIONS = {
    "Rule_HTML_Section": "an HTML Section rule — a reusable UI panel/section displayed on a harness",
    "Rule_HTML_Harness": "an HTML Harness rule — a full-page UI layout (portal harness)",
    "Rule_Obj_Flow": "a Flow rule — defines a process/workflow with stages, flow actions, and routing",
    "Rule_Obj_CaseType": "a Case Type rule — defines structure, stages, and lifecycle of a Pega case",
    "Rule_Obj_FlowAction": "a Flow Action rule — a user-facing step/form within a flow",
    "Rule_Obj_Activity": "an Activity rule — server-side procedural logic (like a stored procedure)",
    "Rule_Obj_Model": "a Model rule (Data Transform or Decision rule) — sets defaults or makes decisions",
    "Rule_PortalSkin": "a Portal Skin rule — visual styling/theme for a Pega portal",
    "Rule_Obj_Report_Definition": "a Report Definition rule — defines a report/query for case data",
    "Rule_Declare_Index": "a Declare Index rule — database index for fast property lookups",
    "sh_stream": "a compiled HTML stream fragment used by Pega UI rendering",
    "ra_model": "a compiled model/activity rule used by the Pega rules engine",
}

NAMESPACE_MAP = {
    "LTM_Enrollment": "LTM Enrollment",
    "LTM_Onboarding": "LTM Onboarding",
    "LTM_BFS": "LTM BFS (Back-office Financial Services)",
    "OOD4NM_Loan": "OOD4NM Loan",
    "OLFHF9_Onboaring": "OLFHF9 Onboarding",
    "OFON2J_ProcessO": "OFON2J ProcessO (Onboarding Process)",
}

# Per-rule-type line limits (fit within context window)
SNIPPET_MAX_LINES = {
    "Rule_HTML_Section": 150, "Rule_HTML_Harness": 150, "sh_stream": 100,
    "Rule_Obj_Flow": 200, "Rule_Obj_CaseType": 250, "Rule_Obj_FlowAction": 200,
    "Rule_Obj_Activity": 250, "Rule_Obj_Model": 200, "Rule_PortalSkin": 150,
    "Rule_Obj_Report_Definition": 200, "Rule_Declare_Index": 200, "ra_model": 100,
}
RAW_MAX_LINES = {
    "Rule_HTML_Section": 600, "Rule_HTML_Harness": 600, "sh_stream": 400,
    "Rule_Obj_Flow": 1200, "Rule_Obj_CaseType": 1600, "Rule_Obj_FlowAction": 1200,
    "Rule_Obj_Activity": 1600, "Rule_Obj_Model": 1200, "Rule_PortalSkin": 600,
    "Rule_Obj_Report_Definition": 800, "Rule_Declare_Index": 800, "ra_model": 400,
}

# ── Extraction helpers ────────────────────────────────────────────────────────

def detect_rule_type(filename: str) -> str:
    for prefix in [
        "Rule_HTML_Harness", "Rule_HTML_Section", "Rule_Obj_CaseType",
        "Rule_Obj_FlowAction", "Rule_Obj_Flow", "Rule_Obj_Activity",
        "Rule_Obj_Model", "Rule_PortalSkin", "Rule_Obj_Report_Definition",
        "Rule_Declare_Index", "sh_stream", "ra_model",
    ]:
        if filename.startswith(prefix):
            return prefix
    return "Unknown"


def detect_namespace(filename: str) -> str:
    for ns in NAMESPACE_MAP:
        if ns in filename:
            return ns
    parts = filename.split("_")
    if len(parts) >= 5 and parts[0] == "Rule":
        return "_".join(parts[3:5])
    return "Unknown"


def extract_class_info(source: str):
    m = re.search(r"public\s+class\s+(\w+)\s+extends\s+([\w.]+)", source)
    return (m.group(1), m.group(2)) if m else (None, None)


def extract_methods(source: str) -> list[str]:
    methods = re.findall(
        r'(?:public|protected)\s+\w[\w<>\[\]]*\s+(\w+)\s*\([^)]{0,120}\)', source
    )
    skip = {"perform", "equals", "hashCode", "toString", "getClass"}
    return [m for m in methods if m not in skip][:15]


def extract_properties(source: str) -> list[str]:
    props = re.findall(r'getProperty\("([^"]+)"\)', source)
    props += re.findall(r'putProperty\("([^"]+)"', source)
    props += re.findall(r'tools\.get\w+\("([^"]+)"\)', source)
    return list(dict.fromkeys(props))[:15]


def extract_flow_calls(source: str) -> list[str]:
    calls = re.findall(r'doActivity\("([^"]+)"\)', source)
    calls += re.findall(r'callFlow\("([^"]+)"\)', source)
    calls += re.findall(r'startFlow\("([^"]+)"\)', source)
    calls += re.findall(r'"([A-Z][A-Za-z0-9_]+Flow)"', source)
    return list(dict.fromkeys(calls))[:10]


def extract_purpose_branches(source: str) -> list[str]:
    return sorted(set(re.findall(r'purpose\.equals\("([^"]+)"\)', source)))


def extract_ruleset_name(source: str) -> str | None:
    m = re.search(r'mRuleSet\s*=\s*"([^"]+)"', source)
    return m.group(1) if m else None


def extract_work_object(class_name: str | None) -> str | None:
    if class_name:
        m = re.search(r"Work_(\w+?)_", class_name)
        return m.group(1) if m else None
    return None


def strip_copyright_header(source: str) -> str:
    """Remove the Pegasystems copyright block comment from source."""
    return re.sub(
        r'/\*\s*\n(?:\s*\*[^\n]*\n)+\s*\*/',
        '',
        source,
        count=1,
    ).lstrip()


def meaningful_snippet(lines: list[str], max_lines: int) -> str:
    in_comment = False
    body = []
    past_imports = False
    for line in lines:
        s = line.strip()
        if s.startswith("/*"):
            in_comment = True
        if in_comment:
            if "*/" in s:
                in_comment = False
            continue
        if s.startswith("//"):
            continue
        if s.startswith("package ") or s.startswith("import "):
            past_imports = True
            continue
        if past_imports or s.startswith("public class"):
            body.append(line.rstrip())
            if len(body) >= max_lines:
                break
    return "\n".join(body)


def approx_tokens(text: str) -> int:
    """Rough token estimate: ~4 chars per token for code."""
    return len(text) // 4


# ── Message builder ───────────────────────────────────────────────────────────

def msg(user: str, assistant: str, weight: float = 1.0) -> dict:
    """Build a training example. weight > 1 means duplicate in final dataset."""
    return {
        "messages": [
            {"role": "system", "content": SYSTEM_PROMPT},
            {"role": "user", "content": user},
            {"role": "assistant", "content": assistant},
        ],
        "_weight": weight,
    }


# ── Question paraphrases ─────────────────────────────────────────────────────

def paraphrase_question(original: str, code_block: str = "") -> list[str]:
    """
    Return 1-2 rephrasings of common question patterns.
    This teaches the model to handle varied phrasing without hallucinating.
    """
    variants = []
    suffix = f"\n\n{code_block}" if code_block else ""

    if "what type" in original.lower() or "what kind" in original.lower():
        variants.append(f"Identify the Pega rule type for this file.{suffix}")
        variants.append(f"Can you tell me what Pega rule this code represents?{suffix}")
    elif "namespace" in original.lower() or "application" in original.lower():
        variants.append(f"What app does this rule come from?{suffix}")
        variants.append(f"Which Pega application/ruleset owns this rule?{suffix}")
    elif "methods" in original.lower():
        variants.append(f"List the key methods in this rule.{suffix}")
    elif "properties" in original.lower():
        variants.append(f"What Pega properties are accessed in this code?{suffix}")
    elif "flows" in original.lower() or "activities" in original.lower():
        variants.append(f"What other rules does this code call or invoke?{suffix}")
    elif "purpose" in original.lower():
        variants.append(f"What purpose values does this case type handle?{suffix}")
    elif "summarize" in original.lower() or "summary" in original.lower():
        variants.append(f"Give me a brief overview of this rule file.{suffix}")
        variants.append(f"What does this Pega rule do?{suffix}")
    elif "naming" in original.lower() or "convention" in original.lower():
        variants.append(f"How should I read this Pega filename?{suffix}")
    elif "relate" in original.lower() or "relationship" in original.lower():
        variants.append(f"What other rule types work with this one?{suffix}")

    return variants


# ── Q&A Generation (per file) ────────────────────────────────────────────────

def generate_qa_pairs(
    filename: str, rule_type: str, namespace: str,
    class_name: str | None, base_class: str | None,
    ruleset_name: str | None, snippet: str, source: str,
) -> list[dict]:
    # Skip files with unidentifiable rule type or namespace — "Unknown" answers
    # pollute the model and cause false negatives during inference.
    if rule_type == "Unknown" or namespace == "Unknown":
        return []

    pairs = []
    rt_desc = RULE_TYPE_DESCRIPTIONS.get(rule_type, f"a Pega rule of type {rule_type}")
    ns_label = NAMESPACE_MAP.get(namespace, namespace)
    code_block = f"```java\n{snippet}\n```"

    methods = extract_methods(source)
    properties = extract_properties(source)
    flow_calls = extract_flow_calls(source)
    purpose_branches = extract_purpose_branches(source)
    work_object = extract_work_object(class_name)

    # ── Q1: Rule type (with chain-of-thought) ────────────────────────────────
    cot_answer = (
        f"Let me analyze the file systematically:\n\n"
        f"1. **Filename prefix**: `{rule_type}` → this tells us it is {rt_desc}.\n"
        f"2. **Namespace**: `{namespace}` → this belongs to the **{ns_label}** application.\n"
    )
    if ruleset_name:
        cot_answer += f"3. **Ruleset**: `{ruleset_name}`.\n"
    if class_name:
        cot_answer += f"4. **Java class**: `{class_name}`"
        if base_class:
            cot_answer += f" extends `{base_class}`"
        cot_answer += ".\n"
    if purpose_branches:
        cot_answer += f"5. **Purpose branches**: {', '.join(f'`{p}`' for p in purpose_branches)}.\n"
    cot_answer += f"\n**Conclusion**: This is {rt_desc} in the **{ns_label}** application."
    cot_answer += "\n\nConfidence: 95%"

    q1_text = f"What type of Pega rule is this file and what does it do?\n\n{code_block}"
    pairs.append(msg(q1_text, cot_answer))
    for pq in paraphrase_question(q1_text, code_block):
        pairs.append(msg(pq, cot_answer))

    # ── Q2: Namespace ────────────────────────────────────────────────────────
    a2 = (
        f"This rule belongs to the **{ns_label}** application (namespace: `{namespace}`). "
        f"Pega uses namespace prefixes to organize rules by application layer, "
        f"allowing inheritance and overrides across the ruleset stack.\n\n"
        f"Confidence: 95%"
    )
    q2_text = f"Which Pega application namespace does this rule belong to?\n\n{code_block}"
    pairs.append(msg(q2_text, a2))
    for pq in paraphrase_question(q2_text, code_block):
        pairs.append(msg(pq, a2))

    # ── Q3: Methods (code-grounded) ──────────────────────────────────────────
    if methods:
        a3 = (
            f"The following methods are defined in `{class_name or filename}`:\n"
            + "\n".join(f"- `{m}()`" for m in methods)
            + f"\n\nThis is in the **{ns_label}** application.\n\nConfidence: 90%"
        )
        q3 = f"What methods are defined in this Pega rule?\n\n{code_block}"
        pairs.append(msg(q3, a3))
        for pq in paraphrase_question(q3, code_block):
            pairs.append(msg(pq, a3))

    # ── Q4: Properties (code-grounded) ───────────────────────────────────────
    if properties:
        a4 = (
            f"This rule reads/writes these Pega properties:\n"
            + "\n".join(f"- `{p}`" for p in properties)
            + f"\n\nAccessed via the `tools` API in **{ns_label}**.\n\nConfidence: 90%"
        )
        q4 = f"What Pega properties does this rule read or write?\n\n{code_block}"
        pairs.append(msg(q4, a4))
        for pq in paraphrase_question(q4, code_block):
            pairs.append(msg(pq, a4))

    # ── Q5: Flow/activity calls ──────────────────────────────────────────────
    if flow_calls:
        a5 = (
            f"This rule invokes:\n"
            + "\n".join(f"- `{c}`" for c in flow_calls)
            + f"\n\nPart of the **{ns_label}** application.\n\nConfidence: 85%"
        )
        q5 = f"What flows or activities does this rule invoke?\n\n{code_block}"
        pairs.append(msg(q5, a5))

    # ── Q6: Purpose branches ─────────────────────────────────────────────────
    if purpose_branches:
        branch_desc = {
            "CREATECASE": "initializes a new case/work object",
            "GETSTARTINGFLOWS": "returns starting flows",
            "ADHOCFLOWS": "returns ad-hoc flows",
            "GETFLOWCALLPARAMS": "retrieves flow call parameters",
            "GETDEADLINES": "defines SLA timings",
        }
        detail = "\n".join(
            f"- `{b}`: {branch_desc.get(b, 'handles ' + b + ' logic')}"
            for b in purpose_branches
        )
        a6 = f"This Case Type in **{ns_label}** handles:\n{detail}\n\nConfidence: 90%"
        q6 = f"What purpose branches does this Case Type rule handle?\n\n{code_block}"
        pairs.append(msg(q6, a6))

    # ── Q7: Work object ──────────────────────────────────────────────────────
    if work_object:
        a7 = (
            f"This rule belongs to the **{work_object}** work object class "
            f"in the **{ns_label}** application. In Pega, work objects are the "
            f"primary entities users interact with.\n\nConfidence: 90%"
        )
        pairs.append(msg(
            f"Which case type or work object does this Pega rule belong to?\n\n{code_block}", a7
        ))

    # ── Q8: Summary (chain-of-thought) ───────────────────────────────────────
    parts = [f"This is {rt_desc} in the **{ns_label}** Pega application."]
    if class_name:
        parts.append(f"Java class: `{class_name}`.")
    if base_class:
        parts.append(f"Extends: `{base_class}`.")
    if work_object:
        parts.append(f"Work object: **{work_object}**.")
    if methods:
        parts.append(f"Key methods: {', '.join(f'`{m}()`' for m in methods[:5])}.")
    if properties:
        parts.append(f"Properties: {', '.join(f'`{p}`' for p in properties[:5])}.")
    if purpose_branches:
        parts.append(f"Purposes: {', '.join(purpose_branches)}.")
    parts.append("\nConfidence: 90%")
    a8 = " ".join(parts)

    q8 = f"Summarize what this Pega rule file does.\n\n{code_block}"
    pairs.append(msg(q8, a8))
    for pq in paraphrase_question(q8, code_block):
        pairs.append(msg(pq, a8))

    # ── Q9: Filename explanation ─────────────────────────────────────────────
    a9 = (
        f"Pega generates filenames encoding the full rule key:\n"
        f"- **Rule type**: `{rule_type}` — {rt_desc}\n"
        f"- **Namespace**: `{namespace}` — {ns_label}\n"
    )
    if work_object:
        a9 += f"- **Work object**: `{work_object}`\n"
    a9 += (
        "- **Timestamp suffix** (e.g. `_20260221T064320_702_GMT`): rule version/checkin time\n"
        "- **Action/Stream**: `_Action_` = execution logic; `_Stream_` = HTML output\n\n"
        "Confidence: 95%"
    )
    q9 = f"Explain the naming convention of this Pega rule file: `{filename}`"
    pairs.append(msg(q9, a9))

    # ── Q10: Rule relationships ──────────────────────────────────────────────
    relations = {
        "Rule_Obj_CaseType": (
            f"This Case Type in **{ns_label}** orchestrates:\n"
            "- **Flow rules** — process/workflow steps\n"
            "- **Flow Action rules** — user forms at each step\n"
            "- **Harness/Section rules** — UI rendering\n"
            "- **Report Definitions** — work list queries\n\nConfidence: 90%"
        ),
        "Rule_Obj_Flow": (
            f"This Flow in **{ns_label}** connects to:\n"
            "- **Case Type** which invokes it\n"
            "- **Flow Actions** appearing as assignment steps\n"
            "- **Activities** for server-side logic\n"
            "- **Decision rules** for routing\n\nConfidence: 90%"
        ),
        "Rule_HTML_Section": (
            f"This Section in **{ns_label}** relates to:\n"
            "- **Harness rules** that embed it\n"
            "- **Flow Actions** that reference it as UI\n"
            "- **Property rules** defining its data fields\n\nConfidence: 90%"
        ),
    }
    a10 = relations.get(
        rule_type,
        f"This `{rule_type}` in **{ns_label}** works with Case Types, Flows, "
        f"Sections/Harnesses, and Activities.\n\nConfidence: 85%"
    )
    pairs.append(msg(
        f"How does this rule relate to other rules in the Pega application?\n\n{code_block}", a10
    ))

    return pairs


# ── Raw file code-in-context ─────────────────────────────────────────────────

def make_raw_file_example(path: pathlib.Path) -> dict | None:
    try:
        source = path.read_text(encoding="utf-8", errors="replace")
    except Exception:
        return None

    source = strip_copyright_header(source)

    filename = path.name
    rule_type = detect_rule_type(filename)
    namespace = detect_namespace(filename)

    # Skip files with unidentifiable rule type or namespace — teaching "Unknown"
    # pollutes the model and causes false negatives during inference.
    if rule_type == "Unknown" or namespace == "Unknown":
        return None

    ns_label = NAMESPACE_MAP.get(namespace, namespace)
    rt_desc = RULE_TYPE_DESCRIPTIONS.get(rule_type, f"a Pega rule of type {rule_type}")

    max_lines = RAW_MAX_LINES.get(rule_type, 400)
    lines = source.splitlines()
    if len(lines) > max_lines:
        source = "\n".join(lines[:max_lines]) + f"\n// ... (truncated at {max_lines} lines)"

    methods = extract_methods(source)
    properties = extract_properties(source)

    ack = f"I have analyzed this Pega rule file: `{filename}`.\n\n"
    ack += f"- **Rule type**: {rt_desc}\n"
    ack += f"- **Application**: {ns_label} (`{namespace}`)\n"
    if methods:
        ack += f"- **Methods**: {', '.join(f'`{m}()`' for m in methods[:8])}\n"
    if properties:
        ack += f"- **Properties**: {', '.join(f'`{p}`' for p in properties[:8])}\n"
    ack += "\nI can answer questions about this rule's structure and behavior."

    return msg(
        f"Here is a Pega rule file. Study its contents.\n\n"
        f"**Filename:** `{filename}`\n\n```java\n{source}\n```",
        ack,
    )


# ── Negative / anti-hallucination examples (5× more than v1) ─────────────────

def make_negative_examples(known_files: list[str], known_ns: list[str]) -> list[dict]:
    """
    Generate diverse negative examples. This is THE key fix for hallucination.
    The model must learn to say "I don't know" confidently.
    """
    negs = []
    IDK = (
        "I don't have that in my training data. I was trained on a specific set of "
        "Pega rule files from this repository, and what you're asking about does not "
        "appear in any of them. Please verify the exact rule name or check a different "
        "ruleset layer.\n\nConfidence: 95% (confident this is NOT in my data)"
    )

    # ── 1. Fake rule names (plausible but non-existent) ──────────────────────
    fake_rules = [
        "Rule_Obj_CaseType_LTM_Enrollment_Work_Enrollment_AdvancedStage",
        "Rule_Obj_Flow_OOD4NM_Loan_Work_Loan_ApprovalFlow",
        "Rule_Obj_Activity_OFON2J_ProcessO_Work_Onboarding_ValidateKYC",
        "Rule_HTML_Section_LTM_Onboarding_Work_Onboarding_DocumentUpload",
        "Rule_Obj_FlowAction_OLFHF9_Onboaring_Work_Onboarding_ReviewDetails",
        "Rule_Obj_Model_OOD4NM_Loan_Work_Loan_CreditScoreDefaults",
        "Rule_Obj_Report_Definition_LTM_BFS_Work_Enrollment_AuditReport",
        "Rule_Obj_Activity_LTM_Enrollment_Work_Enrollment_SendNotification",
        "Rule_Obj_Flow_LTM_Enrollment_Work_Enrollment_EscalationFlow",
        "Rule_HTML_Section_OFON2J_ProcessO_Work_Onboarding_PaymentCapture",
        "Rule_Obj_CaseType_OLFHF9_Onboaring_Work_Claims_pyDefault",
        "Rule_Obj_Activity_OOD4NM_Loan_Work_Loan_CalculateInterest",
        "Rule_HTML_Harness_LTM_BFS_Work_Enrollment_Approval",
        "Rule_Obj_Flow_OLFHF9_Onboaring_Work_Onboarding_VerificationFlow",
        "Rule_Obj_Model_LTM_Enrollment_Work_Enrollment_RiskAssessment",
        "Rule_Declare_Index_LTM_Onboarding_Work_Onboarding_SSNIndex",
    ]

    for fake in fake_rules:
        # Ask what it does
        negs.append(msg(f"What does the rule `{fake}` do?", IDK, weight=1.0))
        # Ask for source
        negs.append(msg(f"Show me the source code for `{fake}`.", IDK, weight=1.0))
        # Ask about methods in it
        negs.append(msg(f"What methods does `{fake}` define?", IDK, weight=1.0))

    # ── 2. Fake namespace questions ──────────────────────────────────────────
    fake_ns = [
        "LTM_KYC", "OOD4NM_Mortgage", "OLFHF9_Claims", "OFON2J_Collections",
        "LTM_Insurance", "OLFHF9_Payments", "OOD4NM_CreditCard", "OFON2J_Billing",
    ]
    ns_list_str = ", ".join(f"`{k}`" for k in known_ns)
    for ns in fake_ns:
        negs.append(msg(
            f"What rules exist in the `{ns}` namespace?",
            f"I don't have any rules from the `{ns}` namespace in my training data. "
            f"The namespaces I know are: {ns_list_str}. I cannot provide information "
            f"about namespaces outside this set.\n\nConfidence: 95%",
            weight=1.0,
        ))
        negs.append(msg(
            f"Tell me about the `{ns}` application.",
            f"The `{ns}` application is not in my training data. "
            f"I was trained on: {ns_list_str}.\n\nConfidence: 95%",
            weight=1.0,
        ))

    # ── 3. Fake method/property questions ────────────────────────────────────
    fake_method_qs = [
        ("What does the `validateCreditScore()` method do in the Loan case type?",
         "I don't have a `validateCreditScore()` method anywhere in the Loan case type rules. "
         "The OOD4NM Loan rules I was trained on don't contain this method.\n\nConfidence: 95%"),
        ("Which rule handles the `STAGE_Approval` purpose in Enrollment?",
         "I don't have a `STAGE_Approval` purpose branch in any Enrollment case type. "
         "The standard purposes I've seen are CREATECASE, GETSTARTINGFLOWS, ADHOCFLOWS.\n\nConfidence: 95%"),
        ("Does the onboarding flow have a background check step?",
         "No. The onboarding flows I was trained on include CreateForm, Stage1, "
         "CollectInformation, and Resolution — none contain a background check step.\n\nConfidence: 90%"),
        ("What does the `sendEmail()` activity do in the Enrollment case?",
         "I don't have a `sendEmail()` activity in any Enrollment rule. This method "
         "does not appear in my training data.\n\nConfidence: 95%"),
        ("Show me the KYC validation logic in ProcessO.",
         "There is no KYC validation logic in the OFON2J ProcessO rules I was trained on. "
         "The ProcessO rules handle onboarding with CollectInformation and Resolution flows.\n\nConfidence: 90%"),
        ("What database tables does the Loan case type use?",
         "I don't have information about specific database tables. My training data "
         "consists of Java rule files, not database schema definitions.\n\nConfidence: 90%"),
        ("What REST APIs are exposed by the onboarding application?",
         "I don't have REST API definitions in my training data. I was trained on "
         "Pega Java rule files (Case Types, Flows, Sections, etc.), not service rule definitions.\n\nConfidence: 90%"),
        ("How do I configure SSO for the Pega portal?",
         "I don't have SSO or authentication configuration in my training data. "
         "I was trained on application rule files. For SSO setup, consult the Pega "
         "Platform Security documentation.\n\nConfidence: 85%"),
        ("What is the approval workflow in the Loan application?",
         "I don't see an approval workflow in the OOD4NM Loan rules. The Loan case type "
         "I was trained on has a CreateForm flow but no approval-specific flow.\n\nConfidence: 90%"),
        ("Explain the pyDecisionTree rule in Enrollment.",
         "I don't have a pyDecisionTree rule in the Enrollment rules. The LTM Enrollment "
         "rules I was trained on include CaseType, Flow, Report Definitions, and UI rules, "
         "but no Decision Tree rules.\n\nConfidence: 90%"),
    ]
    for q, a in fake_method_qs:
        negs.append(msg(q, a, weight=1.0))

    # ── 4. Cross-namespace confusion (model should not mix up namespaces) ────
    cross_ns_qs = [
        ("Does the LTM Enrollment application have a Resolution flow?",
         "No. The LTM Enrollment application only has a CreateForm (Default) flow. "
         "The Resolution flow exists in OLFHF9 Onboarding and OFON2J ProcessO, "
         "but NOT in LTM Enrollment.\n\nConfidence: 90%"),
        ("Is there a CollectInformation flow in OLFHF9 Onboarding?",
         "No. The CollectInformation flow belongs to **OFON2J ProcessO**, not OLFHF9 Onboarding. "
         "OLFHF9 Onboarding has CreateForm, Stage1, and Resolution flows.\n\nConfidence: 90%"),
        ("Does the Loan application have an OnboaringProcess sub-case?",
         "No. The OnboaringProcess sub-case exists only in the **OLFHF9 Onboarding** application. "
         "The OOD4NM Loan application has a single Loan case type.\n\nConfidence: 95%"),
        ("Is there a FlowAction rule in LTM Onboarding?",
         "No. I don't have any FlowAction rules for LTM Onboarding in my training data. "
         "FlowAction rules exist in OFON2J ProcessO (CollectInformation).\n\nConfidence: 90%"),
        ("Does LTM BFS have different rules from LTM Enrollment?",
         "LTM BFS and LTM Enrollment contain the same set of rules (identical CaseType, Flow, "
         "Reports, UI rules). LTM BFS is the base layer; LTM Enrollment extends it. "
         "They share the Work-Enrollment class.\n\nConfidence: 85%"),
    ]
    for q, a in cross_ns_qs:
        negs.append(msg(q, a, weight=1.5))

    # ── 5. General out-of-scope questions ────────────────────────────────────
    oos_qs = [
        ("How do I deploy this Pega application to production?",
         "Deployment procedures are not part of my training data. I was trained on Java rule files, "
         "not deployment scripts or infrastructure configs.\n\nConfidence: 90%"),
        ("What version of Pega Platform was used to generate these rules?",
         "I cannot determine the exact Pega Platform version from the generated Java code alone. "
         "The files follow Pega code generation patterns but the version is not embedded.\n\nConfidence: 80%"),
        ("Can you write a new Flow rule for customer verification?",
         "I can describe how Pega flow rules are structured based on the patterns I've seen, "
         "but I should not generate new rule code that might introduce incorrect names or "
         "non-existent references. The existing flows I know about are: CreateForm, Stage1, "
         "CollectInformation, and Resolution.\n\nConfidence: 70%"),
        ("What is Pega PRPC?",
         "Pega PRPC (PegaRULES Process Commander) is the older name for the Pega platform. "
         "However, general Pega platform knowledge is outside the scope of my specific training data. "
         "I was trained on a specific set of Java rule files from this repository.\n\nConfidence: 60%"),
    ]
    for q, a in oos_qs:
        negs.append(msg(q, a, weight=1.0))

    return negs


# ── Business documentation Q&A ───────────────────────────────────────────────

# Mapping from doc filename → list of (question, answer) tuples.
# We also auto-generate Q&A by extracting sections from each markdown file.

_DOCS_STATIC_QA: list[tuple[str, str]] = [
    # BUSINESS_EPIC.md
    (
        "What is the high-level business goal of this Pega migration project?",
        "The initiative rewrites Pega-based case management interfaces and Java artifacts into "
        "a React frontend + Spring Boot backend + Postgres + Redis stack. Goals: 50% faster "
        "time-to-market for feature changes, enhanced operational visibility (Prometheus/Grafana), "
        "lower operational cost via containerised deployment, improved UX/mobile support, and "
        "better version-control transparency of business logic.\n\nConfidence: 95%"
    ),
    (
        "What are the in-scope case types for the Pega migration?",
        "In-scope: Enrollment (LTM), Onboarding variants (OLFHF9, LTM, ProcessO), and Loan. "
        "Workflows include CreateForm_Default, Stage flows, Resolution, and CollectInformation. "
        "Flow actions, validation rules, audit logging, RBAC, SLA management, and geo/search "
        "integrations are also in scope.\n\nConfidence: 95%"
    ),
    (
        "What are the main risks in migrating from Pega?",
        "Key risks: (1) Complexity transferring Pega artifacts to a relational data model. "
        "(2) Semantic differences between implicit Pega constructs and explicit code. "
        "(3) Ensuring geo/search performance parity (PostGIS). "
        "(4) Stakeholder buy-in on UI/UX equivalence. "
        "Mitigations: run both systems concurrently (canary), document entity mappings, "
        "automated reconciliation.\n\nConfidence: 95%"
    ),
    # BUSINESS_STORIES.md
    (
        "What are the P0 (must-have MVP) user stories for this migration?",
        "P0 stories: (1) Customer creates Onboarding case via multi-step wizard. "
        "(2) Case Worker sees prioritised, pageable case list with SLA coloring. "
        "(3) Case Worker views full case detail (header, sections, attachments, history). "
        "(4) Client-side phone/email validation prevents submission errors. "
        "(5) JWT-based auth with role checks (returns 403 when unauthorised).\n\nConfidence: 95%"
    ),
    (
        "How does the new system support geo-filtering of cases?",
        "Story 5 (P1): Product Owner wants faceted search with proximity filtering "
        "(km-radius). The backend uses PostGIS geo-spatial indexes on stored lat/lon "
        "coordinates. Addresses are validated and geocoded on submission; "
        "proximity queries use `ST_DWithin` or equivalent PostGIS function.\n\nConfidence: 90%"
    ),
    # CASE_TYPE_DIFFERENCES.md
    (
        "How do LTM BFS and LTM Enrollment differ?",
        "They are virtual duplicates (~99% identical). Both share the Work-Enrollment class "
        "and the same CaseType, Flow, Report Definition, and UI rules. LTM_BFS is the base "
        "framework layer; LTM_Enrollment is the derived application. "
        "The analysis recommends consolidating them.\n\nConfidence: 90%"
    ),
    (
        "What makes OFON2J ProcessO unique compared to other onboarding case types?",
        "ProcessO has a 3-stage workflow (PRIM0 → PRIM1 → PRIM2) instead of single-stage; "
        "it uniquely supports geographic/location indexing (HomeAddress geo-coordinates); "
        "and it has a dedicated CollectInformation FlowAction. Other onboarding variants "
        "use a simpler CreateForm → Stage1 → Resolution pattern.\n\nConfidence: 90%"
    ),
    (
        "What is different about OnboaringProcess compared to Onboarding?",
        "OnboaringProcess (OLFHF9) sets `mTraceInfo = null` unlike other case types, "
        "suggesting distinct logging/tracing. It emphasises performance metrics and "
        "process tracking (taskCount, tasksCompleted) rather than standard event capture. "
        "It is a sub-process case within the OLFHF9 application.\n\nConfidence: 85%"
    ),
    # CORE_BUSINESS_FUNCTIONS.md
    (
        "What is the case lifecycle for all case types?",
        "Standard transitions: CREATE → INITIALIZATION → ASSIGN → IN_PROGRESS → COMPLETE → CLOSED. "
        "No shortcuts — all stages are required. Each transition logs old/new state, reason, and "
        "timestamp. SLA: 15 business days for standard enrollment; overdue cases escalate to "
        "manager after 5 days.\n\nConfidence: 95%"
    ),
    (
        "What validation rules must be ported from Pega?",
        "Key validators: (1) Phone — international `+1-999-999-9999` or domestic `999-999-9999`. "
        "(2) Email — RFC 5322 format. (3) Country — ISO 3166-1 alpha-2. "
        "(4) Value range — `ra_validate_casematch_value0to100_*`. "
        "(5) Required field — non-null and non-empty. "
        "(6) Address — format + geocoding. (7) Duplicate check by email/phone. "
        "Port to JSR-380 server-side + HTML5 client-side validators.\n\nConfidence: 95%"
    ),
    (
        "What RBAC roles exist in this system and what can they do?",
        "Four roles: Admin (full access), Manager (approve transitions, view all-team reports), "
        "CaseWorker (process assigned cases), Customer (create/view own cases). "
        "Managers and Admins can approve final stage; CaseWorkers cannot. "
        "Only Admins can delete. Enforced via JWT and When-condition privilege checks "
        "like `pzCanmodifyApplication` and `checkInstanceAccess()`.\n\nConfidence: 95%"
    ),
    (
        "What are the Tier 1 MVP functions to rebuild from Pega?",
        "Tier 1: Case CRUD, paginated/filterable case list, full case detail with edit, "
        "multi-step create wizard, phone/email/required-field validation, "
        "case status transitions, and JWT-based auth + RBAC.\n\nConfidence: 95%"
    ),
    (
        "What technology stack is recommended for rebuilding this system?",
        "Backend: Spring Boot 3.x with Postgres + PostGIS (geo queries) and Redis (caching). "
        "Frontend: React + TypeScript. API: REST + OpenAPI. Auth: JWT (OAuth2 optional). "
        "Validation: JSR-380 server + HTML5 client. Async: Spring @Async for notifications/reports. "
        "Audit: JPA entity listeners.\n\nConfidence: 95%"
    ),
    # DOMAIN_MODEL_MAPPING.md
    (
        "How does the Pega Case entity map to a Spring Boot JPA entity?",
        "The base `Case` entity uses `@Inheritance(JOINED)` with a `case_type` discriminator. "
        "Key fields: `id` (UUID PK), `pyID` (unique String), `pyStatusWork` (Enum: CREATE/INITIALIZATION/"
        "ASSIGN/IN_PROGRESS/COMPLETE/CLOSED), `pxCreateDateTime` (immutable LocalDateTime), "
        "`pxCreateOpName` (creator), `pyLabel`, `pyDescription`, `customProperties` (Map), "
        "`transitions` (audit trail), `attachments`, `updatedAt`, `closedAt`.\n\nConfidence: 95%"
    ),
    (
        "How is the HomeAddress complex type stored in the new system?",
        "HomeAddress is an `@Embeddable` Spring entity with: street, city, stateProvince, "
        "postalCode, country (ISO-2), latitude, longitude (Double), accuracy Enum "
        "(ROOFTOP/RANGE_INTERPOLATED/GEOMETRIC_CENTER/APPROXIMATE), and lastValidated. "
        "In Postgres, a PostGIS `geography(POINT, 4326)` column is added for geo queries, "
        "indexed with `CREATE INDEX ... USING GIST`.\n\nConfidence: 95%"
    ),
    (
        "What Spring entity represents the ProcessO case type?",
        "ProcessOOnboardingCase extends Case with discriminator `ONBOARDING_PROCESSO`. "
        "It adds: firstName, lastName, emailAddress, phone, country, `@Embedded homeAddress`, "
        "`currentStage` (Enum: PRIM0_COLLECTION/PRIM1_VALIDATION/PRIM2_CONFIRMATION/RESOLUTION), "
        "`stageRetryCount`, and a `@OneToMany` list of `ValidationCheckpoint` entities "
        "(each with checkpointName, status, checkpointDate, checkpointDetails).\n\nConfidence: 95%"
    ),
    (
        "How is the Loan case type modelled in Spring Boot?",
        "LoanCase extends Case with discriminator `LOAN`. Extra fields: applicantFirstName, "
        "applicantLastName, applicantEmail, applicantPhone, `currentStage` (Enum: APPLICATION → "
        "INTAKE → UNDERWRITING → APPRAISAL → FUNDING → DISBURSEMENT → CLOSED), loanAmount "
        "(BigDecimal), approvedAmount, loanStatus (APPLIED/APPROVED/REJECTED/FUNDED/CLOSED), "
        "interestRate (Double), loanTermMonths (Integer), disbursementDate (LocalDate).\n\nConfidence: 95%"
    ),
    (
        "What database indexes are needed for this system?",
        "Key indexes: pyID (unique lookup), pyStatusWork, pxCreateDateTime; email/phone/firstName "
        "(filtered to ONBOARDING rows); GIST spatial index on `home_address_geom` (PostGIS); "
        "GIN index on `custom_properties` JSONB; transition case_id and time indexes for audit "
        "trail queries; SLA due-time index for overdue detection.\n\nConfidence: 90%"
    ),
    # REQUIREMENTS.md / DESIGN.md (already in repo, add a couple cross-links)
    (
        "What is the API contract for creating an Onboarding case?",
        "POST /api/cases/create — request body includes caseType (`OLFHF9-Onboarding`), "
        "firstName, lastName, emailAddress, phone (validated format), country (ISO-2), "
        "and optional homeAddress (street, city, state, postalCode). "
        "Response 201: { status: SUCCESS, caseId: 'OLFHF9-ONBOARDING-2026-001234', "
        "message: 'Case created successfully', nextStep: 'CollectInformation' }.\n\nConfidence: 90%"
    ),
    # corepegafilessummary.md
    (
        "What are the high-value migration targets in the Pega generated code?",
        "Priority targets: (1) `casetype/ra_action_pydefault_*` — implement base Case entity "
        "initialization. (2) `flow/createform_default` and `flow/collectinformation` — REST endpoints "
        "+ workflow service. (3) Validation rules — port to JSR-380 + React. "
        "(4) `Rule_Declare_Index` / address indexing — Postgres/PostGIS schema. "
        "(5) HTML harness & stream handlers — map to React components (list/detail/create-wizard)."
        "\n\nConfidence: 95%"
    ),
    (
        "What types of Pega rule files are in the generated Java code?",
        "Rule categories in `com/pegarules/generated`: casetype (case initialization), "
        "flow (workflow orchestration), flowaction (interactive steps), model (data transforms), "
        "validate (phone/email/URI/range validators), html_harness (portal entry points), "
        "html_section (reusable UI panels), stream handlers (sh_stream_*), when/decision "
        "conditions, portalskin (theming), automation/onchange handlers.\n\nConfidence: 95%"
    ),
    (
        "What MVP approach is recommended for the migration?",
        "Start with one case type end-to-end: OLFHF9 Onboarding as the MVP. Implement "
        "API (Spring Boot), DB model (Postgres + PostGIS for geo), UI (React), validation, "
        "and geo-indexing. Then produce an OpenAPI skeleton and a small Spring Boot + React PoC. "
        "Run both systems concurrently during canary phase.\n\nConfidence: 90%"
    ),
]


def make_docs_qa() -> list[dict]:
    """
    Generate training examples from business documentation in docs/.
    Two sources:
      1. Static curated Q&A pairs defined above.
      2. Auto-extracted section headers + bodies from markdown files.
    """
    pairs = []

    # ── 1. Static curated Q&A ────────────────────────────────────────────────
    for q, a in _DOCS_STATIC_QA:
        pairs.append(msg(q, a, weight=1.0))

    # ── 2. Auto-extract sections from markdown docs ──────────────────────────
    if not DOCS_DIR.exists():
        return pairs

    # Only include docs that contain substantial business content (skip JSON/CSV and macOS ._* files)
    doc_files = [
        f for f in sorted(DOCS_DIR.glob("*.md"))
        if not f.name.startswith("._") and f.stat().st_size < 200_000
    ]

    for doc_path in doc_files:
        try:
            text = doc_path.read_text(encoding="utf-8", errors="replace")
        except Exception:
            continue

        # Split on ## or ### headings
        sections = re.split(r'\n(?=#{2,3} )', text)
        for section in sections:
            lines = section.strip().splitlines()
            if not lines:
                continue
            heading_line = lines[0].strip()
            # Must be a real heading
            if not heading_line.startswith("##"):
                continue
            heading = re.sub(r'^#+\s*', '', heading_line).strip()
            body_lines = [l for l in lines[1:] if l.strip()]
            if len(body_lines) < 3:
                continue

            # Use first 30 lines of body as context
            body = "\n".join(body_lines[:30]).strip()
            if len(body) < 80:
                continue

            q = f"In the context of the Pega migration project, what does the section '{heading}' cover?"
            a = (
                f"From `{doc_path.name}`, section **{heading}**:\n\n"
                + body[:800]
                + ("\n\n..." if len(body) > 800 else "")
                + "\n\nConfidence: 85%"
            )
            pairs.append(msg(q, a, weight=1.0))

    # ── 3. Raw doc file code-in-context examples ─────────────────────────────
    # Feed the full markdown as a "Study its contents" example so the model
    # can answer arbitrary questions about each document.
    RAW_DOC_MAX_CHARS = 12000  # ~3000 tokens; keeps total example well within 4096 token budget

    for doc_path in doc_files:
        try:
            text = doc_path.read_text(encoding="utf-8", errors="replace")
        except Exception:
            continue

        if len(text) > RAW_DOC_MAX_CHARS:
            text = text[:RAW_DOC_MAX_CHARS] + f"\n\n... (truncated at {RAW_DOC_MAX_CHARS} chars)"

        # Build a short acknowledgement summarising the document
        first_heading = ""
        for line in text.splitlines():
            if line.startswith("# "):
                first_heading = line.lstrip("# ").strip()
                break

        ack = (
            f"I have studied `{doc_path.name}` — **{first_heading or doc_path.stem}**.\n\n"
            f"This is a business/technical documentation file for the Pega migration project. "
            f"I can answer questions about its content including case types, workflows, "
            f"data models, validation rules, RBAC, and migration recommendations."
        )

        pairs.append(msg(
            f"Here is a business documentation file for the Pega migration project. "
            f"Study its contents.\n\n"
            f"**Filename:** `{doc_path.name}`\n\n```markdown\n{text}\n```",
            ack,
            weight=1.0,
        ))

    return pairs


# ── Application-level Q&A ────────────────────────────────────────────────────

def make_app_level_qa() -> list[dict]:
    pairs = []

    app_qa = [
        (
            "What Pega applications are in this repository?",
            "This repository contains 6 Pega applications:\n"
            "1. **LTM Enrollment** (`LTM_Enrollment`) — customer enrollment\n"
            "2. **LTM Onboarding** (`LTM_Onboarding`) — onboarding process\n"
            "3. **LTM BFS** (`LTM_BFS`) — Back-office Financial Services (base layer for Enrollment)\n"
            "4. **OOD4NM Loan** (`OOD4NM_Loan`) — loan case management\n"
            "5. **OLFHF9 Onboarding** (`OLFHF9_Onboaring`) — multi-stage onboarding with sub-cases\n"
            "6. **OFON2J ProcessO** (`OFON2J_ProcessO`) — process orchestration for onboarding\n\n"
            "Confidence: 95%"
        ),
        (
            "What case types exist in this codebase?",
            "Case types defined:\n"
            "- **Enrollment** (LTM_Enrollment, LTM_BFS)\n"
            "- **Onboarding** (LTM_Onboarding, OLFHF9_Onboaring, OFON2J_ProcessO)\n"
            "- **OnboaringProcess** (OLFHF9_Onboaring) — sub-process case\n"
            "- **Loan** (OOD4NM_Loan)\n\n"
            "Each has a `Rule_Obj_CaseType` rule defining stages, flows, and lifecycle.\n\nConfidence: 95%"
        ),
        (
            "What flows are defined in this codebase?",
            "Flows:\n"
            "- **CreateForm (Default)** — all apps; initial case creation\n"
            "- **CollectInformation** (OFON2J_ProcessO) — collects onboarding data\n"
            "- **Resolution** (OLFHF9_Onboaring, OFON2J_ProcessO) — case resolution\n"
            "- **Stage1** (OLFHF9_Onboaring) — first onboarding stage\n\n"
            "Each is a `Rule_Obj_Flow` invoked by its Case Type.\n\nConfidence: 95%"
        ),
        (
            "What UI rules exist in this codebase?",
            "**Harnesses** (full page layouts):\n"
            "- Enrollment, Onboarding, Loan portals\n"
            "- Work object harnesses: Perform, Review, pyCreate\n\n"
            "**Sections** (reusable panels):\n"
            "- Content: EnrollmentContent, OnboardingContent, LoanContent\n"
            "- Headers: EnrollmentHeader, OnboardingHeader, LoanHeader\n"
            "- Lists: EnrollmentList, OnboardingList, LoanList\n"
            "- CollectInformation section (OFON2J_ProcessO)\n\n"
            "Each has `_Action_` (logic) and `_Stream_` (HTML) variants.\n\nConfidence: 95%"
        ),
        (
            "How is onboarding structured across namespaces?",
            "Onboarding is implemented with increasing complexity:\n\n"
            "1. **LTM_Onboarding** — basic; single CreateForm flow\n"
            "2. **OLFHF9_Onboaring** — extended; Stage1 + Resolution flows, "
            "plus OnboaringProcess sub-case\n"
            "3. **OFON2J_ProcessO** — process-oriented; CollectInformation flow, "
            "FlowAction for data capture, Model rule for defaults\n\n"
            "Pattern: CaseType → Flow → FlowAction → Section/Harness.\n\nConfidence: 90%"
        ),
        (
            "What is the difference between LTM_Enrollment and LTM_BFS?",
            "They are closely related:\n"
            "- Both have identical rule sets (CaseType, Flow, Reports, UI)\n"
            "- LTM_BFS is the base/framework layer\n"
            "- LTM_Enrollment is the derived application that can override\n"
            "- Standard Pega pattern: base app provides core rules, derived app specializes\n"
            "- Both share `Work-Enrollment` work object\n\nConfidence: 85%"
        ),
        (
            "What report definitions are available?",
            "Each app has 3 standard reports (`Rule_Obj_Report_Definition`):\n"
            "1. **DataTableEditorReport** — Data Table editor UI\n"
            "2. **pyDefaultReport** — default work list (open cases)\n"
            "3. **pyDefaultSummaryReport** — aggregate case counts\n\n"
            "Defined for: Enrollment, Onboarding, OnboaringProcess, Loan.\n\nConfidence: 95%"
        ),
        (
            "How would you add a new stage to OLFHF9 Onboarding?",
            "Steps to add a new stage:\n"
            "1. Edit `Rule_Obj_CaseType_OLFHF9_Onboaring_Work_Onboarding_pyDefault`\n"
            "2. Add purpose branch: `else if (purpose.equals('STAGE_NewName'))`\n"
            "3. Create new Flow: `Rule_Obj_Flow_OLFHF9_Onboaring_Work_Onboarding_NewStage_Flow`\n"
            "4. Create FlowAction and Section rules for UI\n"
            "5. Update GETSTARTINGFLOWS if needed\n\n"
            "Confidence: 80% (pattern-based; verify in Dev Studio)"
        ),
    ]

    for q, a in app_qa:
        pairs.append(msg(q, a))
        for pq in paraphrase_question(q):
            pairs.append(msg(pq, a))

    return pairs


# ── File processing ──────────────────────────────────────────────────────────

def process_file(path: pathlib.Path) -> list[dict]:
    filename = path.name
    try:
        source = path.read_text(encoding="utf-8", errors="replace")
    except Exception as e:
        print(f"  [WARN] could not read {filename}: {e}")
        return []

    source = strip_copyright_header(source)

    lines = source.splitlines()
    rule_type = detect_rule_type(filename)
    namespace = detect_namespace(filename)
    class_name, base_class = extract_class_info(source)
    ruleset_name = extract_ruleset_name(source)

    max_snip = SNIPPET_MAX_LINES.get(rule_type, 150)
    snippet = meaningful_snippet(lines, max_lines=max_snip)
    if not snippet.strip():
        snippet = "\n".join(lines[:max_snip])

    return generate_qa_pairs(
        filename=filename, rule_type=rule_type, namespace=namespace,
        class_name=class_name, base_class=base_class,
        ruleset_name=ruleset_name, snippet=snippet, source=source,
    )


# ── Main ─────────────────────────────────────────────────────────────────────

def main():
    parser = argparse.ArgumentParser(description="Pega Q&A dataset generator v2")
    parser.add_argument("--max_seq_length", type=int, default=4096,
                        help="Max token length; examples exceeding this are dropped (match train.py --max_seq_length)")
    parser.add_argument("--neg_ratio", type=float, default=0.20,
                        help="Target ratio of negative examples (default 20%%)")
    parser.add_argument("--no-raw-files", action="store_true",
                        help="Skip raw file code-in-context examples")
    parser.add_argument("--seed", type=int, default=42)
    args = parser.parse_args()

    random.seed(args.seed)
    OUTPUT_DIR.mkdir(parents=True, exist_ok=True)

    known_ns = list(NAMESPACE_MAP.keys())

    # ── Collect Java files ───────────────────────────────────────────────────
    seen = set()
    qa_files, all_java = [], []
    for f in sorted(REPO_ROOT.glob("**/*.java")):
        if "codellama" in str(f) or "ms-phi3-finetune" in str(f):
            continue
        if f.name in seen:
            continue
        seen.add(f.name)
        all_java.append(f)
        if any(ns in f.name for ns in known_ns):
            qa_files.append(f)

    print(f"Found {len(qa_files)} known-namespace files for Q&A")
    print(f"Found {len(all_java)} total Java files")

    # ── Hold out ~10% of files for validation (not random rows) ──────────────
    random.shuffle(qa_files)
    val_count = max(1, int(len(qa_files) * 0.10))
    val_files = set(f.name for f in qa_files[:val_count])
    train_qa_files = [f for f in qa_files if f.name not in val_files]
    val_qa_files = [f for f in qa_files if f.name in val_files]

    print(f"  Train files: {len(train_qa_files)}, Validation files: {len(val_qa_files)}")

    # ── Generate Q&A from train files ────────────────────────────────────────
    all_pairs = []
    type_counts = Counter()
    for path in train_qa_files:
        pairs = process_file(path)
        all_pairs.extend(pairs)
        rt = detect_rule_type(path.name)
        type_counts[rt] += len(pairs)
        print(f"  {path.name}: {len(pairs)} pairs")

    # ── Generate Q&A from validation files ───────────────────────────────────
    val_pairs = []
    for path in val_qa_files:
        pairs = process_file(path)
        val_pairs.extend(pairs)

    # ── Raw file examples ────────────────────────────────────────────────────
    if not args.no_raw_files:
        raw_count = 0
        for path in all_java:
            if path.name in val_files:
                continue  # keep val files truly held out
            ex = make_raw_file_example(path)
            if ex:
                all_pairs.append(ex)
                raw_count += 1
        print(f"  + {raw_count} raw file code-in-context examples")

    # ── App-level Q&A ────────────────────────────────────────────────────────
    app_qa = make_app_level_qa()
    all_pairs.extend(app_qa)
    print(f"  + {len(app_qa)} app-level Q&A pairs")

    # ── Business docs Q&A ─────────────────────────────────────────────────────
    docs_qa = make_docs_qa()
    all_pairs.extend(docs_qa)
    print(f"  + {len(docs_qa)} business docs Q&A pairs")

    # ── Negative examples ────────────────────────────────────────────────────
    negatives = make_negative_examples(
        known_files=[f.stem for f in qa_files],
        known_ns=known_ns,
    )
    all_pairs.extend(negatives)
    print(f"  + {len(negatives)} negative/anti-hallucination examples")

    # ── Apply weights (duplicate high-weight examples) ───────────────────────
    weighted_pairs = []
    for p in all_pairs:
        w = p.pop("_weight", 1.0)
        count = max(1, int(w))
        weighted_pairs.extend([p] * count)

    # remove weight from val too
    for p in val_pairs:
        p.pop("_weight", None)

    # ── Filter by token length ───────────────────────────────────────────────
    before = len(weighted_pairs)
    weighted_pairs = [
        p for p in weighted_pairs
        if approx_tokens(json.dumps(p)) <= args.max_seq_length
    ]
    dropped = before - len(weighted_pairs)
    if dropped:
        print(f"  Dropped {dropped} train examples exceeding ~{args.max_seq_length} tokens")

    val_before = len(val_pairs)
    val_pairs = [
        p for p in val_pairs
        if approx_tokens(json.dumps(p)) <= args.max_seq_length
    ]
    val_dropped = val_before - len(val_pairs)
    if val_dropped:
        print(f"  Dropped {val_dropped} validation examples exceeding ~{args.max_seq_length} tokens")

    # ── Shuffle and write ────────────────────────────────────────────────────
    random.shuffle(weighted_pairs)
    random.shuffle(val_pairs)

    train_path = OUTPUT_DIR / "train.jsonl"
    test_path = OUTPUT_DIR / "test.jsonl"
    full_path = OUTPUT_DIR / "pega_qa.jsonl"

    for path, data in [(train_path, weighted_pairs), (test_path, val_pairs), (full_path, weighted_pairs + val_pairs)]:
        with open(path, "w") as f:
            for item in data:
                f.write(json.dumps(item) + "\n")

    # ── Stats ────────────────────────────────────────────────────────────────
    _neg_prefixes = ("I don't have", "No.", "I don't see", "There is no",
                     "I cannot determine", "Deployment procedures",
                     "I can describe", "Pega PRPC")
    neg_count = len([
        p for p in weighted_pairs
        if p["messages"][2]["content"].strip().startswith(_neg_prefixes)
    ])
    neg_pct = neg_count / len(weighted_pairs) * 100 if weighted_pairs else 0

    print(f"\n{'=' * 60}")
    print(f"  DATASET STATISTICS (v3)")
    print(f"{'=' * 60}")
    print(f"  Train examples:     {len(weighted_pairs)}")
    print(f"  Validation examples: {len(val_pairs)}")
    print(f"  Total written:      {len(weighted_pairs) + len(val_pairs)}")
    print(f"  Negative examples:  {neg_count} ({neg_pct:.1f}%)")
    print(f"  Target neg ratio:   {args.neg_ratio * 100:.0f}%")
    print(f"\n  Rule type breakdown:")
    for rt, cnt in sorted(type_counts.items(), key=lambda x: -x[1]):
        print(f"    {rt}: {cnt}")
    print(f"\n  Files: {train_path}")
    print(f"         {test_path}")
    print(f"         {full_path}")
    print(f"{'=' * 60}")


if __name__ == "__main__":
    main()