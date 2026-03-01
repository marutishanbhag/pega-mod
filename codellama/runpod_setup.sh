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
echo "[1/5] Checking model..."
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
echo "[2/5] Installing dependencies..."
pip install -q "vllm==0.6.3" "numpy<2.0" "accelerate>=0.34.0" gradio httpx uvicorn fastapi

# Fix pyairports (outlines dependency, broken pip package — create stub)
mkdir -p /usr/local/lib/python3.11/dist-packages/pyairports
echo "AIRPORT_LIST = []" > /usr/local/lib/python3.11/dist-packages/pyairports/airports.py
touch /usr/local/lib/python3.11/dist-packages/pyairports/__init__.py
echo "  Done."

# ── Fix model config files ─────────────────────────────────────────────────────
echo ""
echo "[3/5] Fixing model config..."

# Fix tokenizer_config.json: set correct tokenizer class and chat template
python3 -c "
import json, os

# Fix tokenizer_config.json
tok_cfg = '$MODEL_PATH/tokenizer_config.json'
if os.path.exists(tok_cfg):
    d = json.load(open(tok_cfg))
    changed = False
    if d.get('tokenizer_class') != 'CodeLlamaTokenizer':
        d['tokenizer_class'] = 'CodeLlamaTokenizer'
        changed = True
        print('  Fixed tokenizer_class -> CodeLlamaTokenizer')
    if 'chat_template' not in d:
        d['chat_template'] = '{% for message in messages %}{% if message[\"role\"] == \"system\" %}<<SYS>>\n{{ message[\"content\"] }}\n<</SYS>>\n\n{% elif message[\"role\"] == \"user\" %}[INST] {{ message[\"content\"] }} [/INST]{% elif message[\"role\"] == \"assistant\" %} {{ message[\"content\"] }}</s>{% endif %}{% endfor %}'
        changed = True
        print('  Added CodeLlama chat_template')
    if changed:
        json.dump(d, open(tok_cfg, 'w'), indent=2)

# Fix config.json: remove rope_scaling if present (causes vLLM AssertionError)
cfg = '$MODEL_PATH/config.json'
if os.path.exists(cfg):
    d = json.load(open(cfg))
    if 'rope_scaling' in d:
        del d['rope_scaling']
        json.dump(d, open(cfg, 'w'), indent=2)
        print('  Removed rope_scaling from config.json')
print('  Config OK')
"

# Download tokenizer.model if missing (needed by CodeLlamaTokenizer slow mode)
if [ ! -f "$MODEL_PATH/tokenizer.model" ]; then
    echo "  Downloading tokenizer.model from HuggingFace..."
    python3 -c "
from huggingface_hub import hf_hub_download
hf_hub_download(repo_id='codellama/CodeLlama-13b-Instruct-hf', filename='tokenizer.model', local_dir='$MODEL_PATH')
print('  tokenizer.model downloaded')
"
fi

# ── Download chat UI scripts ───────────────────────────────────────────────────
echo ""
echo "[4/5] Downloading chat_ui.py and chat_ui.html..."
mkdir -p "$SCRIPTS_DIR"
curl -fsSL "$GITHUB_RAW/chat_ui.py"   -o "$SCRIPTS_DIR/chat_ui.py"
curl -fsSL "$GITHUB_RAW/chat_ui.html" -o "$SCRIPTS_DIR/chat_ui.html"
echo "  Done."

# ── Start vLLM in background ───────────────────────────────────────────────────
echo ""
echo "[5/5] Starting vLLM..."
python -m vllm.entrypoints.openai.api_server \
    --model "$MODEL_PATH" \
    --dtype bfloat16 \
    --max-model-len 4096 \
    --port "$VLLM_PORT" \
    --host 0.0.0.0 \
    --gpu-memory-utilization 0.90 \
    --served-model-name "pega-codellama" \
    --tokenizer-mode slow &

VLLM_PID=$!
echo "  vLLM PID: $VLLM_PID — waiting for it to be ready..."

for i in $(seq 1 80); do
    if curl -sf "http://localhost:$VLLM_PORT/v1/models" > /dev/null 2>&1; then
        echo "  vLLM is ready!"
        break
    fi
    if [ $i -eq 80 ]; then
        echo "ERROR: vLLM did not start in 4 minutes."
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
