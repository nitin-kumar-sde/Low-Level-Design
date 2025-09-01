# 🚗 **Factory Design Pattern in Java**

The **Factory Design Pattern** is a **creational design pattern** that provides a way to **encapsulate the object creation logic**.  
Instead of creating objects directly in your code with `new`, you **delegate the creation** to a dedicated **Factory class**.

---

## 🎯 **Why Use the Factory Pattern?**

| Feature | Benefit |
|----------|---------|
| 🛡 **Encapsulation** | Hides complex object creation logic from the client. |
| 🗂 **Centralization** | Keeps object creation in a single place for better consistency. |
| 🛠 **Easy Maintenance** | Adding or modifying a class needs changes only in the factory, not everywhere in the codebase. |
| ♻ **Reusability** | One factory can be reused across multiple modules and projects. |
| 🚀 **Extensibility** | Add new product types with minimal code changes. |

---

## 💡 Key Takeaways

✅ Single Responsibility: The factory handles creation; the client focuses on usage.

✅ Decoupled Code: Your app isn't tightly bound to concrete implementations.

✅ Scalable: Add new Vehicle types like Bus or Van by updating just the factory.

---

## 🚀 When to Use

When object creation is complex or repetitive.

When you want loose coupling between your code and object implementations.

When you expect the system to grow with more product types in the future.
