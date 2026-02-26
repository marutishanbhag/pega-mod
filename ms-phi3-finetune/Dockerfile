# =============================================================================
# Dockerfile — Phi-3 QLoRA fine-tuning environment
#
# Base: PyTorch 2.3 + CUDA 12.1 (matches RunPod GPU template)
# Usage:
#   Build via GitHub Actions (see .github/workflows/docker-build.yml)
#   Run:  docker run --gpus all -v $(pwd):/workspace pega-phi3-finetune
# =============================================================================

FROM pytorch/pytorch:2.3.0-cuda12.1-cudnn8-devel

# Avoid interactive prompts during apt
ENV DEBIAN_FRONTEND=noninteractive

# System dependencies
RUN apt-get update && apt-get install -y --no-install-recommends \
    git \
    curl \
    wget \
    && apt-get clean && rm -rf /var/lib/apt/lists/*

WORKDIR /workspace

# Copy requirements first (layer cache)
COPY requirements.txt /workspace/requirements.txt

# Install Python dependencies
RUN pip install --no-cache-dir --upgrade pip && \
    pip install --no-cache-dir -r /workspace/requirements.txt

# Copy fine-tuning scripts
COPY prepare_dataset.py train.py merge_adapters.py test_inference.py runpod_setup.sh /workspace/

RUN chmod +x /workspace/runpod_setup.sh

# Default: drop to bash (scripts are run manually or via CMD override)
CMD ["/bin/bash"]
