#!/bin/bash
# =============================================================================
# runpod_setup.sh
#
# Starts vLLM (API server) + Open WebUI (chat interface) on RunPod.
#
# Ports:
#   8000 — vLLM OpenAI-compatible API
#   3000 — Open WebUI chat interface
#
# RunPod configuration:
#   - Template : runpod/pytorch:2.4.0-py3.11-cuda12.4.1-devel-ubuntu22.04
#   - GPU      : RTX 4090 (24 GB VRAM)
#   - Expose   : HTTP ports 8000 and 3000
#   - Volume   : /workspace  (persistent storage)
# =============================================================================

set -e

MODEL_PATH="${1:-/workspace/merged_model}"
VLLM_PORT="${2:-8000}"
WEBUI_PORT="${3:-3000}"
WEBUI_DATA="/workspace/open-webui-data"

echo "=============================================="
echo "  Pega Phi-3 — vLLM + Open WebUI"
echo "  Model    : $MODEL_PATH"
echo "  API      : http://0.0.0.0:$VLLM_PORT/v1"
echo "  Chat UI  : http://0.0.0.0:$WEBUI_PORT"
echo "=============================================="

# ── Verify model directory ─────────────────────────────────────────────────────
echo ""
echo "[1/4] Checking model directory..."
if [ ! -d "$MODEL_PATH" ] || [ ! -f "$MODEL_PATH/config.json" ]; then
    echo "ERROR: Model not found at $MODEL_PATH"
    echo "Run the full pipeline first (training + merge steps)."
    exit 1
fi
echo "  Model OK: $(du -sh "$MODEL_PATH" | cut -f1)"

# ── Install Open WebUI ─────────────────────────────────────────────────────────
echo ""
echo "[2/4] Installing Open WebUI..."
export PIP_TARGET=/workspace/pip_packages
export PYTHONPATH=/workspace/pip_packages:$PYTHONPATH
pip install --target=/workspace/pip_packages open-webui --quiet
echo "  Open WebUI installed."

# ── Start vLLM in background ───────────────────────────────────────────────────
echo ""
echo "[3/4] Starting vLLM API server on port $VLLM_PORT..."

python -m vllm.entrypoints.openai.api_server \
    --model "$MODEL_PATH" \
    --dtype bfloat16 \
    --max-model-len 4096 \
    --port "$VLLM_PORT" \
    --host 0.0.0.0 \
    --gpu-memory-utilization 0.90 \
    --served-model-name "pega-phi3-mini" &

VLLM_PID=$!
echo "  vLLM PID: $VLLM_PID"

# Wait for vLLM to be ready
echo "  Waiting for vLLM to be ready..."
for i in $(seq 1 60); do
    if curl -sf "http://localhost:$VLLM_PORT/v1/models" > /dev/null 2>&1; then
        echo "  vLLM is ready!"
        break
    fi
    if [ $i -eq 60 ]; then
        echo "ERROR: vLLM did not start in time. Check logs."
        exit 1
    fi
    sleep 3
done

# ── Start Open WebUI ───────────────────────────────────────────────────────────
echo ""
echo "[4/4] Starting Open WebUI on port $WEBUI_PORT..."
echo "  Connecting to vLLM at http://localhost:$VLLM_PORT/v1"
echo ""
echo "  ✓ Chat UI will be available at: http://0.0.0.0:$WEBUI_PORT"
echo "  ✓ API available at:             http://0.0.0.0:$VLLM_PORT/v1"
echo ""
echo "  On first open, create an admin account in the UI."
echo "  The model 'pega-phi3-mini' will appear in the model selector."
echo ""

mkdir -p "$WEBUI_DATA"

OPENAI_API_KEY="none" \
OPENAI_API_BASE_URL="http://localhost:$VLLM_PORT/v1" \
DATA_DIR="$WEBUI_DATA" \
PORT="$WEBUI_PORT" \
HOST="0.0.0.0" \
open-webui serve

# Keep vLLM alive if Open WebUI exits
wait $VLLM_PID
