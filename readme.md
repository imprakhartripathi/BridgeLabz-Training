<!-- ===================================================== -->
<!--                  HERO / INTRO BANNER                  -->
<!-- ===================================================== -->

<div align="center">

<h1>BridgeLabz Training Repository</h1>

<h3>A Structured, Auditable, and Industry-Aligned Learning Workspace</h3>

<p>
<em>Designed for disciplined practice, transparent evaluation, and professional growth</em>
</p>

<hr width="100%" />

</div>

<!-- ===================================================== -->
<!--                    AUTHOR PROFILE                     -->
<!-- ===================================================== -->

<table width="100%" cellspacing="0" cellpadding="0" style="border-collapse:collapse; border:none;">
  <tr>
    <td width="180" align="center" style="border:none;">
      <img
        src="./assets/me.jpeg"
        alt="Prakhar Tripathi"
        width="150"
        height="150"
        style="border-radius:50%; display:block;"
      />
    </td>
    <td style="border:none;">
      <h2>Prakhar Tripathi</h2>
      <p>
        <strong>Final Year Computer Science Student · Software Engineer</strong><br/>
        BridgeLabz Trainee — Core Java, Problem Solving, Backend & Frontend Foundations<br/>
        <em>(Spring Boot · React · GenAI with Python)</em>
      </p>
    </td>
  </tr>
</table>


---

## Executive Overview

This repository serves as a **centralized training workspace** for my BridgeLabz program.  
It is intentionally structured to reflect **industry practices** such as:

- Clear separation of concerns  
- Branch-driven development  
- Review-ready documentation  
- Traceable learning progression through commits  

The objective is not just skill acquisition, but **demonstrable engineering discipline**.

---

## Branch Strategy & Ownership Model

The repository follows a **role-based branching strategy**, where each branch has a clearly defined responsibility.

### Branch Responsibilities

| Branch | Role | Stability | Link |
|------|-----|----------|------|
| `main` | Documentation & Reference Baseline | Stable | [Redirect ↗️](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/main) |
| `core-java-practice` | Active Development & Learning | Volatile | [Redirect ↗️](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/core-java-practice) |
| `oops` | Active Development & Learning | Volatile | [Redirect ↗️](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/oops) |
| `dsa-practice` | Active Development & Learning | Volatile | [Redirect ↗️](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/dsa-practice) |
| `reviews` | Evaluation & Performance Tracking | Controlled | [Redirect ↗️](https://github.com/imprakhartripathi/BridgeLabz-Training/tree/reviews) |

---

## Branch Breakdown

### `main` — Reference & Governance Layer

**Purpose**  
Acts as the **canonical entry point** for reviewers, mentors, and auditors.

**Contains**
- Repository documentation  
- Structural overview  
- Training context and guidelines  

> This branch remains clean, stable, and presentation-ready at all times.

---

### `core-java-practice` — Execution Layer

**Purpose**  
Dedicated workspace for **hands-on coding and daily practice**.

**Contains**
- Core Java implementations  
- Concept-wise programs  
- Practice problems  
- Incremental commits reflecting real learning progression  

> This branch intentionally evolves fast and mirrors the learning curve.

---

### `oops` — Execution Layer

**Purpose**  
Dedicated workspace for **hands-on coding and daily practice**.

**Contains**
- Java-OOPs implementations  
- Concept-wise programs  
- Practice problems  
- Incremental commits reflecting real learning progression  

> This branch intentionally evolves fast and mirrors the learning curve.

---

### `dsa-practice` — Execution Layer

**Purpose**  
Dedicated workspace for **hands-on coding and daily practice**.

**Contains**
- Java-DSA implementations  
- Concept-wise programs  
- Practice problems  
- Incremental commits reflecting real learning progression  

> This branch intentionally evolves fast and mirrors the learning curve.

---

### `reviews` — Evaluation & Feedback Layer

**Purpose**  
Supports **formal review cycles and performance monitoring**.

**Contains**
- Review notes  
- Trainer feedback  
- Code review checkpoints  
- Assessment artifacts  

> Enables transparent, time-bound evaluation by BridgeLabz trainers.

---

## Repository Architecture & Workflow

This repository follows a **hub-and-spoke model**, where `main` acts as the governance hub, and all learning and evaluation activities are routed through dedicated branches.

---

## Branch Structure (Architectural View)

```mermaid
---
config:
  layout: dagre
  theme: neo
  look: handDrawn
---
flowchart TB
    Main(["main"]) -.- MainCtx["Central Hub & Entry Point"]

    Main --> Core(["core-java-practice"])
    Main --> OOPS(["oops"])
    Main --> DSA(["dsa-practice"])
    Main --> Reviews(["reviews"])

    Core -.- CoreCtx["Daily Coding Problem"]
    OOPS -.- OOPSCtx["Daily Coding Problem"]
    DSA -.- DSACtx["Daily Coding Problem"]
    Reviews -.- ReviewsCtx["Evaluation Branch"]

    MainCtx@{ shape: rounded}
    CoreCtx@{ shape: rounded}
    OOPSCtx@{ shape: rounded}
    DSACtx@{ shape: rounded}
    ReviewsCtx@{ shape: rounded}

    classDef branch fill:#ffffff,stroke:#555555
    classDef context fill:#ffffff, stroke:#999999, stroke-dasharray:4 4
    style Main fill:transparent

```

**Explanation**

* `main` serves as the **central control and reference branch**
* All working branches are created and managed from `main`
* No direct dependency exists between working branches

---

## Learning & Review Workflow (Operational Flow)

```mermaid
---
config:
  theme: mc
  look: handDrawn
---
flowchart LR
    A["Core Java Questions"] --> B(["core-java-practice"])
    G["OOP Concepts + Ques"] --> H(["oops"])
    I["DSA Concepts + Ques"] --> J(["dsa-practice"])
    C["Evaluations"] --> D(["reviews"])
    E["Entry Point"] --> F(["main"])

    A@{ shape: card}
    G@{ shape: card}
    C@{ shape: card}
    E@{ shape: card}
    I@{ shape: card}

```

**Explanation**

* **Daily practice** and instructor-driven tasks are implemented in `core-java-practice` `oops` `dsa-practice`
* **Reviews** include:

  * Evaluation questions
  * Assigned problems
  * Review-specific exercises
* All review-related work is consolidated in the `reviews` branch
* `main` remains untouched by daily or weekly execution work

---


## Engineering Principles Followed

* One concept per commit
* Readability over cleverness
* Explicit intent in naming and structure
* Commit history reflects learning, not polish
* Stability is earned, not assumed

This repository is designed to be **reviewed, not just run**.

---

## Notes for Reviewers & Mentors

* For active code: switch to `core-java-practice` `oops` `dsa-practice`
* For evaluations and feedback: refer to `reviews`
* For repository understanding and context: stay on `main`

`main` will always represent the **cleanest and most stable state** of this workspace.
