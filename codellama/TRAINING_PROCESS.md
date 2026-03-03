# Pega Llama-3.1-8B — Training Process

## Overview

Fine-tuning `meta-llama/Llama-3.1-8B-Instruct` on a proprietary Pega codebase using
QLoRA (4-bit quantized Low-Rank Adaptation). The goal is to make the model answer
questions about specific Pega Java rule files, case types, flows, and business logic
without hallucinating.

---

## Architecture

```
Pega Java Files (145 files)
       +
Business Docs (10 .md files)
       ↓
prepare_dataset.py          ← generates train.jsonl / test.jsonl
       ↓
train.py                    ← QLoRA fine-tuning on Llama-3.1-8B
       ↓
merge_adapters.py           ← merges LoRA weights into base model
       ↓
HuggingFace Hub upload      ← marutishanbhag/pega-llama31-8b-v1
       ↓
vLLM (port 8000)            ← OpenAI-compatible API
       +
Chat UI (port 3000)         ← web interface
```

---

## Step 1 — Dataset Generation (`prepare_dataset.py`)

### Input Sources
| Source | Files | Purpose |
|--------|-------|---------|
| Java rule files | 145 `.java` files | Core training data |
| Business docs | 10 `.md` files | Domain context |

### Java File Processing
Each Java file is processed into multiple training examples:

**Raw "Study" examples (278 single + 223 chunked = 501 total)**
- The full file content is sent to the model with instruction to study it
- Large files (>16K tokens) are split into overlapping chunks of 600 lines
- Each chunk overlaps by 60 lines to preserve context at boundaries
- Format:
  ```
  USER: Here is a Pega rule file (part 1 of 3). Study its contents.
        Filename: `Rule_HTML_Section_...java`
        ```java
        [file content]
        ```
  ASST: I have analyzed this Pega rule file...
        - Rule type: HTML Section rule
        - Application: OOD4NM Loan
        - Methods: isAllowed(), generate()...
  ```

**Q&A pairs (13–18 per file)**
- Specific questions about each file covering:
  - Naming conventions
  - Rule type and purpose
  - Namespace and application
  - Methods and properties
  - Case type relationships
  - Flow structure

**Negative / anti-hallucination examples (83)**
- Questions about things that do NOT exist in the codebase
- Model trained to respond: "I don't have that information in my training data"
- Prevents the model from inventing rule names, methods, or class hierarchies

**Business docs Q&A (116)**
- Auto-extracted Q&A from markdown section headings
- 23 static curated Q&A pairs covering migration goals, RBAC, entity mappings
- Raw "Study its contents" examples for each `.md` file

### Dataset Stats
```
Train examples      : 1,918
Validation examples : 147
Total               : 2,065
Negative ratio      : 3.8% (target: 20%)

Rule type breakdown:
  Rule_HTML_Section           : 525
  Rule_HTML_Harness           : 332
  Rule_Obj_Report_Definition  : 260
  Rule_Obj_Flow               : 176
  Rule_Obj_CaseType           : 81
  Rule_Obj_FlowAction         : 34
  Rule_Obj_Model              : 28
  Rule_Declare_Index          : 15
  Rule_Obj_Activity           : 13
```

### Token Budget
- `max_seq_length = 16384` — matches Llama 3.1's capacity for large files
- Examples exceeding the budget are trimmed 20 lines at a time from the end
- 100% Java file line coverage achieved (122,815 / 122,815 lines)

---

## Step 2 — Training (`train.py`)

### How QLoRA Works
```
Base Llama-3.1-8B weights   →  frozen in 4-bit (not updated)
LoRA adapter weights        →  trained in bfloat16
```

Only 83M parameters (1% of 8.1B) are trained — the LoRA adapters inserted
into each transformer layer. This makes training feasible on a single GPU.

### Training Flow
```
1. Load tokenizer (AutoTokenizer, fast, HF token required for gated model)
2. Detect VRAM → choose 4-bit QLoRA (48GB pod)
3. Load base model in 4-bit (BitsAndBytesConfig nf4)
4. Attach LoRA adapters to: q_proj, k_proj, v_proj, o_proj,
                             gate_proj, up_proj, down_proj
5. Apply chat template to all examples (Llama 3.1 instruct format)
6. Train with SFTTrainer (3 epochs, cosine LR, early stopping)
7. Save best checkpoint (lowest eval_loss)
8. Save LoRA adapters → /workspace/output/final_adapter
```

### Training Progress
```
Epoch 1: loss ~0.5   (model starts learning Pega patterns)
Epoch 2: loss ~0.3   (model refines understanding)
Epoch 3: loss ~0.115 (model converges)

Best eval_loss      : 0.060  (excellent)
Token accuracy      : 97.76%
Best checkpoint     : checkpoint-300
Runtime             : ~2h 15min
```

### Early Stopping
Training stops automatically if eval_loss doesn't improve for 3 consecutive
evaluation steps — prevents overfitting.

---

## Step 3 — Merge Adapters (`merge_adapters.py`)

LoRA adapters are mathematically merged into the base model weights:
```
Final weight = Original weight + (LoRA_A × LoRA_B × alpha/r)
```

Result: a standalone bfloat16 model (~16GB) with Pega knowledge baked in.
No need to load the base model + adapter separately at inference time.

```
Input  : /workspace/output/final_adapter  (160MB LoRA weights)
Output : /workspace/merged_model          (~16GB full model)
```

---

## Step 4 — Upload to HuggingFace

Merged model uploaded to: `marutishanbhag/pega-llama31-8b-v1`

```python
HfApi(token=HF_TOKEN).upload_folder(
    folder_path='/workspace/merged_model',
    repo_id='marutishanbhag/pega-llama31-8b-v1',
    repo_type='model',
)
```

---

## Step 5 — Serve with vLLM

```bash
python -m vllm.entrypoints.openai.api_server \
    --model /workspace/merged_model \
    --served-model-name pega-llama31 \
    --host 0.0.0.0 \
    --port 8000 \
    --dtype bfloat16 \
    --max-model-len 8192 \
    --trust-remote-code
```

Exposes OpenAI-compatible API at `http://0.0.0.0:8000/v1`

---

## Step 6 — Chat UI

```bash
python3 chat_ui.py \
    --vllm_url http://localhost:8000 \
    --port 3000 \
    --model pega-llama31
```

Web interface at `http://0.0.0.0:3000`

---

## Known Issues & Fixes

| Issue | Cause | Fix |
|-------|-------|-----|
| `GatedRepoError 401` | HF token not passed to `from_pretrained()` | `token=os.environ.get("HF_TOKEN")` |
| `TokenizersBackend` error in vLLM | transformers 5.x sets wrong tokenizer_class | Patch `tokenizer_config.json` to `PreTrainedTokenizerFast` |
| `transformers` incompatible with vLLM | Training installs transformers>=5.0 | `pip install transformers==4.48.3` before serving |
| Terminal disconnect kills training | Running in foreground | Use `nohup ... &` or `tmux` |

---

## Reproducibility

To retrain from scratch on a fresh RunPod pod:

```bash
export HF_TOKEN=<your_token>
curl -fsSL "https://raw.githubusercontent.com/marutishanbhag/pega-mod/feature/start_small/codellama/train_pipeline.sh" \
  -o /tmp/train_pipeline.sh && \
nohup bash /tmp/train_pipeline.sh "$HF_TOKEN" marutishanbhag/pega-llama31-8b-v1 \
  > /tmp/pipeline.log 2>&1 & echo $!
```

To serve an already-trained model:

```bash
pip install "transformers==4.48.3"
python3 -c "import json; path='/workspace/merged_model/tokenizer_config.json'; cfg=json.load(open(path)); cfg['tokenizer_class']='PreTrainedTokenizerFast'; json.dump(cfg, open(path,'w'), indent=2)"
nohup python -m vllm.entrypoints.openai.api_server --model /workspace/merged_model --served-model-name pega-llama31 --host 0.0.0.0 --port 8000 --dtype bfloat16 --max-model-len 8192 --trust-remote-code > /tmp/vllm.log 2>&1 & echo $!
```

---

## Files Reference

| File | Purpose |
|------|---------|
| `prepare_dataset.py` | Generates training data from Java files and docs |
| `train.py` | QLoRA fine-tuning script |
| `merge_adapters.py` | Merges LoRA adapters into base model |
| `runpod_setup.sh` | Starts vLLM + Chat UI |
| `train_pipeline.sh` | End-to-end pipeline (steps 1–6) |
| `chat_ui.py` | Web chat interface |
| `data/train.jsonl` | Training examples (1,918) |
| `data/test.jsonl` | Validation examples (147) |
| `data/pega_qa.jsonl` | Full Q&A pairs |
| `TRAINING_PARAMS.md` | All training hyperparameters |
| `DEPLOYMENT.md` | RunPod deployment guide |
