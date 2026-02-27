#!/bin/bash
# =============================================================================
# runpod_setup.sh
#
# Starts vLLM (port 8000) + Gradio chat UI with proxy (port 3000).
#
# Ports:
#   8000 — vLLM OpenAI-compatible API
#   3000 — Gradio chat UI + FastAPI proxy (no CORS issues)
#
# RunPod: expose both ports 8000 and 3000.
# =============================================================================

set -e

MODEL_PATH="${1:-/workspace/merged_model}"
VLLM_PORT="${2:-8000}"
UI_PORT="${3:-3000}"
SCRIPTS_DIR="/workspace/scripts"
GITHUB_RAW="https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/ms/ms-phi3-finetune"

echo "=============================================="
echo "  Pega Phi-3 — vLLM + Chat UI"
echo "  Model    : $MODEL_PATH"
echo "  API      : http://0.0.0.0:$VLLM_PORT/v1"
echo "  Chat UI  : http://0.0.0.0:$UI_PORT"
echo "=============================================="

# ── Verify model ───────────────────────────────────────────────────────────────
echo ""
echo "[1/4] Checking model..."
if [ ! -d "$MODEL_PATH" ] || [ ! -f "$MODEL_PATH/config.json" ]; then
    echo "ERROR: Model not found at $MODEL_PATH"
    exit 1
fi
echo "  Model OK: $(du -sh "$MODEL_PATH" | cut -f1)"

# ── Install UI dependencies ────────────────────────────────────────────────────
echo ""
echo "[2/4] Installing chat UI dependencies..."
export PIP_TARGET=/workspace/pip_packages
export PYTHONPATH=/workspace/pip_packages:$PYTHONPATH
pip install --target=/workspace/pip_packages -q gradio httpx uvicorn fastapi
echo "  Done."

# ── Download chat UI scripts ───────────────────────────────────────────────────
echo ""
echo "[3/4] Downloading chat_ui.py and chat_ui.html..."
mkdir -p "$SCRIPTS_DIR"
curl -fsSL "$GITHUB_RAW/chat_ui.py"   -o "$SCRIPTS_DIR/chat_ui.py"
curl -fsSL "$GITHUB_RAW/chat_ui.html" -o "$SCRIPTS_DIR/chat_ui.html"
echo "  Done."

# ── Start vLLM in background ───────────────────────────────────────────────────
echo ""
echo "[4/4] Starting vLLM..."
python -m vllm.entrypoints.openai.api_server \
    --model "$MODEL_PATH" \
    --dtype bfloat16 \
    --max-model-len 4096 \
    --port "$VLLM_PORT" \
    --host 0.0.0.0 \
    --gpu-memory-utilization 0.90 \
    --served-model-name "pega-phi3-mini" &

VLLM_PID=$!
echo "  vLLM PID: $VLLM_PID — waiting for it to be ready..."

for i in $(seq 1 60); do
    if curl -sf "http://localhost:$VLLM_PORT/v1/models" > /dev/null 2>&1; then
        echo "  vLLM is ready!"
        break
    fi
    if [ $i -eq 60 ]; then
        echo "ERROR: vLLM did not start in 3 minutes."
        exit 1
    fi
    sleep 3
done

# ── Start Gradio chat UI ───────────────────────────────────────────────────────
echo ""
echo "Starting Gradio chat UI on port $UI_PORT..."
echo "  Chat UI : http://0.0.0.0:$UI_PORT"
echo "  API     : http://0.0.0.0:$VLLM_PORT/v1"
echo ""

python "$SCRIPTS_DIR/chat_ui.py" \
    --vllm_url "http://localhost:$VLLM_PORT" \
    --port "$UI_PORT" \
    --model "pega-phi3-mini"

wait $VLLM_PID
