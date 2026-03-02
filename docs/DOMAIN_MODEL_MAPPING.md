# Domain Model Mapping — Pega to Spring Boot

Document Date: February 26, 2026

**Purpose:** Map Pega case types, properties, and workflows to Spring Boot/JPA domain entities, with ER diagrams and JSON schemas for API contracts.

---

## 1. Entity Hierarchy

### 1.1 Base Entity: `Case`

Core abstract superclass inherited by all case types.

**Pega Source:**
- `Rule_Obj_CaseType_*_pyDefault_Action` classes
- Base class: `Work` (Pega's case class hierarchy)

**Spring Entity:**
```java
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "case_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String pyID;  // Pega case ID (human-readable)

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CaseStatus pyStatusWork;  // CREATE, INITIALIZE, ASSIGN, IN_PROGRESS, COMPLETE, CLOSED

    @Column(nullable = false, updatable = false)
    private LocalDateTime pxCreateDateTime;

    @Column(updatable = false)
    private String pxCreateOpName;

    @Column(nullable = false)
    private String pyLabel;  // Human-readable label

    @Column(columnDefinition = "TEXT")
    private String pyDescription;

    @ElementCollection
    @CollectionTable(name = "case_custom_properties")
    private Map<String, String> customProperties;  // Flexible extension for domain-specific fields

    @OneToMany(mappedBy = "case", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<CaseTransition> transitions;  // Audit trail

    @OneToMany(mappedBy = "case", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Attachment> attachments;

    @Column(nullable = false)
    private LocalDateTime updatedAt;

    @Column
    private LocalDateTime closedAt;
}

// Enum for case status
public enum CaseStatus {
    CREATE,
    INITIALIZATION,
    ASSIGN,
    IN_PROGRESS,
    COMPLETE,
    CLOSED
}
```

**Field Mapping (Pega → Spring):**
| Pega Property | Spring Field | Type | Notes |
|---|---|---|---|
| pyID | pyID | String (unique) | Human-readable case ID |
| pyStatusWork | pyStatusWork | Enum (CaseStatus) | Workflow state |
| pxCreateDateTime | pxCreateDateTime | LocalDateTime | Immutable |
| pxCreateOpName | pxCreateOpName | String | Creator username |
| pyLabel | pyLabel | String | Display name |
| pyDescription | pyDescription | String (TEXT) | Multi-line description |
| (domain-specific) | customProperties | Map<String, String> | Flexible extension |

---

## 2. Case-Specific Entities

### 2.1 Enrollment Case (`LTM_BFS`, `LTM_Enrollment`)

**Pega Source:**
- `Rule_Obj_CaseType_LTM_BFS_Work_Enrollment_pyDefault_Action`
- `Rule_Obj_CaseType_LTM_Enrollment_Work_Enrollment_pyDefault_Action`

**Spring Entity:**
```java
@Entity
@DiscriminatorValue("ENROLLMENT")
public class EnrollmentCase extends Case {
    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 255)
    @Email
    private String emailAddress;

    @Column(nullable = false, length = 20)
    private String phone;  // Validated format

    @Column(length = 2)
    private String country;  // ISO 3166-1 alpha-2

    @Enumerated(EnumType.STRING)
    private EnrollmentStatus enrollmentStatus;  // PENDING, APPROVED, REJECTED

    @Column
    private LocalDateTime enrollmentDate;

    @Column(columnDefinition = "TEXT")
    private String enrollmentNotes;
}

public enum EnrollmentStatus {
    PENDING,
    APPROVED,
    REJECTED
}
```

**Field Mapping:**
| Pega Property | Spring Field | Type | Validation |
|---|---|---|---|
| FirstName | firstName | String (100) | Required, non-empty |
| LastName | lastName | String (100) | Required, non-empty |
| EmailAddress | emailAddress | String (255) | Required, RFC 5322 |
| Phone | phone | String (20) | Required, phone format |
| Country | country | String (2) | ISO country code |

---

### 2.2 Onboarding Cases (3 variants)

#### A. OLFHF9 Onboarding

**Pega Source:**
- `Rule_Obj_CaseType_OLFHF9_Onboaring_Work_Onboarding_pyDefault_Action`

**Spring Entity:**
```java
@Entity
@DiscriminatorValue("ONBOARDING_OLFHF9")
public class OnboardingCaseOLFHF9 extends Case {
    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 255)
    @Email
    private String emailAddress;

    @Column(nullable = false, length = 20)
    private String phone;

    @Column(nullable = false, length = 2)
    private String country;

    @Embedded
    private HomeAddress homeAddress;  // Complex type (optional)

    @Enumerated(EnumType.STRING)
    private OnboardingStage currentStage;  // STAGE1, STAGE2, RESOLUTION

    @Column
    private LocalDateTime stageStartDate;
}

public enum OnboardingStage {
    INITIALIZATION,
    STAGE1_COLLECTION,
    STAGE2_VERIFICATION,
    RESOLUTION
}
```

#### B. LTM Onboarding

**Pega Source:**
- `Rule_Obj_CaseType_LTM_Onboarding_Work_Onboarding_pyDefault_Action`

**Spring Entity:**
```java
@Entity
@DiscriminatorValue("ONBOARDING_LTM")
public class OnboardingCaseLTM extends Case {
    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 255)
    @Email
    private String emailAddress;

    @Column(nullable = false, length = 20)
    private String phone;

    @Column(nullable = false, length = 2)
    private String country;

    @Embedded
    private HomeAddress homeAddress;

    @Column
    private String departmentAssignment;
}
```

#### C. OLFHF9 OnboardingProcess (variant)

**Pega Source:**
- `Rule_Obj_CaseType_OLFHF9_Onboaring_Work_OnboaringProcess_pyDefault_Action`

**Spring Entity:**
```java
@Entity
@DiscriminatorValue("ONBOARDING_PROCESS")
public class OnboardingProcessCase extends Case {
    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 255)
    @Email
    private String emailAddress;

    @Column(nullable = false, length = 20)
    private String phone;

    @Column(nullable = false, length = 2)
    private String country;

    @Embedded
    private HomeAddress homeAddress;

    // Tracking and performance metrics
    @Column
    private Integer taskCount;

    @Column
    private Integer tasksCompleted;

    @Enumerated(EnumType.STRING)
    private ProcessStatus processStatus;  // IN_PROGRESS, REVIEW, COMPLETE
}

public enum ProcessStatus {
    INITIATED,
    IN_PROGRESS,
    REVIEW,
    COMPLETED,
    CANCELLED
}
```

---

### 2.3 ProcessO Onboarding Case

**Pega Source:**
- `Rule_Obj_CaseType_OFON2J_ProcessO_Work_Onboarding_pyDefault_Action`

**Spring Entity:**
```java
@Entity
@DiscriminatorValue("ONBOARDING_PROCESSO")
public class ProcessOOnboardingCase extends Case {
    @Column(nullable = false, length = 100)
    private String firstName;

    @Column(nullable = false, length = 100)
    private String lastName;

    @Column(nullable = false, length = 255)
    @Email
    private String emailAddress;

    @Column(nullable = false, length = 20)
    private String phone;

    @Column(nullable = false, length = 2)
    private String country;

    @Embedded
    private HomeAddress homeAddress;

    // Advanced multi-stage workflow
    @Enumerated(EnumType.STRING)
    private ProcessOStage currentStage;  // PRIM0, PRIM1, PRIM2

    @Column
    private Integer stageRetryCount;

    @OneToMany(mappedBy = "processOCase", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ValidationCheckpoint> validationCheckpoints;
}

public enum ProcessOStage {
    PRIM0_COLLECTION,
    PRIM1_VALIDATION,
    PRIM2_CONFIRMATION,
    RESOLUTION
}

@Entity
public class ValidationCheckpoint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ProcessOOnboardingCase processOCase;

    @Column(nullable = false)
    private String checkpointName;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CheckpointStatus status;  // PENDING, PASSED, FAILED

    @Column
    private LocalDateTime checkpointDate;

    @Column(columnDefinition = "TEXT")
    private String checkpointDetails;
}

public enum CheckpointStatus {
    PENDING,
    PASSED,
    FAILED
}
```

---

### 2.4 Loan Case

**Pega Source:**
- `Rule_Obj_CaseType_OOD4NM_Loan_Work_Loan_pyDefault_Action`

**Spring Entity:**
```java
@Entity
@DiscriminatorValue("LOAN")
public class LoanCase extends Case {
    @Column(nullable = false, length = 100)
    private String applicantFirstName;

    @Column(nullable = false, length = 100)
    private String applicantLastName;

    @Column(nullable = false, length = 255)
    @Email
    private String applicantEmail;

    @Column(nullable = false, length = 20)
    private String applicantPhone;

    @Enumerated(EnumType.STRING)
    private LoanStage currentStage;  // APPLICATION, INTAKE, UNDERWRITING, APPRAISAL, FUNDING, DISBURSEMENT, CLOSED

    @Column
    private BigDecimal loanAmount;

    @Column
    private BigDecimal approvedAmount;

    @Enumerated(EnumType.STRING)
    private LoanStatus loanStatus;  // APPLIED, APPROVED, REJECTED, FUNDED

    @Column
    private Double interestRate;

    @Column
    private Integer loanTermMonths;

    @Column
    private LocalDate disbursementDate;
}

public enum LoanStage {
    APPLICATION,
    INTAKE,
    UNDERWRITING,
    APPRAISAL,
    FUNDING,
    DISBURSEMENT,
    CLOSED
}

public enum LoanStatus {
    APPLIED,
    APPROVED,
    REJECTED,
    FUNDED,
    CLOSED
}
```

---

## 3. Complex Types (Embeddables)

### 3.1 HomeAddress

**Pega Source:**
- `HomeAddress` complex page used by Onboarding cases
- `Rule_Declare_Index_OFON2J_ProcessO_Work_Onboarding_HomeAddress_Action`

**Spring Entity (Embeddable):**
```java
@Embeddable
public class HomeAddress {
    @Column(length = 255)
    private String street;

    @Column(length = 100)
    private String city;

    @Column(length = 100)
    private String stateProvince;

    @Column(length = 10)
    private String postalCode;

    @Column(length = 2)
    private String country;  // ISO code

    // Geo-coordinates (PostGIS or simple doubles)
    @Column(precision = 10, scale = 8)
    private Double latitude;

    @Column(precision = 10, scale = 8)
    private Double longitude;

    @Enumerated(EnumType.STRING)
    private GeoAccuracy accuracy;  // ROOFTOP, RANGE_INTERPOLATED, GEOMETRIC_CENTER, APPROXIMATE

    @Column
    private LocalDateTime lastValidated;

    @Transient  // Avoid persisting
    private Double distanceKm;  // Computed field for geo queries
}

public enum GeoAccuracy {
    ROOFTOP,
    RANGE_INTERPOLATED,
    GEOMETRIC_CENTER,
    APPROXIMATE
}
```

**Database Mapping (Postgres with PostGIS):**
```sql
-- Embedded columns in case table
ALTER TABLE case ADD COLUMN home_address_street VARCHAR(255);
ALTER TABLE case ADD COLUMN home_address_city VARCHAR(100);
ALTER TABLE case ADD COLUMN home_address_state_province VARCHAR(100);
ALTER TABLE case ADD COLUMN home_address_postal_code VARCHAR(10);
ALTER TABLE case ADD COLUMN home_address_country VARCHAR(2);
ALTER TABLE case ADD COLUMN home_address_latitude NUMERIC(10, 8);
ALTER TABLE case ADD COLUMN home_address_longitude NUMERIC(10, 8);
ALTER TABLE case ADD COLUMN home_address_accuracy VARCHAR(50);
ALTER TABLE case ADD COLUMN home_address_last_validated TIMESTAMP;

-- PostGIS geography type (alternative)
ALTER TABLE case ADD COLUMN home_address_geom geography(POINT, 4326);

-- Index for geo queries
CREATE INDEX idx_case_home_address_geom ON case USING GIST(home_address_geom);
```

---

## 4. Supporting Entities

### 4.1 CaseTransition (Audit Trail)

**Pega Source:** Implicit in flows and state machines

**Spring Entity:**
```java
@Entity
public class CaseTransition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Case case;

    @Column(nullable = false)
    private String fromStatus;

    @Column(nullable = false)
    private String toStatus;

    @Column(nullable = false)
    private LocalDateTime transitionTime;

    @Column
    private String performedBy;  // Username

    @Column(columnDefinition = "TEXT")
    private String reason;

    @Column(columnDefinition = "JSONB")
    private String dataSnapshot;  // JSON snapshot of case at transition time

    @Column
    private String flowName;  // Which flow triggered this

    @Column
    private Long slaDueTime;  // Unix timestamp for SLA deadline
}
```

### 4.2 Attachment

**Spring Entity:**
```java
@Entity
public class Attachment {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Case case;

    @Column(nullable = false)
    private String fileName;

    @Column
    private String contentType;

    @Column
    private Long fileSize;

    @Column(columnDefinition = "BYTEA")
    private byte[] fileContent;  // Or reference to S3/blob storage

    @Column(nullable = false, updatable = false)
    private LocalDateTime uploadedAt;

    @Column
    private String uploadedBy;
}
```

---

## 5. Entity Relationship Diagram (ER)

```
┌─────────────────────────────────────────────────────────────────┐
│                         CASE (Abstract)                         │
├─────────────────────────────────────────────────────────────────┤
│ id (UUID, PK)                                                   │
│ pyID (String, unique)                                           │
│ pyStatusWork (Enum: CREATE, INITIALIZE, IN_PROGRESS, CLOSED)    │
│ pxCreateDateTime (LocalDateTime)                                │
│ pxCreateOpName (String)                                         │
│ pyLabel (String)                                                │
│ pyDescription (TEXT)                                            │
│ customProperties (Map<String, String>)                          │
│ updatedAt (LocalDateTime)                                       │
│ closedAt (LocalDateTime)                                        │
└──────────────────────────────┬──────────────────────────────────┘
                               │
                ┌──────────────┼──────────────┬──────────────┬──────────────┐
                ▼              ▼              ▼              ▼              ▼
    ┌─────────────────┐ ┌─────────────────┐ ┌─────────────────┐ ┌─────────────────┐
    │ EnrollmentCase  │ │OnboardingCase*  │ │ProcessOOnboard  │ │   LoanCase      │
    │                 │ │  (3 variants)   │ │   ingCase       │ │                 │
    ├─────────────────┤ ├─────────────────┤ ├─────────────────┤ ├─────────────────┤
    │firstName        │ │firstName        │ │firstName        │ │applicantName*   │
    │lastName         │ │lastName         │ │lastName         │ │loanAmount       │
    │emailAddress     │ │emailAddress     │ │emailAddress     │ │approvedAmount   │
    │phone            │ │phone            │ │phone            │ │interestRate     │
    │country          │ │country          │ │country          │ │loanStage        │
    │enrollmentStatus │ │homeAddress [*]  │ │homeAddress [*]  │ │loanStatus       │
    └─────────────────┘ │currentStage     │ │validationChkpts │ │loanTermMonths   │
                        │stageStartDate   │ │  (1:many)       │ └─────────────────┘
                        └─────────────────┘ └─────────────────┘

┌──────────────────────────┐       ┌────────────────────────┐
│   HomeAddress (Embedded) │       │  CaseTransition        │
├──────────────────────────┤       ├────────────────────────┤
│street                    │       │id (FK)                 │
│city                      │   ◄───│case_id (FK)            │
│stateProvince             │       │fromStatus              │
│postalCode                │       │toStatus                │
│country                   │       │transitionTime          │
│latitude                  │       │performedBy             │
│longitude                 │       │reason                  │
│accuracy (Enum)           │       │dataSnapshot (JSON)     │
│lastValidated             │       │flowName                │
└──────────────────────────┘       └────────────────────────┘

┌──────────────────────┐            ┌─────────────────────┐
│  Attachment          │            │ValidationCheckpoint │
├──────────────────────┤            ├─────────────────────┤
│id (UUID, PK)         │        ◄───│case_id (FK)         │
│case_id (FK)          │            │checkpointName       │
│fileName              │            │status (Enum)        │
│contentType           │            │checkpointDate       │
│fileSize              │            │checkpointDetails    │
│fileContent (BYTEA)   │            └─────────────────────┘
│uploadedAt            │
│uploadedBy            │
└──────────────────────┘
```

---

## 6. JSON Schemas (API Contracts)

### 6.1 Base Case Response Schema

```json
{
  "$schema": "http://json-schema.org/draft-07/schema#",
  "title": "Case",
  "type": "object",
  "properties": {
    "id": {
      "type": "string",
      "format": "uuid",
      "description": "Unique case identifier (UUID)"
    },
    "pyID": {
      "type": "string",
      "description": "Human-readable case ID (e.g., ONBOARDING-2026-001234)"
    },
    "caseType": {
      "type": "string",
      "enum": ["ENROLLMENT", "ONBOARDING_OLFHF9", "ONBOARDING_LTM", "ONBOARDING_PROCESS", "ONBOARDING_PROCESSO", "LOAN"],
      "description": "Discriminator: case type"
    },
    "pyStatusWork": {
      "type": "string",
      "enum": ["CREATE", "INITIALIZATION", "ASSIGN", "IN_PROGRESS", "COMPLETE", "CLOSED"],
      "description": "Current workflow status"
    },
    "pyLabel": {
      "type": "string",
      "description": "Human-readable case label"
    },
    "pyDescription": {
      "type": "string",
      "description": "Detailed case description"
    },
    "pxCreateDateTime": {
      "type": "string",
      "format": "date-time",
      "description": "Case creation timestamp (ISO 8601)"
    },
    "pxCreateOpName": {
      "type": "string",
      "description": "Username of case creator"
    },
    "updatedAt": {
      "type": "string",
      "format": "date-time",
      "description": "Last update timestamp"
    },
    "closedAt": {
      "type": ["string", "null"],
      "format": "date-time",
      "description": "Case closure timestamp (if closed)"
    }
  },
  "required": ["id", "pyID", "caseType", "pyStatusWork", "pyLabel", "pxCreateDateTime"]
}
```

### 6.2 Onboarding Case Schema (OLFHF9)

```json
{
  "$schema": "http://json-schema.org/draft-07/schema#",
  "title": "OnboardingCaseOLFHF9",
  "allOf": [
    { "$ref": "#/definitions/BaseCase" },
    {
      "type": "object",
      "properties": {
        "firstName": { "type": "string", "minLength": 1, "maxLength": 100 },
        "lastName": { "type": "string", "minLength": 1, "maxLength": 100 },
        "emailAddress": { "type": "string", "format": "email", "maxLength": 255 },
        "phone": {
          "type": "string",
          "pattern": "^(\\+\\d{1,3})?[-\\s]?\\d{3,14}$",
          "description": "International or domestic phone format"
        },
        "country": {
          "type": "string",
          "pattern": "^[A-Z]{2}$",
          "description": "ISO 3166-1 alpha-2 country code"
        },
        "currentStage": {
          "type": "string",
          "enum": ["INITIALIZATION", "STAGE1_COLLECTION", "STAGE2_VERIFICATION", "RESOLUTION"]
        },
        "homeAddress": { "$ref": "#/definitions/HomeAddress" },
        "stageStartDate": { "type": ["string", "null"], "format": "date-time" }
      },
      "required": ["firstName", "lastName", "emailAddress", "phone", "country"]
    }
  ]
}
```

### 6.3 Loan Case Schema

```json
{
  "$schema": "http://json-schema.org/draft-07/schema#",
  "title": "LoanCase",
  "allOf": [
    { "$ref": "#/definitions/BaseCase" },
    {
      "type": "object",
      "properties": {
        "applicantFirstName": { "type": "string", "minLength": 1, "maxLength": 100 },
        "applicantLastName": { "type": "string", "minLength": 1, "maxLength": 100 },
        "applicantEmail": { "type": "string", "format": "email" },
        "applicantPhone": { "type": "string" },
        "currentStage": {
          "type": "string",
          "enum": ["APPLICATION", "INTAKE", "UNDERWRITING", "APPRAISAL", "FUNDING", "DISBURSEMENT", "CLOSED"]
        },
        "loanAmount": { "type": "number", "minimum": 0 },
        "approvedAmount": { "type": ["number", "null"], "minimum": 0 },
        "loanStatus": {
          "type": "string",
          "enum": ["APPLIED", "APPROVED", "REJECTED", "FUNDED", "CLOSED"]
        },
        "interestRate": { "type": ["number", "null"], "minimum": 0 },
        "loanTermMonths": { "type": ["integer", "null"], "minimum": 1 },
        "disbursementDate": { "type": ["string", "null"], "format": "date" }
      },
      "required": ["applicantFirstName", "applicantLastName", "applicantEmail", "applicantPhone", "currentStage", "loanAmount", "loanStatus"]
    }
  ]
}
```

---

## 7. Field Indexing Strategy

```sql
-- Case lookup
CREATE INDEX idx_case_pyid ON case(pyid);
CREATE INDEX idx_case_status ON case(py_status_work);
CREATE INDEX idx_case_created ON case(px_create_date_time);

-- Onboarding lookups
CREATE INDEX idx_case_firstname ON case(first_name) WHERE case_type LIKE 'ONBOARDING%';
CREATE INDEX idx_case_email ON case(email_address) WHERE case_type LIKE 'ONBOARDING%';
CREATE INDEX idx_case_phone ON case(phone) WHERE case_type LIKE 'ONBOARDING%';

-- Geo-spatial (PostGIS)
CREATE INDEX idx_case_geom ON case USING GIST(home_address_geom);

-- Full-text search (JSONB custom properties)
CREATE INDEX idx_case_custom_props ON case USING GIN(custom_properties);

-- Transitions (audit)
CREATE INDEX idx_transition_case ON case_transition(case_id);
CREATE INDEX idx_transition_time ON case_transition(transition_time);

-- SLA/aging
CREATE INDEX idx_transition_sla ON case_transition(sla_due_time);
```

---

## 8. Mapping Summary Table

| Category | Pega Rule/Property | Spring Entity | Field | Type | Notes |
|---|---|---|---|---|---|
| Base | pyID | Case | pyID | String | Unique case identifier |
| Base | pyStatusWork | Case | pyStatusWork | Enum | Case workflow state |
| Base | pyLabel | Case | pyLabel | String | Human-readable label |
| Onboarding | FirstName | OnboardingCase* | firstName | String | Required, < 100 chars |
| Onboarding | LastName | OnboardingCase* | lastName | String | Required, < 100 chars |
| Onboarding | EmailAddress | OnboardingCase* | emailAddress | String | Required, valid email |
| Onboarding | Phone | OnboardingCase* | phone | String | Required, validated format |
| Onboarding | Country | OnboardingCase* | country | String | ISO-2 country code |
| Address | HomeAddress.Street | HomeAddress | street | String | Embedded, optional |
| Address | HomeAddress.Latitude/Longitude | HomeAddress | latitude/longitude | Double | PostGIS geography support |
| ProcessO | Stage (PRIM0, PRIM1, PRIM2) | ProcessOOnboardingCase | currentStage | Enum | Advanced multi-stage |
| Loan | LoanAmount | LoanCase | loanAmount | BigDecimal | In currency units |
| Audit | (implicit) | CaseTransition | fromStatus/toStatus | String | State machine audit |
| Audit | (implicit) | CaseTransition | transitionTime | LocalDateTime | When transition occurred |

---

## 9. Next Steps

1. **Validate Entity Mapping:** Review with business stakeholders to confirm all fields are captured.
2. **Design Postgres Schema:** Convert JPA entities to DDL with constraints and indexes.
3. **Implement Redis Caching:** Define cache keys for frequent queries (case list, detail, lookup).
4. **Build Repositories:** Implement Spring Data JPA repository layer with custom queries.
5. **Create REST DTOs:** Define separate API request/response DTOs mapped from entities (DTO pattern).
6. **Implement Validators:** Port Pega validators (phone, email, range) to JSR-380 constraints.

---

**Document Version:** 1.0
**Last Updated:** February 26, 2026
**Prepared By:** AL Team
