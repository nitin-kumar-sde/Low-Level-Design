# 🎠 Low-Level Design (LLD) complete Roadmap with resources

🪂🪂  Welcome to the all-in-one guide to master Low-Level Design (LLD).


Whether you're preparing for system design interviews, leveling up your object-oriented programming skills , enhancing API or DB schemas designing skills or learning failure handling mechanism at low level or unit testing at class level - this repo has you covered.

---

## 📘 Table of Contents

- [🔍 What is LLD?](#-what-is-lld)
- [🔩 What does LLD comprise?](#-what-does-lld-comprise)
- [🧱 OOPs](#-oops)
- [📝 UML Diagrams](#-uml-diagrams)
- [🎲 Design Principles](#-design-principles)
- [💫 Design Patterns](#-design-patterns)
- [🛠 Practice Standard Interview Problems](#-practice-standard-interview-problems)
- [🧹 Clean Coding](#-clean-coding)
- [⏳ Modular Application Architecture](#-modular-application-architecture)
- [🧳 API desiging](#-api-designing)
- [🗽DB Schema designing](#-db-schema-designing)
- [🧸 Unit testing](#-unit-testing)
- [🦅 Error handling](#-error-handling)
- [🧵 Multi Threading](#-multi-threading)
- [📖 Recommended Books](#-recommended-books)

---

# 🔍 What is LLD?

Low-Level Design (LLD) is a crucial phase in the software development process where the internal components of a system and their interactions are defined in detail, including implementation specifics.

It translates the high-level design into a detailed technical blueprint, covering aspects such as algorithms, data structures, interfaces, performance optimization, unit testing strategies, failure handling mechanisms, and the optimal design of APIs and database schemas.

LLD acts as a developer’s guide during implementation, ensuring the system is built accurately, efficiently, and in alignment with the intended architecture.


[Learn More →](https://www.geeksforgeeks.org/what-is-low-level-design-or-lld-learn-system-design/)


---


# 🔩 What does LLD comprise?

While LLD can capture a wide range of micro-level details, it primarily focuses on the following key areas:

- 🧱 Object-Oriented Programming (OOPs)
- 🧾 UML diagrams
- 📐 Design Principles 
- 🎨 Design Patterns
- ⏳ Modular Application Architecture
- ⚛ API Design 
- 🔑 Database Schemas
- 🛡️ Error handling mechanism
- ⏳ Unit testing
- 🛢 Multithreading and Thread safety

---

# 🧱 OOPs

Before diving into Low-Level Design (LLD), having a strong grasp of **Object-Oriented Programming (OOP)** is essential.

OOP provides the foundation for building modular, reusable, and maintainable software.

## 🔑 Core OOP Concepts

- [📦 Classes & Objects](https://www.geeksforgeeks.org/classes-objects-java/)
- [✍🏻 Constructors](https://www.geeksforgeeks.org/constructors-in-java/)
- [💊 Encapsulation](https://www.geeksforgeeks.org/encapsulation-in-java/)
- [🎭 Abstraction](https://www.geeksforgeeks.org/abstraction-in-java-2/)
- [🧬 Inheritance](https://www.geeksforgeeks.org/inheritance-in-java/)
- [🪄 Polymorphism](https://www.geeksforgeeks.org/polymorphism-in-java/)
  - [⚙️ Compile-time Polymorphism (Method Overloading)](https://www.geeksforgeeks.org/method-overloading-in-java/)
  - [⚒️ Runtime Polymorphism (Method Overriding)](https://www.geeksforgeeks.org/overriding-in-java/)
  - [➕ Operator Overloading](https://www.geeksforgeeks.org/operator-overloading-cpp/) **(C++ only)**


## ❓ Frequently Asked Interview Questions
- [🆚 Abstract Class vs Interface](https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/)
- [🔁 Static vs Dynamic Binding](https://www.geeksforgeeks.org/java/static-vs-dynamic-binding-in-java/)
- [📤 Overloading vs Overriding](https://www.geeksforgeeks.org/java/difference-between-method-overloading-and-method-overriding-in-java/)
- [📦 Constructor Chaining](https://www.geeksforgeeks.org/constructor-chaining-java-examples/)

## 📘 Resources
- [🗞️ Java OOPs Tutorial – GeeksforGeeks](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
- [🛫 OOP Concepts with Real Examples – Educative](https://www.educative.io/blog/object-oriented-programming)
- [🎥 Video Crash Course – YouTube](https://www.youtube.com/watch?v=0flBHkyET_E)
- [🧳 OOP Explained with Java (FreeCodeCamp)](https://www.freecodecamp.org/news/learn-java-object-oriented-programming/)
- [✉️ C++ OOP Fundamentals – GeeksforGeeks](https://www.geeksforgeeks.org/object-oriented-programming-in-cpp/)


---

# 📝 UML Diagrams

**Unified Modeling Language (UML)** is a standardized visual language used to model the architecture, design, and behavior of software systems. It helps developers, architects, and stakeholders communicate system structure and design decisions effectively.

## 🧭 Types of UML Diagrams

- **📐 Structural Diagrams** – Describe the *static* aspects of the system such as classes, objects, and their relationships.
- **⚙️ Behavioral Diagrams** – Represent the *dynamic* behavior of the system including use cases, sequences, and workflows.


## 🏎️ Most Commonly used UML Diagrams

- [📦 Class Diagrams](https://www.geeksforgeeks.org/unified-modeling-language-uml-class-diagrams/)
- [🧸 Object Diagrams](https://www.geeksforgeeks.org/unified-modeling-language-uml-object-diagrams/)
- [⏱️ Sequence Diagrams](https://www.geeksforgeeks.org/unified-modeling-language-uml-sequence-diagrams/)
- [📊 Activity Diagrams](https://www.geeksforgeeks.org/unified-modeling-language-uml-activity-diagrams/)
- [🔁 State Machine Diagrams](https://www.geeksforgeeks.org/unified-modeling-language-uml-state-diagrams/)
- [🧱 Component Diagrams](https://www.geeksforgeeks.org/component-based-diagram/)
- [🎭 Use Case Diagrams](https://www.geeksforgeeks.org/use-case-diagram/)


## ❓ Frequently Asked Interview Questions
- [🧩 Aggregation vs Composition](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-aggregation-vs-composition/)
- [🔗 "Is A" vs "Has A" Relationship](https://www.geeksforgeeks.org/what-is-has-a-relation-in-java/)

## 🛠️ Tools for Designing UML Diagrams
- [✏️ Draw.io](https://draw.io) 
- [📝 Lucidchart](https://www.lucidchart.com/) 
- [♻️ PlantUML](https://plantuml.com/) 

---

# 🎲 Design Principles

Design principles are foundational guidelines that help developers build clean, maintainable, and scalable systems. These principles reduce code smells, improve team collaboration, and enhance long-term project sustainability.


## 🧱 SOLID

**SOLID** is an acronym for five essential object-oriented design principles introduced by *Robert C. Martin (Uncle Bob)*. They promote clean architecture, ease of extension, and maintainability.

🏂 **S – Single Responsibility Principle (SRP)**  

A class should have only one reason to change.

🧘 **O – Open/Closed Principle (OCP)**  
Software entities should be open for extension but closed for modification.

🎖 **L – Liskov Substitution Principle (LSP)**  
Subtypes must be substitutable for their base types without altering program correctness.

🎸 **I – Interface Segregation Principle (ISP)**  
Clients should not be forced to depend on interfaces they do not use.

🎧 **D – Dependency Inversion Principle (DIP)**  
High-level modules should not depend on low-level modules. Both should depend on abstractions.

🧠 *Note:* These principles are the backbone of designing robust, testable, and extensible object-oriented systems.


## ♻️ DRY

**DRY** is an acronym which stands for **Don't Repeat Yourself**.

Avoid duplicating logic or knowledge in your codebase.

💡 **Why it matters:**  
Duplication leads to inconsistency, bugs, and higher maintenance effort.

🛠 **How to follow DRY:**
- Extract reusable logic into utility methods or helper classes.
- Use abstract classes with generics to extract common logic in multiple similar use cases.
- Rely on proven libraries to avoid reinventing the wheel.


## 🧊 KISS – Keep It Simple, Stupid

**KISS** is an acronym which stands for **Keep It Simple, Stupid.**

Prefer simplicity in design and implementation. Avoid unnecessary complexity.

💡 **Why it matters:**  
Simple code is easier to read, debug, test, and extend.

> “Simplicity is the soul of efficiency.” — *Austin Freeman*

🛠 **Tips to follow KISS:**
- Choose the simplest possible solution that works.
- Avoid premature abstraction or over-engineering.
- Write for clarity first, optimization later.


## 🚫 YAGNI 

**YAGNI** is an acronym which stands for **You Aren’t Gonna Need It**. 

Don’t implement something unless it is absolutely required.

💡 **Why it matters:**  
Speculative features increase code complexity and often never get used.

🛠 **How to avoid YAGNI:**
- Stick to current requirements; iterate based on real feedback.
- Delay abstractions until patterns genuinely emerge.
- Don’t anticipate future features unless they’re well-defined.


## 📘 Resources

- [SOLID Principles](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design)
- [DRY Principle](https://www.baeldung.com/cs/dry-software-design-principle)
- [KiSS Principle](https://www.baeldung.com/cs/kiss-software-design-principle)
- [YAGNI Principle](https://www.geeksforgeeks.org/software-engineering/what-is-yagni-principle-you-arent-gonna-need-it/)

  
---

# 💫 Design Patterns

**Design Patterns** are proven, reusable solutions to common problems in software design. Rather than reinventing the wheel, developers can apply these patterns to improve code quality, scalability, and maintainability.

They encapsulate best practices gained over time, helping teams write cleaner, more modular, and flexible code—especially in large systems.

Design patterns are broadly categorized into **three types**, based on their purpose:

## 🏗️ Creational Patterns  

**Concerned with **object creation**, they abstract the instantiation process and promote loose coupling.**

- 🔁 [Singleton](./src/main/java/design_patterns/creational/singleton) -  Ensure a class has only one instance.
- 🏭 [Factory Method](./src/main/java/design_patterns/creational/factory/) - Create objects without exposing the instantiation logic.
- 🧰 [Abstract Factory](./src/main/java/design_patterns/creational/abstract_factory/) - Factory of factories — create families of related objects.
- 🧱 [Builder](./src/main/java/design_patterns/creational/builder/) - Step-by-step object construction.
- 🧬 [Prototype](./src/main/java/design_patterns/creational/prototype/) - Clone existing objects without depending on their classes.

## 🧱 Structural Patterns  

These patterns deal with the **composition of classes and objects**, forming larger structures while keeping them flexible and efficient.

- 🔌 [Adapter](./src/main/java/design_patterns/structural/adapter) - Convert one interface into another.
- 🌉 [Bridge](./src/main/java/design_patterns/structural/bridge) - Separate abstraction from implementation.
- 🌲 [Composite](./src/main/java/design_patterns/structural/composite) - Treat individual and composite objects uniformly.
- 🎨 [Decorator](./src/main/java/design_patterns/structural/decorator) - Add new behaviors dynamically at runtime.
- 🔎 [Criteria](./src/main/java/design_patterns/structural/criteria) - Allow applying dynamic filtering logic.
- 🧊 [Facade](./src/main/java/design_patterns/structural/facade) - Provide a simplified interface to a complex subsystem.
- 🎯 [Flyweight](./src/main/java/design_patterns/structural/flyweight) - Provides memory optimization by reusing existing objects.
- 🛡️ [Proxy](./src/main/java/design_patterns/structural/proxy) - Control access or add functionality to another object.


## 🚢 Behavioral Patterns  

These patterns focus on **communication between objects**, how they interact, and delegate responsibilities.

- 👁️ [Observer](./src/main/java/design_patterns/behavioral/observer) - Notify dependent objects automatically on state change.
- 🧠 [Strategy](./src/main/java/design_patterns/behavioral/strategy) - Select algorithms or behaviors at runtime.
- 🔁 [Iterator](./src/main/java/design_patterns/behavioral/iterator) - Provide a way to access elements sequentially.
- 🎮 [Command](./src/main/java/design_patterns/behavioral/command) - Encapsulate a request as an object for later execution.
- 🔄 [State](./src/main/java/design_patterns/behavioral/state) - Change behavior when internal state changes.
- 🧾 [Chain of Responsibility](./src/main/java/design_patterns/behavioral/chain_of_responsibilty) - Pass request along a chain of handlers until one handles it.
- 👓 [Mediator](./src/main/java/design_patterns/behavioral/mediator) - centralizes complex communication between multiple objects.
- 📸 [Momento](./src/main/java/design_patterns/behavioral/momento) - capture and store an object’s internal state to restore to previous stored states.
- 📜 [Template](./src/main/java/design_patterns/behavioral/template) - defines skeleton of an algorithm in a base class, with changing parts in corresponding child classes.
- 🧳 [Visitor](./src/main/java/design_patterns/behavioral/visitor) - Add new operations to existing object structures without modifying their classes.
- 🪖 [Interpreter](./src/main/java/design_patterns/behavioral/interpreter) - Parse grammar of a language in a object oriented way.


## 🧠 When to Use Each Design Pattern

| 🏷️ Pattern            | 💡 Intent                                                | 📎 When to Use                                                                 | 🔍 Example                              |
|-----------------------|----------------------------------------------------------|--------------------------------------------------------------------------------|------------------------------------------|
| **Singleton**         | Ensure a class has only one instance                     | Global config manager, logger, DB connection pool                              | OS Kernel instance, Logger               |
| **Factory Method**    | Delegate object creation to subclasses                   | When object creation is complex or dependent on conditions                     | GUI elements (e.g., buttons for Win/Mac) |
| **Abstract Factory**  | Produce families of related objects                      | When system needs to be independent of product creation logic                  | UI themes with widget families           |
| **Builder**           | Construct complex objects step-by-step                   | When object construction involves many parameters or configurations           | Building a meal, complex documents       |
| **Prototype**         | Create objects by cloning existing ones                  | When instantiation cost is high or configuration is complex                    | Object cloning, game character skins     |
| **Adapter**           | Convert one interface to another                         | When integrating legacy code or incompatible interfaces                        | Power plug adapter                       |
| **Bridge**            | Decouple abstraction and implementation                  | When you need to vary abstraction and implementation independently             | Remote control → TV, Projector           |
| **Composite**         | Treat groups of objects uniformly                        | When you need to work with tree structures                                     | File system (Folders and Files)          |
| **Decorator**         | Add responsibilities dynamically                         | When you want to add behavior without modifying original code                  | Wrapping a coffee with milk/sugar        |
| **Facade**            | Simplify complex subsystems                              | When you want to provide a simple interface to a complex system                | Hotel reception, API Gateway             |
| **Proxy**             | Control access or enhance another object                 | When adding security, lazy loading, or logging                                 | Virtual proxy for image loading          |
| **Observer**          | Notify multiple objects on change                        | When multiple objects need to react to state changes                           | News subscribers, UI events              |
| **Strategy**          | Encapsulate algorithms and switch at runtime             | When you need to switch between different algorithms or behaviors              | Payment method (Credit, UPI, PayPal)     |
| **Command**           | Encapsulate requests as objects                          | For undo operations, task queues, or logging actions                           | Remote control, Macro recorder           |
| **State**             | Change behavior based on internal state                  | When object behavior changes with state                                        | Vending machine, Media Player            |
| **Iterator**          | Access elements sequentially without exposing structure  | When you need to traverse a collection                                         | Java Iterator, Cursor in DB              |
| **Chain of Responsibility** | Pass request along a chain of handlers           | When multiple handlers can process a request                                   | Customer support escalation              |


## 📘 Resources

- [Coursera – Design Patterns (by UC San Diego)](https://www.coursera.org/learn/design-patterns)
- [GOF Book - Attached as PDF in Repository](https://www.oreilly.com/library/view/design-patterns-elements/0201633612/)
- [Design Patterns - GFG](https://www.geeksforgeeks.org/system-design/java-design-patterns/)

---

# 🛠 Practice Standard Interview Problems

| 🧩 Problem | 📚 Core Concepts Involved |
|-----------|---------------------------|
| [Snake and Ladder](./src/main/java/practise/snake_ladder) |  SOLID |
| [Tic Tac Toe](./src/main/java/practise/tic_tac_toe) | SOLID |
| [Chess Game](././src/main/java/practise/chess) | SOLID |
| [Notify Me Feature](./src/main/java/practise/notify_me) | Observer Pattern |
| [File System](./src/main/java/practise/file_system) |Composite Pattern |
| [Logging System](./src/main/java/practise/logging_framework) | Chain of Responsibility, Factory, Observer, Singleton |
| [Parking Lot](./src/main/java/practise/parking_lot) | OOP, Strategy |
| [True Caller](https://www.lldcoding.com/design-lld-truecaller-machine-coding) | SOLID |
| [Traffic Light System](https://leetcode.com/discuss/post/291233/design-a-traffic-light-controller-by-thi-7fyd/) | Concurrency |
| [Inventory Management System](./src/main/java/practise/inventory_management) | SOLID, Strategy
| [Stock Trading System](https://www.geeksforgeeks.org/dbms/how-to-design-a-database-for-stock-trading-app-like-groww/) | SOLID, Concurrency
| [CricBuzz](https://programmingappliedai.substack.com/p/design-patterns-to-be-used-in-cricbuzz) | Observer |
| [Meeting Scheduler](https://akhileshmj.medium.com/lld-6-meeting-scheduler-0eb8b23d9b04) | Locking |
| [Movie Booking System](./src/main/java/practise/movie_booking_system) | Concurrency |
| [Online Voting System](https://dev.to/zeeshanali0704/polling-2hc8) | Observer,  Strategy|
| [Car Rental System](./src/main/java/practise/car_rental) | Strategy, Filter |
| [ATM Machine](./src/main/java/practise/atm) | Chain of Responsibility, State |
| [Vending Machine](./src/main/java/practise/vending_machine) | State, Strategy |
| [Cab Booking](./src/main/java/practise/car_booking) | Strategy, Observer |
| [Payment Gateway](https://blog.devgenius.io/low-level-design-payment-gateway-system-aead85996fd9) | Transaction , Strategy |
| [Notification Service](https://www.youtube.com/watch?v=t-4r2AsJz_Q&ab_channel=CoderArmy) | Decorator, Strategy |
| [Chat System](https://medium.com/@anurodh.kumar.civ21/low-level-design-of-a-chat-application-a-deep-dive-0af9c6957362) | SOLID |
| [Food Delivery System](./src/main/java/practise/food_delivery) | Strategy, SOLID |
| [Kafka Stream](./src/main/java/practise/kafka_streams) | Concurrency|
| [Rate Limiter](./src/main/java/practise/rate_limiter) | Strategy, Concurrency |
| [Cache Library](./src/main/java/practise/cache) | Strategy, Concurrency|
| [Design a URL Shortener](./src/main/java/practise/url_shortener) | Concurrency, Strategy |
| [Community Discussion Forum](./src/main/java/practise/community_discussion_platform) | SOLID |
| [Elevator System](./src/main/java/practise/elevator) | Strategy, Scheduling Algorithms |
| [Splitwise](./src/main/java/practise/splitwise) | Strategy, DSA |

---

# 🧹 Clean Coding 

Writing **clean code** is about crafting software that is easy to read, maintain, and extend. It focuses on **clarity, simplicity, consistency, and intent**, rather than cleverness. Clean code reduces bugs, improves collaboration, and makes debugging faster.

> _"Clean code always looks like it was written by someone who cares."_  
> – Robert C. Martin (Uncle Bob)

## 🧭 Principles of Clean Code

- 📛 **Meaningful Names**: Use descriptive variable, method, and class names.
- 📏 **Small Functions**: Functions should do one thing and do it well.
- 🧹 **Clean Formatting**: Maintain consistent indentation, spacing, and structure.
- 🧪 **Avoid Duplication**: Follow the **DRY (Don’t Repeat Yourself)** principle.
- 🧠 **Code for Humans**: Your code should be self-explanatory, even without comments.
- 🔀 **Single Responsibility**: Each class/function should have only one reason to change.
- 🔥 **Error Handling**: Use exceptions, not return codes. Handle errors close to their source.
- 🪓 **Remove Dead Code**: Eliminate unused code paths, variables, and methods.
- 💬 **Minimal Comments**: Code should explain itself — comments are for complex logic or decisions only.

> 🔁 Writing clean code is not a one-time task — it’s a mindset and a habit built over time.


## 📚 Resources

- [Clean Code Video Playlist](https://www.youtube.com/watch?v=7EmboKQH8lM)
- [Clean Code Tutorial](https://www.freecodecamp.org/news/how-to-write-clean-code/)
- [Clean code Book](https://www.amazon.com/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350882) - PDF added in repository

---

# ⏳ Modular Application Architecture

Layered architecture separates responsibilities into distinct layers, making code modular, testable, and easier to maintain.

## 💡 Layer Responsibilities

- **𝄜 Controller Layer**: Handles user input and routes requests to the domain layer.
- **📋 Domain Layer**: Contains core business logic and models.
- **🔧 DAO Layer**: Responsible for interacting with the database.
- **📎 Accessor Layer**: Handles communication with external services/APIs.

## 📁 Sample Folder Structure

```
/src
  └── /main
      └── /java
          └── /com/example/app
              ├── controller      # Handles incoming requests (e.g., UserController.java)
              ├── domain          # Business logic and models (e.g., UserService.java, User.java)
              ├── dao             # Data Access layer (e.g., UserRepository.java)
              └── accessor        # External API/service clients (e.g., EmailClient.java)
```


---

# 🧳 API designing

Designing high-quality APIs is fundamental to building scalable, maintainable, and user-friendly backend systems. A well-designed API acts as a **contract** between systems—enabling integration, clear communication, and long-term stability.

## 🚏 Best practices for designing RESTful APIs

### 🏆 Self explainatory Name
- API endpoints should clearly reflect their intent through naming.
- Avoid side effects or unexpected behavior not implied by the name.
- Use nouns for resource names and HTTP methods to convey action:

Example:
```
GET /users/{id} → fetch user info

POST /orders → place a new order
```

### 🎸 Follow Single Responsibility Principle
- Each API should perform one well-defined task.
- If an endpoint handles multiple flows or behaviors, break it down into separate endpoints for clarity and testability.


### 🎖 Clear Structure: Paths, Requests & Responses
- Keep API paths hierarchical, resource-based, and REST-compliant
- Use consistent and clear attribute naming conventions in JSON bodies
- Document the request/response schemas (use OpenAPI/Swagger for standardization).

```
✅ GET /users/{userId}/orders
❌ GET /getAllOrdersByUserId
```

### 🎭 Meaningful Errors with Status Codes
- Include meaningful error messages and appropriate HTTP status codes in the response body.
`200 OK`, `201 Created`, `400 Bad Request`, `401 Unauthorized`, `404 Not Found`, `500 Internal Server Error`

```
{
  "error": "UserNotFound",
  "message": "No user found with ID 1234"
}
```

### 🔢 Use Versioning
- Always version your APIs to support backward-incompatible changes.
- Use URI versioning like
  
```
/api/v1/users
```
 
### 🔐 Implement Authentication & Authorization

- Use industry standards like OAuth2, JWT, or API keys to secure your APIs.
- Enforce **Role-Based Access Control (RBAC)** to restrict sensitive operations.


### ⏳ Rate Limiting

- Protect APIs from abuse and server overload using rate-limiting.
- Return status code 429 Too Many Requests when limit is exceeded


### 🧮 Pagination for Large Data Sets

- Use offset-based or cursor-based pagination when response is too large

`GET /orders?page=2&limit=50`

### ♻️ Idempotency for Safe Repeats
- Ensure repeatable requests (especially PUT, DELETE, and retryable POSTs) don’t create unintended side effects.
- Use idempotency keys to prevent duplicate processing.

```
POST /payments  
Idempotency-Key: abc123
```

## ✍️ Interview practise Problems on API design

| 🧩 Problem | 📚 Core Concepts Involved |
|-----------|---------------------------|
| [Design File upload API](https://tyk.io/blog/api-design-guidance-file-upload/) | REST API |
| [Design Payment API](https://sumeetmore.medium.com/design-a-payment-api-8100bf5dbba7) | Transactions, Idempotency |
| [Poll API design](https://dev.to/zeeshanali0704/polling-2hc8) | REST API, Idempotency |
| [Notification API](https://www.twilio.com/docs/sendgrid/api-reference) | REST API, Idempotency |

## 📘 Resources
- [API design best practises](https://www.youtube.com/watch?v=_YlYuNMTCc8)
- [Restful APIs best practises](https://www.youtube.com/watch?v=etKM5-gGwto)
- [Video Tutorial on REST APIs](https://www.youtube.com/watch?v=7nm1pYuKAhY)
- [Idempotency](https://medium.com/@reetesh043/rest-api-design-what-is-idempotency-18218e1ff73c)

---

# 🗽 DB schema designing

DB Schema Design focuses on **how** data models are structured, indexed for optimal querying.

This involves **schemas**, **relationships**, and mechanisms to ensure **data integrity, consistency, and traceability**.

## ♻️ ER Diagrams (Entity-Relationship)

- Visual representation of **entities** (tables), their **attributes**, and **relationships**.
- Helps translate business rules into database structure.

[Learn More →](https://www.geeksforgeeks.org/dbms/introduction-of-er-model/)

## 🗂️ Table Designing

Designing tables with normalization and performance in mind:

- Appropriately choose Primary, Secondary and Foreign Keys
- Enfore proper constraints to ensure data integrity
- Add required indices as per access patterns
- Do table normalisation to avoid Data redundancy

## 🎮 Handling Concurrent Updates

When multiple threads update the **same row**, it can lead to **race conditions** — causing **data loss, corruption, or stale writes**. To avoid this, we apply concurrency control strategies.

###  Pessimistic Locking
- Locks the row during read 
- Other transactions must **wait** or **fail**.
- Best when **conflicts are frequent**.

### Optimistic Locking
- Before update, check `version` attribute.
- If value changed → reject or retry the operation.

✅ High throughput, no blocking  
❌ May need retries on conflict


[Learn More →](https://www.freecodecamp.org/news/how-databases-guarantee-isolation/)

## 🕵️ Traceability & Auditing

Audit trails ensure that **every change to data is tracked** — who did what, when, and why. This enables **debugging**, **security compliance**, and **historical traceability**.


### 📌 Common Audit Fields

- Add following attributes to every critical table
   - `created_at`, `created_by`
   - `updated_at`, `updated_by`
- Have a metadata table to store other relevant information.
  
---

# 🧪 Unit Testing

**Unit testing** is the process of testing individual units of code—such as functions, methods, or classes—in isolation from the rest of the system. It is a **core practice in modern software development** that ensures your business logic works correctly before integration with other parts.

🔍 A unit test verifies a single "unit of work" and should **not depend** on external systems like databases, file systems, or network APIs.

Well-written unit tests serve as a **safety net during refactoring**, enable faster development, and improve long-term maintainability and confidence in the system.

> “Tests are not optional. A project without tests is broken by design.”  
> – *Robert C. Martin*

## 🕰 Best Practices

- ✅ **Test One Thing**  
  Each test should validate a single, specific behavior — this makes tests easier to read and debug.

- 🧱 **Mock External Dependencies**  
  Use mocking libraries to isolate the unit under test. Never test actual database or network calls in unit tests.

- 📐 **Follow TDD (Test-Driven Development)**  
  Consider writing tests before the implementation to clarify requirements and drive better design.

- 🎯 **Target Business-Critical Logic**  
  Focus on areas where logic complexity is high or errors are costly.

- 🧼 **Clean Test Code Is Crucial**  
  Keep your test code as readable and maintainable as your production code — avoid copy-paste, duplication, and vague test names.

- 🧩 **Use Descriptive Test Names**  
  Example: `shouldThrowException_whenUsernameIsBlank()` or `returnsDiscountedPrice_whenLoyalCustomer()`

- 🧪 **Avoid Over-Mocking**  
  Don’t mock everything — mock only what's required to keep the test isolated.

- 📊 **Use Coverage Wisely**  
  Strive for **high coverage** but not at the cost of readability or test bloat. Focus more on **important logic paths** than on achieving 100%.


## 🧰 Common Libraries and Tools

| Language     | Framework         | Testing Tools                | Mocking Tools            |
|--------------|-------------------|-------------------------------|---------------------------|
| **Java**     | Spring Boot        | JUnit 5, TestNG               | Mockito, EasyMock         |
| **Node.js**  | Express            | Jest, Mocha, Supertest        | Sinon.js, Nock            |
| **Python**   | FastAPI, Flask     | pytest, unittest              | unittest.mock, MagicMock  |
| **Go**       | stdlib             | `testing` pkg, GoMock         | testify/mock              |
| **.NET**     | ASP.NET Core       | MSTest, xUnit, NUnit          | Moq                       |
| **Ruby**     | Rails              | RSpec                         | rspec-mocks               |


## 📘 Resources

- 📖 [Java Unit Testing – FreeCodeCamp](https://www.freecodecamp.org/news/java-unit-testing/)
- 📺 [Unit Testing in Java – YouTube](https://www.youtube.com/watch?v=o5k9NOR9lrI)
- 📘 [Baeldung – Unit Testing Principles](https://www.baeldung.com/java-unit-testing-best-practices)
- 🛠 [Test-Driven Development (Baeldung)](https://www.baeldung.com/java-test-driven-list)
- 📘 [The Art of Unit Testing (Book)](https://www.manning.com/books/the-art-of-unit-testing)

---


# 🦅 Error Handling

Exception handling in APIs plays a **critical role** in delivering a predictable and smooth client experience. When done well, it provides:
- **Meaningful feedback** to clients
- Easier **debugging** for developers
- Greater **resilience and observability** for the system

A well-handled exception should:
- Return **clear and consistent error messages**
- Use **standard HTTP status codes**
- Separate **business logic** from **error management**
- Enable **client retries** in transient scenarios (e.g., 5xx errors) using exponential backoff


## 🏄‍♂️ Best Practices

### ✅ **Use Custom Exception Classes**  
  Create domain-specific exceptions for granular control and clearer intent.

### 🧭 **Map Exceptions to Appropriate HTTP Status Codes**  
  | Code | Meaning                    | Example                            |
  |------|----------------------------|------------------------------------|
  | 400  | Bad Request                | Input validation failure           |
  | 401  | Unauthorized               | No valid authentication            |
  | 403  | Forbidden                  | Authenticated but unauthorized     |
  | 404  | Not Found                  | Resource does not exist            |
  | 500  | Internal Server Error      | Unhandled server-side exception    |

### 🔍 **Never Swallow Exceptions Silently**  
  Always log the full stack trace and error context — it's essential for debugging and root cause analysis.

### 🔄 **Differentiate Error Types**  
  - **User Errors**: Invalid inputs, unauthorized access  
  - **Business Failures**: Domain rule violations (e.g., insufficient balance)  
  - **System Failures**: Downstream API or DB failures

### 📊 **Emit Structured Logs and Metrics**  
  Include identifiers like `traceId`, `requestId`, and error codes in logs. Integrate with observability tools (e.g., ELK, Prometheus).

### 🧹 **Validate and Sanitize Inputs**  
  Prevent invalid data and avoid cascading downstream issues.


## ❗ Sample Error Response

```json
{
  "error": "UserNotFound",
  "message": "No user found with ID 1234",
  "code": 404,
  "timestamp": "2025-06-17T10:44:00Z",
  "traceId": "xyz-123-abcd"
}
```

## 📘 Resources
- [Tutorail](https://www.baeldung.com/java-exceptions)
- [Video Tutorial](https://www.youtube.com/watch?v=34ttwuxHtAE)
- [Best Practises](https://www.geeksforgeeks.org/best-practices-to-handle-exceptions-in-java/)

---

# 🧵 Multi Threading

Multithreading allows multiple parts of a program to bowlScore concurrently, leveraging modern multi-core processors. It's foundational for writing responsive, high-performance systems.

## 🚀 Why Use Multithreading?

- 🔄 **Asynchronous Processing**: Keep UIs responsive or background jobs non-blocking.
- ⚙️ **Parallelism**: Perform CPU-intensive tasks faster using multiple cores.
- 💡 **Throughput**: Handle high volumes of user requests, tasks, or I/O operations concurrently.

> ⚠️ Multithreading introduces complexity: **race conditions**, **deadlocks**, **livelocks**, and **memory visibility issues**.


## 🧩 Threading Basics

- 📚 [Java Threads Introduction](https://www.geeksforgeeks.org/java-threads/)
- 🧬 [Threads vs Processes](https://www.geeksforgeeks.org/operating-systems/difference-between-process-and-thread/)


## 🛠️ Thread Safety & Synchronization

Ensuring correctness when multiple threads access shared data:

- 🔐 [Synchronization](./src/main/java/concurrency/CounterComparisonExample.java)
- 🔓 [Locks in Java](./src/main/java/concurrency/locks)
- 🧪 [Atomic Variables](./src/main/java/concurrency/CounterComparisonExample.java)
- 🚦 [Semaphores](./src/main/java/concurrency/semaphores)
- 📦 [Concurrent Collections](./src/main/java/concurrency/concurrent_collection)


## ⛓️ Inter-thread Communication

For coordination and signaling between threads

- 👂 [Wait & Notify](./src/main/java/concurrency/wait_notify)
- ⏱️ [CountdownLatch](./src/main/java/concurrency/count_down_latch)


## 🧳 Thread Pools & Executors

Efficient thread lifecycle management using executors

- 🏊 [Thread Pools in Java](./src/main/java/concurrency/ThreadPoolExample.java)
- 🧭 [ExecutorService](./src/main/java/concurrency/ThreadPoolExample.java)
- 🧮 [Callables & Futures](./src/main/java/concurrency/future)
- 🔀 [Fork/Join Framework](./src/main/java/concurrency/join_fork)



## ⚠️ Common Pitfalls

Avoiding the classic mistakes of concurrent programming:

- 🕳️ [Deadlocks & Livelocks](https://www.baeldung.com/java-deadlock-livelock)
- 🔁 [Race Conditions](https://www.baeldung.com/cs/race-conditions)


## 📚 Resources

- 📘 [Comprehensive Java Concurrency Guide – Baeldung](https://www.baeldung.com/java-concurrency)
- 📺 [Multithreading Crash Course – FreeCodeCamp](https://www.youtube.com/watch?v=gvQGKRlgop4&ab_channel=freeCodeCamp.org)

---

# 📖 Recommended Books

- **[Clean Code](./Books/Clean_Code.pdf)** — *Robert C. Martin*
  
- **[Design Patterns: Elements of Reusable Object-Oriented Software (GoF)](./Books/GOF.pdf)** — *Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides*  

- **[Refactoring: Improving the Design of Existing Code](./Books/Refactoring.pdf)** — *Martin Fowler*  

- **[The Pragmatic Programmer](./Books/The_Pragmatic_Programmer.pdf)** — *Andrew Hunt & David Thomas*  


---

🔁 Practice ➡️ Refactor ➡️ Discuss — is the secret to mastering Low-Level Design.

👨‍💻 Keep building. Keep learning. Happy designing!
