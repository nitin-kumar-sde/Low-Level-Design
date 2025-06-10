# 🎠 Low-Level Design (LLD) complete Roadmap with resources

🪂🪂  Welcome to the ultimate roadmap + resources to master **Low-Level Design (LLD)**. 

Whether you're preparing for system design interviews, leveling up your object-oriented programming skills , enhancing API or DB schemas designing skills or learning failure handling mechanism at low level or unit testing at class level - this repo has you covered.

---

## 📘 Table of Contents

- [🧰 What is LLD?](#-what-is-lld)
- [🔩 What does LLD comprise?](#-what-does-lld-comprise)
- [🧱 OOPs](#-oops)
- [📚 Solid Principles](#-solid-principles)
- [🎯 Design Pattern Resources](#-design-pattern-resources)
- [🛠 Practice Standard Interview Problems](#-practice-standard-interview-problems)
- [🧳 API desiging](#-api-designing)
- [🧸 Unit tests](#-unit-tests)
- [📡 Exception handling](#-exception-handling)
- [💡 Interview-Oriented Resources](#-interview-oriented-resources)
- [📺 Video Playlists](#-video-playlists)
- [📖 Recommended Books](#-recommended-books)
- [🚀 Bonus: Mock Design Problems](#-bonus-mock-design-problems)

---

## 🧰 What is LLD?

Low-Level Design, is a phase in the software development process where detailed system components and their interactions are specified, along with their implementation details. 

It involves converting the high-level design into a more detailed blueprint, addressing specific algorithms, data structures, interfaces, performance, unit testing mechanisms, failure handling and Optiomally designing APIs and Database tables.

LLD serves as a guide for developers during coding, which ensures the accurate and efficient implementation of the system's functionality.

[Learn More](https://www.geeksforgeeks.org/what-is-low-level-design-or-lld-learn-system-design/)


---


## 🔩 What does LLD comprise?

LLD comprises of all the low level details of the system like 

- Master Object-Oriented Programming (OOPs)
- Learn UML diagrams
- Learn SOLID Principles 
- Deep dive into Design Patterns
- Practise standard problems of LLD interviews
- Art of Designing great APIs
- Database schema design skills
- Proper error handling mechanisms
- Unit testing at class level
- Multithreading and Thread safety


---

## 🧱 OOPs

Before diving into LLD, mastering **OOPs** is a must.

### Core OOP Concepts:
- [Classes & Objects](https://www.geeksforgeeks.org/classes-objects-java/)
- [Constructors](https://www.geeksforgeeks.org/constructors-in-java/)
- [Encapsulation](https://www.geeksforgeeks.org/encapsulation-in-java/)
- [Abstraction](https://www.geeksforgeeks.org/abstraction-in-java-2/)
- [Inheritance](https://www.geeksforgeeks.org/inheritance-in-java/)
- [Polymorphism](https://www.geeksforgeeks.org/polymorphism-in-java/)
- [Runtime Polymorphism - Method overriding](https://www.geeksforgeeks.org/overriding-in-java/)
- [Compile time Polymorphism - Method overloading](https://www.geeksforgeeks.org/method-overloading-in-java/)
- [Compile time Polymorphism - Operator overloading](https://www.geeksforgeeks.org/operator-overloading-cpp/)  - Only supported in C++

  
### UML Diagrams
- [Class Diagrams](https://www.geeksforgeeks.org/unified-modeling-language-uml-class-diagrams/)
- [Object Diagrams](https://www.geeksforgeeks.org/unified-modeling-language-uml-object-diagrams/)
- [Is A/ Has A relationship](https://www.geeksforgeeks.org/what-is-has-a-relation-in-java/)


### Important Interview Questions
- [Difference between Abstract class and Interface](https://www.geeksforgeeks.org/difference-between-abstract-class-and-interface-in-java/)
- [Difference between Aggregation and Composition](https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-aggregation-vs-composition/)


### Resources:
- [Java OOPs Tutorial - GeeksforGeeks](https://www.geeksforgeeks.org/object-oriented-programming-oops-concept-in-java/)
- [OOP Concepts with Examples](https://www.educative.io/blog/object-oriented-programming)
- [Video Tutorial](https://www.youtube.com/watch?v=0flBHkyET_E)
- [Book](https://www.freecodecamp.org/news/learn-java-object-oriented-programming/)


---


## 📚 Solid Principles

SOLID is an acronym for five key principles of object-oriented design that help create clean, scalable, and maintainable software. 
These principles make your codebase easier to understand, extend, and refactor.

It stands for 

🏂 S – Single Responsibility Principle (SRP)
**A class should have only one reason to change.**

🧘 O – Open/Closed Principle (OCP)
**Software entities should be open for extension but closed for modification.**

🎖 L – Liskov Substitution Principle (LSP)
**Subtypes must be substitutable for their base types without breaking the program.**

🎸 I – Interface Segregation Principle (ISP)
**Clients should not be forced to depend on interfaces they don’t use.**

🎧 D – Dependency Inversion Principle (DIP)
**High-level modules should not depend on low-level modules. Both should depend on abstractions.**

🧠 Note
> These principles were introduced by Robert C. Martin (Uncle Bob) and are foundational in designing robust object-oriented systems.


- [Tutorial](https://www.digitalocean.com/community/conceptual-articles/s-o-l-i-d-the-first-five-principles-of-object-oriented-design)
- [Best Video Tutorial](https://www.youtube.com/watch?v=_jDNAf3CzeY)


---

## 🎯 Design Pattern Resources

### Key Patterns to Learn:

- Singleton
- Factory Method
- Builder
- Strategy
- Observer
- Adapter
- Decorator
- Composite
- Proxy
- Template Method

### Best Resources:

- [Refactoring Guru](https://refactoring.guru/design-patterns)
- [SourceMaking Patterns](https://sourcemaking.com/design_patterns)
- [Tech Dummies (YouTube)](https://www.youtube.com/@TechDummiesNarendraL)

---

## 🛠 Practice Standard Interview Problems

- Design BookMyShow
- Design a Parking Lot
- Design Splitwise
- Design an Elevator System
- Design Cab Booking (Uber)

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

  
### 📘 Resources
- [API design best practises](https://www.youtube.com/watch?v=_YlYuNMTCc8)
- [Restful APIs best practises](https://www.youtube.com/watch?v=etKM5-gGwto)
- [Video Tutorial on REST APIs](https://www.youtube.com/watch?v=7nm1pYuKAhY)

---

## 🧸 Unit tests

Unit testing ensures **individual units of logic** (like class ) behave **predictably** and **fail fast**. These tests are **fast**, **independent of external systems**, and focus purely on **business logic**, and are independent of external dependencies.


### 🕰 Best Practices

- Test **one unit** at a time.
- Use **mocks/stubs** to isolate dependencies.
- Use test driven developement.
- Aim for **high coverage**, but **don't chase 100%**
- Test code should be equally readble like business logic.


### 📦 Common Libraries

| Language | Framework     | Testing Tool         | Mocking Tool     |
|----------|----------------|----------------------|------------------|
| Node.js  | Express         | Jest, Mocha, Supertest | Sinon, Nock       |
| Java     | Spring Boot     | JUnit,    | Mockito          |
| Python   | Flask/FastAPI   | pytest      | unittest.mock    |

### 📘 Resources
- [Tutorial](https://www.freecodecamp.org/news/java-unit-testing/)
- [Video Tutorial](https://www.youtube.com/watch?v=o5k9NOR9lrI)
  
---


## 📡 Exception Handling

Exception handling in APIs should:
- Return **clear and consistent error messages** to the client in case of failures.
- Use **standard HTTP status codes**
- Separate **business logic** from error management
- Client should implement retries with exponential backoff in case of retriable scenerios.

### 📿 Best Practices

-  Use **custom exception classes** for domain-specific errors
-  Map exceptions to proper **HTTP status codes**
-  Don't swallow exceptions, logs complete stack trace on server for better debugging.
-  Distinguish betwenn, service failures, dependency failures and bad requests and have monitoring on service failures.
-  Emit proper metrics during successful or unsuccessful invocation of APIs for dashboarding.

### 🗒 Resources
- [Tutorail](https://www.baeldung.com/java-exceptions)
- [Video Tutorial](https://www.youtube.com/watch?v=34ttwuxHtAE)
- [Best Practises](https://www.geeksforgeeks.org/best-practices-to-handle-exceptions-in-java/)

---


## 💡 Interview-Oriented Resources

- [LLD Questions List (GitHub)](https://github.com/tssovi/low-level-design-primer)
- [Scaler LLD Sheets](https://www.scaler.com/topics/low-level-design/)
- [LLD Playlist - SDE Skills](https://www.youtube.com/@SDESkills)

---

## 📺 Video Playlists

- [Tech Dummies - Narendra L](https://www.youtube.com/@TechDummiesNarendraL)
- [CodeKarle](https://www.youtube.com/@codekarle)
- [Arpit Bhayani](https://www.youtube.com/@arpitbhayani)

---

## 📖 Recommended Books

- **Design Patterns: Elements of Reusable Object-Oriented Software** – Gang of Four  
- **Head First Design Patterns** – Eric Freeman  
- **Clean Code** – Robert C. Martin  
- **System Design Interview Vol. 2** – Alex Xu

---

## 🚀 Bonus: Mock Design Problems

- Design Rate Limiter  
- Design In-Memory Cache (like LRU)  
- Design File Storage System  
- Design Hotel Booking System  
- Design Notification System (Email/SMS)

---

> 🔁 _Practice. Refactor. Discuss. That’s the secret to mastering LLD._  
> 👨‍💻 Happy Designing!
