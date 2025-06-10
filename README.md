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

### 🔫 Self explainatory name
- API name should clearly tell its behaviour.
- API should not have side effects i.e. unexpected behaviour apart from conveyed by the name.

### 🔩 Single Responsibilty
- API should have a clear and single reponsibility.
- Break API into multiple ones, if its have too much branching based in input.

### 🧲 Clear Request, response structures and API paths
- Request attributes should be carefully named, explained clearly in documentation.
- Response attributes should be carefully named, explained clearly in documentation.
- API path should be consistent and follow REST standards.

### 🧹 Clear Errors with  Status Codes
- API should have clearly defined common errors along with status codes.

### 🧨 Versioning
-  Use API versions in case of backward incompatible changes.
-  Example  `/api/v1/users`
 
### 🔑 Authentication and Authorization
- Use proper authentication and authorization mechanisms.

### 🏺 Rate limit APIs
- Rate limit your APIs to protect service from unwanted number of accesses.

### 📐 Pagination
- Set up pagination logic for bigger responses.

### 📂 Resources
- [API design best practises](https://www.youtube.com/watch?v=_YlYuNMTCc8)
- [Restful APIs best practises](https://www.youtube.com/watch?v=etKM5-gGwto)
- [HTTP Protocols](https://www.w3schools.com/tags/ref_httpmethods.asp)

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
