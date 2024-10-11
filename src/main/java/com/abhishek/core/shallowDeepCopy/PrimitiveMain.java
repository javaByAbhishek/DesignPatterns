package com.abhishek.core.shallowDeepCopy;

/**
 * Primitive Data Types:
 *
 * Stored by value.
 * Assignment creates a copy of the value.
 * No shallow or deep copy concept necessary.
 */
public class PrimitiveMain {
    public static void main(String[] args) {
        int originalValue = 10;
        int copiedValue = originalValue; // Copying the value

        copiedValue = 20; // Modify copied value

        System.out.println("Original Value: " + originalValue); // Outputs: 10
        System.out.println("Copied Value: " + copiedValue);     // Outputs: 20
    }
}
