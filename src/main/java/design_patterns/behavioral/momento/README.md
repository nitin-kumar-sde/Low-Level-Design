# 🧠 Memento Design Pattern

The **Memento Design Pattern** is used to **capture and store an object’s internal state** without exposing its internal implementation.  
Later, you can **restore** the object back to that saved state — like an "undo" button for your objects.

---

## 🏆 Key Advantages

| Feature | Benefit |
|----------|---------|
| **State Preservation 💾** | Allows saving and restoring an object's state seamlessly. |
| **Encapsulation 🔒** | Internal details remain hidden; only the originator accesses its state. |
| **Undo/Redo Support ↩️** | Ideal for implementing undo/redo or rollback functionality. |
| **Time Travel 🕰** | Navigate to previous states without breaking the flow of your app. |

---

## 📌 When to Use

- Implementing **undo/redo functionality** in editors, games, or workflows.
- **Checkpointing** in applications, such as saving drafts.
- **Rollback systems** in databases or transactions.
- **Game state saving** for user sessions.

---

## 🛠 Common Use Cases

- **Text editors**: Undo/redo actions.
- **Gaming**: Save and load checkpoints.
- **Configuration management**: Reverting to known good settings.
- **Financial systems**: Rolling back to safe states during errors.
