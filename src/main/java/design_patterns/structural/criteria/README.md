# 🔎 Criteria (Filter) Design Pattern

The **Criteria (Filter) Design Pattern** encapsulates filtering logic into reusable, composable **criteria objects** 

and lets you combine them (AND/OR/NOT) to build **dynamic, scalable queries** without cluttering client code.

---

## 💡 Core Idea
- Define a **common filter interface** over a collection of domain objects.
- Implement **atomic criteria** (one responsibility per filter).
- **Compose** criteria (AND / OR / NOT) to express complex queries declaratively.
- Keep **client code decoupled** from filter logic and evolution.

---

## 🧩 Key Components
| Component | Responsibility |
|-----------|----------------|
| **Criteria** | Contract for filtering a collection of domain objects. |
| **Concrete Criteria** | Encapsulates a single filtering rule (e.g., `ByStatus`, `ByPriceRange`). |
| **Composite Criteria** | Combines multiple criteria (AND/OR/NOT) for complex logic. |
| **Client** | Orchestrates criteria without knowing implementation details. |

---

## 🏆 Advantages
| Feature | Benefit |
|--------|---------|
| **Extensible** | Add new filters without changing existing ones. |
| **Composable** | Chain many conditions dynamically at runtime. |
| **Readable** | Business rules read like natural language. |
| **Testable** | Unit test each criterion in isolation. |
| **Reusable** | Apply the same criteria across services and flows. |

---

## 📌 When to Use
- Dynamic search/filtering in **product catalogs**, **HR/CRM lists**, **task boards**.
- **Pre-DB filtering** or **post-DB in-memory refinement**.
- Building **query builders/DSLs** where users specify criteria at runtime.
- Feature flags and **rule engines** that evolve frequently.
