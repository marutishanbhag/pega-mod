#!/bin/bash
# =============================================================================
# run_on_pod.sh  —  Paste and run this in your RunPod web terminal
#
# Does everything in one go:
#   1. Pull the Docker image from Docker Hub
#   2. Run dataset preparation (in case data/ wasn't uploaded)
#   3. Train (QLoRA fine-tuning)
#   4. Merge LoRA adapters into full model
#   5. Start vLLM server on port 8000
#
# Usage:
#   DOCKERHUB_USERNAME=yourname bash run_on_pod.sh
#
# Or set it inline:
#   export DOCKERHUB_USERNAME=yourname && bash run_on_pod.sh
# =============================================================================

set -e

DOCKERHUB_USERNAME="${DOCKERHUB_USERNAME:-YOUR_DOCKERHUB_USERNAME}"
IMAGE="${DOCKERHUB_USERNAME}/pega-phi3-finetune:feature-ms"
WORKSPACE="/workspace"
DATA_DIR="$WORKSPACE/data"
OUTPUT_DIR="$WORKSPACE/output"
MERGED_DIR="$WORKSPACE/merged_model"

echo "=============================================="
echo "  Pega Phi-3 Full Training Pipeline"
echo "  Image    : $IMAGE"
echo "  Workspace: $WORKSPACE"
echo "=============================================="

# ── Step 1: Pull Docker image ──────────────────────────────────────────────────
echo ""
echo "[1/5] Pulling Docker image..."
docker pull "$IMAGE"

# ── Step 2: Check / generate data ─────────────────────────────────────────────
echo ""
echo "[2/5] Checking training data..."

if [ ! -f "$DATA_DIR/train.jsonl" ]; then
    echo "  data/train.jsonl not found — running prepare_dataset.py inside container..."
    docker run --rm \
        -v "$WORKSPACE:/workspace" \
        "$IMAGE" \
        python /workspace/prepare_dataset.py
else
    echo "  data/train.jsonl found ($(wc -l < "$DATA_DIR/train.jsonl") examples)"
fi

# ── Step 3: Train ──────────────────────────────────────────────────────────────
echo ""
echo "[3/5] Starting QLoRA training (this takes ~1-2 hours)..."
mkdir -p "$OUTPUT_DIR"

docker run --rm --gpus all \
    -v "$WORKSPACE:/workspace" \
    -e HF_HOME=/workspace/.cache/huggingface \
    "$IMAGE" \
    python /workspace/train.py \
        --data_dir /workspace/data \
        --output_dir /workspace/output

echo "  Training complete. Adapter saved to $OUTPUT_DIR/final_adapter"

# ── Step 4: Merge adapters ─────────────────────────────────────────────────────
echo ""
echo "[4/5] Merging LoRA adapters into base model..."
mkdir -p "$MERGED_DIR"

docker run --rm --gpus all \
    -v "$WORKSPACE:/workspace" \
    -e HF_HOME=/workspace/.cache/huggingface \
    "$IMAGE" \
    python /workspace/merge_adapters.py \
        --adapter_path /workspace/output/final_adapter \
        --output_dir /workspace/merged_model

echo "  Merged model saved to $MERGED_DIR"

# ── Step 5: Start vLLM server ──────────────────────────────────────────────────
echo ""
echo "[5/5] Starting vLLM server on port 8000..."
echo "  The server will keep running. Press Ctrl+C to stop."
echo ""

docker run --rm --gpus all \
    -v "$WORKSPACE:/workspace" \
    -p 8000:8000 \
    "$IMAGE" \
    bash /workspace/runpod_setup.sh /workspace/merged_model 8000
