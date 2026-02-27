"""
chat_ui.py

FastAPI server that:
  - Serves chat_ui.html at /
  - Exposes /api/chat  — accepts {message, history} and proxies to vLLM
  - Exposes /api/proxy/{path} — raw proxy to vLLM for any OpenAI client

No CORS issues — the HTML and the API are on the same origin.

Usage:
  python chat_ui.py [--vllm_url http://localhost:8000] [--port 3000]
"""

import argparse
import pathlib
import httpx
from fastapi import FastAPI, Request
from fastapi.responses import HTMLResponse, JSONResponse
from fastapi.staticfiles import StaticFiles
import uvicorn

SCRIPT_DIR = pathlib.Path(__file__).parent
HTML_FILE = SCRIPT_DIR / "chat_ui.html"

SYSTEM_PROMPT = (
    "You are a Pega platform expert fine-tuned on 6 Pega applications: "
    "LTM_Enrollment, LTM_Onboarding, LTM_BFS, OOD4NM_Loan, OLFHF9_Onboaring, and OFON2J_ProcessO. "
    "You have studied all 3,489 Java rule source files from these applications including "
    "Case Types, Flows, Flow Actions, HTML Sections, HTML Harnesses, Activities, "
    "Report Definitions, Portal Skins, and Declare Index rules. "
    "When answering: be specific and reference actual rule names, namespaces, and class names. "
    "Explain what rules do, how they relate to each other, and suggest concrete enhancements. "
    "For code questions, show actual Java/Pega patterns from the codebase. "
    "For enhancement requests, provide step-by-step Pega Dev Studio instructions."
)


def parse_args():
    p = argparse.ArgumentParser()
    p.add_argument("--vllm_url", default="http://localhost:8000")
    p.add_argument("--port", type=int, default=3000)
    p.add_argument("--model", default="pega-phi3-mini")
    return p.parse_args()


args = parse_args()
app = FastAPI()


# ── Serve HTML ─────────────────────────────────────────────────────────────────

@app.get("/", response_class=HTMLResponse)
async def index():
    if not HTML_FILE.exists():
        return HTMLResponse("<h1>chat_ui.html not found</h1>", status_code=404)
    return HTMLResponse(HTML_FILE.read_text())


# ── Chat endpoint ──────────────────────────────────────────────────────────────

@app.post("/api/chat")
async def chat(request: Request):
    body = await request.json()
    message = body.get("message", "")
    history = body.get("history", [])

    # Build messages list with system prompt
    messages = [{"role": "system", "content": SYSTEM_PROMPT}]
    # Add conversation history (last 10 turns to keep context manageable)
    for turn in history[-10:]:
        if turn.get("role") in ("user", "assistant"):
            messages.append({"role": turn["role"], "content": turn["content"]})

    # Ensure last message is the current one
    if not messages or messages[-1]["content"] != message:
        messages.append({"role": "user", "content": message})

    payload = {
        "model": args.model,
        "messages": messages,
        "max_tokens": 512,
        "temperature": 0.1,
    }

    try:
        async with httpx.AsyncClient(timeout=120) as client:
            res = await client.post(
                f"{args.vllm_url}/v1/chat/completions",
                json=payload,
            )
            res.raise_for_status()
            reply = res.json()["choices"][0]["message"]["content"].strip()
            return JSONResponse({"reply": reply})
    except Exception as e:
        return JSONResponse({"reply": f"Error contacting model server: {e}"}, status_code=500)


# ── Raw proxy for OpenAI clients ───────────────────────────────────────────────

@app.api_route("/api/proxy/{path:path}", methods=["GET", "POST", "PUT", "DELETE"])
async def proxy(path: str, request: Request):
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

    content_type = response.headers.get("content-type", "")
    if "application/json" in content_type:
        return JSONResponse(content=response.json(), status_code=response.status_code)
    return JSONResponse(content={"text": response.text}, status_code=response.status_code)


@app.get("/health")
async def health():
    return {"status": "ok", "vllm": args.vllm_url, "model": args.model}


# ── Run ────────────────────────────────────────────────────────────────────────

if __name__ == "__main__":
    print(f"Starting Pega Chat UI")
    print(f"  Chat UI : http://0.0.0.0:{args.port}")
    print(f"  API     : http://0.0.0.0:{args.port}/api/chat")
    print(f"  Proxy   : http://0.0.0.0:{args.port}/api/proxy/v1/...")
    print(f"  vLLM    : {args.vllm_url}")
    uvicorn.run(app, host="0.0.0.0", port=args.port)
