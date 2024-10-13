package com.abhishek.creational.factory;

/**
 * 3. Factory Method
 * Create a factory method in the interface or abstract class that will be overridden by subclasses.
 * This method is responsible for instantiating the product.
 */
public abstract class AnimalFactory {
    public abstract Animal createAnimal();
}
