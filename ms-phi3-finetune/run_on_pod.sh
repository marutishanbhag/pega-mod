#!/bin/bash
# =============================================================================
# run_on_pod.sh  —  Run this in your RunPod web terminal
#
# Designed for: runpod/pytorch:2.4.0-py3.11-cuda12.4.1-devel-ubuntu22.04
#
# Usage:
#   bash <(curl -fsSL https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/ms/ms-phi3-finetune/run_on_pod.sh) 2>&1 | tee /workspace/training.log
# =============================================================================

set -e

WORKSPACE="/workspace"
DATA_DIR="$WORKSPACE/data"
OUTPUT_DIR="$WORKSPACE/output"
MERGED_DIR="$WORKSPACE/merged_model"
SCRIPTS_DIR="$WORKSPACE/scripts"
GITHUB_RAW="https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/ms/ms-phi3-finetune"

log() { echo "[$(date '+%H:%M:%S')] $*"; }

log "=============================================="
log "  Pega Phi-3 Full Training Pipeline"
log "  PyTorch 2.4 / CUDA 12.4 / RTX 4090"
log "=============================================="

# ── GPU check ─────────────────────────────────────────────────────────────────
log ""
log "GPU info:"
nvidia-smi --query-gpu=name,memory.total,memory.free --format=csv,noheader

# ── Disk check ────────────────────────────────────────────────────────────────
log ""
log "Disk space:"
df -h /workspace | tail -1

# ── Step 1: Set up pip to install to /workspace ────────────────────────────────
log ""
log "[1/6] Installing Python dependencies to /workspace/pip_packages..."
export PIP_TARGET=/workspace/pip_packages
export PYTHONPATH=/workspace/pip_packages:$PYTHONPATH
mkdir -p /workspace/pip_packages

pip install --target=/workspace/pip_packages -q \
    "transformers>=4.43.0" \
    "peft>=0.12.0" \
    "bitsandbytes>=0.43.0" \
    "trl>=0.9.6" \
    "datasets>=2.20.0" \
    "accelerate>=0.31.0" \
    scipy \
    vllm \
    "huggingface-hub>=0.34.0,<1.0"

log "  Done: $(ls /workspace/pip_packages | wc -l) packages installed"

# ── Step 2: Download scripts ───────────────────────────────────────────────────
log ""
log "[2/6] Downloading training scripts from GitHub..."
mkdir -p "$SCRIPTS_DIR"

for script in prepare_dataset.py train.py merge_adapters.py runpod_setup.sh; do
    log "  Downloading $script..."
    curl -fsSL "$GITHUB_RAW/$script" -o "$SCRIPTS_DIR/$script"
    log "  OK: $script ($(wc -c < "$SCRIPTS_DIR/$script") bytes)"
done
chmod +x "$SCRIPTS_DIR/runpod_setup.sh"

# ── Step 3: Check training data ───────────────────────────────────────────────
log ""
log "[3/6] Checking training data..."

if [ ! -f "$DATA_DIR/train.jsonl" ]; then
    log "  WARNING: $DATA_DIR/train.jsonl not found!"
    log "  Contents of /workspace:"
    ls -lh /workspace/
    log "  Attempting to generate dataset from scripts..."
    cd "$SCRIPTS_DIR"
    python prepare_dataset.py --include-raw-files
    cd /
else
    COUNT=$(wc -l < "$DATA_DIR/train.jsonl")
    SIZE=$(du -sh "$DATA_DIR" | cut -f1)
    log "  train.jsonl found — $COUNT examples, $SIZE total"
fi

# ── Step 4: Train ──────────────────────────────────────────────────────────────
log ""
log "[4/6] Starting QLoRA fine-tuning (~1-2 hours on RTX 4090)..."
log "  Loss will print every 10 steps. Watch for it decreasing."
log ""

export PIP_TARGET=/workspace/pip_packages
export PYTHONPATH=/workspace/pip_packages:$PYTHONPATH
export HF_HOME="$WORKSPACE/.cache/huggingface"
mkdir -p "$OUTPUT_DIR" "$HF_HOME"

python "$SCRIPTS_DIR/train.py" \
    --data_dir "$DATA_DIR" \
    --output_dir "$OUTPUT_DIR"

log ""
log "  Training complete!"
log "  Adapter size: $(du -sh "$OUTPUT_DIR/final_adapter" | cut -f1)"

# ── Step 5: Merge adapters ─────────────────────────────────────────────────────
log ""
log "[5/6] Merging LoRA adapters into base model (~10-15 min)..."
mkdir -p "$MERGED_DIR"

python "$SCRIPTS_DIR/merge_adapters.py" \
    --adapter_path "$OUTPUT_DIR/final_adapter" \
    --output_dir "$MERGED_DIR"

log "  Merged model size: $(du -sh "$MERGED_DIR" | cut -f1)"

# ── Step 6: Start vLLM + Open WebUI ───────────────────────────────────────────
log ""
log "[6/6] Starting vLLM API + Open WebUI chat interface..."
log "  API     : http://0.0.0.0:8000/v1"
log "  Chat UI : http://0.0.0.0:3000"
log "  Press Ctrl+C to stop."
log ""
log "  NOTE: Make sure ports 8000 and 3000 are both exposed in RunPod pod settings."
log ""

bash "$SCRIPTS_DIR/runpod_setup.sh" "$MERGED_DIR" 8000 3000
