# Troubleshooting — Pega CodeLlama vLLM Deployment

## Working Dependency Versions

These are the exact versions confirmed to work together with vLLM 0.6.3 on RunPod (RTX 6000 Ada):

```
vllm==0.6.3
transformers==4.44.2
lm-format-enforcer==0.10.6
outlines==0.0.46
tokenizers==0.22.0
numpy<2.0
accelerate>=0.34.0
```

Note: `transformers==4.45.2` conflicts with `tokenizers==0.22.0`. Use `transformers==4.44.2` instead.

---

## Known Issues & Fixes

### 1. `TokenizersBackend does not exist`
**Error:** `ValueError: Tokenizer class TokenizersBackend does not exist`

**Cause:** PEFT writes `TokenizersBackend` as `tokenizer_class` in `tokenizer_config.json` after merging.

**Fix:**
```bash
python3 -c "import json; path='/workspace/merged_model/tokenizer_config.json'; d=json.load(open(path)); d['tokenizer_class']='CodeLlamaTokenizer'; json.dump(d, open(path,'w'), indent=2)"
```

---

### 2. `assert "factor" in rope_scaling` AssertionError
**Error:** `AssertionError` in `vllm/config.py` at `assert "factor" in rope_scaling`

**Cause:** `config.json` has `rope_scaling: null`. vLLM 0.6.3 tries to check `"factor" in None`.

**Fix:** Remove the key entirely:
```bash
python3 -c "import json; path='/workspace/merged_model/config.json'; d=json.load(open(path)); d.pop('rope_scaling', None); json.dump(d, open(path,'w'), indent=2)"
```

---

### 3. `default chat template is no longer allowed`
**Error:** `BadRequestError: As of transformers v4.44, default chat template is no longer allowed`

**Cause:** `tokenizer_config.json` has no `chat_template` field.

**Fix:**
```bash
python3 -c "
import json
path='/workspace/merged_model/tokenizer_config.json'
d=json.load(open(path))
d['chat_template']='{% for message in messages %}{% if message[\"role\"] == \"system\" %}<<SYS>>\n{{ message[\"content\"] }}\n<</SYS>>\n\n{% elif message[\"role\"] == \"user\" %}[INST] {{ message[\"content\"] }} [/INST]{% elif message[\"role\"] == \"assistant\" %} {{ message[\"content\"] }}</s>{% endif %}{% endfor %}'
json.dump(d, open(path,'w'), indent=2)
"
```

---

### 4. `TokenizersBackend has no attribute all_special_tokens_extended`
**Error:** `AttributeError: TokenizersBackend has no attribute all_special_tokens_extended`

**Cause:** vLLM is using the fast tokenizer (`TokenizersBackend`) instead of the slow HF tokenizer.

**Fix:** Add `--tokenizer-mode slow` to the vLLM launch command:
```bash
python -m vllm.entrypoints.openai.api_server \
    --model /workspace/merged_model \
    --tokenizer-mode slow \
    ...
```

---

### 5. `No module named 'pyairports'`
**Error:** `ModuleNotFoundError: No module named 'pyairports'`

**Cause:** `outlines` depends on `pyairports` but the pip package is broken (installs but has no files).

**Fix:** Create a stub module manually:
```bash
mkdir -p /usr/local/lib/python3.11/dist-packages/pyairports
echo "AIRPORT_LIST = []" > /usr/local/lib/python3.11/dist-packages/pyairports/airports.py
touch /usr/local/lib/python3.11/dist-packages/pyairports/__init__.py
```

---

### 6. `tokenizer.model` missing
**Error:** `TypeError: expected str, bytes or os.PathLike object, not NoneType` in `tokenization_code_llama.py`

**Cause:** The SentencePiece vocab file (`tokenizer.model`) is not saved by PEFT during merge.

**Fix:** Download it from HuggingFace:
```bash
python3 -c "
from huggingface_hub import hf_hub_download
hf_hub_download(repo_id='codellama/CodeLlama-13b-Instruct-hf', filename='tokenizer.model', local_dir='/workspace/merged_model')
"
```

---

### 7. `numpy._core.multiarray` AttributeError
**Error:** `AttributeError: module 'numpy._core' has no attribute 'multiarray'`

**Cause:** numpy 2.x is incompatible with accelerate.

**Fix:**
```bash
pip install "numpy<2.0" "accelerate>=0.34.0"
```

---

### 8. Package shadowing from `/workspace/pip_packages`
**Error:** Various import errors where old package versions shadow system installs.

**Cause:** Old `--target=/workspace/pip_packages` install approach left stale packages.

**Fix:**
```bash
rm -rf /workspace/pip_packages
```

---

### 9. Port already in use
**Error:** `OSError: [Errno 98] Address already in use`

**Fix:**
```bash
pkill -f "vllm.entrypoints"; pkill -f "chat_ui.py"; sleep 2
```

---

## Working vLLM Start Command

```bash
nohup python -m vllm.entrypoints.openai.api_server \
    --model /workspace/merged_model \
    --dtype bfloat16 \
    --max-model-len 4096 \
    --port 8000 \
    --host 0.0.0.0 \
    --gpu-memory-utilization 0.90 \
    --served-model-name "pega-codellama" \
    --tokenizer-mode slow \
    > /workspace/vllm.log 2>&1 &
```

## Working Chat UI Start Command

```bash
nohup python /workspace/scripts/chat_ui.py \
    --vllm_url http://localhost:8000 \
    --port 3000 \
    --model pega-codellama \
    > /workspace/chatui.log 2>&1 &
```

## Quick Health Check

```bash
# Check processes
ps aux | grep -E "vllm|chat_ui"

# Check vLLM
curl -s http://localhost:8000/v1/models

# Test inference
curl -s -X POST http://localhost:8000/v1/chat/completions \
    -H "Content-Type: application/json" \
    -d '{"model":"pega-codellama","messages":[{"role":"user","content":"hello"}],"max_tokens":50}' \
    | python3 -m json.tool
```
