# Design

## High-Level Architecture
This repository is a Pega rules export compiled into Java. The design follows the standard Pega rule structure:
- Case types define creation behavior and case metadata.
- Flows orchestrate screen flows and assignments.
- Flow actions define UI and validation behavior for assignments.
- Sections and harnesses compose the UI.
- Data transforms and declarative rules populate defaults and indexes.

## Core Components
### Case Types
- Enrollment, Onboarding, Loan, and OnboaringProcess case types are implemented with standard CreateForm_Default flows.
- ProcessO Onboarding case type provides a Collect Information flow/action.
- Onboaring case type provides Stage1 and Resolution flows.

### Flows and Flow Actions
- CreateForm_Default flows handle creation metadata and harness selection.
- CollectInformation_Flow handles ProcessO onboarding data collection with a Confirm harness.
- Flow actions enforce security (privileges/When conditions) and validate required properties.

### Data Transforms
- pyDefault applies pySetFieldDefaults for OFON2J ProcessO Onboarding.
- pySetFieldDefaults sets defaults for .HomeAddress and applies pyDefault for that page.

### Declarative Rules
- HomeAddress declare index exists for OFON2J ProcessO Onboarding, enabling search/indexing for address data.

## UI Composition
- Harnesses provide top-level pages for Onboarding and Loan, referencing content sections.
- Content sections include list sections:
  - OnboardingContent -> OnboardingList
  - EnrollmentContent -> EnrollmentList
  - LoanContent -> LoanList
- List sections are grid-based and include standard case fields and UI actions.
- CollectInformation section includes inputs for FirstName, LastName, EmailAddress, Phone, Country, and a nested HomeAddress section (pyLocationFieldOptional).
- Work- Create section captures pyLabel and pyDescription.

## Data Flow
1. User starts a case using a CreateForm_Default flow.
2. pyDefault data transform applies pySetFieldDefaults (including HomeAddress defaults).
3. For ProcessO Onboarding, CollectInformation flow action collects required fields and proceeds to Confirm.
4. Cases appear in list grids with key metadata.

## Assumptions and Open Questions
- Assumption: UI sections not fully expanded here (e.g., pyLocationFieldOptional) contain detailed address fields.
- Assumption: Flows are mostly standard scaffolding with no custom routing beyond what is visible.
- Open question: What are the concrete stage steps and assignment logic inside Stage1_Flow and Resolution_Flow?
- Open question: Are there external integrations or services invoked by hidden rules not captured in this export?
