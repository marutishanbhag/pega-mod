# Pega CodeLlama — Deployment Guide

## Trained Models (HuggingFace Hub)

| Epoch | HuggingFace Repo | Notes |
|-------|-----------------|-------|
| Epoch 3 | [marutishanbhag/p_lllama_e3](https://huggingface.co/marutishanbhag/p_lllama_e3) | ~3 epochs, conservative |
| Epoch 5 | [marutishanbhag/code_llama_p_e5](https://huggingface.co/marutishanbhag/code_llama_p_e5) | 5 epochs, more trained |

Both are merged CodeLlama-13B-Instruct models (fp16, ~26GB each), ready for vLLM.

---

## Docker Serve Image

A single lightweight inference image (~5GB, no weights baked in) is built via GitHub Actions
and pushed to Docker Hub as `pega-codellama-serve`.

The model weights are downloaded from HuggingFace Hub at container startup.

### Build

Triggered automatically on push to `feature/codellama` or `main` when these files change:
- `Dockerfile.serve`
- `serve_entrypoint.sh`
- `chat_ui.py` / `chat_ui.html`

Or trigger manually via GitHub Actions → **Build & Push Serve Docker Image** → Run workflow.

### Required GitHub Secrets

| Secret | Description |
|--------|-------------|
| `DOCKERHUB_USERNAME` | Docker Hub username |
| `DOCKERHUB_TOKEN` | Docker Hub access token |

---

## Running the Container

### Epoch 3
```bash
docker run --gpus all \
  -e HF_TOKEN=hf_xxx \
  -e HF_MODEL_ID=marutishanbhag/p_lllama_e3 \
  -p 8000:8000 -p 3000:3000 \
  your-dockerhub/pega-codellama-serve:latest
```

### Epoch 5
```bash
docker run --gpus all \
  -e HF_TOKEN=hf_xxx \
  -e HF_MODEL_ID=marutishanbhag/code_llama_p_e5 \
  -p 8000:8000 -p 3000:3000 \
  your-dockerhub/pega-codellama-serve:latest
```

### With persistent model cache (skips re-download on restart)
```bash
docker run --gpus all \
  -e HF_TOKEN=hf_xxx \
  -e HF_MODEL_ID=marutishanbhag/code_llama_p_e5 \
  -v /mnt/storage/model_cache:/workspace/model \
  -p 8000:8000 -p 3000:3000 \
  your-dockerhub/pega-codellama-serve:latest
```

### Optional env vars

| Env Var | Default | Description |
|---------|---------|-------------|
| `VLLM_PORT` | `8000` | vLLM API port |
| `UI_PORT` | `3000` | Chat UI port |
| `DTYPE` | `bfloat16` | Model dtype |
| `MAX_MODEL_LEN` | `4096` | Max context length |
| `GPU_MEM_UTIL` | `0.90` | vLLM GPU memory utilization |
| `MODEL_NAME` | `pega-codellama` | Served model name at `/v1/models` |

---

## Endpoints (once running)

| Endpoint | Description |
|----------|-------------|
| `http://<host>:3000` | Gradio chat UI |
| `http://<host>:8000/v1/chat/completions` | OpenAI-compatible API |
| `http://<host>:8000/v1/models` | List loaded models |
| `http://<host>:3000/health` | Health check |

---

## Testing the API

```bash
python test_inference.py --base_url http://<host>:8000
```

Or with curl:
```bash
curl http://<host>:8000/v1/chat/completions \
  -H "Content-Type: application/json" \
  -d '{
    "model": "pega-codellama",
    "messages": [{"role": "user", "content": "What does Rule_Obj_CaseType do?"}],
    "max_tokens": 256
  }'
```

---

## RunPod Source Pods

| Epoch | Pod ID | Status |
|-------|--------|--------|
| Epoch 3 | `6fa3d018fb39` | Model uploaded to HF, can be stopped |
| Epoch 5 | `b27b733296c7` | Model uploaded to HF, can be stopped |
