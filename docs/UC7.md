# UC7: Display "Hello" with Multiple Command-Line Arguments using String.join() Method or Default Message

## 1. Description

This use case enhances the application by using the built-in `String.join()` method to concatenate multiple command-line arguments into a single formatted string. It simplifies string handling and eliminates the need for manual iteration and delimiter management. If no arguments are provided, the application defaults to "Hello, World!".

---

## 2. Disadvantages of Previous Use Case

* UC6 requires manual string construction using StringBuilder
* Additional step needed to remove trailing delimiter using substring()
* More lines of code and complexity

---

## 3. Preconditions

* Application is executed with zero or more command-line arguments
* Java runtime environment is properly configured

---

## 4. Main Flow

1. User runs the application with or without arguments
2. The `main()` method is invoked
3. Application checks if arguments exist using `args.length`
4. If no arguments exist, default value "World" is used
5. If arguments exist, `String.join(", ", args)` is used to concatenate names
6. Displays "Hello, <names>!"
7. Program terminates

---

## 5. Postconditions

* Greeting message is displayed correctly formatted
* No trailing delimiters are present

---

## 6. Code Implementation

```java
package com.srivathsan.helloapp;

public class HelloApp {

    public static void main(String[] args) {

        String result;

        if (args.length == 0) {
            result = "World";
        } else {
            result = String.join(", ", args);
        }

        System.out.println("Hello, " + result + "!");
    }
}
```

---

## 7. Sample Output

### Case 1: No Arguments

```
Input:  java HelloApp
Output: Hello, World!
```

### Case 2: Single Argument

```
Input:  java HelloApp Alice
Output: Hello, Alice!
```

### Case 3: Multiple Arguments

```
Input:  java HelloApp Alice Bob Charlie
Output: Hello, Alice, Bob, Charlie!
```

---

## 8. Concepts Covered

### String.join() Method

Efficient built-in method to concatenate strings with a delimiter

### Static Methods

Method can be called without creating an object

### Command-Line Arguments

Handling multiple inputs via args[]

### Conditional Logic

Checking presence of arguments

### Default Values

Fallback when no input is provided

### Code Optimization

Reducing complexity and improving readability

---

## 9. Notes

* Cleanest implementation among all approaches
* Eliminates need for loops and manual cleanup
* Preferred approach in modern Java development
