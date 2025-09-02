# 📜 Template Method Design Pattern

The **Template Method Design Pattern** defines the **skeleton of an algorithm** in a base class, allowing subclasses to provide **specific implementations** for certain steps **without changing the algorithm's structure**.

---

## ✨ **Why Use Template Pattern?**

| Feature | Benefit |
|----------|---------|
| **Code Reuse ♻️** | Common logic stays in the abstract class, avoiding duplication. |
| **Encapsulation 🔒** | The algorithm structure is protected; only customizable steps are exposed. |
| **Open/Closed Principle 📐** | Easy to extend behavior by creating new subclasses without modifying core logic. |
| **Consistency ⚖️** | Ensures all subclasses follow the same process flow. |

---

## 🏆 Key Advantages

Reusability ♻️: Common algorithm logic is centralized.

Consistency ⚖️: All subclasses follow the same process steps.

Maintainability 🛠: Adding a new vehicle type is simple — just create a new subclass.

Encapsulation 🔒: Prevents clients from altering the core workflow.

---

## 📌 When to Use

When you have similar workflows with customizable steps.

For processing pipelines like payment systems, report generation, or data parsing.

When enforcing a consistent structure across multiple implementations.

