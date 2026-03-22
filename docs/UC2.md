# UC2: Display "Hello" with Command-Line Argument

## 1. Description

This use case enhances the basic functionality of the application by accepting a user’s name as a command-line argument and displaying a personalized greeting. It introduces dynamic input handling compared to the static output in UC1.

---

## 2. Disadvantages of Previous Use Case

* UC1 only displays a static message ("Hello World")
* No support for user input
* Not interactive or customizable

---

## 3. Preconditions

* Application is executed from command line or via Maven
* Optional command-line argument (user name) may be provided

---

## 4. Main Flow

1. User runs the application with or without arguments
2. The `main()` method is invoked
3. Application checks if arguments are provided using `args.length`
4. If present, it reads the first argument (`args[0]`)
5. Displays a personalized greeting: "Hello, <name>!"
6. If no argument is provided, displays default message: "Hello, World!"
7. Program terminates

---

## 5. Postconditions

* A greeting message is displayed based on user input or default value

---

## 6. Code Implementation

```java id="0eqj3l"
package com.srivathsan.helloapp;

public class HelloApp {

    public static void main(String[] args) {

        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello, World!");
        }

    }
}
```

---

## 7. Sample Output

### Case 1: With Argument

```id="9r3n5b"
Input:  java HelloApp Alice
Output: Hello, Alice!
```

### Case 2: Without Argument

```id="7t8rqs"
Input:  java HelloApp
Output: Hello, World!
```

---

## 8. Concepts Covered

### Command-Line Arguments

Inputs passed during program execution, accessible via `String[] args`

### Array Length

Used `args.length` to check if arguments exist and prevent runtime errors

### Array Indexing

Accessed first argument using `args[0]`

### Conditional Logic

Used `if-else` to handle different execution paths

### String Concatenation

Combined strings using `+` operator to form output message

### Default Handling

Provided fallback output ("Hello, World!") when no input is given

---

## 9. Notes

* Prevents `ArrayIndexOutOfBoundsException` by checking `args.length`
* Builds foundation for handling multiple inputs in future use cases
