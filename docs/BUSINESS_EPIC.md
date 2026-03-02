# Business Epic — Pega → React + Spring Migration

Document Date: February 26, 2026

Epic Owner: Product + AL Team

## Overview

This initiative involves rewriting Pega-based case management interfaces and Java artifacts into a contemporary tech stack: React frontend, Spring Boot backend, Postgres database, and Redis caching. The effort maintains existing business functionality—case types, workflows, validations, reporting, integrations—while enhancing developer productivity, observability, testing capabilities, and system scalability.

## Business Outcomes

- "Reduced time-to-market for feature changes (target: 50% faster)"
- Enhanced operational visibility through metrics, alerts, and dashboards
- Decreased operational expenses via simplified architecture and containerized deployment
- Improved user experience and mobile compatibility through React
- Better transparency of business logic in version control systems

## Scope (In-scope)

- Primary case types: Enrollment (LTM), Onboarding (variants), ProcessO, Loan
- Workflows: CreateForm_Default, Stage flows, Resolution/CollectInformation
- Flow actions and validation rules (phone, email, ranges)
- Interface elements: lists, details, create wizard, reports
- External systems: JSON API, address validation/geocoding, search/indexing
- Audit logging, role-based access control, SLA management

## Out of Scope (initial)

- Custom Pega Designer Studio capabilities
- Non-essential legacy reporting

## Stakeholders

- Product Manager (Business owner)
- Case Operations / Process Owners
- Engineering (Backend, Frontend, Platform)
- Security & Compliance
- DevOps / SRE

## Success Metrics

- "Feature parity for core workflows (create → resolve) within MVP"
- API uptime SLA 99.9% post-launch
- Test coverage targets: backend ≥80%; comprehensive E2E for critical paths
- Data migration verification: consistency within acceptable tolerances

## High-level Timeline (Milestones)

1. Discovery & Design — 2 weeks
2. MVP backend + one case type (Onboarding) — 3 weeks
3. MVP frontend (list/detail/create) — 3 weeks
4. Workflow engine & search, caching — 2 weeks
5. Data migration dry runs & CI/CD — 2 weeks
6. Canary & Cutover — 1 week

## Major Risks

- Complexity in transferring Pega artifacts to a relational data model
- Semantic differences between implicit Pega constructs and explicit code implementations
- Ensuring search/geo performance parity (PostGIS optimization)
- Achieving stakeholder buy-in on UI/UX equivalence

## Mitigations

- Operate both systems concurrently during canary phase
- Document entity mappings and JSON schemas thoroughly
- Implement automated reconciliation and sampling validation

## Approval

Sign-off from Product and Operations required before canary cutover.
