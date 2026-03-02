# Business-Level User Stories — Migration to React + Spring

Document Date: February 26, 2026

## Purpose
High-level, business-facing user stories to guide product, UX and implementation prioritization. Each story includes acceptance criteria and business value.

## Persona Key
- Customer: end user who submits data (applicant)
- Case Worker: agent who processes cases
- Manager: supervises, approves, views reports
- Admin/IT: config, roles, ops

## Stories

1) As a Customer, I want to create an Onboarding case so that my information is submitted for processing.
   - Acceptance: Customer can complete multi-step create wizard; required fields validated; successful create returns case ID and next step.
   - Business value: Enables intake via new web UI (reduces manual entry).

2) As a Case Worker, I want to see a prioritized list of assigned cases so I can process high-priority work first.
   - Acceptance: List supports paging, sorting, status filter and SLA-based priority coloring. Action buttons for View/Edit/Close present.
   - Business value: Improves throughput and SLA adherence.

3) As a Case Worker, I want to view full case details (header, sections, attachments, history) so I can make informed decisions.
   - Acceptance: Detail page displays case metadata, collapsible sections, activity history and attachments; edits save and create audit entries.
   - Business value: Reduces errors and cycle time.

4) As a Manager, I want to approve stage transitions so that compliance approvals are enforced.
   - Acceptance: Transition UI shows required approvals, role checks enforce permissions, approval actions update state and log reason.
   - Business value: Ensures policy and auditability.

5) As a Product Owner, I want search and geo-filtering so I can find cases by address proximity and key fields quickly.
   - Acceptance: Search supports faceted filters and proximity search (km radius). Results are paginated and sortable.
   - Business value: Enables operational queries and regional reporting.

6) As an Admin, I want role-based access controls so I can restrict actions by role.
   - Acceptance: JWT-based auth with roles; protected endpoints return 403 when unauthorized; UI hides unauthorized actions.
   - Business value: Security & compliance.

7) As an Ops engineer, I want metrics and alerts on case processing so I can detect failures and SLA breaches.
   - Acceptance: Prometheus metrics for API latency, error rates, queue length; Grafana dashboards and alert rules present.
   - Business value: Reduces mean-time-to-detect and resolve issues.

8) As a Data Steward, I want migration and reconciliation reports so I can confirm data parity between Pega and new system.
   - Acceptance: Migration scripts produce reconciliation report showing counts and key field diffs; mismatches flagged.
   - Business value: Reduces migration risk.

9) As a Customer, I want client-side validation (phone/email) so that submission errors are caught early.
   - Acceptance: Wizard validates required formats and prevents submission until valid.
   - Business value: Reduces bounce/processing errors.

10) As a Case Worker, I want to trigger flow actions (ADD, REFRESHSETTINGS) from the UI so I can perform the same operations as in Pega.
    - Acceptance: UI prompts for parameters when needed; backend executes action and returns updated state or settings.
    - Business value: Preserves existing operational capabilities.

## Prioritization (MVP Focus)
- P0: Create Onboarding (Story 1), List (2), Detail (3), Validation (9), Auth (6)
- P1: Workflow approvals (4), Search/Geo (5), Flow actions (10)
- P2: Reports, Notifications, Advanced reports export

## Next Steps
- Convert top P0 stories into sprint tickets with acceptance tests and UI wireframes.
- Run stakeholder walkthrough to confirm priority and UX.
