# Requirements

## Functional Requirements
1. Case creation
   - Users can create Enrollment, Onboarding, Loan, and OnboaringProcess cases using CreateForm_Default flows.
   - Case creation uses a standard harness and data model (pyDefault).
2. Collect Information for ProcessO Onboarding
   - Users must enter First Name, Last Name, Email Address, Phone, and Country.
   - Users must provide Home Address details via a location section.
   - A confirm step is shown after validation.
3. Case list views
   - Enrollment, Onboarding, and Loan cases have list grids.
   - Lists display Case ID, Status, Created Date/Time, and Created By.
   - Lists support sorting, filtering, pagination, and open-work actions.
4. Work- Create metadata
   - A generic Create section captures pyLabel and pyDescription for a new work object.

## Data Requirements
- OFON2J-ProcessO-Work-Onboarding
  - FirstName (string)
  - LastName (string)
  - EmailAddress (string)
  - Phone (string)
  - Country (string)
  - HomeAddress (complex page)
- Work- (base work class)
  - pyLabel (string)
  - pyDescription (string)
- Work- case list fields
  - pyID, pyStatusWork, pxCreateDateTime, pxCreateOpName

## Security Requirements
- Flow actions must enforce privilege checks before execution.
- Flow actions must enforce When conditions for execution.

## Non-Functional Requirements
- UI must support standard grid actions: sort, filter, paginate, column toggle, and search.
- UI must support refresh actions for list sections and flow actions.

## Assumptions and Open Questions
- Assumption: Validation rules for required fields are defined in the Pega UI rule metadata not visible in compiled code.
- Assumption: HomeAddress fields are defined in the pyLocationFieldOptional section.
- Open question: Are there additional fields required for Enrollment or Loan beyond the list view columns?
- Open question: Are there SLAs, routing rules, or approval steps not captured in the generated sources?
