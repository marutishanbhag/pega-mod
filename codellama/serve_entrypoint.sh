#!/bin/bash
# =============================================================================
# serve_entrypoint.sh
#
# Container startup script (Option C — weights pulled from HuggingFace Hub).
#
# Steps:
#   1. Validate required env vars
#   2. Download model from HF Hub (skipped if /workspace/model already exists)
#   3. Start vLLM on port $VLLM_PORT (default 8000)
#   4. Start chat UI on port $UI_PORT (default 3000)
#
# Required env vars:
#   HF_TOKEN     — HuggingFace token
#   HF_MODEL_ID  — e.g. "your-hf-username/pega-codellama-13b"
#
# Optional env vars:
#   VLLM_PORT     — default 8000
#   UI_PORT       — default 3000
#   DTYPE         — default bfloat16
#   MAX_MODEL_LEN — default 4096
#   GPU_MEM_UTIL  — default 0.90
#   MODEL_NAME    — served model name, default "pega-codellama"
# =============================================================================

set -e

VLLM_PORT="${VLLM_PORT:-8000}"
UI_PORT="${UI_PORT:-3000}"
DTYPE="${DTYPE:-bfloat16}"
MAX_MODEL_LEN="${MAX_MODEL_LEN:-4096}"
GPU_MEM_UTIL="${GPU_MEM_UTIL:-0.90}"
MODEL_NAME="${MODEL_NAME:-pega-codellama}"
MODEL_DIR="/workspace/model"

echo "=============================================="
echo "  Pega CodeLlama — Inference Container"
echo "  HF model  : ${HF_MODEL_ID:-<not set>}"
echo "  API       : http://0.0.0.0:$VLLM_PORT/v1"
echo "  Chat UI   : http://0.0.0.0:$UI_PORT"
echo "=============================================="

# ── [1/4] Validate env vars ────────────────────────────────────────────────────
echo ""
echo "[1/4] Validating environment..."

if [ -z "$HF_MODEL_ID" ]; then
    echo "ERROR: HF_MODEL_ID env var is required."
    echo "  Set it to your HuggingFace repo, e.g.:"
    echo "    -e HF_MODEL_ID=your-hf-username/pega-codellama-13b"
    exit 1
fi

if [ -z "$HF_TOKEN" ]; then
    echo "WARNING: HF_TOKEN is not set — will only work for public repos."
fi

echo "  OK."

# ── [2/4] Download model from HuggingFace Hub ──────────────────────────────────
echo ""
echo "[2/4] Checking model at $MODEL_DIR..."

if [ -f "$MODEL_DIR/config.json" ]; then
    echo "  Model already present ($(du -sh "$MODEL_DIR" | cut -f1)) — skipping download."
else
    echo "  Downloading $HF_MODEL_ID from HuggingFace Hub..."
    echo "  (This will take several minutes for a 13B model)"

    mkdir -p "$MODEL_DIR"

    python3 - <<PYEOF
import os, sys
from huggingface_hub import snapshot_download

token = os.environ.get("HF_TOKEN") or None
repo  = os.environ["HF_MODEL_ID"]

print(f"  Fetching: {repo}")
snapshot_download(
    repo_id=repo,
    local_dir="/workspace/model",
    token=token,
    ignore_patterns=["*.msgpack", "*.h5", "flax_model*", "tf_model*"],
)
print("  Download complete.")
PYEOF

    echo "  Model size: $(du -sh "$MODEL_DIR" | cut -f1)"
fi

# ── [3/4] Start vLLM ──────────────────────────────────────────────────────────
echo ""
echo "[3/4] Starting vLLM..."

python -m vllm.entrypoints.openai.api_server \
    --model "$MODEL_DIR" \
    --dtype "$DTYPE" \
    --max-model-len "$MAX_MODEL_LEN" \
    --port "$VLLM_PORT" \
    --host 0.0.0.0 \
    --gpu-memory-utilization "$GPU_MEM_UTIL" \
    --served-model-name "$MODEL_NAME" &

VLLM_PID=$!
echo "  vLLM PID: $VLLM_PID — waiting for it to be ready..."

for i in $(seq 1 60); do
    if curl -sf "http://localhost:$VLLM_PORT/v1/models" > /dev/null 2>&1; then
        echo "  vLLM is ready!"
        break
    fi
    if [ $i -eq 60 ]; then
        echo "ERROR: vLLM did not start within 3 minutes."
        exit 1
    fi
    sleep 3
done

# ── [4/4] Start chat UI ───────────────────────────────────────────────────────
echo ""
echo "[4/4] Starting chat UI on port $UI_PORT..."
echo "  Chat UI : http://0.0.0.0:$UI_PORT"
echo "  API     : http://0.0.0.0:$VLLM_PORT/v1"
echo ""

python /workspace/chat_ui.py \
    --vllm_url "http://localhost:$VLLM_PORT" \
    --port "$UI_PORT" \
    --model "$MODEL_NAME"

wait $VLLM_PID
