#!/bin/bash
# =============================================================================
# runpod_setup.sh
#
# Starts vLLM (port 8000) + chat UI (port 3000).
# For: meta-llama/Llama-3.1-8B-Instruct fine-tune
#
# Known issues fixed automatically:
#   1. /workspace/pip_packages shadowing → remove stale dir
#   2. HF cache config conflicts         → fix all cached config.json files
# =============================================================================

set -e

MODEL_PATH="${1:-/workspace/merged_model}"
VLLM_PORT="${2:-8000}"
UI_PORT="${3:-3000}"
SCRIPTS_DIR="/workspace/scripts"
GITHUB_RAW="https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/codellama/codellama"

echo "=============================================="
echo "  Pega Llama-3.1-8B — vLLM + Chat UI"
echo "  Model    : $MODEL_PATH"
echo "  API      : http://0.0.0.0:$VLLM_PORT/v1"
echo "  Chat UI  : http://0.0.0.0:$UI_PORT"
echo "=============================================="

# ── Verify model ───────────────────────────────────────────────────────────────
echo ""
echo "[1/6] Checking model..."
if [ ! -d "$MODEL_PATH" ] || [ ! -f "$MODEL_PATH/config.json" ]; then
    echo "ERROR: Model not found at $MODEL_PATH"
    exit 1
fi
echo "  Model OK: $(du -sh "$MODEL_PATH" | cut -f1)"

# ── Remove stale pip_packages dir ─────────────────────────────────────────────
if [ -d "/workspace/pip_packages" ]; then
    echo "  Removing stale /workspace/pip_packages..."
    rm -rf /workspace/pip_packages
fi

# ── Install dependencies ──────────────────────────────────────────────────────
echo ""
echo "[2/6] Installing dependencies..."
pip install -q "vllm==0.7.3" "huggingface_hub>=1.3.0" "numpy<2.0" "accelerate>=0.34.0" gradio httpx uvicorn fastapi
echo "  Done."

# ── Verify model config ────────────────────────────────────────────────────────
echo ""
echo "[3/6] Checking model config..."
python3 -c "
import json, os
cfg_path = '$MODEL_PATH/config.json'
if os.path.exists(cfg_path):
    d = json.load(open(cfg_path))
    arch = d.get('architectures', ['?'])[0]
    print(f'  Architecture: {arch}')
    print(f'  Config OK')
else:
    print('  WARNING: config.json not found')
"

# ── Download chat UI scripts ───────────────────────────────────────────────────
echo ""
echo "[4/6] Downloading chat UI..."
mkdir -p "$SCRIPTS_DIR"
curl -fsSL "$GITHUB_RAW/chat_ui.py"   -o "$SCRIPTS_DIR/chat_ui.py"
curl -fsSL "$GITHUB_RAW/chat_ui.html" -o "$SCRIPTS_DIR/chat_ui.html"
echo "  Done."

# ── Start vLLM ────────────────────────────────────────────────────────────────
echo ""
echo "[5/6] Starting vLLM..."
python3 -m vllm.entrypoints.openai.api_server \
    --model "$MODEL_PATH" \
    --dtype bfloat16 \
    --max-model-len 8192 \
    --port "$VLLM_PORT" \
    --host 0.0.0.0 \
    --gpu-memory-utilization 0.90 \
    --served-model-name "pega-llama31" &

VLLM_PID=$!
echo "  vLLM PID: $VLLM_PID — waiting for it to be ready..."

for i in $(seq 1 120); do
    if curl -sf "http://localhost:$VLLM_PORT/v1/models" > /dev/null 2>&1; then
        echo "  vLLM is ready!"
        break
    fi
    if [ $i -eq 120 ]; then
        echo "ERROR: vLLM did not start in 6 minutes."
        exit 1
    fi
    sleep 3
done

# ── Start Chat UI ─────────────────────────────────────────────────────────────
echo ""
echo "[6/6] Starting Chat UI on port $UI_PORT..."
echo "  Chat UI : http://0.0.0.0:$UI_PORT"
echo "  API     : http://0.0.0.0:$VLLM_PORT/v1"
echo ""

python3 "$SCRIPTS_DIR/chat_ui.py" \
    --vllm_url "http://localhost:$VLLM_PORT" \
    --port "$UI_PORT" \
    --model "pega-llama31"

wait $VLLM_PID
