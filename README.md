# Overview

The goal of this project is to strengthen my understanding of Kotlin as a modern, concise, and expressive programming language for building console and desktop applications.
I wanted to explore how Kotlin handles object-oriented design, collections, and data classes while practicing clean code organization and modular structure.

This program is a simple **Task Tracker** that allows users to create, list, complete, and update their tasks. It demonstrates several core Kotlin features including data classes, mutable lists, object declarations, and control flow using the `when` expression.
By integrating an update feature that uses the `copy()` method from Kotlin data classes, the program also highlights how Kotlin simplifies immutability and state management.

**Purpose:**
My purpose in writing this software was to become more comfortable working with Kotlin syntax and its object-oriented and functional programming capabilities. It served as a hands-on way to understand how Kotlin differs from Java in terms of readability, data management, and type safety.

[Software Demo Video](https://youtu.be/Lxb8xmv6AQo)

---

# Development Environment

This project was developed using:
- **IDE:** IntelliJ IDEA Community Edition
- **Build Tool:** Gradle
- **JDK Version:** 17
- **Language:** Kotlin (version 2.2.20)

**Libraries and Tools Used:**
- Kotlin Standard Library (`kotlin-stdlib`)
- Gradle `application` plugin for running the project
- Command-line interaction through Kotlin’s `readlnOrNull()` for input

The program structure follows a clean separation of concerns, splitting functionality into:
- `Task.kt` — defines the `Task` data class
- `TaskManager.kt` — handles task creation, listing, completion, and updates
- `TaskApp.kt` — runs the main loop and manages user interaction

---

# Useful Websites

- [Kotlin Language Documentation](https://kotlinlang.org/docs/home.html)
- [Kotlin Data Classes](https://kotlinlang.org/docs/data-classes.html)
- [Gradle Kotlin DSL Reference](https://docs.gradle.org/current/userguide/kotlin_dsl.html)
- [JetBrains IntelliJ IDEA Guide](https://www.jetbrains.com/idea/guide/)
- [Baeldung: Kotlin Basics](https://www.baeldung.com/kotlin)

---

# Future Work

- Add persistent storage (save tasks to a database)
- Implement task due dates and priorities
- Add sorting and filtering options
- Improve error handling for user input
- Create a GUI version using Android

# Quickstart

**To build and run the project locally:**

1. **Clone the repository**
   ```bash
   git clone https://github.com/yourusername/TaskTracker.git
   cd TaskTracker
2. Run the application with Gradle
   ```bash
   ./gradlew run
    gradlew.bat run
3. Interact with the program
 - Add new tasks
 - View the list of tasks
 - Mark tasks as complete 
 - Update existing tasks 
 - Remove tasks
4. Exit
 - Type exit or select the quit option to close the Task Tracker.
