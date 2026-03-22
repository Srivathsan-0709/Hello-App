# UC1: Display "Hello World"

## 1. Description

This use case demonstrates the most basic functionality of the HelloApp by printing a static message "Hello World" to the console. It serves as the entry point for understanding program execution in Java.

---

## 2. Preconditions

* Java Development Kit (JDK) is installed
* Maven project is set up successfully
* Application entry point is defined

---

## 3. Main Flow

1. The application is executed
2. The JVM invokes the `main()` method
3. The application prints "Hello World" to the console
4. The program terminates

---

## 4. Postconditions

* The message "Hello World" is displayed on the console

---

## 5. Code Implementation

```java
package org.example;

public class HelloApp {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
```

---

## 6. Sample Output

```
Hello World
```

---

## 7. Concepts Covered

### Class Declaration

Defines the structure of the program. `HelloApp` acts as the entry point container.

### Main Method

* Signature: `public static void main(String[] args)`
* Serves as the starting point of execution

### Access Modifier (`public`)

Allows the JVM to access the method

### Static Keyword

Enables method execution without object creation

### System Output

`System.out.println()` is used to display output to the console

---

## 8. Notes

* This is the foundational use case for all subsequent enhancements
* No user input or dynamic behavior is involved
