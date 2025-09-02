# 🛒 State Design Pattern

The **State Design Pattern** allows an object to **change its behavior dynamically** based on its internal state.  
In this example, an **Order** goes through its lifecycle — **Created → Paid → Shipped → Delivered** — by calling a single method: `next()`.

---

## ✨ **Why Use This Approach?**

| Feature | Benefit |
|----------|---------|
| **Cleaner API 🎯** | Clients just call `next()` to progress, no need to know internal state logic. |
| **Encapsulation 🔒** | Transition rules are hidden inside state classes. |
| **Open/Closed Principle ♻️** | New states can be added without modifying existing states. |
| **Predictable Flow 🔄** | Ensures consistent and traceable transitions. |

---

## 🧩 **How It Works**

- Each state knows **what the next state is**.
- The context (`OrderContext`) delegates the state transition to the current state.
- Client code stays **simple and clean**.
