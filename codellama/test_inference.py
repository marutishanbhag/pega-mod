"""
test_inference.py

Test the fine-tuned Pega Phi-3 model served via vLLM on RunPod.

Usage:
    python test_inference.py --base_url http://<RUNPOD_POD_IP>:8000

The vLLM server exposes an OpenAI-compatible API, so we use the openai SDK.
Install if needed: pip install openai
"""

import argparse
import json
import sys
from openai import OpenAI

SYSTEM_PROMPT = (
    "You are a Pega platform expert. You have deep knowledge of Pega rule types, "
    "rulesets, case types, flows, activities, and the Java source code that Pega "
    "generates for each rule. Answer questions clearly and accurately."
)

TEST_QUESTIONS = [
    {
        "label": "Rule type identification",
        "question": (
            "I have a Pega Java file named "
            "`Rule_Obj_CaseType_OOD4NM_Loan_Work_Loan_pyDefault_Action.java`. "
            "What type of Pega rule is this, and what does it do?"
        ),
    },
    {
        "label": "Namespace lookup",
        "question": (
            "Which Pega application does the namespace prefix `OLFHF9_Onboaring` belong to, "
            "and what does it manage?"
        ),
    },
    {
        "label": "Base class explanation",
        "question": (
            "Why do most Pega generated Java rule files extend "
            "`com.pega.pegarules.priv.AbstractFUASupport`? "
            "What capabilities does this base class provide?"
        ),
    },
    {
        "label": "Case type purpose branching",
        "question": (
            "In a Pega Case Type rule, what is the purpose of the "
            "`pyCaseTypePurpose` parameter and what values can it take?"
        ),
    },
    {
        "label": "Flow rule summary",
        "question": (
            "Explain the difference between a `Rule_Obj_Flow` and a `Rule_Obj_FlowAction` "
            "in the Pega platform."
        ),
    },
    {
        "label": "HTML Section vs Harness",
        "question": (
            "What is the difference between a `Rule_HTML_Section` and a `Rule_HTML_Harness` "
            "in Pega, and when would you use each?"
        ),
    },
    {
        "label": "Report Definition rule",
        "question": (
            "What does a `Rule_Obj_Report_Definition` rule do in Pega, "
            "and how is it used in case management?"
        ),
    },
    {
        "label": "Activity rule",
        "question": (
            "What is a Pega Activity rule (`Rule_Obj_Activity`) and "
            "what kind of logic is typically placed in one?"
        ),
    },
]


def parse_args():
    p = argparse.ArgumentParser()
    p.add_argument(
        "--base_url",
        default="http://localhost:8000/v1",
        help="Base URL of the vLLM OpenAI-compatible API server",
    )
    p.add_argument(
        "--model",
        default="pega-phi3-mini",
        help="Model name as registered with vLLM (--served-model-name)",
    )
    p.add_argument(
        "--max_tokens",
        type=int,
        default=512,
        help="Maximum tokens in the response",
    )
    p.add_argument(
        "--temperature",
        type=float,
        default=0.1,
        help="Sampling temperature (low = more deterministic)",
    )
    p.add_argument(
        "--questions",
        nargs="*",
        help="Custom question(s) to ask (skips built-in test suite)",
    )
    return p.parse_args()


def ask(client: OpenAI, model: str, question: str, max_tokens: int, temperature: float) -> str:
    response = client.chat.completions.create(
        model=model,
        messages=[
            {"role": "system", "content": SYSTEM_PROMPT},
            {"role": "user", "content": question},
        ],
        max_tokens=max_tokens,
        temperature=temperature,
    )
    return response.choices[0].message.content.strip()


def main():
    args = parse_args()

    print(f"Connecting to vLLM server at: {args.base_url}")
    client = OpenAI(base_url=args.base_url, api_key="none")

    # Check available models
    try:
        models = client.models.list()
        model_ids = [m.id for m in models.data]
        print(f"Available models: {model_ids}")
        if args.model not in model_ids and model_ids:
            print(f"  [WARN] Requested model '{args.model}' not found. Using '{model_ids[0]}'.")
            args.model = model_ids[0]
    except Exception as e:
        print(f"  [WARN] Could not list models: {e}")

    print(f"Using model: {args.model}\n")
    print("=" * 70)

    # Custom questions mode
    if args.questions:
        for i, q in enumerate(args.questions, 1):
            print(f"\n[Custom Q{i}] {q}")
            print("-" * 60)
            try:
                answer = ask(client, args.model, q, args.max_tokens, args.temperature)
                print(f"Answer:\n{answer}")
            except Exception as e:
                print(f"  ERROR: {e}", file=sys.stderr)
        return

    # Built-in test suite
    passed = 0
    failed = 0
    for i, test in enumerate(TEST_QUESTIONS, 1):
        print(f"\n[{i}/{len(TEST_QUESTIONS)}] {test['label']}")
        print(f"Q: {test['question']}")
        print("-" * 60)
        try:
            answer = ask(client, args.model, test["question"], args.max_tokens, args.temperature)
            print(f"A: {answer}")
            passed += 1
        except Exception as e:
            print(f"  ERROR: {e}", file=sys.stderr)
            failed += 1

    print("\n" + "=" * 70)
    print(f"Test results: {passed} passed, {failed} failed out of {len(TEST_QUESTIONS)}")
    if failed > 0:
        print("Check the vLLM server logs for errors.")
        sys.exit(1)


if __name__ == "__main__":
    main()
