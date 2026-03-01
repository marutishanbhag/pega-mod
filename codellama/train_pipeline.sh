#!/bin/bash
# =============================================================================
# train_pipeline.sh
#
# End-to-end training pipeline for Pega CodeLlama fine-tune on RunPod.
# Automatically runs inside a tmux session so terminal disconnects are safe.
#
# Usage:
#   bash train_pipeline.sh [HF_TOKEN] [HF_REPO]
#
# Or set env vars before running:
#   export HF_TOKEN=hf_xxx
#   export HF_REPO=marutishanbhag/pega-codellama-13b-v2
#   bash train_pipeline.sh
#
# If terminal disconnects, reattach with:
#   tmux attach -t pega-training
#
# Steps:
#   1. Clone repo and checkout feature/codellama
#   2. Install dependencies
#   3. Generate training dataset
#   4. Train CodeLlama-13B with LoRA (3 epochs, 4-bit QLoRA)
#   5. Merge LoRA adapters into full model
#   6. Upload merged model to HuggingFace Hub
#   7. Start vLLM + Chat UI
# =============================================================================

set -e

# ── Auto-relaunch inside tmux if available and running interactively ──────────
TMUX_SESSION="pega-training"
if [ -z "$TMUX" ] && [ -t 1 ] && command -v tmux &> /dev/null; then
    echo "Launching inside tmux session '$TMUX_SESSION'..."
    echo "  To reattach after disconnect: tmux attach -t $TMUX_SESSION"
    echo ""
    tmux kill-session -t "$TMUX_SESSION" 2>/dev/null || true
    exec tmux new-session -s "$TMUX_SESSION" \
        "HF_TOKEN='$HF_TOKEN' HF_REPO='$HF_REPO' bash '$0' '$@'; echo ''; echo 'Pipeline finished. Press any key to exit.'; read"
fi

# ── Config ────────────────────────────────────────────────────────────────────

REPO_URL="https://github.com/marutishanbhag/pega-mod.git"
BRANCH="feature/codellama"
WORKSPACE="/workspace"
CODE_DIR="$WORKSPACE/pega-mod"
PIPELINE_DIR="$CODE_DIR/codellama"
OUTPUT_DIR="$WORKSPACE/output"
MERGED_DIR="$WORKSPACE/merged_model"
VLLM_PORT="${VLLM_PORT:-8000}"
UI_PORT="${UI_PORT:-3000}"

HF_TOKEN="${1:-$HF_TOKEN}"
HF_REPO="${2:-$HF_REPO}"

echo "=============================================="
echo "  Pega CodeLlama — Training Pipeline"
echo "  Branch  : $BRANCH"
echo "  Output  : $OUTPUT_DIR"
echo "  Merged  : $MERGED_DIR"
echo "  HF repo : ${HF_REPO:-<not set, will skip upload>}"
echo "=============================================="

# ── [1/7] Clone repo ──────────────────────────────────────────────────────────
echo ""
echo "[1/7] Cloning repo..."

if [ -d "$CODE_DIR/.git" ]; then
    echo "  Repo already exists — pulling latest..."
    git -C "$CODE_DIR" fetch origin
    git -C "$CODE_DIR" checkout "$BRANCH"
    git -C "$CODE_DIR" pull origin "$BRANCH"
else
    git clone --branch "$BRANCH" "$REPO_URL" "$CODE_DIR"
fi
echo "  Done."

# ── [2/7] Install dependencies ────────────────────────────────────────────────
echo ""
echo "[2/7] Installing dependencies..."
pip install -q --upgrade pip

# Upgrade PyTorch first to ensure bitsandbytes compatibility
pip install -q --upgrade torch torchvision --index-url https://download.pytorch.org/whl/cu121

# Install remaining deps with compatible versions
pip install -q --upgrade \
    "transformers>=5.0.0" \
    "peft>=0.12.0" \
    "trl>=0.9.6" \
    "datasets>=2.20.0" \
    "accelerate>=0.31.0" \
    "bitsandbytes>=0.44.0" \
    "huggingface_hub>=0.23.0" \
    gradio httpx uvicorn fastapi
echo "  Done."

# ── [3/7] Generate training dataset ───────────────────────────────────────────
echo ""
echo "[3/7] Generating training dataset..."
cd "$PIPELINE_DIR"

# Remove any old data to ensure we train on freshly generated data
rm -f data/train.jsonl data/test.jsonl data/pega_qa.jsonl

python prepare_dataset.py
echo "  Done."

# Verify data was just generated (not stale)
DATA_AGE=$(( $(date +%s) - $(stat -c %Y data/train.jsonl) ))
if [ "$DATA_AGE" -gt 60 ]; then
    echo "  ERROR: train.jsonl is ${DATA_AGE}s old — expected freshly generated data."
    exit 1
fi
echo "  Data freshness OK (generated ${DATA_AGE}s ago)"
echo "  Train examples: $(wc -l < data/train.jsonl)"
echo "  Test examples : $(wc -l < data/test.jsonl)"

# ── Data quality checks ────────────────────────────────────────────────────────
echo ""
echo "  Verifying data quality..."

python3 - <<'PYEOF'
import json, sys

train_file = "data/train.jsonl"
with open(train_file) as f:
    examples = [json.loads(l) for l in f]

total = len(examples)
neg_count = 0
raw_count = 0
grounded_count = 0
template_only = 0

for ex in examples:
    msgs = ex["messages"]
    user = msgs[1]["content"]
    asst = msgs[2]["content"]

    # Negative examples
    if "don't have that" in asst or "not have that" in asst or "don't have any" in asst:
        neg_count += 1

    # Raw file examples (support both old and new phrasing)
    if "Study and remember" in user or "Study its contents" in user:
        raw_count += 1

    # Code-grounded: assistant references real backtick identifiers like `methodName()`
    if "`" in asst and ("()" in asst or "tools." in asst):
        grounded_count += 1
    elif "Study" not in user and "don't have" not in asst:
        template_only += 1

print(f"  Total examples          : {total}")
print(f"  Code-grounded Q&A       : {grounded_count}")
print(f"  Raw file (all java)     : {raw_count}")
print(f"  Negative (no-halluc)    : {neg_count}")
print(f"  Template-only (no code) : {template_only}")
print()

# Sample a grounded Q&A
grounded = [e for e in examples
            if "`" in e["messages"][2]["content"] and "()" in e["messages"][2]["content"]
            and "Study" not in e["messages"][1]["content"]]
if grounded:
    sample = grounded[0]["messages"]
    print("  Sample grounded Q&A:")
    print("    Q:", sample[1]["content"][:120].replace("\n"," "))
    print("    A:", sample[2]["content"][:200].replace("\n"," "))

# Sample a negative example
negs = [e for e in examples if "don't have that" in e["messages"][2]["content"]]
if negs:
    sample = negs[0]["messages"]
    print()
    print("  Sample negative example:")
    print("    Q:", sample[1]["content"][:120].replace("\n"," "))
    print("    A:", sample[2]["content"][:150].replace("\n"," "))

# Fail if critical categories are missing
errors = []
if neg_count == 0:
    errors.append("ERROR: No negative examples found.")
if raw_count == 0:
    errors.append("ERROR: No raw file examples found.")
if grounded_count == 0:
    errors.append("ERROR: No code-grounded examples found.")
if errors:
    for e in errors:
        print(e)
    sys.exit(1)

print()
print("  Data quality OK — proceeding to training.")
PYEOF

# ── [4/7] Train ───────────────────────────────────────────────────────────────
echo ""
echo "[4/7] Starting training (3 epochs, 4-bit QLoRA)..."
echo "  This will take ~2-3 hours on RTX 6000 Ada."
echo ""

python train.py \
    --num_train_epochs 3 \
    --max_seq_length 512 \
    --per_device_train_batch_size 4 \
    --gradient_accumulation_steps 4 \
    --load_in_4bit \
    --output_dir "$OUTPUT_DIR"

echo ""
echo "  Training complete."
echo "  Adapter saved to: $OUTPUT_DIR/final_adapter"

# ── [5/7] Merge adapters ──────────────────────────────────────────────────────
echo ""
echo "[5/7] Merging LoRA adapters into base model..."
echo "  This requires loading the full fp16 model (~26GB) — may take 10-15 min."

python merge_adapters.py \
    --adapter_path "$OUTPUT_DIR/final_adapter" \
    --output_dir "$MERGED_DIR"

echo "  Merged model saved to: $MERGED_DIR"
echo "  Merged model size: $(du -sh "$MERGED_DIR" | cut -f1)"

# ── [6/7] Upload to HuggingFace Hub ───────────────────────────────────────────
echo ""
echo "[6/7] Uploading to HuggingFace Hub..."

if [ -z "$HF_REPO" ]; then
    echo "  WARNING: HF_REPO not set — skipping upload."
    echo "  To upload manually:"
    echo "    huggingface-cli login"
    echo "    huggingface-cli upload <your-hf-username>/<repo-name> $MERGED_DIR/"
else
    if [ -z "$HF_TOKEN" ]; then
        echo "  WARNING: HF_TOKEN not set — trying without token (will fail for private repos)."
    else
        huggingface-cli login --token "$HF_TOKEN"
    fi
    echo "  Uploading to $HF_REPO ..."
    huggingface-cli upload "$HF_REPO" "$MERGED_DIR/"
    echo "  Upload complete."

    # ── Upload training dataset to HF Hub ─────────────────────────────────────
    HF_DATASET_REPO="${HF_DATASET_REPO:-marutishanbhag/pega-codellama-13b-v2}"
    echo ""
    echo "  Uploading training dataset to $HF_DATASET_REPO ..."
    python3 - <<PYEOF
from datasets import load_dataset, DatasetDict
from huggingface_hub import HfApi

train_ds = load_dataset("json", data_files={"train": "$PIPELINE_DIR/data/train.jsonl"})["train"]
test_ds  = load_dataset("json", data_files={"test":  "$PIPELINE_DIR/data/test.jsonl"})["test"]

DatasetDict({"train": train_ds, "test": test_ds}).push_to_hub(
    "$HF_DATASET_REPO",
    token="$HF_TOKEN",
    commit_message="Add training dataset generated by prepare_dataset.py",
)
print("  Dataset upload complete.")
PYEOF
fi

# ── [7/7] Start vLLM + Chat UI ────────────────────────────────────────────────
echo ""
echo "[7/7] Starting vLLM + Chat UI..."
echo "  Model  : $MERGED_DIR"
echo "  API    : http://0.0.0.0:$VLLM_PORT/v1"
echo "  Chat UI: http://0.0.0.0:$UI_PORT"
echo ""

bash "$PIPELINE_DIR/runpod_setup.sh" "$MERGED_DIR" "$VLLM_PORT" "$UI_PORT"
