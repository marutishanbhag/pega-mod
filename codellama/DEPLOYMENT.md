# Pega CodeLlama — Deployment Guide

## Current Model (HuggingFace Hub)

| Model | HuggingFace Repo | Notes |
|-------|-----------------|-------|
| v2 (latest) | [marutishanbhag/pega-codellama-13b-v2](https://huggingface.co/marutishanbhag/pega-codellama-13b-v2) | Best checkpoint (early stopping), anti-hallucination training |

Merged CodeLlama-13B-Instruct model (bfloat16, ~25GB), ready for vLLM.

---

## RunPod Deployment

### Option A — Full Pipeline (train + merge + serve)

Use this when starting from scratch on a new pod.

**Recommended pod spec:** RTX 6000 Ada (48GB VRAM), 80GB+ RAM, 200GB+ disk

```bash
curl -fsSL https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/codellama/codellama/train_pipeline.sh -o /tmp/train_pipeline.sh && nohup bash /tmp/train_pipeline.sh <HF_TOKEN> <HF_REPO> > /tmp/pipeline.log 2>&1 & echo $!
```

Watch progress:
```bash
tail -f /tmp/pipeline.log
```

Steps it runs automatically:
1. Clone repo (`feature/codellama` branch)
2. Install dependencies
3. Generate training dataset from Java rule files
4. Train CodeLlama-13B with QLoRA (3 epochs, early stopping)
5. Merge LoRA adapters into full model
6. Upload merged model to HuggingFace Hub
7. Start vLLM + Chat UI

---

### Option B — Serve Only (already have merged model)

Use this when `/workspace/merged_model` already exists (e.g. after pod restart).

```bash
curl -fsSL https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/codellama/codellama/runpod_setup.sh -o /tmp/runpod_setup.sh && nohup bash /tmp/runpod_setup.sh /workspace/merged_model 8000 3000 > /tmp/setup.log 2>&1 & echo $!
```

Watch progress:
```bash
tail -f /tmp/setup.log
```

What `runpod_setup.sh` handles automatically:
- Installs `vllm==0.7.3` and dependencies
- Fixes `tokenizer_class` → `CodeLlamaTokenizer` (local + HF cache)
- Fixes `rope_scaling` to include `factor: 1.0` (local + HF cache)
- Adds `chat_template` if missing
- Downloads `tokenizer.model` from HF if missing
- Patches vLLM `tokenizer.py` for `all_special_tokens_extended` error
- Starts vLLM on port 8000
- Downloads and starts Chat UI on port 3000

---

## Endpoints

| Endpoint | Description |
|----------|-------------|
| `http://<host>:3000` | Chat UI |
| `http://<host>:3000/api/chat` | Chat API (`POST {message, history}`) |
| `http://<host>:8000/v1/chat/completions` | OpenAI-compatible API |
| `http://<host>:8000/v1/models` | List loaded models |
| `http://<host>:3000/health` | Health check |

---

## Testing the API

```bash
# Check vLLM is up
curl http://localhost:8000/v1/models

# Test inference
curl -s -X POST http://localhost:8000/v1/chat/completions \
  -H "Content-Type: application/json" \
  -d '{
    "model": "pega-codellama",
    "messages": [
      {"role": "system", "content": "You are a Pega code expert fine-tuned on a specific repository of 3,489 Java rule files. These files are Pega-generated Java classes representing Case Types, Flows, Flow Actions, HTML Sections, HTML Harnesses, Activities, Report Definitions, Portal Skins, Data Transforms, and Declare Index rules.\n\nSTRICT RULES:\n1. ONLY reference rule names, class names, methods, and properties you have ACTUALLY seen.\n2. If you are unsure or the question is about something outside your training data, say: \"I don'\''t have that information in my training data.\"\n3. NEVER invent rule names, method names, property names, or class hierarchies.\n4. Explain code in Pega terms (rule type, case type, application namespace).\n5. Provide a confidence score (0-100%) at the end of every response.\n6. If a question is ambiguous, ask for clarification rather than guessing."},
      {"role": "user", "content": "What namespaces are present in the codebase?"}
    ],
    "max_tokens": 300,
    "temperature": 0.1
  }' | python3 -m json.tool

# Test via chat UI API
curl -s -X POST http://localhost:3000/api/chat \
  -H "Content-Type: application/json" \
  -d '{"message": "What namespaces are present in the codebase?", "history": []}' \
  | python3 -m json.tool
```

---

## Restart After Pod Stop/Start

`/workspace` persists across stop/start. Just re-run Option B:

```bash
curl -fsSL https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/codellama/codellama/runpod_setup.sh -o /tmp/runpod_setup.sh && nohup bash /tmp/runpod_setup.sh /workspace/merged_model 8000 3000 > /tmp/setup.log 2>&1 & echo $!
```

---

## Troubleshooting

See [TROUBLESHOOTING.md](./TROUBLESHOOTING.md) for known issues and fixes.

Key things to remember:
- Always use the exact system prompt from `prepare_dataset.py` — the model was trained on it
- vLLM requires `--tokenizer-mode slow` for CodeLlama
- If GPU OOM after crash: stop/start the pod (GPU reset requires host-level permissions)
