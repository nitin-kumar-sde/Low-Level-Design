# 🌀 Iterator Design Pattern

The **Iterator Pattern** provides a **standardized way** to access elements of a collection 
**sequentially** without exposing its underlying structure.

It promotes **clean traversal** of complex data structures and centralizes iteration logic.

---

## 🛠 **Core Idea**

Instead of letting the client manipulate the collection directly, we provide an **iterator object** that:
- Keeps track of iteration state
- Provides methods like `hasNext()` and `next()`
- Decouples **collection structure** from iteration logic

---

## 🏆 **Key Advantages**

| Feature | Benefit |
|----------|---------|
| **Encapsulation 🔒** | Hides the internal structure of the collection. |
| **Clean Traversal 🧼** | Provides a standardized way to loop through items. |
| **Multiple Iterators 🔄** | Supports multiple concurrent iterations over the same collection. |
| **Simplifies Client Code 🧑‍💻** | No need to handle complex traversal logic in the client. |

---

## 📌 **When to Use**
- When your collection is complex or subject to changes, but you want a **consistent way** to iterate through it.
- When you want to **provide multiple ways of traversal** (e.g., forward, reverse, or custom filters).
- When you want to **decouple collection structure** from iteration logic.

