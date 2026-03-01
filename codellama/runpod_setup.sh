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
GITHUB_RAW="https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/codellama/codellama"

echo "=============================================="
echo "  Pega CodeLlama — vLLM + Chat UI"
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

# ── Remove stale pip_packages dir (causes shadowing conflicts) ─────────────────
if [ -d "/workspace/pip_packages" ]; then
    echo "  Removing stale /workspace/pip_packages to prevent shadowing..."
    rm -rf /workspace/pip_packages
fi

# ── Install dependencies at system level ──────────────────────────────────────
echo ""
echo "[2/4] Installing dependencies..."
# Install everything at system level to avoid shadowing/conflict issues
pip install -q \
    "numpy<2.0" \
    "tokenizers==0.22.0" \
    "accelerate>=0.34.0" \
    "vllm==0.6.3" \
    gradio httpx uvicorn fastapi
echo "  Done."

# ── Download chat UI scripts ───────────────────────────────────────────────────
echo ""
echo "[3/4] Downloading chat_ui.py and chat_ui.html..."
mkdir -p "$SCRIPTS_DIR"
curl -fsSL "$GITHUB_RAW/chat_ui.py"   -o "$SCRIPTS_DIR/chat_ui.py"
curl -fsSL "$GITHUB_RAW/chat_ui.html" -o "$SCRIPTS_DIR/chat_ui.html"
echo "  Done."

# ── Fix tokenizer_config.json if needed ───────────────────────────────────────
TOK_CFG="$MODEL_PATH/tokenizer_config.json"
if [ -f "$TOK_CFG" ]; then
    python3 -c "
import json
path='$TOK_CFG'
d=json.load(open(path))
if d.get('tokenizer_class') != 'CodeLlamaTokenizer':
    d['tokenizer_class']='CodeLlamaTokenizer'
    json.dump(d, open(path,'w'), indent=2)
    print('  Fixed tokenizer_class -> CodeLlamaTokenizer')
else:
    print('  tokenizer_class OK:', d['tokenizer_class'])
"
fi

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
    --served-model-name "pega-codellama" &

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
    --model "pega-codellama"

wait $VLLM_PID
