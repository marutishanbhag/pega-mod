#!/bin/bash
# =============================================================================
# train_pipeline.sh
#
# End-to-end training pipeline for Pega CodeLlama fine-tune on RunPod.
#
# Usage:
#   bash train_pipeline.sh [HF_TOKEN] [HF_REPO]
#
# Or set env vars before running:
#   export HF_TOKEN=hf_xxx
#   export HF_REPO=marutishanbhag/pega-codellama-13b-v2
#   bash train_pipeline.sh
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
python prepare_dataset.py
echo "  Done."
echo "  Train examples: $(wc -l < data/train.jsonl)"
echo "  Test examples : $(wc -l < data/test.jsonl)"

# ── Data quality checks ────────────────────────────────────────────────────────
echo ""
echo "  Verifying data quality..."

# Check a sample Q&A is code-grounded
echo "  Sample Q&A pair:"
head -1 data/train.jsonl | python3 -c "
import json, sys
d = json.loads(sys.stdin.read())
msgs = d['messages']
print('    USER    :', msgs[1]['content'][:120].replace('\n',' '))
print('    ASSISTANT:', msgs[2]['content'][:200].replace('\n',' '))
"

# Check negative examples are present
NEG_COUNT=$(grep -c "don't have that rule\|don't have any\|not have that" data/train.jsonl || true)
echo "  Negative (anti-hallucination) examples: $NEG_COUNT"

# Check raw file examples are present
RAW_COUNT=$(grep -c "Study and remember" data/train.jsonl || true)
echo "  Raw file code-in-context examples: $RAW_COUNT"

if [ "$NEG_COUNT" -eq 0 ]; then
    echo "  ERROR: No negative examples found — aborting. Check prepare_dataset.py."
    exit 1
fi
if [ "$RAW_COUNT" -eq 0 ]; then
    echo "  ERROR: No raw file examples found — aborting. Check prepare_dataset.py."
    exit 1
fi
echo "  Data quality OK."

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
fi

# ── [7/7] Start vLLM + Chat UI ────────────────────────────────────────────────
echo ""
echo "[7/7] Starting vLLM + Chat UI..."
echo "  Model  : $MERGED_DIR"
echo "  API    : http://0.0.0.0:$VLLM_PORT/v1"
echo "  Chat UI: http://0.0.0.0:$UI_PORT"
echo ""

bash "$PIPELINE_DIR/runpod_setup.sh" "$MERGED_DIR" "$VLLM_PORT" "$UI_PORT"
