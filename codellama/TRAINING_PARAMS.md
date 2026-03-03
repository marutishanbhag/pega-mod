# Pega Llama-3.1-8B — Training Parameters

## Base Model
```
base_model = meta-llama/Llama-3.1-8B-Instruct
```

---

## LoRA Config
```
r                         = 32
lora_alpha                = 64
lora_dropout              = 0.10
bias                      = none
task_type                 = CAUSAL_LM
target_modules            = q_proj, k_proj, v_proj, o_proj,
                            gate_proj, up_proj, down_proj
```

---

## Quantization (QLoRA)
```
load_in_4bit                  = True
bnb_4bit_quant_type           = nf4
bnb_4bit_compute_dtype        = bfloat16
bnb_4bit_use_double_quant     = True
```

---

## Training Args
```
num_train_epochs              = 3
max_seq_length                = 16384
per_device_train_batch_size   = 1
per_device_eval_batch_size    = 1
gradient_accumulation_steps   = 16
effective_batch_size          = 16  (1 × 16)
learning_rate                 = 5e-5
lr_scheduler_type             = cosine
warmup_ratio                  = 0.10
optimizer                     = adamw_torch
```

---

## Precision
```
bf16                      = True   (4-bit QLoRA uses bfloat16 compute)
fp16                      = False
gradient_checkpointing    = True
```

---

## Checkpointing & Evaluation
```
logging_steps             = 10
save_steps                = 100
eval_steps                = 100
eval_strategy             = steps
save_total_limit          = 3
load_best_model_at_end    = True
metric_for_best_model     = eval_loss
early_stopping_patience   = 3
```

---

## Dataset
```
train_examples            = 1,918
eval_examples             = 147
packing                   = False
dataset_text_field        = text

  Rule_HTML_Section       : 525
  Rule_HTML_Harness       : 332
  Rule_Obj_Report_Def     : 260
  Rule_Obj_Flow           : 176
  Rule_Obj_CaseType       : 81
  Rule_Obj_FlowAction     : 34
  Rule_Obj_Model          : 28
  Rule_Declare_Index      : 15
  Rule_Obj_Activity       : 13
```

---

## Results
```
best_checkpoint           = /workspace/output/checkpoint-300
best_eval_loss            = 0.060
final_train_loss          = 0.115
token_accuracy            = 97.76%
trainable_params          = 83,886,080  (1.03% of total)
total_params              = 8,114,147,328
runtime                   = ~2h 15min
```

---

## Hardware
```
GPU                       = RTX 6000 Ada
VRAM                      = 48GB (51GB detected)
VRAM used                 = ~18GB
```

---

## Served Model
```
served_model_name         = pega-llama31
vllm_version              = 0.7.3
max_model_len             = 8192
dtype                     = bfloat16
huggingface_repo          = marutishanbhag/pega-llama31-8b-v1
```
