# UC5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop or Default Message

## 1. Description

This use case enhances the application by using an enhanced for loop (for-each loop) to process multiple command-line arguments. It provides a cleaner and more readable way to iterate through input values. If no arguments are provided, the application defaults to displaying "Hello, World!".

---

## 2. Disadvantages of Previous Use Case

* UC4 uses String.join() which abstracts the iteration logic
* Less control over formatting and iteration process
* Does not demonstrate loop-based string building explicitly

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
5. If arguments exist, application iterates using enhanced for loop
6. Builds a comma-separated string using StringBuilder
7. Displays "Hello, <names>!"
8. Program terminates

---

## 5. Postconditions

* Greeting message is displayed using all provided names or default value

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
            StringBuilder sb = new StringBuilder();

            for (String name : args) {
                sb.append(name).append(", ");
            }

            sb.setLength(sb.length() - 2);

            result = sb.toString();
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

### Enhanced For Loop

Simplifies iteration over arrays without index management

### Command-Line Arguments

Accessing multiple inputs using `args[]`

### StringBuilder

Efficient way to build strings dynamically

### Conditional Logic

Determines behavior based on presence of arguments

### Default Values

Ensures program works even without input

### String Formatting

Proper handling of delimiters (comma separation)

---

## 9. Notes

* Improves readability compared to traditional loops
* Demonstrates manual string construction
* Prepares for more complex data processing in later use cases
