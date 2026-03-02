# Core Pega Files Summary

Document Date: February 26, 2026

Source: com/pegarules/generated (compiled Pega rules)

Purpose
-------
Summarizes the core business logic, flows, validation rules and integrations present in the generated Java rules under `com/pegarules/generated` to help guide migration planning and identify high-value targets for re-implementation.

Top-Level Rule Categories (observed)
-----------------------------------
- Case Type rules (`casetype/ra_action_pydefault_*`) — defines case initialization, default properties and lifecycle. (~7 canonical case types: Enrollment, Onboarding variants, ProcessO, Loan)
- Flow rules (`flow/ra_action_*_flow_*`) — create, stage, collect information and resolution flows (CreateForm_Default, Stage flows, CollectInformation, Resolution)
- Flow Actions (`flowaction` / `ra_action_*`) — reusable operations within flows (e.g., CollectInformation action handles `ADD` and `REFRESHSETTINGS`).
- Data Models (`model/ra_model_*`) — data transforms, field defaulting, and model prolog/epilog tracing.
- Validation & Rules (`validate/ra_validate_*`, `ra_action_*` in decision/when) — phone/email/URI/range validators and property-level checks used across flows.
- HTML Harness & Streams (`html_harness/ra_stream_*`, `sh_stream_*`) — UI renderers and stream templates used by Pega UI; they map to list/detail/create UI pieces.
- When conditions & Decision Tables (`when/ra_when_*`, `decisiontable/ra_decision_*`) — conditional guards and business decision tables controlling execution paths and UI behavior.
- Portals/Skins (`portalskin/ra_action_*`) — theming and portal-level behavior.
- Automation / OnChange / Actions (`automation/`, `onchange/`) — UI onchange handlers, automation helpers and parameterized actions invoked during user interaction.

Primary Business Flows (high-level)
----------------------------------
1. CreateForm_Default
   - Entry flow for case creation across case types. Collects initial data, validates, initializes case defaults and routes to first stage.
   - Files: `flow/ra_action_createform_default_*.java`

2. Stage Flows
   - Per-case stage flows that collect detailed information and enforce business validations before advancing.
   - Example: `flow/ra_action_OLFHF9_Onboaring_Work_Onboarding_Stage1_Flow` variants.

3. CollectInformation (Flow Action)
   - Handles interactive actions inside a flow (ADD, REFRESHSETTINGS). Manages parameters like `ActionType`, `assignPage`, UI presentation flags and returns operation values.
   - Files: `flow/ra_action_collectinformation_flow_*.java` and `flowaction` entries.

4. Resolution / Close
   - Finalize and archive cases; trigger post-completion tasks (notifications, report generation, audit). Ensure closure preconditions are met.
   - Files: `flow/ra_action_resolution_flow_*.java`, plus `model/ra_model_*_resolvecase_*.java` variants.

Core Validation Rules (examples)
--------------------------------
- Phone validation: `validate/ra_validate_validphonenumber_*.java` — international and domestic format checks.
- Email/URI validation: `validate/ra_validate_pzisvaliduri_*.java` and related validators.
- Property/field validations and value range checks: various `ra_validate_*` and `ra_action_pzvalidaterundatatransform_*` files.

Key Integrations & Cross-Cutting Concerns
-----------------------------------------
- JSON API serialization/parsing (`org.json.simple`) in harnesses — used for REST-like input and UI params.
- Location/address indexing (`Rule_Declare_Index_*` + model rules) — Geo-coordinates, proximity queries and address validation used by Onboarding/ProcessO cases.
- Reporting/Listing (report definitions) — used by list UI sections and export functionality.
- Auditing & SLA enforcement — transition history and SLA computation embedded in flows and model rules.

High-Value Targets for Migration
--------------------------------
1. `casetype` pyDefault rules — implement base `Case` entity initialization and defaults in backend domain model.
2. `flow/createform_default` and `flow/collectinformation` — implement REST endpoints and workflow service to mimic initial intake and interactive flow actions.
3. Validation rules — port to server-side validators (JSR-380) and client-side equivalents in React.
4. `Rule_Declare_Index` / address indexing — design Postgres/PostGIS schema and indexing strategy for geo queries.
5. HTML harness & stream handlers used by UIs — map to React components (lists, detail, create-wizard) and reuse JSON configurations where applicable.

Recommendations & Next Steps
----------------------------
- Generate an automated extractor to parse `com/pegarules/generated` files and produce a CSV of rule types, names, and short descriptions (helps complete mapping at scale).
- Start by re-implementing one case type (recommend: `OLFHF9 Onboarding`) end-to-end as an MVP to validate approach (API, DB model, UI, validation, geo-indexing).
- Produce OpenAPI skeleton for case operations and a small PoC Spring Boot module and React app connected to it.

Appendix — Sample file name hints
--------------------------------
- `com/pegarules/generated/casetype/ra_action_pydefault_*.java`  — case initialization
- `com/pegarules/generated/flow/ra_action_createform_default_*.java` — create flow
- `com/pegarules/generated/flow/ra_action_collectinformation_flow_*.java` — collect information
- `com/pegarules/generated/validate/ra_validate_validphonenumber_*.java` — phone validator
- `com/pegarules/generated/model/ra_model_*_resolvecase_*.java` — resolve case model logic
