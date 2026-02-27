"""
chat_ui.py

Lightweight Gradio chat UI with a built-in FastAPI proxy to vLLM.
Runs everything on a single port (3000) — no CORS issues.

Layout:
  http://0.0.0.0:3000        → Gradio chat UI
  http://0.0.0.0:3000/proxy  → FastAPI proxy → vLLM at localhost:8000

Usage:
  python chat_ui.py [--vllm_url http://localhost:8000] [--port 3000]
"""

import argparse
import httpx
import gradio as gr
from fastapi import FastAPI, Request
from fastapi.responses import StreamingResponse, JSONResponse
import uvicorn

# ── Args ───────────────────────────────────────────────────────────────────────

def parse_args():
    p = argparse.ArgumentParser()
    p.add_argument("--vllm_url", default="http://localhost:8000")
    p.add_argument("--port", type=int, default=3000)
    p.add_argument("--model", default="pega-phi3-mini")
    return p.parse_args()

args = parse_args()

SYSTEM_PROMPT = (
    "You are a Pega platform expert fine-tuned on Pega rule source files. "
    "Answer questions about Pega rules, case types, flows, activities, "
    "namespaces, and code structure clearly and accurately. "
    "You can also suggest enhancements to existing Pega rules."
)

# ── FastAPI proxy ──────────────────────────────────────────────────────────────

app = FastAPI()

@app.api_route("/proxy/{path:path}", methods=["GET", "POST", "PUT", "DELETE"])
async def proxy(path: str, request: Request):
    """Forward all /proxy/* requests to vLLM, stripping the /proxy prefix."""
    target_url = f"{args.vllm_url}/{path}"
    body = await request.body()
    headers = {k: v for k, v in request.headers.items() if k.lower() != "host"}

    async with httpx.AsyncClient(timeout=120) as client:
        response = await client.request(
            method=request.method,
            url=target_url,
            headers=headers,
            content=body,
            params=dict(request.query_params),
        )

    return JSONResponse(
        content=response.json() if response.headers.get("content-type", "").startswith("application/json") else response.text,
        status_code=response.status_code,
    )

@app.get("/health")
async def health():
    return {"status": "ok", "vllm": args.vllm_url, "model": args.model}

# ── Gradio chat ────────────────────────────────────────────────────────────────

def chat(message: str, history: list) -> str:
    """Send message to vLLM and return response."""
    messages = [{"role": "system", "content": SYSTEM_PROMPT}]
    for user_msg, assistant_msg in history:
        messages.append({"role": "user", "content": user_msg})
        messages.append({"role": "assistant", "content": assistant_msg})
    messages.append({"role": "user", "content": message})

    payload = {
        "model": args.model,
        "messages": messages,
        "max_tokens": 512,
        "temperature": 0.1,
    }

    try:
        with httpx.Client(timeout=120) as client:
            response = client.post(
                f"{args.vllm_url}/v1/chat/completions",
                json=payload,
            )
            response.raise_for_status()
            return response.json()["choices"][0]["message"]["content"].strip()
    except Exception as e:
        return f"Error: {e}"

with gr.Blocks(title="Pega AI Assistant", theme=gr.themes.Soft()) as ui:
    gr.Markdown("""
    # 🤖 Pega AI Assistant
    Fine-tuned on Pega platform rule source files.
    Ask questions about rule types, case types, flows, activities, namespaces, or request enhancements.
    """)

    chatbot = gr.Chatbot(height=500, show_label=False)
    msg = gr.Textbox(
        placeholder="Ask about a Pega rule, e.g. 'What does Rule_Obj_CaseType do?' or 'How do I add a stage to a flow?'",
        label="Your question",
        lines=2,
    )
    with gr.Row():
        submit = gr.Button("Send", variant="primary")
        clear = gr.Button("Clear")

    def respond(message, history):
        reply = chat(message, history)
        history.append((message, reply))
        return "", history

    submit.click(respond, [msg, chatbot], [msg, chatbot])
    msg.submit(respond, [msg, chatbot], [msg, chatbot])
    clear.click(lambda: [], None, chatbot)

# ── Mount Gradio into FastAPI and serve ────────────────────────────────────────

app = gr.mount_gradio_app(app, ui, path="/")

if __name__ == "__main__":
    print(f"Starting Pega Chat UI on port {args.port}")
    print(f"  Chat UI : http://0.0.0.0:{args.port}")
    print(f"  Proxy   : http://0.0.0.0:{args.port}/proxy/v1/...")
    print(f"  vLLM    : {args.vllm_url}")
    uvicorn.run(app, host="0.0.0.0", port=args.port)
