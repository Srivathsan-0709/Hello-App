# UC4: Display "Hello" with Multiple Command-Line Arguments or Default Message

## 1. Description

This use case extends the application to support multiple names as command-line arguments. Instead of greeting a single user, the application now combines all provided names into one greeting. If no names are provided, it defaults to "World".

---

## 2. Disadvantages of Previous Use Case

* UC3 handles only a single name
* Requires multiple executions to greet multiple users
* Not efficient for real-world usage

---

## 3. Preconditions

* Application is executed with zero or more command-line arguments
* Java runtime environment is configured properly

---

## 4. Main Flow

1. User runs the application with or without arguments
2. The `main()` method is invoked
3. Application checks if arguments exist using `args.length`
4. If present, all arguments are combined into a single string
5. If absent, default value "World" is used
6. Displays "Hello, <names>!"
7. Program terminates

---

## 5. Postconditions

* Greeting message includes all names or defaults to "World"

---

## 6. Code Implementation

```java
package com.srivathsan.helloapp;

public class HelloApp {

    public static void main(String[] args) {

        String names;

        if (args.length > 0) {
            names = String.join(", ", args);
        } else {
            names = "World";
        }

        System.out.println("Hello, " + names + "!");
    }
}
```

---

## 7. Sample Output

### Case 1: Multiple Arguments

```
Input:  java HelloApp Alice Bob Charlie
Output: Hello, Alice, Bob, Charlie!
```

### Case 2: Single Argument

```
Input:  java HelloApp John
Output: Hello, John!
```

### Case 3: No Arguments

```
Input:  java HelloApp
Output: Hello, World!
```

---

## 8. Concepts Covered

### Array Handling

Processing multiple command-line arguments using arrays

### String.join()

Efficiently combines multiple strings using a delimiter

### Conditional Logic

Used to determine whether arguments are present

### Default Values

Fallback mechanism when no input is provided

### Loop Abstraction

Avoids manual loops by using built-in methods like `String.join()`

### User Experience Enhancement

Supports multiple inputs in a single execution

---

## 9. Notes

* Improves scalability of the application
* Keeps code clean and readable
* Prepares for handling collections in future use cases
