#!/bin/bash
# =============================================================================
# send_data.sh  —  Run this on your LOCAL Mac
#
# 1. Generates the Q&A dataset from the Pega .java files
# 2. Sends data/ to your RunPod pod via runpodctl
#
# Usage:
#   bash ms-phi3-finetune/send_data.sh
# =============================================================================

set -e

SCRIPT_DIR="$(cd "$(dirname "$0")" && pwd)"
REPO_ROOT="$(cd "$SCRIPT_DIR/.." && pwd)"

echo "=============================================="
echo "  Step 1: Generate Pega Q&A dataset"
echo "=============================================="

cd "$SCRIPT_DIR"

# Install datasets library if not present
python3 -c "import datasets" 2>/dev/null || pip install datasets --quiet

python3 prepare_dataset.py

echo ""
echo "=============================================="
echo "  Step 2: Send data/ to RunPod pod"
echo "=============================================="

if ! command -v runpodctl &>/dev/null; then
    echo "runpodctl not found. Installing..."
    brew install runpod/runpodctl/runpodctl
fi

echo ""
echo "Sending data/ folder to RunPod..."
echo "A one-time code will appear below."
echo "Paste it into your RunPod terminal: runpodctl receive <code>"
echo ""

runpodctl send "$SCRIPT_DIR/data"

echo ""
echo "After receiving on pod, move the folder:"
echo "  mv data /workspace/data"
