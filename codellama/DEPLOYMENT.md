# Pega Llama-3.1-8B — Deployment Guide

## Current Model (HuggingFace Hub)

| Model | HuggingFace Repo | Notes |
|-------|-----------------|-------|
| v3 (latest) | [marutishanbhag/pega-llama31-8b-v1](https://huggingface.co/marutishanbhag/pega-llama31-8b-v1) | Llama-3.1-8B-Instruct, anti-hallucination training |
| v2 (archived) | [marutishanbhag/pega-codellama-13b-v2](https://huggingface.co/marutishanbhag/pega-codellama-13b-v2) | Previous CodeLlama-13B model |

Merged Llama-3.1-8B-Instruct model (bfloat16, ~16GB), ready for vLLM.

---

## RunPod Pod Spec

**Recommended:** RTX 6000 Ada (48GB VRAM), 80GB+ RAM, 200GB+ disk

Training uses `max_seq_length=16384` with 4-bit QLoRA — 48GB VRAM is required.

---

## Option A — Full Pipeline (train + merge + serve)

Use this on a **fresh pod** to train from scratch, merge, upload to HuggingFace, and serve.

```bash
curl -fsSL https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/start_small/codellama/train_pipeline.sh \
  -o /tmp/train_pipeline.sh && \
nohup bash /tmp/train_pipeline.sh <HF_TOKEN> <HF_REPO> > /tmp/pipeline.log 2>&1 & echo $!
```

Watch progress:
```bash
tail -f /tmp/pipeline.log
```

Reattach if terminal disconnects:
```bash
tmux attach -t pega-training
```

**What it does automatically:**
1. Clone repo (`feature/start_small` branch)
2. Install Python dependencies
3. Generate training dataset (`prepare_dataset.py --max_seq_length 16384`)
   - 1,913 train examples from 115 Java rule files (100% line coverage)
   - 116 business docs Q&A pairs from `docs/*.md`
   - Anti-hallucination negative examples
4. Train Llama-3.1-8B-Instruct with QLoRA (`max_seq_length=16384`, 3 epochs)
5. Merge LoRA adapters into full bfloat16 model
6. Upload merged model to HuggingFace Hub
7. Start vLLM on port 8000 + Chat UI on port 3000

---

## Option B — Serve Only (model already trained)

Use this when `/workspace/merged_model` already exists (e.g. after pod stop/start, or pulling from HuggingFace).

```bash
curl -fsSL https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/start_small/codellama/runpod_setup.sh \
  -o /tmp/runpod_setup.sh && \
nohup bash /tmp/runpod_setup.sh /workspace/merged_model 8000 3000 > /tmp/setup.log 2>&1 & echo $!
```

Watch progress:
```bash
tail -f /tmp/setup.log
```

**What it does:**
- Installs `vllm` and dependencies
- Verifies model config
- Starts vLLM on port 8000 (served model name: `pega-llama31`)
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
    "model": "pega-llama31",
    "messages": [
      {"role": "system", "content": "You are a Pega code expert fine-tuned on a specific repository of 3,489 Java rule files. These files are Pega-generated Java classes representing Case Types, Flows, Flow Actions, HTML Sections, HTML Harnesses, Activities, Report Definitions, Portal Skins, Data Transforms, and Declare Index rules.\n\nSTRICT RULES:\n1. ONLY reference rule names, class names, methods, and properties you have ACTUALLY seen.\n2. If you are unsure or the question is about something outside your training data, say: \"I don'\''t have that information in my training data.\"\n3. NEVER invent rule names, method names, property names, or class hierarchies.\n4. Explain code in Pega terms (rule type, case type, application namespace).\n5. Provide a confidence score (0-100%) at the end of every response.\n6. If a question is ambiguous, ask for clarification rather than guessing."},
      {"role": "user", "content": "What namespaces are present in the codebase?"}
    ],
    "max_tokens": 300,
    "temperature": 0.1
  }' | python3 -m json.tool

# Test via Chat UI API
curl -s -X POST http://localhost:3000/api/chat \
  -H "Content-Type: application/json" \
  -d '{"message": "What namespaces are present in the codebase?", "history": []}' \
  | python3 -m json.tool
```

---

## Restart After Pod Stop/Start

`/workspace` persists across stop/start. Re-run Option B:

```bash
curl -fsSL https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/start_small/codellama/runpod_setup.sh \
  -o /tmp/runpod_setup.sh && \
nohup bash /tmp/runpod_setup.sh /workspace/merged_model 8000 3000 > /tmp/setup.log 2>&1 & echo $!
```

---

## Key Notes

- Branch: **`feature/start_small`** (this branch has all current training improvements)
- Training `max_seq_length`: **16384** (up from 512 — covers full Java file content)
- Llama 3.1 does NOT need `--tokenizer-mode slow`
- Stop tokens: `<|eot_id|>`, `<|end_of_text|>`
- Served model name: **`pega-llama31`**
- If GPU OOM after crash: stop/start the pod (GPU reset requires host-level permissions)
- Always use the exact system prompt from `prepare_dataset.py` — the model was trained on it

---

## Troubleshooting

See [TROUBLESHOOTING.md](./TROUBLESHOOTING.md) for known issues and fixes.
