# 🎯 Flyweight Design Pattern

The **Flyweight Design Pattern** is a **structural pattern** focused on **memory optimization** by reusing existing objects with shared intrinsic state.  
It avoids creating duplicate objects, reducing the application's memory footprint while maintaining flexibility through extrinsic state.

---

## 💡 **Core Idea**
- Store **shared, immutable data** (intrinsic state) in a central cache.
- Provide **unique external details** (extrinsic state) when using the object.
- Reuse the same instance whenever the intrinsic state matches.

---

## 🧩 **Key Components**
| Component | Responsibility |
|-----------|----------------|
| **Flyweight (Shape)** | Defines the common interface for all shared objects. |
| **Concrete Flyweight (Circle, Square)** | Implements the intrinsic state (e.g., radius, side length). |
| **Flyweight Factory** | Creates and caches unique shape objects based on type and dimension. |
| **Client** | Supplies extrinsic state (color, position) when drawing or using shapes. |

---

## 🏆 **Key Advantages**
| Feature | Benefit |
|----------|---------|
| **Memory Efficiency 🧠** | Eliminates duplicate objects for repeated data. |
| **Performance Boost ⚡** | Reduces object creation overhead. |
| **Scalability 📈** | Handles thousands of objects without ballooning memory usage. |
| **Immutability 🔒** | Ensures thread-safe usage of shared intrinsic data. |

---

## 📌 **When to Use**
- When the system creates **a large number of similar objects**.
- When objects share **common, unchanging data**.
- In **performance-critical** or **memory-sensitive** applications.

