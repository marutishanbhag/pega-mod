#!/bin/bash
# =============================================================================
# run_on_pod.sh  —  Paste and run this in your RunPod web terminal
#
# Designed for: runpod/pytorch:2.4.0-py3.11-cuda12.4.1-devel-ubuntu22.04
# (Runs directly on the pod — no Docker-in-Docker needed)
#
# Does everything in one go:
#   1. Install Python dependencies
#   2. Copy scripts from GitHub
#   3. Check training data (expects /workspace/data from runpodctl receive)
#   4. Train (QLoRA fine-tuning ~1-2 hours on RTX 4090)
#   5. Merge LoRA adapters into full model
#   6. Start vLLM server on port 8000
#
# Usage (in RunPod terminal):
#   bash /workspace/run_on_pod.sh
# =============================================================================

set -e

WORKSPACE="/workspace"
DATA_DIR="$WORKSPACE/data"
OUTPUT_DIR="$WORKSPACE/output"
MERGED_DIR="$WORKSPACE/merged_model"
SCRIPTS_DIR="$WORKSPACE/scripts"

echo "=============================================="
echo "  Pega Phi-3 Full Training Pipeline"
echo "  PyTorch 2.4 / CUDA 12.4 / RTX 4090"
echo "=============================================="

# ── Step 1: Install dependencies ──────────────────────────────────────────────
echo ""
echo "[1/5] Installing Python dependencies..."
pip install --quiet \
    transformers>=4.43.0 \
    peft>=0.12.0 \
    bitsandbytes>=0.43.0 \
    trl>=0.9.6 \
    datasets>=2.20.0 \
    accelerate>=0.31.0 \
    scipy \
    vllm

echo "  Dependencies installed."

# ── Step 2: Download scripts from GitHub ──────────────────────────────────────
echo ""
echo "[2/5] Downloading training scripts from GitHub..."
mkdir -p "$SCRIPTS_DIR"

GITHUB_RAW="https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/ms/ms-phi3-finetune"

for script in prepare_dataset.py train.py merge_adapters.py runpod_setup.sh; do
    echo "  Downloading $script..."
    curl -fsSL "$GITHUB_RAW/$script" -o "$SCRIPTS_DIR/$script"
done
chmod +x "$SCRIPTS_DIR/runpod_setup.sh"
echo "  Scripts downloaded to $SCRIPTS_DIR"

# ── Step 3: Check / generate data ─────────────────────────────────────────────
echo ""
echo "[3/5] Checking training data..."

if [ ! -f "$DATA_DIR/train.jsonl" ]; then
    echo "  data/train.jsonl not found."
    echo "  Did you run: runpodctl receive <code> && mv data /workspace/data ?"
    echo ""
    echo "  Attempting to generate from scripts (requires .java files)..."
    cd "$SCRIPTS_DIR" && python prepare_dataset.py || {
        echo "ERROR: No training data found and could not generate it."
        echo "Please upload the data first: runpodctl receive <code>"
        exit 1
    }
else
    COUNT=$(wc -l < "$DATA_DIR/train.jsonl")
    echo "  train.jsonl found — $COUNT training examples"
fi

# ── Step 4: Train ──────────────────────────────────────────────────────────────
echo ""
echo "[4/5] Starting QLoRA fine-tuning..."
echo "  This takes ~1-2 hours on RTX 4090. Watch the loss decrease in the logs."
echo ""
mkdir -p "$OUTPUT_DIR"

HF_HOME="$WORKSPACE/.cache/huggingface" \
python "$SCRIPTS_DIR/train.py" \
    --data_dir "$DATA_DIR" \
    --output_dir "$OUTPUT_DIR"

echo ""
echo "  Training complete. Adapter saved to $OUTPUT_DIR/final_adapter"

# ── Step 5: Merge adapters ─────────────────────────────────────────────────────
echo ""
echo "[5/5] Merging LoRA adapters into base model..."
mkdir -p "$MERGED_DIR"

HF_HOME="$WORKSPACE/.cache/huggingface" \
python "$SCRIPTS_DIR/merge_adapters.py" \
    --adapter_path "$OUTPUT_DIR/final_adapter" \
    --output_dir "$MERGED_DIR"

echo "  Merged model saved to $MERGED_DIR"

# ── Step 6: Start vLLM server ──────────────────────────────────────────────────
echo ""
echo "[6/6] Starting vLLM server on port 8000..."
echo "  Access via: http://<your-pod-ip>:8000/v1"
echo "  Press Ctrl+C to stop."
echo ""

bash "$SCRIPTS_DIR/runpod_setup.sh" "$MERGED_DIR" 8000
