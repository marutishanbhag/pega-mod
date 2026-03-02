# Core Business Functions Summary – Products to Rebuild

Document Date: February 26, 2026

**Source:** Analysis of 3,344 generated Pega Java files with 60,000+ business methods extracted and categorized.

**Objective:** Identify core product business logic required for rebuilding non-Pega system; filtered to remove framework boilerplate.

---

## 1. Core Business Domains

### 1.1 Case Management (61,189 methods across case types)

**Files:** 17 core case type files + 861 activity methods

**Key Business Functions:**

#### A. Case Lifecycle Management
- **Create Case** (Initialize case, set defaults, assign ID)
  - Properties initialized: pyID, pyLabel, pyDescription, status, creator
  - Execution: Timestamps, ownership, role-based assignment
  - Output: Case ID, initial status (CREATE), audit trail entry

- **Transition Case State** (Move case through workflow stages)
  - Valid transitions: CREATE → INITIALIZATION → ASSIGN → IN_PROGRESS → COMPLETE → CLOSED
  - Enforcement: Prevent invalid transitions, enforce SLA checks
  - Actions: Log transition reason, capture old/new state, notify stakeholders
  - SLA: Calculate deadline based on business rules (15 business days for standard enrollment)

- **Update Case Properties** (Modify case data)
  - Allowed updates based on role and stage
  - Validation: Field-level checks before persistence
  - Audit: Track all changes with before/after snapshots

- **Close/Resolve Case** (Finalize and archive)
  - Preconditions: All required approvals obtained, all tasks completed
  - Post-actions: Generate final report, send notifications, archive data
  - Status: Mark as CLOSED with closure reason and date

#### B. Case Type Specifics (7 case types)

| Case Type | Use Case | Key Workflows | Critical Fields |
|---|---|---|---|
| **Enrollment** (LTM-BFS, LTM-Enrollment) | New enrollment intake | CreateForm → Assign → ProcessingRULE → Complete | firstName, lastName, email, phone, country |
| **Onboarding** (OLFHF9) | Employee/contractor onboarding | CreateForm → Stage1 (collect info) → Stage2 → Resolution | firstName, lastName, email, phone, homeAddress, country |
| **Onboarding** (LTM) | LTM onboarding variant | Similar to OLFHF9 + dept assignment | + departmentAssignment |
| **OnboardingProcess** (OLFHF9) | Extended onboarding tracking | CreateForm → Perform → Review → Resolution | taskCount, tasksCompleted, performanceMetrics |
| **ProcessO** (OFON2J) | Advanced 3-stage validation | CreateForm → PRIM0 (collect) → PRIM1 (validate) → PRIM2 (confirm) → Resolution | validateCheckpoints[], stageRetryCount |
| **Loan** (OOD4NM) | Loan application + underwriting | CreateForm → Intake → Underwriting → Appraisal → Funding → Disbursement | loanAmount, approvedAmount, interestRate, loanTerm |

---

### 1.2 Workflow & Flow Management (206 flow methods + 2,093 flow action methods)

**Business Functions:**

#### A. Flow Orchestration
- **CreateForm_Default** (Universal case entry)
  - Collect initial required data
  - Perform basic validation
  - Initialize case with defaults
  - Route to first active stage
  - Return case ID and next step

- **Stage Flows** (Multi-step workflows)
  - Example: Onboarding has Stage1 (collection) → Stage2 (verification)
  - Each stage: Display form → Collect/verify data → Validate against business rules → Route to next or error
  - Conditional routing based on data collected

- **CollectInformation Flow Action** (Interactive operations)
  - Purpose-driven: `ADD` (add flow action item), `REFRESHSETTINGS` (reload settings)
  - Parameters:
    - `ActionType`: Type of action being added
    - `assignPage`: Assignment context
    - `isSelectedAction`: Selection state
    - `displaySeparatorAbove`: UI hint
  - Return: Success/failure status, updated settings

- **Resolution Flow** (Case closure)
  - Verify closure preconditions
  - Trigger post-completion tasks (notifications, reports)
  - Update final status
  - Create audit trail entry

#### B. Flow Actions (2,093 methods)
**Core Operations:**
- Add/remove/modify action items
- Refresh/reload collected settings
- Validate action prerequisites
- Route to next action or complete

---

### 1.3 Validation & Business Rules (105 validation methods + 921 conditional business rules)

**Business Functions:**

#### A. Data Validation Rules
| Rule | Input | Logic | Output |
|---|---|---|---|
| **Phone Validation** | Phone string | International format: +1-999-999-9999 OR domestic: 999-999-9999 | Boolean (valid/invalid) + error msg |
| **Email Validation** | Email string | RFC 5322 format check | Boolean + error msg |
| **Country Code Validation** | Country code (2-char) | Check against approved list (ISO 3166-1) | Boolean + error msg |
| **Value Range Check** | Numeric value, min, max | Verify value ∈ [min, max] | Boolean + error msg |
| **Required Field Check** | Field value | Ensure non-null and non-empty | Boolean + error msg |
| **Address Validation** | Street, city, state, postal | Check format and validate against known addresses | Boolean + coordinates (lat/lon) |
| **Duplicate Check** | Email/phone/identifier | Query existing cases for matches | Boolean + existing case ID if found |

**Key Validators Identified:**
```
Port these validators to backend (JSR-380):
- ra_validate_validphonenumber_*
- ra_validate_pzisvaliduri_*
- ra_validate_casematch_value0to100_* (range check)
- ra_validate_pzisfieldavalidvalue_* (property validation)
- (custom validators for each domain: enrollment, loan, etc.)
```

#### B. Business Condition Guards (When Rules)
**Execution Guards:** Rules fired when specific conditions met
```
Examples:
- pyIsForcedsplitjs — force JavaScript execution
- pzCanmodifyApplication — check user role/permissions
- pyStatusChangedToResolved — trigger resolution logic
- pzIsembedfieldreadonly — determine UI editability
```

**Usage:** 100% apply to deciding:
1. Is operation allowed? (AUTH checks)
2. Should UI show this field? (VISIBILITY)
3. Is field editable? (EDITABILITY)
4. What's the calculated value? (COMPUTATION)

---

### 1.4 Data Transformations (429 datatransform methods + 1,597 model methods)

**Business Functions:**

#### A. Model Data Transforms
**Purpose:** Map clipboard/request data → entity properties → database

**Model Types Identified:**
- `pySetFieldDefaults` — Initialize all case properties with defaults
- `pyDefaultModel` — map incoming DTO to case entity
- `ResolveCase` — Transform case state for closure

**Key Operations:**
1. **Property Mapping** (Request field → Entity property)
   - FirstName (request) → Case.firstName
   - EmailAddress (request) → Case.emailAddress
   - etc.

2. **Complex Type Handling** (HomeAddress object/page)
   ```
   HomeAddress (complex page):
   - Street, City, State, PostalCode, Country
   - + Geo-coordinates (from address service)
   - + Accuracy level
   - + Last validated timestamp
   ```

3. **Computed Fields**
   - `pyLabel`: Auto-generate from firstName + lastName + caseType
   - `pyDescription`: Build from collected properties
   - SLA deadline calculations

4. **Data Profiling** (Quality checks during transform)
   - Verify all required fields present
   - Normalize data (trim, uppercase country codes)
   - Reject on validation errors

#### B. Report Generation Models
**Reports:** Extract and format case data for list/detail display

**Core Report Operations:**
- **List Report** (Case grid display)
  - Columns: pyID, pyStatusWork, pxCreateDateTime, pxCreateOpName, lastUpdated
  - Filtering: By status, date range, assignee
  - Sorting: Any column asc/desc
  - Pagination: 10/25/50/100 rows per page

- **Detail Report** (Full case display)
  - All case properties + audit trail + attachments
  - Formatted for presentation (dates, phone numbers)

- **Summary Report** (Metrics and KPIs)
  - Case count by status
  - SLA compliance rate
  - Average processing time per stage
  - Aging cases (overdue by X days)

---

### 1.5 Integration Points (Location, Search, Notifications)

**Business Functions:**

#### A. Location/Address Integration
**Use Cases:** Onboarding cases collect home address → validate → store geo-coordinates

**Operations:**
1. **Address Standardization** (User enters messy address)
   - Parse street, city, state, postal code
   - Normalize formatting
   - Validate against known address databases

2. **Geo-Coding** (Convert address → coordinates)
   - Call geocoding service (Google Maps, OpenStreetMap, etc.)
   - Return latitude, longitude, accuracy level
   - Store for future geo queries

3. **Proximity Queries** (Find cases near location)
   - "Find all onboarding cases within 10 km of ZIP code 12345"
   - Uses stored coordinates

4. **Indexing** (Declare_Index rule)
   - Index HomeAddress for fast lookups
   - Create spatial index on geo-coordinates

#### B. Search & Indexing
**Index Types:**
- **Full-Text Search** (Search case notes, descriptions)
- **Faceted Search** (Filter by status, country, date range)
- **Geo-Spatial Index** (Proximity searches on coordinates)

**Search Queries:**
```
Examples:
- Find all cases with status = "IN_PROGRESS" AND country = "US"
- Find cases created in last 7 days, sorted by SLA deadline
- Find cases within 5 km of location (lat, lon)
- Full-text search: "urgent" in case notes
```

#### C. Notifications & Post-Completion Actions
**Trigger:** Case transitions (especially COMPLETE → CLOSED)

**Actions:**
- Send email notification to case creator
- Send notification to next assignee
- Generate final report
- Archive case data
- Trigger integrations (third-party systems)

**Message Format:** Email with:
- Case ID, status, summary of actions taken
- Link to case in system

---

## 2. User Interface Flows (1,751 + 34,264 methods for UI rendering)

### 2.1 HTML Harnesses (Main entry points, 1,751 methods)

**Business Functions:**

#### A. Case Manager Portal (`pycasemanager7`)
- List view: All assigned cases with status, priority
- Filter/search controls
- Action buttons: View, Edit, Close, etc.

#### B. Case Create Portal (`pycreate`)
- Multi-step create form (wizard)
- Field-by-field collection
- Client-side validation feedback
- Submit to backend

#### C. Case Worker Portal (`pycaseworkerportal`)
- Inbox of assigned cases
- Inbox count badge
- Status indicators
- Quick actions

#### D. Dashboard (`pydashboard7`)
- Summary metrics: Cases by status, SLA compliance, aging
- Charts/KPIs
- Quick links to key functions

#### E. Admin Studio (`pxadminstudio`)
- Rule creation/editing
- System configuration
- User/role management

### 2.2 HTML Sections (Rendering components, 34,264 methods)

**List View Section:**
- Render case table grid
- Row: [Case ID | Status | Created | Creator | Actions]
- Sorting headers
- Pagination controls
- Filter panel (faceted)
- Search box

**Detail Content Section:**
- Case header: ID, status, priority badge
- Accordion sections: Basic Info, Contact Info, Address, Audit Trail, Attachments
- Edit form (in-place or modal)
- Save/Cancel buttons

**Create Header Section:**
- Step indicator (e.g., 1 of 3)
- Form title
- Required field indicators (*)
- Help text/tooltips

---

## 3. Audit & Compliance (CaseTransition entities)

**Business Functions:**

#### A. Audit Trail Capture
**Available for Every State Change:**
- Who made change (operator/username)
- When (timestamp)
- What changed (field name, old value, new value)
- Why (reason/comment)
- Where (IP address implied)

**Retention:**
- Active cases: Indefinite
- Closed cases: 7 years minimum

#### B. SLA Enforcement
**SLA Calculation:**
- Case created → SLA deadline = created_time + SLA_WINDOW
- Example: Enrollment SLA = 15 business days
- Check on transitions: flag overdue

**Escalation Logic:**
- If overdue by > 5 days → escalate to manager
- Send notification to manager
- Record escalation in audit trail

---

## 4. Security & Authorization

**Business Functions:**

#### A. Role-Based Access Control (RBAC)
**Roles:**
- `Admin` — Full system access
- `Manager` — Approve transitions, view reports, manage team
- `CaseWorker` — Process assigned cases, update properties
- `EndUser/Customer` — Create own cases, view own status

**Role-Based Permissions:**
| Operation | Admin | Manager | CaseWorker | Customer |
|---|---|---|---|---|
| Create case | ✓ | ✓ | ✓ | ✓ |
| Edit own case | ✓ | ✓ | ✓ | ✓ |
| Transition stage | ✓ | ✓ | ✓ | ✗ |
| Approve final | ✓ | ✓ | ✗ | ✗ |
| View all cases | ✓ | ✓ (team) | ✓ (assigned) | ✓ (own) |
| Export report | ✓ | ✓ | ✗ | ✗ |

#### B. Privilege Checks (When Conditions)
Examples observed:
```
- Before UPDATE: checkInstanceAccess(caseID, "UPDATE")
- Before APPROVE: hasRole("Manager") || hasRole("Admin")
- Before DELETE: hasRole("Admin")
- Field visibility: User role → show/hide sensitive fields (e.g., SSN)
```

---

## 5. Performance & Scalability Requirements (Observed)

### 5.1 Target Metrics
- **Case Creation** < 1 second (including validation, audit trail)
- **List Load (100 items)** < 2 seconds
- **Case Detail Retrieval** < 1.5 seconds
- **Report Generation** < 5 seconds (async available)
- **Concurrent Users** 100-1K typical, scale to 10K
- **DB Connections** 20-50 pool size

### 5.2 Optimization Strategies (In Code)
- **Pagination**: List views use 10/25/50/100 row limits
- **Lazy Loading**: Sections/attachments load on-demand
- **Caching**: Frequently accessed data (case list, lookups) cached
- **Indexing**: Optimized for common queries (status, date, creator)
- **Async Processing**: Reports, notifications run async

---

## 6. Business Rules Summary

### 6.1 Workflow Rules (Cannot Skip Stages)
```
For ALL Onboarding cases:
  CREATE → INITIALIZATION
    → ASSIGN (assign to processor)
    → IN_PROGRESS (collect/verify)
    → COMPLETE (all checks pass)
    → CLOSED (archive permanently)

No shortcuts. All stages required.
```

### 6.2 SLA Rules
```
Standard SLA: 15 business days from creation
- Aging: Cases > SLA deadline flagged in red
- Non-compliance: Escalate to manager after 5 days overdue
- Reports: SLA compliance % tracked daily
```

### 6.3 Validation Rules (Summary)
```
ALL required fields must be present and valid:
✓ FirstName (1-100 chars, required)
✓ LastName (1-100 chars, required)
✓ EmailAddress (valid RFC 5322, required)
✓ Phone (international or domestic format, required)
✓ Country (ISO 3166-1 alpha-2, required)
✓ HomeAddress (optional, but if provided, all sub-fields must be valid)

If ANY validation fails:
  → Return error with specific field + error message
  → Allow user to correct and resubmit
  → Do NOT save incomplete case
```

### 6.4 Routing Rules
```
Based on collected data:
- Country = US → Route to US processing team
- Country ≠ US → Route to International team
- LoanAmount > $100K → Escalate to Senior Underwriter
- Email domain in whitelist → Auto-approve; else review
```

---

## 7. Data Model (Business Entities)

### 7.1 Core Entity: Case
```
Base entity inherited by all case types.

Properties:
- pyID (unique case identifier, human-readable)
- pyStatusWork (workflow state: CREATE, INITIALIZE, ASSIGN, IN_PROGRESS, COMPLETE, CLOSED)
- pyLabel (display name, e.g., "John Doe - Onboarding 2026")
- pyDescription (notes/description)
- pxCreateDateTime (when created, immutable)
- pxCreateOpName (who created)
- updatedAt (last change timestamp)
- closedAt (when closed, if closed)
- customProperties (flexible map for domain-specific extensions)
```

### 7.2 Case-Specific Entities

**Enrollment**
- firstName, lastName, emailAddress, phone, country, enrollmentStatus, enrollmentDate, enrollmentNotes

**Onboarding (OLFHF9, LTM)**
- firstName, lastName, emailAddress, phone, country, homeAddress (complex), currentStage, stageStartDate
- LTM variant adds: departmentAssignment

**OnboardingProcess**
- [same + ] taskCount, tasksCompleted, processStatus (IN_PROGRESS, REVIEW, COMPLETED)

**ProcessO**
- [Onboarding fields + ] currentStage (PRIM0, PRIM1, PRIM2), stageRetryCount, validationCheckpoints[]

**Loan**
- applicantFirstName, applicantLastName, applicantEmail, applicantPhone
- currentStage (APPLICATION → INTAKE → UNDERWRITING → APPRAISAL → FUNDING → DISBURSEMENT → CLOSED)
- loanAmount, approvedAmount, loanStatus (APPLIED, APPROVED, REJECTED, FUNDED), interestRate, loanTermMonths, disbursementDate

### 7.3 Complex Types

**HomeAddress (Embedded)**
- street, city, stateProvince, postalCode, country
- latitude, longitude (from geocoding)
- accuracy (ROOFTOP, RANGE_INTERPOLATED, GEOMETRIC_CENTER, APPROXIMATE)
- lastValidated (when address was last verified)

---

## 8. Summary: Core Functions to Rebuild (Priority Order)

### Tier 1 (MVP — Must Have)
1. **Case CRUD** — Create, read, update, delete cases
2. **Case List** — Paginated, filterable case list
3. **Case Detail** — Full case view with edit capability
4. **Create Wizard** — Multi-step case creation form
5. **Validation** — Phone, email, required field checks
6. **Case Status Transitions** — Move case through workflow stages
7. **Auth & RBAC** — Login, role-based permissions

### Tier 2 (Core — Next 2 Sprints)
8. **Audit Trail** — Track all changes with who/what/when
9. **SLA Enforcement** — Calculate deadlines, flag overdue
10. **Search & Filtering** — Query cases by status, date, creator
11. **Reports** — List/detail/summary reports with export
12. **Notifications** — Email on case transitions, escalations
13. **Address/Geo Integration** — Address lookup + geocoding

### Tier 3 (Advanced — Later Sprints)
14. **Workflow Approvals** — Approve/reject transitions
15. **Process O Multi-Stage** — Advanced 3-stage validation
16. **Attachments** — Upload/download case files
17. **Metrics Dashboard** — SLA compliance, case aging, throughput
18. **Admin Portal** — System config, user management

---

## 9. Technology Recommendations (For Rebuilding)

| Component | Recommended | Why |
|---|---|---|
| **Backend** | Spring Boot 3.x | Mature, widely used, JPA support |
| **Persistence** | Postgres + PostGIS | Rel DB + geo-spatial queries |
| **Cache** | Redis | Fast lookups, SLA deadlines |
| **Frontend** | React + TypeScript | Modern, component-based, type-safe |
| **API** | REST + OpenAPI | Standard, well-documented |
| **Auth** | JWT (OAuth2 optional) | Stateless, scalable |
| **Validation** | JSR-380 (server) + HTML5 (client) | Declarative, consistent |
| **Async** | Spring @Async or message queue | Notifications, reports |
| **Search** | Postgres full-text + PostGIS | No external dependency |
| **Audit** | Entity listeners (JPA) | Automatic, consistent |

---

**Document Version:** 1.0
**Last Updated:** February 26, 2026
**Source:** Automated analysis of 3,344 Pega-generated Java files (60,000+ business methods)
**Prepared By:** AL Team

---

## Appendix A: Business Functions by Category (Method Counts)

```
Activity (Case processing logic): 14,379 methods
HTML Section (UI rendering): 34,264 methods
HTML Property (Field-level UI): 1,760 methods
Flow Action (Interactive ops): 2,093 methods
Expression (Computed fields): 762 methods
When Rules (Conditions): 921 methods
Model (Data transforms): 1,597 methods
Definition (Rules & configs): 655 methods
Navigation (Routing): 666 methods
HTML Harness (Portal entry): 1,751 methods
Flow (Workflow orchestration): 206 methods
[Others]: ~8,000 methods (triggers, onchange, validation, etc.)
─────────────────────
TOTAL: 60,000+ business methods
```
