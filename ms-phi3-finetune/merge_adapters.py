"""
merge_adapters.py

Merge LoRA adapters into the base Phi-3 model to produce a standalone
full-precision model that vLLM can serve directly.

Usage:
    python merge_adapters.py \
        [--base_model microsoft/Phi-3-mini-4k-instruct] \
        [--adapter_path ./output/final_adapter] \
        [--output_dir ./merged_model]
"""

import argparse
import pathlib

import torch
from peft import PeftModel
from transformers import AutoModelForCausalLM, AutoTokenizer

SCRIPT_DIR = pathlib.Path(__file__).parent


def parse_args():
    p = argparse.ArgumentParser()
    p.add_argument(
        "--base_model",
        default="microsoft/Phi-3-mini-4k-instruct",
        help="Base model ID or local path (loaded in fp16, no quantization)",
    )
    p.add_argument(
        "--adapter_path",
        default=str(SCRIPT_DIR / "output" / "final_adapter"),
        help="Path to saved LoRA adapters (output of train.py)",
    )
    p.add_argument(
        "--output_dir",
        default=str(SCRIPT_DIR / "merged_model"),
        help="Where to save the merged model",
    )
    return p.parse_args()


def main():
    args = parse_args()

    print(f"Base model   : {args.base_model}")
    print(f"Adapter path : {args.adapter_path}")
    print(f"Output dir   : {args.output_dir}")

    # ── Load base model in fp16 (NOT 4-bit — we need full precision to merge) ──
    print("\nLoading base model in fp16 ...")
    model = AutoModelForCausalLM.from_pretrained(
        args.base_model,
        torch_dtype=torch.float16,
        device_map="auto",
        trust_remote_code=True,
    )

    # ── Load tokenizer ─────────────────────────────────────────────────────────
    print("Loading tokenizer ...")
    tokenizer = AutoTokenizer.from_pretrained(
        args.adapter_path,        # adapter dir also holds the tokenizer
        trust_remote_code=True,
    )

    # ── Load LoRA adapters on top of base model ────────────────────────────────
    print("Loading LoRA adapters ...")
    model = PeftModel.from_pretrained(
        model,
        args.adapter_path,
        torch_dtype=torch.float16,
    )

    # ── Merge weights ──────────────────────────────────────────────────────────
    print("Merging LoRA weights into base model ...")
    model = model.merge_and_unload()

    # ── Save merged model ──────────────────────────────────────────────────────
    print(f"\nSaving merged model to {args.output_dir} ...")
    model.save_pretrained(args.output_dir, safe_serialization=True)
    tokenizer.save_pretrained(args.output_dir)

    print("\nMerge complete.")
    print(f"  Merged model saved to: {args.output_dir}")
    print(
        "\nNext steps:\n"
        "  1. Upload merged_model/ to RunPod pod storage:\n"
        "       runpodctl send merged_model/\n"
        "     or push to HuggingFace Hub:\n"
        "       huggingface-cli upload <your-hf-repo> merged_model/\n"
        "  2. Run runpod_setup.sh on the pod to start the vLLM server.\n"
        "  3. Test with: python test_inference.py --base_url http://<POD_IP>:8000"
    )


if __name__ == "__main__":
    main()
