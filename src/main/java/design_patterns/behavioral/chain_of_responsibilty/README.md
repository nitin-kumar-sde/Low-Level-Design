# 🔗 Chain of Responsibility Design Pattern

The **Chain of Responsibility (CoR)** pattern lets a request pass through a **chain of handlers**, where **each handler decides whether 
to process the request or pass it to the next**.

This is perfect for scenarios like **approval chains**, **middleware pipelines**, and **validation flows**.

---

## ✨ **Why Use Chain of Responsibility?**

| Feature | Benefit |
|----------|---------|
| **Decoupling 🔌** | The requester doesn't need to know who handles the request. |
| **Flexible Workflow 🔄** | Handlers can be added, removed, or reordered without impacting the rest of the system. |
| **Single Responsibility 🧩** | Each handler focuses on its level of approval logic. |
| **Open/Closed Principle 📐** | New handlers can be added without modifying existing ones. |

---

## 🏆 Key Advantages

| Feature | Benefit |
|----------|---------|
| **Scalable Workflow 🔄** | Add new approval levels without touching existing code. |
| **Maintainability 🛠** | Each approver has a clear, single responsibility. |
| **Reusability ♻️** | Same chain structure can be reused for other workflows. |
| **Open/Closed Principle 📐** | Extend without modifying existing logic. |

---

## 📌 When to Use
- Multi-level approval workflows (HR, finance, procurement).
- Authentication or validation pipelines.
- Event or request pre-processing in middleware.
- Customer service escalation systems.
