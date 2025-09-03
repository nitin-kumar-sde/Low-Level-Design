# Flyweight Design Pattern — Shapes (Java)

A lightweight, memory-efficient implementation of the **Flyweight Design Pattern** for managing shapes.  
Each unique **(shape, dimension)** combination is created once and reused, while **color and position** are provided at draw time.

---

## Features
- Multiple shape types: `Circle`, `Square`
- Caching at **shape + dimension** level
- Reuse of intrinsic state to minimize memory footprint
- Clean, centralized factory logic

---

## How It Works
- **Intrinsic state (shared):** Shape type and dimension (e.g., radius, side length)
- **Extrinsic state (per call):** Color and coordinates (x, y)
- **Caching logic:** Uses a unique key like `circle_10` to ensure a single instance per combination
- **Flow:**
    1. Request a shape →
    2. Factory checks cache →
    3. Returns existing instance or creates and stores a new one

---

## Benefits
- **Memory Efficient:** Reduces duplicate objects
- **Performance Boost:** Faster repeated object access
- **Scalable:** Easy to add new shapes or properties
- **Thread-Safe Ready:** Immutable intrinsic state

---

## Use Cases
- **Graphics Editors:** Reusing font glyphs or shapes
- **Game Engines:** Sharing sprites for bullets, trees, or NPCs
- **Mapping Systems:** Reusing markers or shapes for pins and routes
- **Document Rendering:** Sharing repeated styling elements

---

## Extensibility
- Add more shapes by updating the factory
- Use a `WeakHashMap` to allow garbage collection of unused flyweights
- Enhance cache keys to include additional parameters like style or theme
- Keep flyweight objects **immutable** for safe multithreading

---

## Project Structure
