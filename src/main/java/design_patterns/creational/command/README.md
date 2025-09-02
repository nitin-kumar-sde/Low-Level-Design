# 🖇️ Command Design Pattern in Java

The **Command Pattern** is a **behavioral design pattern** that encapsulates a request as an object.  
This allows the system to **decouple the sender (Invoker)** from the **receiver (Executor)**, 
improving **flexibility, maintainability, and scalability**.

---

## 🧠 **Why Command Pattern?**
In a growing application, requirements often change:
- New actions need to be supported.
- Existing commands may need to be extended.
- Requests may need logging, queuing, or undo/redo capabilities.

The Command Pattern fits perfectly here because it **adheres to key SOLID principles**.

---

## 🏆 **Key Advantages**

| Principle | Benefit |
|-----------|---------|
| **Open/Closed Principle ♻️** | Add new commands **without modifying existing code**. Just create a new class implementing `Command`. |
| **Single Responsibility 🔒** | Each command class handles **only one action**, making it easy to debug, extend, or replace. |
| **Maintainability 🛠** | Clear separation of concerns simplifies testing, logging, and scaling. |

---

## 📌 **When to Use**
- When actions need to be **parameterized or queued**.
- When you need **undo/redo** capabilities.
- When following **clean architecture** for decoupling UI from logic.
- When **extensibility and testing** are critical.
