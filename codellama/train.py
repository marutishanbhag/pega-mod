"""
train.py

LoRA fine-tuning of codellama/CodeLlama-13b-Instruct-hf on the Pega Q&A dataset.
Optimised for large VRAM (200GB+) — full fp16, no quantization.

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
from transformers import EarlyStoppingCallback
from trl import SFTTrainer, SFTConfig

# ── Defaults ───────────────────────────────────────────────────────────────────

DEFAULT_BASE_MODEL = "codellama/CodeLlama-13b-Instruct-hf"
SCRIPT_DIR = pathlib.Path(__file__).parent


def parse_args():
    p = argparse.ArgumentParser()
    p.add_argument("--base_model", default=DEFAULT_BASE_MODEL)
    p.add_argument("--data_dir", default=str(SCRIPT_DIR / "data"))
    p.add_argument("--output_dir", default=str(SCRIPT_DIR / "output"))
    p.add_argument("--max_seq_length", type=int, default=512)
    p.add_argument("--num_train_epochs", type=int, default=3)
    p.add_argument("--per_device_train_batch_size", type=int, default=8)
    p.add_argument("--gradient_accumulation_steps", type=int, default=2)
    p.add_argument("--learning_rate", type=float, default=5e-5)
    p.add_argument("--load_in_4bit", action="store_true",
                   help="Use 4-bit QLoRA (for GPUs with <40GB VRAM)")
    return p.parse_args()


def get_vram_gb() -> float:
    if torch.cuda.is_available():
        return torch.cuda.get_device_properties(0).total_memory / 1e9
    return 0.0


# ── LoRA config (CodeLlama target modules) ─────────────────────────────────────

def make_lora_config() -> LoraConfig:
    return LoraConfig(
        r=32,
        lora_alpha=64,
        # CodeLlama / Llama-2 attention + MLP projection layers
        target_modules=["q_proj", "k_proj", "v_proj", "o_proj", "gate_proj", "up_proj", "down_proj"],
        lora_dropout=0.10,
        bias="none",
        task_type=TaskType.CAUSAL_LM,
    )


# ── Chat-template formatting ───────────────────────────────────────────────────

def format_chat(example: dict, tokenizer) -> dict:
    """
    Convert a messages list to a single chat string using the model's template.
    CodeLlama Instruct format:
        [INST] <<SYS>>\n{system}\n<</SYS>>\n\n{user} [/INST] {assistant}
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
    if tokenizer.pad_token is None:
        tokenizer.pad_token = tokenizer.eos_token
    tokenizer.padding_side = "right"

    # ── Auto-detect VRAM and choose quantization ───────────────────────────────
    vram_gb = get_vram_gb()
    use_4bit = args.load_in_4bit or vram_gb < 40.0
    print(f"Detected VRAM: {vram_gb:.1f} GB — using {'4-bit QLoRA' if use_4bit else 'fp16 LoRA'}")

    bnb_config = None
    if use_4bit:
        bnb_config = BitsAndBytesConfig(
            load_in_4bit=True,
            bnb_4bit_quant_type="nf4",
            bnb_4bit_compute_dtype=torch.bfloat16,
            bnb_4bit_use_double_quant=True,
        )

    print(f"Loading model {args.base_model} ...")
    model = AutoModelForCausalLM.from_pretrained(
        args.base_model,
        quantization_config=bnb_config,
        torch_dtype=torch.bfloat16 if use_4bit else torch.float16,
        device_map="auto",
        trust_remote_code=True,
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
        lambda ex: format_chat(ex, tokenizer),
        remove_columns=raw_datasets["train"].column_names,
    )
    eval_dataset = raw_datasets["test"].map(
        lambda ex: format_chat(ex, tokenizer),
        remove_columns=raw_datasets["test"].column_names,
    )

    print(f"Train examples: {len(train_dataset)}")
    print(f"Eval examples:  {len(eval_dataset)}")

    # ── SFTConfig ──────────────────────────────────────────────────────────────
    training_args = SFTConfig(
        output_dir=args.output_dir,
        num_train_epochs=args.num_train_epochs,
        per_device_train_batch_size=args.per_device_train_batch_size,
        per_device_eval_batch_size=args.per_device_train_batch_size,
        gradient_accumulation_steps=args.gradient_accumulation_steps,
        learning_rate=args.learning_rate,
        lr_scheduler_type="cosine",
        warmup_ratio=0.10,
        bf16=use_4bit,
        fp16=not use_4bit,
        gradient_checkpointing=True,
        gradient_checkpointing_kwargs={"use_reentrant": False},
        optim="adamw_torch",
        logging_steps=10,
        save_steps=100,
        eval_strategy="steps",
        eval_steps=100,
        save_total_limit=3,
        load_best_model_at_end=True,
        metric_for_best_model="eval_loss",
        greater_is_better=False,
        report_to="none",
        dataloader_num_workers=4,
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
        callbacks=[EarlyStoppingCallback(early_stopping_patience=3)],
    )

    # ── Train ──────────────────────────────────────────────────────────────────
    print("\nStarting training ...")
    trainer.train()

    # ── Save best adapter (lowest eval_loss checkpoint) ───────────────────────
    adapter_path = os.path.join(args.output_dir, "final_adapter")
    best_ckpt = getattr(trainer.state, "best_model_checkpoint", None)
    best_loss = getattr(trainer.state, "best_metric", None)
    print(f"\nBest checkpoint : {best_ckpt}")
    print(f"Best eval_loss  : {best_loss}")
    print(f"Saving LoRA adapters to {adapter_path} ...")
    # trainer.save_model() respects load_best_model_at_end and saves the best checkpoint
    trainer.save_model(adapter_path)
    trainer.processing_class.save_pretrained(adapter_path)

    print("\nTraining complete.")
    print(f"  Adapters saved to: {adapter_path}")
    print("  Next step: run merge_adapters.py")


if __name__ == "__main__":
    main()
