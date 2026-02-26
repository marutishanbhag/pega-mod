# Business Logic

## Overview
This repository appears to be a Pega rules export rendered as generated Java. Most files represent compiled Pega rules (case types, flows, flow actions, sections, and harnesses). The core business behavior centers on creating and processing case types for enrollment, onboarding, and loan workflows, with a dedicated onboarding data capture flow.

## Case Types
- LTM-Enrollment-Work-Enrollment: case type for Enrollment with Create flow and list views.
- LTM-Onboarding-Work-Onboarding: case type for Onboarding with Create flow and list views.
- OOD4NM-Loan-Work-Loan: case type for Loan with Create flow and list views.
- OFON2J-ProcessO-Work-Onboarding: case type for ProcessO Onboarding with Collect Information flow action and data capture.
- OLFHF9-Onboaring-Work-Onboarding: case type for Onboaring (spelling as in rules) with Stage1 and Resolution flows.
- OLFHF9-Onboaring-Work-OnboaringProcess: case type for a separate OnboaringProcess with Create flow.

## Flow Behavior
- CreateForm_Default flows exist for Enrollment, Onboarding, Loan, and OnboaringProcess case types.
  - These flows expose work creation metadata (starting harness, model) when invoked with GetWorkCreateInfo.
  - They are standard screen-flow scaffolds and defer most logic to Pega flow engine.
- OFON2J ProcessO Onboarding includes a CollectInformation_Flow and a CollectInformation flow action.
  - Flow action validates required properties, applies security checks, and directs to a Confirm harness.
  - Flow action is marked as not for bulk processing.
- OLFHF9 Onboaring Onboarding includes Stage1_Flow and Resolution_Flow.
  - Both are standard flow engine scaffolds with no custom step logic shown in these generated sources.

## Data Transforms and Declaratives
- OFON2J ProcessO Onboarding data transforms:
  - pyDefault applies pySetFieldDefaults.
  - pySetFieldDefaults scopes to .HomeAddress and applies pyDefault for that subpage.
- Declarative index:
  - HomeAddress index rule exists for OFON2J ProcessO Onboarding. The generated code does not expose explicit computation, implying default or rule-based behavior in Pega.

## UI-Specific Logic
- Collect Information UI for OFON2J ProcessO Onboarding references properties:
  - FirstName, LastName, EmailAddress, Phone, Country.
  - Uses a nested section for .HomeAddress (pyLocationFieldOptional).
- Case list sections for Enrollment, Onboarding, and Loan show standard case fields:
  - Case ID (pyID), Status (pyStatusWork), Created Date/Time (pxCreateDateTime), Created By (pxCreateOpName), and display/link helpers.
- Work- Create section uses pyLabel and pyDescription to capture basic case details.

## Security and Validation
- Flow actions enforce privilege checks and When conditions for execution.
- Flow actions provide a Confirm harness and keep-working flags after validation.

## Assumptions and Open Questions
- Assumption: The generated Java is from Pega rulesets; custom logic may exist in the Pega rule definitions not fully visible in the compiled output.
- Assumption: The Onboarding, Enrollment, and Loan list grids use standard sorting, filtering, paging, and open-work actions.
- Open question: What are the exact fields and validations in the HomeAddress section (pyLocationFieldOptional)?
- Open question: Are there custom validations or data transforms beyond the default ones seen here?
- Open question: What are the exact stage steps within Stage1_Flow and Resolution_Flow?
