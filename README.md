# HelloApp 🚀

## 📌 Overview

HelloApp is a structured Java application developed using Maven that demonstrates core programming concepts through a sequence of incremental use cases (UC1–UC12). The project evolves from a simple console output program to a modular, extensible, and persistent application.

---

## 🎯 Objectives

* Understand Java fundamentals and program execution
* Practice structured development using use-case driven approach
* Apply object-oriented principles and clean architecture
* Learn version control workflows using Git

---

## 🧩 Features (Use Cases)

* UC1: Display Hello World
* UC2: Accept user name (CLI)
* UC3: Handle optional inputs
* UC4: Multiple arguments handling
* UC5–UC8: Input handling and collection management
* UC9–UC11: Refactoring, modular design, persistence
* UC12: Banner-style output rendering

---

## 🛠️ Tech Stack

* Java
* Maven
* IntelliJ IDEA

---

## 📂 Project Structure

```
hello-app/
├── src/main/java/        # Application source code
├── src/test/java/        # Test code (optional)
├── docs/                 # Use case documentation
├── pom.xml               # Maven configuration
├── README.md             # Project overview
└── .gitignore            # Ignored files
```

---

## ▶️ How to Run

### Compile

```
mvn compile
```

### Execute

```
mvn exec:java -Dexec.mainClass="org.example.HelloApp"
```

---

## 🔀 Git Workflow

* `main` → stable release
* `dev` → integration branch
* `feature/*` → individual use case implementation

---

## 📖 Documentation

Detailed use case documentation is available in the `docs/` directory.

---

## Completion Status

* UC1:Display Hello world → ✅
* UC2:Display Hello world with Command-Line Argument  → ✅
* UC3:Display "Hello" with Command-Line Argument or Default Message  → ✅
* UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message → ✅
* UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop or Default Message → ✅

---
## 👨‍💻 Author 

Srivathsan S
