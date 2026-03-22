# UC3: Display "Hello" with Command-Line Argument or Default Message

## 1. Description

This use case enhances the application by supporting both personalized and default greetings. If a user provides a name as a command-line argument, the application displays a personalized greeting. Otherwise, it defaults to "World". This ensures robustness and improves usability.

---

## 2. Disadvantages of Previous Use Case

* UC2 requires explicit conditional handling using if-else
* Code becomes slightly verbose for simple logic
* Can be simplified using more concise constructs

---

## 3. Preconditions

* Application is executed with or without command-line arguments
* Java runtime environment is properly configured

---

## 4. Main Flow

1. User runs the application
2. The `main()` method is invoked
3. Application checks if arguments are provided
4. If present, it assigns `args[0]` to name
5. If absent, assigns default value "World"
6. Displays "Hello, <name>!"
7. Program terminates

---

## 5. Postconditions

* Greeting message is displayed using either user input or default value

---

## 6. Code Implementation

```java
package com.srivathsan.helloapp;

public class HelloApp {

    public static void main(String[] args) {

        String name = (args.length > 0) ? args[0] : "World";

        System.out.println("Hello, " + name + "!");
    }
}
```

---

## 7. Sample Output

### Case 1: With Argument

```
Input:  java HelloApp Alice
Output: Hello, Alice!
```

### Case 2: Without Argument

```
Input:  java HelloApp
Output: Hello, World!
```

---

## 8. Concepts Covered

### Conditional Logic

Used to determine whether input is available

### Ternary Operator

A concise alternative to if-else:
(condition ? valueIfTrue : valueIfFalse)

### Command-Line Arguments

Accessed using `args[]` array

### Default Values

Ensures program does not fail when input is missing

### Defensive Programming

Prevents runtime errors by validating input before usage

### String Concatenation

Combines text and variables to form output

---

## 9. Notes

* Improves code readability compared to UC2
* Ensures consistent output behavior
* Forms the base for handling multiple arguments in future use cases
