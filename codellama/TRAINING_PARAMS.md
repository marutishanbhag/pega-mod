# Pega Llama-3.1-8B — Training Parameters

## Base Model
| Parameter | Value | What it means |
|-----------|-------|---------------|
| `base_model` | meta-llama/Llama-3.1-8B-Instruct | The pretrained model we fine-tuned — 8 billion parameters, already knows general language and code |

---

## LoRA Config
| Parameter | Value | What it means |
|-----------|-------|---------------|
| `r` | 32 | Rank — size of the adapter matrices. Higher = more capacity to learn, more VRAM |
| `lora_alpha` | 64 | Scaling factor for adapter output. Usually set to 2×r |
| `lora_dropout` | 0.10 | Randomly drops 10% of adapter neurons during training to prevent overfitting |
| `bias` | none | Don't train bias terms — keeps adapter small |
| `task_type` | CAUSAL_LM | Causal language modelling — predict the next token (standard for chat models) |
| `target_modules` | q_proj, k_proj, v_proj, o_proj, gate_proj, up_proj, down_proj | Which layers inside each transformer block get LoRA adapters attached |

---

## Quantization (QLoRA)
| Parameter | Value | What it means |
|-----------|-------|---------------|
| `load_in_4bit` | True | Load base model weights in 4-bit precision — reduces 16GB model to ~4GB VRAM |
| `bnb_4bit_quant_type` | nf4 | NormalFloat4 — best 4-bit format for normally distributed weights like LLMs |
| `bnb_4bit_compute_dtype` | bfloat16 | Do the actual math in bfloat16 even though weights are stored in 4-bit |
| `bnb_4bit_use_double_quant` | True | Quantize the quantization constants too — saves extra ~0.4GB VRAM |

---

## Training Args
| Parameter | Value | What it means |
|-----------|-------|---------------|
| `num_train_epochs` | 3 | How many full passes through the training data |
| `max_seq_length` | 16384 | Maximum tokens per example — set to fit the largest Java files (~5,300 lines) |
| `per_device_train_batch_size` | 1 | Examples processed per GPU step — kept at 1 due to large context length |
| `per_device_eval_batch_size` | 1 | Examples processed per GPU step during evaluation |
| `gradient_accumulation_steps` | 16 | Accumulate gradients over 16 steps before updating weights — simulates batch size of 16 |
| `effective_batch_size` | 16 | 1 × 16 — the real batch size the model trains with |
| `learning_rate` | 5e-5 | How fast the model updates its weights — 0.00005 |
| `lr_scheduler_type` | cosine | Learning rate starts at 5e-5 and smoothly decays to near zero following a cosine curve |
| `warmup_ratio` | 0.10 | Spend the first 10% of training gradually increasing LR from 0 to 5e-5 — prevents early instability |
| `optimizer` | adamw_torch | AdamW — standard optimizer for LLM training, handles sparse gradients well |

---

## Precision
| Parameter | Value | What it means |
|-----------|-------|---------------|
| `bf16` | True | Use bfloat16 for LoRA adapter training — same range as fp32 but half the memory |
| `fp16` | False | Not used — bf16 is safer for training (no overflow issues) |
| `gradient_checkpointing` | True | Recompute activations during backward pass instead of storing them — saves ~30% VRAM at cost of ~20% speed |

---

## Checkpointing & Evaluation
| Parameter | Value | What it means |
|-----------|-------|---------------|
| `logging_steps` | 10 | Print loss and metrics every 10 steps |
| `save_steps` | 100 | Save a checkpoint to disk every 100 steps |
| `eval_steps` | 100 | Run evaluation on validation set every 100 steps |
| `eval_strategy` | steps | Evaluate based on steps, not epochs |
| `save_total_limit` | 3 | Keep only the 3 most recent checkpoints — saves disk space |
| `load_best_model_at_end` | True | After training, automatically load the checkpoint with lowest eval_loss |
| `metric_for_best_model` | eval_loss | Use validation loss to decide which checkpoint is best |
| `early_stopping_patience` | 3 | Stop training if eval_loss doesn't improve for 3 consecutive evaluations |

---

## Dataset
| Parameter | Value | What it means |
|-----------|-------|---------------|
| `train_examples` | 1,918 | Total examples the model trained on |
| `eval_examples` | 147 | Examples held out for validation (never seen during training) |
| `packing` | False | Don't pack multiple short examples into one sequence — each example is separate |
| `dataset_text_field` | text | Column name in the dataset that contains the formatted chat text |

### Rule type breakdown
| Rule Type | Examples |
|-----------|----------|
| Rule_HTML_Section | 525 |
| Rule_HTML_Harness | 332 |
| Rule_Obj_Report_Definition | 260 |
| Rule_Obj_Flow | 176 |
| Rule_Obj_CaseType | 81 |
| Rule_Obj_FlowAction | 34 |
| Rule_Obj_Model | 28 |
| Rule_Declare_Index | 15 |
| Rule_Obj_Activity | 13 |

---

## Results
| Metric | Value | What it means |
|--------|-------|---------------|
| `best_checkpoint` | checkpoint-300 | The saved checkpoint with the lowest eval_loss |
| `best_eval_loss` | 0.060 | How wrong the model is on unseen examples — 0.06 is excellent |
| `final_train_loss` | 0.115 | How wrong the model is on training examples at end of training |
| `token_accuracy` | 97.76% | % of tokens the model predicted correctly |
| `trainable_params` | 83,886,080 | Only 83M out of 8.1B params were trained — the LoRA adapters |
| `total_params` | 8,114,147,328 | Total parameters in the full model |
| `runtime` | ~2h 15min | Total training time on RTX 6000 Ada |

---

## Hardware
| Spec | Value | What it means |
|------|-------|---------------|
| `GPU` | RTX 6000 Ada | NVIDIA professional GPU with 48GB VRAM |
| `VRAM` | 48GB (51GB detected) | GPU memory available |
| `VRAM used` | ~18GB | Base model (4GB) + LoRA adapters + optimizer states + activations |

---

## Served Model
| Parameter | Value | What it means |
|-----------|-------|---------------|
| `served_model_name` | pega-llama31 | Name used when calling the API (`"model": "pega-llama31"`) |
| `vllm_version` | 0.7.3 | Version of vLLM inference engine |
| `max_model_len` | 8192 | Maximum tokens for input + output at inference time |
| `dtype` | bfloat16 | Precision used for inference — full quality, ~16GB VRAM |
| `huggingface_repo` | marutishanbhag/pega-llama31-8b-v1 | Where the merged model is stored |
