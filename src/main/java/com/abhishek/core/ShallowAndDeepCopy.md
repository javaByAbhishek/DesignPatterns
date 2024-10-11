# Shallow Copy and Deep Copy in Java

In Java, the concepts of shallow copy and deep copy primarily apply to objects. When it comes to primitive data types and immutable objects like `String`, the behavior is different. This document explores how shallow copy and deep copy work with both primitive data types and `String`.

## Primitive Data Types

Primitive data types in Java (such as `int`, `char`, `boolean`, etc.) are stored by value. This means that when you assign a primitive type to another variable, you are copying the actual value, not a reference. Therefore, there’s no need for shallow or deep copies with primitives.

### Example with Primitive Types

```java
public class Main {
    public static void main(String[] args) {
        int originalValue = 10;
        int copiedValue = originalValue; // Copying the value

        copiedValue = 20; // Modify copied value

        System.out.println("Original Value: " + originalValue); // Outputs: 10
        System.out.println("Copied Value: " + copiedValue);     // Outputs: 20
    }
}
```
## String
Strings in Java are immutable, meaning that once a String object is created, it cannot be changed. When you assign a String to another String variable, you are copying the reference to the same String object rather than creating a new object.

### Example with Primitive Types

```java
public class Main {
    public static void main(String[] args) {
        String originalString = "Hello";
        String copiedString = originalString; // Copying the reference

        // Attempting to change the copied string
        copiedString = "World"; // This creates a new String object

        System.out.println("Original String: " + originalString); // Outputs: Hello
        System.out.println("Copied String: " + copiedString);     // Outputs: World
    }
}

```

# Summary

## Example with Strings

- **Stored by value.**
- **Assignment creates a copy of the value.**
- **No shallow or deep copy concept necessary.**

## String

- **Immutable; stored by reference.**
- **Assignment copies the reference.**
- **Modifying the copied string creates a new String object, leaving the original unchanged.**
