package com.abhishek.creational.factory;

/**
 * 4. Subclass Responsibility
 * Allow subclasses to define which product to instantiate.
 * This keeps the product creation logic flexible and extensible.
 */
public class DogFactory extends AnimalFactory {
    @Override
    public Animal createAnimal() {

        return new Dog();
    }
}