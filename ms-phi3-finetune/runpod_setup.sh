#!/bin/bash
# =============================================================================
# runpod_setup.sh
#
# RunPod startup script for serving the merged Phi-3-mini model with vLLM.
#
# RunPod configuration:
#   - Template : RunPod PyTorch 2.3.0, CUDA 12.1
#   - GPU      : RTX 4090 (24 GB VRAM)
#   - Expose   : HTTP port 8000
#   - Volume   : /workspace  (persistent storage)
#
# How to upload your merged model to the pod:
#   Option A — runpodctl (CLI):
#     1. Install: https://github.com/runpod/runpodctl
#     2. On your LOCAL machine:
#          runpodctl send merged_model/
#       This prints a one-time code.
#     3. On the POD (via RunPod web terminal):
#          runpodctl receive <code>
#          mv merged_model /workspace/merged_model
#
#   Option B — HuggingFace Hub:
#     1. On your local machine:
#          pip install huggingface_hub
#          huggingface-cli login
#          huggingface-cli upload <your-username>/<repo-name> merged_model/ --repo-type model
#     2. On the pod:
#          huggingface-cli download <your-username>/<repo-name> --local-dir /workspace/merged_model
#
#   Option C — rsync over SSH (if RunPod SSH is enabled):
#          rsync -avz --progress merged_model/ \
#              root@<POD_IP>:<SSH_PORT>:/workspace/merged_model/
# =============================================================================

set -e

MODEL_PATH="${1:-/workspace/merged_model}"
PORT="${2:-8000}"

echo "=============================================="
echo "  Pega Phi-3 vLLM Deployment Script"
echo "  Model : $MODEL_PATH"
echo "  Port  : $PORT"
echo "=============================================="

# ── Install vLLM ──────────────────────────────────────────────────────────────
echo "[1/3] Installing vLLM ..."
pip install vllm --quiet

# ── Verify model directory ─────────────────────────────────────────────────────
echo "[2/3] Checking model directory ..."
if [ ! -d "$MODEL_PATH" ]; then
    echo "ERROR: Model directory not found at $MODEL_PATH"
    echo "Please upload your merged_model/ directory first (see instructions above)."
    exit 1
fi

if [ ! -f "$MODEL_PATH/config.json" ]; then
    echo "ERROR: $MODEL_PATH/config.json not found — model may be incomplete."
    exit 1
fi

echo "  Model directory OK: $(du -sh "$MODEL_PATH" | cut -f1)"

# ── Start vLLM OpenAI-compatible API server ────────────────────────────────────
echo "[3/3] Starting vLLM server on port $PORT ..."
echo "  Access the API at: http://0.0.0.0:$PORT/v1"
echo "  Example: curl http://0.0.0.0:$PORT/v1/models"
echo ""

python -m vllm.entrypoints.openai.api_server \
    --model "$MODEL_PATH" \
    --dtype bfloat16 \
    --max-model-len 4096 \
    --port "$PORT" \
    --host 0.0.0.0 \
    --gpu-memory-utilization 0.90 \
    --served-model-name "pega-phi3-mini"
