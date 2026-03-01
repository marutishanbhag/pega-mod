#!/bin/bash
# =============================================================================
# runpod_setup.sh
#
# Starts vLLM (port 8000) + chat UI (port 3000).
#
# Known issues fixed automatically:
#   1. tokenizer_class=TokenizersBackend  → CodeLlamaTokenizer
#   2. rope_scaling={rope_type,rope_theta} without factor → add factor:1.0
#   3. chat_template missing             → add CodeLlama template
#   4. tokenizer.model missing           → download from HF
#   5. vLLM tokenizer.all_special_tokens_extended AttributeError → patch vLLM
#   6. HF cache config conflicts         → fix all cached config.json files
#   7. /workspace/pip_packages shadowing → remove stale dir
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

# ── Fix model config files ─────────────────────────────────────────────────────
echo ""
echo "[3/6] Fixing model config..."

python3 -c "
import json, os, glob

def fix_config(cfg_path):
    if not os.path.exists(cfg_path):
        return
    d = json.load(open(cfg_path))
    changed = False

    # Fix rope_scaling: must have 'factor' key or be absent entirely
    rs = d.get('rope_scaling')
    if rs is not None and 'factor' not in rs:
        d['rope_scaling'] = {'rope_type': rs.get('rope_type', 'default'), 'factor': 1.0}
        changed = True
        print(f'  Fixed rope_scaling in {cfg_path}')

    if changed:
        json.dump(d, open(cfg_path, 'w'), indent=2)

def fix_tokenizer_config(tok_path):
    if not os.path.exists(tok_path):
        return
    d = json.load(open(tok_path))
    changed = False

    if d.get('tokenizer_class') != 'CodeLlamaTokenizer':
        d['tokenizer_class'] = 'CodeLlamaTokenizer'
        changed = True
        print(f'  Fixed tokenizer_class in {tok_path}')

    if 'chat_template' not in d:
        d['chat_template'] = '{%- for message in messages %}{%- if message[\"role\"] == \"system\" %}<<SYS>>\n{{ message[\"content\"] }}\n<</SYS>>\n\n{%- elif message[\"role\"] == \"user\" %}[INST] {{ message[\"content\"] }} [/INST]{%- elif message[\"role\"] == \"assistant\" %} {{ message[\"content\"] }}</s>{%- endif %}{%- endfor %}'
        changed = True
        print(f'  Added chat_template in {tok_path}')

    if changed:
        json.dump(d, open(tok_path, 'w'), indent=2)

# Fix local model files
fix_config('$MODEL_PATH/config.json')
fix_tokenizer_config('$MODEL_PATH/tokenizer_config.json')

# Fix all HF cache copies to avoid cache override
for p in glob.glob('/root/.cache/huggingface/hub/**/config.json', recursive=True):
    fix_config(p)
for p in glob.glob('/root/.cache/huggingface/hub/**/tokenizer_config.json', recursive=True):
    fix_tokenizer_config(p)

print('  Config OK')
"

# ── Download tokenizer.model if missing ───────────────────────────────────────
if [ ! -f "$MODEL_PATH/tokenizer.model" ]; then
    echo "  Downloading tokenizer.model from HuggingFace..."
    python3 -c "
from huggingface_hub import hf_hub_download
hf_hub_download(repo_id='codellama/CodeLlama-13b-Instruct-hf', filename='tokenizer.model', local_dir='$MODEL_PATH')
print('  tokenizer.model downloaded')
"
fi

# ── Patch vLLM: fix all_special_tokens_extended AttributeError ────────────────
VLLM_TOKENIZER="/usr/local/lib/python3.11/dist-packages/vllm/transformers_utils/tokenizer.py"
if [ -f "$VLLM_TOKENIZER" ]; then
    if grep -q "tokenizer.all_special_tokens_extended)" "$VLLM_TOKENIZER"; then
        sed -i 's/tokenizer\.all_special_tokens_extended)/getattr(tokenizer, "all_special_tokens_extended", []))/' "$VLLM_TOKENIZER"
        echo "  Patched vLLM tokenizer.py"
    fi
fi

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
    --max-model-len 4096 \
    --port "$VLLM_PORT" \
    --host 0.0.0.0 \
    --gpu-memory-utilization 0.90 \
    --served-model-name "pega-codellama" \
    --tokenizer-mode slow &

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
    --model "pega-codellama"

wait $VLLM_PID
