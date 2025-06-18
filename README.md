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
- [🧳 API desiging](#-api-designing)
- [🗽DB Schema designing](#-db-schema-designing)
- [🧸 Unit testing](#-unit-testing)
- [🦅 Error handling](#-error-handling)
- [🧵 Multi Threading](#-multi-threading)
- [💡 Interview-Oriented Resources](#-interview-oriented-resources)
- [📖 Recommended Books](#-recommended-books)

---

## 🔍 What is LLD?

Low-Level Design (LLD) is a crucial phase in the software development process where the internal components of a system and their interactions are defined in detail, including implementation specifics.

It translates the high-level design into a detailed technical blueprint, covering aspects such as algorithms, data structures, interfaces, performance optimization, unit testing strategies, failure handling mechanisms, and the optimal design of APIs and database schemas.

LLD acts as a developer’s guide during implementation, ensuring the system is built accurately, efficiently, and in alignment with the intended architecture.


[Learn More →](https://www.geeksforgeeks.org/what-is-low-level-design-or-lld-learn-system-design/)


---


## 🔩 What does LLD comprise?

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

## 🧱 OOPs

Before diving into Low-Level Design (LLD), having a strong grasp of **Object-Oriented Programming (OOP)** is essential.

OOP provides the foundation for building modular, reusable, and maintainable software.

### 🔑 Core OOP Concepts

- [📦 Classes & Objects](https://www.geeksforgeeks.org/classes-objects-java/)
- [✍🏻 Constructors](https://www.geeksforgeeks.org/constructors-in-java/)
- [💊 Encapsulation](https://www.geeksforgeeks.org/encapsulation-in-java/)
- [🎭 Abstraction](https://www.geeksforgeeks.org/abstraction-in-java-2/)
- [🧬 Inheritance](https://www.geeksforgeeks.org/inheritance-in-java/)
- [🪄 Polymorphism](https://www.geeksforgeeks.org/polymorphism-in-java/)
  - [⚙️ Compile-time Polymorphism (Method Overloading)](https://www.geeksforgeeks.org/method-overloading-in-java/)
  - [⚒️ Runtime Polymorphism (Method Overriding)](https://www.geeksforgeeks.org/overriding-in-java/)
  - [➕ Operator Overloading](https://www.geeksforgeeks.org/operator-overloading-cpp/) **(C++ only)**


### ❓ Frequently Asked Interview Questions
- [🆚 Abstract Class vs Interface](https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/)
- [🔁 Static vs Dynamic Binding](https://www.geeksforgeeks.org/java/static-vs-dynamic-binding-in-java/)
- [📤 Overloading vs Overriding](https://www.geeksforgeeks.org/java/difference-between-method-overloading-and-method-overriding-in-java/)
- [📦 Constructor Chaining](https://www.geeksforgeeks.org/constructor-chaining-java-examples/)

### 📘 Resources
- [🗞️ Java OOPs Tutorial – GeeksforGeeks](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
- [🛫 OOP Concepts with Real Examples – Educative](https://www.educative.io/blog/object-oriented-programming)
- [🎥 Video Crash Course – YouTube](https://www.youtube.com/watch?v=0flBHkyET_E)
- [🧳 OOP Explained with Java (FreeCodeCamp)](https://www.freecodecamp.org/news/learn-java-object-oriented-programming/)
- [✉️ C++ OOP Fundamentals – GeeksforGeeks](https://www.geeksforgeeks.org/object-oriented-programming-in-cpp/)


---

## 📝 UML Diagrams

**Unified Modeling Language (UML)** is a standardized visual language used to model the architecture, design, and behavior of software systems. It helps developers, architects, and stakeholders communicate system structure and design decisions effectively.

### 🧭 Types of UML Diagrams

- **📐 Structural Diagrams** – Describe the *static* aspects of the system such as classes, objects, and their relationships.
- **⚙️ Behavioral Diagrams** – Represent the *dynamic* behavior of the system including use cases, sequences, and workflows.


### 🏎️ Most Commonly used UML Diagrams

- [📦 Class Diagrams](https://www.geeksforgeeks.org/unified-modeling-language-uml-class-diagrams/)
- [🧸 Object Diagrams](https://www.geeksforgeeks.org/unified-modeling-language-uml-object-diagrams/)
- [⏱️ Sequence Diagrams](https://www.geeksforgeeks.org/unified-modeling-language-uml-sequence-diagrams/)
- [📊 Activity Diagrams](https://www.geeksforgeeks.org/unified-modeling-language-uml-activity-diagrams/)
- [🔁 State Machine Diagrams](https://www.geeksforgeeks.org/unified-modeling-language-uml-state-diagrams/)
- [🧱 Component Diagrams](https://www.geeksforgeeks.org/component-based-diagram/)
- [🎭 Use Case Diagrams](https://www.geeksforgeeks.org/use-case-diagram/)


### ❓ Frequently Asked Interview Questions
- [🧩 Aggregation vs Composition](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-aggregation-vs-composition/)
- [🔗 "Is A" vs "Has A" Relationship](https://www.geeksforgeeks.org/what-is-has-a-relation-in-java/)

### 🛠️ Tools for Designing UML Diagrams
- [✏️ Draw.io](https://draw.io) 
- [📝 Lucidchart](https://www.lucidchart.com/) 
- [♻️ PlantUML](https://plantuml.com/) 

---

## 🎲 Design Principles

Design principles are foundational guidelines that help developers build clean, maintainable, and scalable systems. These principles reduce code smells, improve team collaboration, and enhance long-term project sustainability.


### 🧱 SOLID

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


### ♻️ DRY

**DRY** is an acronym which stands for **Don't Repeat Yourself**.

Avoid duplicating logic or knowledge in your codebase.

💡 **Why it matters:**  
Duplication leads to inconsistency, bugs, and higher maintenance effort.

🛠 **How to follow DRY:**
- Extract reusable logic into utility methods or helper classes.
- Use abstract classes with generics to extract common logic in multiple similar use cases.
- Rely on proven libraries to avoid reinventing the wheel.


### 🧊 KISS – Keep It Simple, Stupid

**KISS** is an acronym which stands for **Keep It Simple, Stupid.**

Prefer simplicity in design and implementation. Avoid unnecessary complexity.

💡 **Why it matters:**  
Simple code is easier to read, debug, test, and extend.

> “Simplicity is the soul of efficiency.” — *Austin Freeman*

🛠 **Tips to follow KISS:**
- Choose the simplest possible solution that works.
- Avoid premature abstraction or over-engineering.
- Write for clarity first, optimization later.


### 🚫 YAGNI 

**YAGNI** is an acronym which stands for **You Aren’t Gonna Need It**. 

Don’t implement something unless it is absolutely required.

💡 **Why it matters:**  
Speculative features increase code complexity and often never get used.

🛠 **How to avoid YAGNI:**
- Stick to current requirements; iterate based on real feedback.
- Delay abstractions until patterns genuinely emerge.
- Don’t anticipate future features unless they’re well-defined.


### 📘 Resources

- [SOLID](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design)
- [Video SOLID](https://www.youtube.com/watch?v=_jDNAf3CzeY)
- [DRY Principle](https://www.baeldung.com/cs/dry-software-design-principle)
- [KiSS Principle](https://www.baeldung.com/cs/kiss-software-design-principle)
- [YAGNI Principle](https://www.geeksforgeeks.org/software-engineering/what-is-yagni-principle-you-arent-gonna-need-it/)

  
---

## 💫 Design Patterns

**Design Patterns** are proven, reusable solutions to common problems in software design. Rather than reinventing the wheel, developers can apply these patterns to improve code quality, scalability, and maintainability.

They encapsulate best practices gained over time, helping teams write cleaner, more modular, and flexible code—especially in large systems.

Design patterns are broadly categorized into **three types**, based on their purpose:

### 🏗️ Creational Patterns  

**Object creation mechanisms, decoupling the client from the creation logic.**

- 🔁 [Singleton](https://www.geeksforgeeks.org/singleton-design-pattern/) -  Ensure a class has only one instance.
- 🏭 [Factory Method](https://www.geeksforgeeks.org/system-design/factory-method-for-designing-pattern/) - Create objects without exposing the instantiation logic.
- 🧰 [Abstract Factory](https://www.geeksforgeeks.org/abstract-factory-pattern/) - Factory of factories — create families of related objects.
- 🧱 [Builder](https://www.geeksforgeeks.org/system-design/builder-design-pattern/) - Step-by-step object construction.
- 🧬 [Prototype](https://www.geeksforgeeks.org/system-design/prototype-design-pattern/) - Clone existing objects without depending on their classes.


### 🧱 Structural Patterns  

**How to compose objects and classes into larger structures.**

- 🔌 [Adapter](https://www.geeksforgeeks.org/adapter-pattern/) - Convert one interface into another.
- 🌉 [Bridge](https://www.geeksforgeeks.org/system-design/bridge-design-pattern/) - Separate abstraction from implementation.
- 🌲 [Composite](https://www.geeksforgeeks.org/composite-design-pattern-in-java/) - Treat individual and composite objects uniformly.
- 🎨 [Decorator](https://www.geeksforgeeks.org/system-design/decorator-pattern/) - Add new behaviors dynamically at runtime.
- 🧊 [Facade](https://www.geeksforgeeks.org/system-design/facade-design-pattern-introduction/) - Provide a simplified interface to a complex subsystem.
- 🛡️ [Proxy](https://www.geeksforgeeks.org/system-design/proxy-design-pattern/) - Control access or add functionality to another object.


### 🚢 Behavioral Patterns  

**How objects interact, share responsibility, and communicate.**

- 👁️ [Observer](https://www.geeksforgeeks.org/system-design/observer-pattern-set-1-introduction/) - Notify dependent objects automatically on state change.
- 🧠 [Strategy](https://www.geeksforgeeks.org/system-design/strategy-pattern-set-1/) - Select algorithms or behaviors at runtime.
- 🎮 [Command](https://www.geeksforgeeks.org/system-design/command-pattern/) - Encapsulate a request as an object for later execution.
- 🔄 [State](https://www.geeksforgeeks.org/system-design/state-design-pattern/) - Change behavior when internal state changes.
- 🔁 [Iterator](https://www.geeksforgeeks.org/system-design/iterator-pattern/) - Provide a way to access elements sequentially.
- 🧾 [Chain of Responsibility](https://www.geeksforgeeks.org/system-design/chain-responsibility-design-pattern/) - Pass request along a chain of handlers until one handles it.

### 📘 Resources

- [Coursera – Design Patterns (by UC San Diego)](https://www.coursera.org/learn/design-patterns)
- [GOF Book - Attached as PDF in Repository](https://www.oreilly.com/library/view/design-patterns-elements/0201633612/)
- [Design Patterns - GFG](https://www.geeksforgeeks.org/system-design/java-design-patterns/)

---

## 🛠 Practice Standard Interview Problems

- [Design Notify Me feature](https://medium.com/@beingadish/how-amazons-notify-me-feature-leverages-the-observer-design-pattern-d087b23deb46)
- [Design Snake and Ladder](https://medium.com/@abhigulve06/lld-of-the-snake-and-ladder-game-3fd9f47cdd3a)
- [Design Tic Tac Toe](https://medium.com/@avinashsoni9829/tic-tac-toe-low-level-design-f7ebefa88efc)
- [Design Chess Game](https://www.geeksforgeeks.org/design-a-chess-game/)
- [Design File System](https://www.geeksforgeeks.org/system-design/design-data-structures-algorithms-memory-file-system/)
- [Design Logging System](https://medium.com/@say2ankitgupta/low-level-design-of-logging-framework-ffaae7c701ee)
- [Design Parking Lot](https://www.geeksforgeeks.org/system-design/designing-parking-lot-garage-system-system-design/)
- [Design Elevator System](https://www.geeksforgeeks.org/system-design/elevator-system-low-level-design-lld/)
- [Design Pizza Billing System](https://www.youtube.com/watch?v=whghs8payCc&ab_channel=ProgrammingPathshala)
- [Design True Caller](https://www.lldcoding.com/design-lld-truecaller-machine-coding)
- [Design Traffic Light Management System](https://leetcode.com/discuss/post/291233/design-a-traffic-light-controller-by-thi-7fyd/)
- [Design CricBuzz](https://programmingappliedai.substack.com/p/design-patterns-to-be-used-in-cricbuzz)
- [Design Meeting Schedular](https://akhileshmj.medium.com/lld-6-meeting-scheduler-0eb8b23d9b04)
- [Design BookMyShow](https://lowleveldesign.io/OOD/DesignBookMyShow)
- [Design Online Voting System](https://dev.to/zeeshanali0704/polling-2hc8)
- [Design Car Rental System](https://aurigait.com/blog/low-level-design-of-car-rental-system-with-java/)
- [Design ATM machine](https://medium.com/design-bootcamp/atm-low-level-design-f356595e3074)
- [Design Vending Machine](https://www.geeksforgeeks.org/system-design/vending-machine-low-level-design/)
- [Design Splitwise](https://www.geeksforgeeks.org/system-design/system-design-of-backend-for-expense-sharing-apps-like-splitwise/)
- [Design Cab Booking](https://www.geeksforgeeks.org/system-design/cab-booking-system-low-level-design/)
- [Design Payment Gateway](https://blog.devgenius.io/low-level-design-payment-gateway-system-aead85996fd9)
- [Design Notification Service](https://www.youtube.com/watch?v=t-4r2AsJz_Q&ab_channel=CoderArmy)
- [Design Chat System](https://medium.com/@anurodh.kumar.civ21/low-level-design-of-a-chat-application-a-deep-dive-0af9c6957362)
- [Design Food Delivery System](https://www.youtube.com/watch?v=XN17WWiUzT4&ab_channel=KeertiPurswani)
- [Design Peer 2 Peer sharing System](https://www.thealgorists.com/LLD/FileSharingSystem)
- [Design Rate limiter](https://www.youtube.com/watch?v=X5daFTDfy2g&ab_channel=Concept%26%26Coding-byShrayansh)
- [Design Community Discussion Forum]()

---

## 🧹 Clean Coding 

Writing **clean code** is about crafting software that is easy to read, maintain, and extend. It focuses on **clarity, simplicity, consistency, and intent**, rather than cleverness. Clean code reduces bugs, improves collaboration, and makes debugging faster.

> _"Clean code always looks like it was written by someone who cares."_  
> – Robert C. Martin (Uncle Bob)

### 🧭 Principles of Clean Code

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


### 📚 Resources

- [Clean Code Video Playlist](https://www.youtube.com/watch?v=7EmboKQH8lM)
- [Clean Code Tutorial](https://www.freecodecamp.org/news/how-to-write-clean-code/)
- [Clean code Book](https://www.amazon.com/Clean-Code-Handbook-Software-Craftsmanship/dp/0132350882) - PDF added in repository

---

## 🧳 API designing

Designing high-quality APIs is at the heart of building scalable, maintainable, and user-friendly backend systems. A good API acts as a contract between different components or services, and when designed well, it enables ease of integration, clear communication, and long-term stability.

This section outlines key principles and best practices for designing clean, RESTful APIs that are easy to understand, evolve, and use.


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
- If an API handles multiple logical flows based on input, split it into separate endpoints.
- This enhances modularity, testing, and reusability.



### 🎖 Clear Request, response structures and API paths
- Use consistent and clear naming conventions for attributes in both requests and responses.
- Document the request/response schemas (use OpenAPI/Swagger for standardization).
- Keep API paths hierarchical, resource-based, and REST-compliant:

```
✅ GET /users/{userId}/orders
❌ GET /getAllOrdersByUserId
```

### 🎭 Clear Errors with  Status Codes
- Return appropriate HTTP status codes (200, 400, 401, 404, 500, etc.).
- Include meaningful error messages and optional error codes in the response body.

```
{
  "error": "UserNotFound",
  "message": "No user found with ID 1234"
}
```

### 🥋 Use Versioning
- Always version your APIs to allow for backward-incompatible changes.
- Use URI versioning like
  
```
/api/v1/users
or header-based versioning.
```
 
### 🔑 Implement Authentication & Authorization

- Use standards like OAuth2, JWT, or API keys to secure your APIs.
- Ensure role-based access control (RBAC) is properly enforced.


### 🏹 Rate limit APIs

- Use rate limiting to prevent abuse, reduce load, and ensure fair usage.
- Respond with 429 Too Many Requests when the limit is exceeded.


### 🎪 Support Pagination
- For large datasets, implement pagination using query parameters:
`GET /orders?page=2&limit=50`
- Use standard patterns like cursor-based or offset-based pagination

### 🎛 Idempotency 
- APIs should be idempotent—repeated calls with the same input should produce the same result without causing unintended side effects.
- This is especially important for PUT, DELETE, and retryable POST requests in order to prevent duplication or inconsistent state in case of network failures or client retries.
- Idempotency ensures safety, predictability, and robustness in distributed systems
  
### 📘 Resources
- [API design best practises](https://www.youtube.com/watch?v=_YlYuNMTCc8)
- [Restful APIs best practises](https://www.youtube.com/watch?v=etKM5-gGwto)
- [Video Tutorial on REST APIs](https://www.youtube.com/watch?v=7nm1pYuKAhY)
- [Idempotency](https://medium.com/@reetesh043/rest-api-design-what-is-idempotency-18218e1ff73c)

---

## 🗽 DB schema designing

> TBD

---
## 🧸 Unit testing

Unit testing is the practice of testing individual units of code (typically functions or classes) in isolation to ensure they work as expected. These tests are fast, reliable, and help you catch bugs early, making your codebase more maintainable and robust.

Unit tests should not depend on databases, network calls, or external services — they strictly validate the business logic in isolation.

### 🕰 Best Practices

- ✅ Test one unit at a time – Keep tests focused and scoped.
- 🧪 Use mocks/stubs/fakes to isolate external dependencies.
- 🧱 Follow Test-Driven Development (TDD) when possible: write the test before the implementation.
- 🎯 Aim for high coverage, but don’t obsess over 100% — focus on critical paths.
- 📖 Keep test code clean and readable – treat it with the same care as production code.
- 🧩 Use meaningful test names to describe behavior: `shouldThrowException_whenInputIsInvalid()`


### 📦 Common Libraries and Tools

| Language   | Framework       | Testing Tool             | Mocking Tool      |
|------------|------------------|---------------------------|-------------------|
| **Java**     | Spring Boot      | JUnit, TestNG              | Mockito           |
| **Node.js**  | Express          | Jest, Mocha, Supertest     | Sinon, Nock       |
| **Python**   | Flask/FastAPI    | pytest, unittest           | unittest.mock     |
| **Go**       | stdlib           | `testing` pkg              | testify/mock      |
| **.NET**     | ASP.NET Core     | MSTest, xUnit              | Moq               |


### 📘 Resources
- 📖 [Java Unit Testing Tutorial – FreeCodeCamp](https://www.freecodecamp.org/news/java-unit-testing/)
- 📺 [Unit Testing in Java – YouTube](https://www.youtube.com/watch?v=o5k9NOR9lrI)
- 📘 [Effective Unit Testing Principles (Baeldung)](https://www.baeldung.com/java-unit-testing-best-practices)
- 🛠 [Test driven Development](https://www.baeldung.com/java-test-driven-list)
  
---

## 🦅 Error Handling

Exception handling in APIs plays a critical role in delivering a predictable and smooth client experience. Proper handling ensures that clients receive **meaningful feedback**, developers can **debug issues effectively**, and systems remain **resilient and observable**.

A well-handled exception should:
- Return **clear and consistent error messages** to client.
- Use **standard HTTP status codes** to convey the type of failure.
- Separate **business logic** from **error management**.
- Enable clients to implement **retries with exponential backoff** in retriable scenarios (e.g., 5xx errors).

### 🏄‍♂️ Best Practices

- ✅ **Use custom exception classes** for domain-specific error handling.
- 🧭 **Map exceptions to appropriate HTTP status codes**:
  - `400` – Bad Request (e.g., validation error)
  - `401` – Unauthorized
  - `403` – Forbidden
  - `404` – Not Found
  - `500` – Internal Server Error
- 🔍 **Do not silently swallow exceptions** – log complete stack traces for debugging.
- 🔄 **Differentiate between**:
  - Business logic failures
  - Dependency/infrastructure failures (e.g., DB/3rd party APIs)
  - User input errors
- 📊 **Emit structured logs and metrics** for success/failure events – useful for observability and alerting.
- 🧪 **Always validate and sanitize** user inputs to prevent cascading failures.


### 📘 Resources
- [Tutorail](https://www.baeldung.com/java-exceptions)
- [Video Tutorial](https://www.youtube.com/watch?v=34ttwuxHtAE)
- [Best Practises](https://www.geeksforgeeks.org/best-practices-to-handle-exceptions-in-java/)

---

## 🧵 Multi Threading 

Multithreading allows multiple parts of a program to execute concurrently, making full use of multi-core processors. It helps improve:
- 🔄 **Asynchronous Processing** (e.g., UI threads not blocked)
- 🚀 **Throughput** (e.g., web servers handling thousands of requests)
- 💰 **Improved Performance** (e.g. Parallellism to improve latency)

But, it introduces complexity: **race conditions**, **deadlocks**, **memory visibility issues**.

### 💸 Threads Basics
- [Threads Introduction](https://www.geeksforgeeks.org/java-threads/)
- [Difference between Threads and Processes](https://www.shiksha.com/online-courses/articles/difference-between-process-and-thread/)

### 🛠️ Thread safety and Synchronization
- [Synchronization](https://www.geeksforgeeks.org/synchronization-in-java/)
- [Locks](https://www.baeldung.com/java-concurrent-locks)
- [Atomic variables](https://www.baeldung.com/java-atomic-variables)
- [Semaphores](https://www.baeldung.com/java-semaphore)
- [Concurrent Collections](https://www.geeksforgeeks.org/need-concurrent-collections-java/)


### ⛓️ Inter Thread Coordination
- [Wait and Notify](https://www.baeldung.com/java-wait-notify)
- [Countdown Latch](https://www.baeldung.com/java-countdown-latch)
- [Exchangers](https://www.baeldung.com/java-exchanger)

### 🧳 Thread Pool and Executors
- [Thread Pools](https://www.baeldung.com/thread-pool-java-and-guava)
- [Executor Service](https://www.baeldung.com/java-executor-service-tutorial)
- [Types of Executor Service](https://vinodhgowda.medium.com/understanding-executorservices-types-in-java-62ded89f6bdd)
- [Callables and Futures](https://www.geeksforgeeks.org/callable-future-java/)
- [Fork and Join](https://www.baeldung.com/java-fork-join)


### 📉 Optimal Number of threads
- [Optimal Pool size](https://engineering.zalando.com/posts/2019/04/how-to-set-an-ideal-thread-pool-size.html)
- [Parallellisation factor using Threads](https://stackoverflow.com/questions/43874079/how-to-decide-on-the-threadpooltaskexecutor-pools-and-queue-sizes)

###  ⚠️ Common Pitfalls
- [Deadlocks](https://www.baeldung.com/java-deadlock-livelock)
- [Race Conditions](https://www.baeldung.com/cs/race-conditions)

### Resources
- [Tutorial](https://www.baeldung.com/java-concurrency)
- [Video Tutorial](https://www.youtube.com/watch?v=gvQGKRlgop4&ab_channel=freeCodeCamp.org)

---

## 💡 Interview-Oriented Resources

- [LLD Questions List (GitHub)](https://github.com/tssovi/low-level-design-primer)
- [Scaler LLD Sheets](https://www.scaler.com/topics/low-level-design/)
- [LLD Playlist - SDE Skills](https://www.youtube.com/@SDESkills)


---

## 📖 Recommended Books

- **Design Patterns: Elements of Reusable Object-Oriented Software** – Gang of Four  
- **Clean Code** – Robert C. Martin 
 [Both are attached in the repository]
---

🔁 _Practice. Refactor. Discuss. That’s the secret to mastering LLD._  
👨‍💻 Happy Designing!
