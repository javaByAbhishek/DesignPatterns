package com.abhishek.core.shallowDeepCopy;

/**
 * String:
 * Immutable; stored by reference.
 * Assignment copies the reference.
 * Modifying the copied string creates a new String object, leaving the original unchanged.
 */
public class StringMain {
    public static void main(String[] args) {
        String originalString = "Hello";
        String copiedString = originalString; // Copying the reference

        // Attempting to change the copied string
        copiedString = "World"; // This creates a new String object

        System.out.println("Original String: " + originalString); // Outputs: Hello
        System.out.println("Copied String: " + copiedString);     // Outputs: World
    }
}
