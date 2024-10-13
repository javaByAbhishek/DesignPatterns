# Factory Method Pattern

The **Factory Method Pattern** is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created. This pattern promotes loose coupling by eliminating the need for the client code to know the specific classes being instantiated.

## Key Considerations for the Factory Method Pattern

### 1. Interface or Abstract Class
Define a common interface or abstract class for the products that will be created. This ensures that all products conform to the same contract.
#### Product Interface

```java
public interface Animal {
    void speak();
}
```
### 2. Concrete Products
Implement concrete classes that adhere to the interface or abstract class. Each concrete class represents a specific implementation of a product.

#### Concrete Products
```java
public class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

public class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}
```
### 3. Factory Method
Create a factory method in the interface or abstract class that will be overridden by subclasses. This method is responsible for instantiating the product.

#### Creator Abstract Class
```java
public abstract class AnimalFactory {
    public abstract Animal createAnimal();
}
```
### 4. Subclass Responsibility
Allow subclasses to define which product to instantiate. This keeps the product creation logic flexible and extensible.

```java
public class DogFactory extends AnimalFactory {
@Override
public Animal createAnimal() {
return new Dog();
}
}

public class CatFactory extends AnimalFactory {
@Override
public Animal createAnimal() {
return new Cat();
}
}
```
### 5. Decoupling
Decouple the client code from the specific classes of the products. This allows for easier modification and maintenance.


## Example Implementation

Here’s a simple example demonstrating the Factory Method Pattern:
```java
public class Main {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        dog.speak();  // Outputs: Woof!

        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        cat.speak();  // Outputs: Meow!
    }
}
```
>In this example, the AnimalFactory serves as the interface for creating Animal objects, while DogFactory and CatFactory are concrete implementations that provide specific products. This structure allows for easy expansion when new animal types need to be introduced.




