"""
train.py

QLoRA fine-tuning of microsoft/Phi-3-mini-4k-instruct on the Pega Q&A dataset.
Optimised for a single RTX 4090 (24 GB VRAM).

Usage:
    python train.py [--base_model MODEL_ID] [--data_dir ./data] [--output_dir ./output]
"""

import argparse
import os
import pathlib

import torch
from datasets import load_dataset
from peft import LoraConfig, TaskType, get_peft_model
from transformers import (
    AutoModelForCausalLM,
    AutoTokenizer,
    BitsAndBytesConfig,
)
from trl import SFTTrainer, SFTConfig

# ── Defaults ───────────────────────────────────────────────────────────────────

DEFAULT_BASE_MODEL = "microsoft/Phi-3-mini-4k-instruct"
SCRIPT_DIR = pathlib.Path(__file__).parent


def parse_args():
    p = argparse.ArgumentParser()
    p.add_argument("--base_model", default=DEFAULT_BASE_MODEL)
    p.add_argument("--data_dir", default=str(SCRIPT_DIR / "data"))
    p.add_argument("--output_dir", default=str(SCRIPT_DIR / "output"))
    p.add_argument("--max_seq_length", type=int, default=2048)
    p.add_argument("--num_train_epochs", type=int, default=3)
    p.add_argument("--per_device_train_batch_size", type=int, default=2)
    p.add_argument("--gradient_accumulation_steps", type=int, default=8)
    p.add_argument("--learning_rate", type=float, default=2e-4)
    return p.parse_args()


# ── BitsAndBytes 4-bit config ──────────────────────────────────────────────────

def make_bnb_config() -> BitsAndBytesConfig:
    return BitsAndBytesConfig(
        load_in_4bit=True,
        bnb_4bit_quant_type="nf4",
        bnb_4bit_compute_dtype=torch.bfloat16,
        bnb_4bit_use_double_quant=True,
    )


# ── LoRA config (Phi-3 target modules) ────────────────────────────────────────

def make_lora_config() -> LoraConfig:
    return LoraConfig(
        r=16,
        lora_alpha=32,
        # Phi-3-mini attention + MLP projection layers
        target_modules=["qkv_proj", "o_proj", "gate_up_proj", "down_proj"],
        lora_dropout=0.05,
        bias="none",
        task_type=TaskType.CAUSAL_LM,
    )


# ── Chat-template formatting ───────────────────────────────────────────────────

def format_phi3_chat(example: dict, tokenizer) -> dict:
    """
    Convert a messages list to a single Phi-3 chat string.

    Phi-3 template:
        <|system|>\n{system}<|end|>\n<|user|>\n{user}<|end|>\n<|assistant|>\n{assistant}<|end|>
    """
    text = tokenizer.apply_chat_template(
        example["messages"],
        tokenize=False,
        add_generation_prompt=False,
    )
    return {"text": text}


# ── Main ───────────────────────────────────────────────────────────────────────

def main():
    args = parse_args()

    os.makedirs(args.output_dir, exist_ok=True)

    # ── Load tokenizer ─────────────────────────────────────────────────────────
    print(f"Loading tokenizer from {args.base_model} ...")
    tokenizer = AutoTokenizer.from_pretrained(
        args.base_model,
        trust_remote_code=True,
        use_fast=True,
    )
    tokenizer.pad_token = tokenizer.unk_token
    tokenizer.padding_side = "right"

    # ── Load model (4-bit) ─────────────────────────────────────────────────────
    print(f"Loading model {args.base_model} in 4-bit ...")
    bnb_config = make_bnb_config()
    model = AutoModelForCausalLM.from_pretrained(
        args.base_model,
        quantization_config=bnb_config,
        device_map="auto",
        trust_remote_code=True,
        dtype=torch.bfloat16,
        attn_implementation="eager",  # flash_attention_2 optional if installed
    )
    model.config.use_cache = False  # required for gradient checkpointing

    # ── Wrap with LoRA ─────────────────────────────────────────────────────────
    print("Applying LoRA adapters ...")
    lora_config = make_lora_config()
    model = get_peft_model(model, lora_config)
    model.print_trainable_parameters()

    # ── Load dataset ───────────────────────────────────────────────────────────
    data_dir = pathlib.Path(args.data_dir)
    train_file = str(data_dir / "train.jsonl")
    test_file = str(data_dir / "test.jsonl")

    if not os.path.exists(train_file):
        raise FileNotFoundError(
            f"Training data not found at {train_file}. "
            "Run prepare_dataset.py first."
        )

    print(f"Loading dataset from {data_dir} ...")
    raw_datasets = load_dataset(
        "json",
        data_files={"train": train_file, "test": test_file},
    )

    # Apply chat template
    train_dataset = raw_datasets["train"].map(
        lambda ex: format_phi3_chat(ex, tokenizer),
        remove_columns=raw_datasets["train"].column_names,
    )
    eval_dataset = raw_datasets["test"].map(
        lambda ex: format_phi3_chat(ex, tokenizer),
        remove_columns=raw_datasets["test"].column_names,
    )

    print(f"Train examples: {len(train_dataset)}")
    print(f"Eval examples:  {len(eval_dataset)}")

    # ── SFTConfig (replaces TrainingArguments in trl 0.29+) ────────────────────
    training_args = SFTConfig(
        output_dir=args.output_dir,
        num_train_epochs=args.num_train_epochs,
        per_device_train_batch_size=args.per_device_train_batch_size,
        per_device_eval_batch_size=args.per_device_train_batch_size,
        gradient_accumulation_steps=args.gradient_accumulation_steps,
        learning_rate=args.learning_rate,
        lr_scheduler_type="cosine",
        warmup_ratio=0.05,
        bf16=True,
        gradient_checkpointing=True,
        gradient_checkpointing_kwargs={"use_reentrant": False},
        optim="paged_adamw_8bit",
        logging_steps=10,
        save_steps=100,
        eval_strategy="steps",
        eval_steps=100,
        save_total_limit=3,
        load_best_model_at_end=False,
        report_to="none",
        dataloader_num_workers=2,
        remove_unused_columns=False,
        dataset_text_field="text",
        max_length=args.max_seq_length,
        packing=False,
    )

    # ── SFTTrainer ─────────────────────────────────────────────────────────────
    trainer = SFTTrainer(
        model=model,
        processing_class=tokenizer,
        train_dataset=train_dataset,
        eval_dataset=eval_dataset,
        args=training_args,
    )

    # ── Train ──────────────────────────────────────────────────────────────────
    print("\nStarting training ...")
    trainer.train()

    # ── Save final adapter ────────────────────────────────────────────────────
    adapter_path = os.path.join(args.output_dir, "final_adapter")
    print(f"\nSaving LoRA adapters to {adapter_path} ...")
    trainer.model.save_pretrained(adapter_path)
    trainer.processing_class.save_pretrained(adapter_path)

    print("\nTraining complete.")
    print(f"  Adapters saved to: {adapter_path}")
    print("  Next step: run merge_adapters.py")


if __name__ == "__main__":
    main()
