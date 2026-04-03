# UC6: Display "Hello" with Multiple Command-Line Arguments using substring to Remove Trailing Delimiter

## 1. Description

This use case enhances the application by using the `substring()` method to remove trailing delimiters after constructing the greeting string. It uses an enhanced for loop to process multiple command-line arguments. If no arguments are provided, it defaults to "Hello, World!".

---

## 2. Disadvantages of Previous Use Case

* UC5 uses `setLength()` which directly modifies StringBuilder
* Less intuitive for beginners
* Does not clearly separate string construction and cleanup logic

---

## 3. Preconditions

* Application is executed with zero or more command-line arguments
* Java runtime environment is properly configured

---

## 4. Main Flow

1. User runs the application with or without arguments
2. The `main()` method is invoked
3. Application checks if arguments exist
4. If no arguments exist, default value "World" is used
5. If arguments exist:

    * Iterate through args using enhanced for loop
    * Append each name followed by ", "
6. Use `substring()` to remove trailing delimiter
7. Display "Hello, <names>!"
8. Program terminates

---

## 5. Postconditions

* Greeting message is displayed correctly formatted
* No trailing commas present

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
            StringBuilder nameBuilder = new StringBuilder();

            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            String names = nameBuilder.substring(0, nameBuilder.length() - 2);

            result = names;
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

### substring() Method

Extracts a portion of a string using index positions

### Enhanced For Loop

Simplifies iteration over array elements

### StringBuilder

Efficient string construction in loops

### String Length

Used to determine substring boundaries

### Default Values

Ensures application works without input

### Delimiter Handling

Append first, clean later approach

---

## 9. Notes

* Cleaner logic compared to conditional delimiter checks
* Separates building and cleanup phases
* Common pattern in string processing tasks
