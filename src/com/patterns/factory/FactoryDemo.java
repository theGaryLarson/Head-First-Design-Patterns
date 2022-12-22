package com.patterns.factory;

/**
 * A demonstration of the Factory pattern.
 */
public class FactoryDemo {
    /**
     * The entry point of the demo.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        
        // Get a dog object and call its speak method
        Animal animal1 = animalFactory.getAnimal("DOG");
        animal1.speak();
        
        // Get a cat object and call its speak method
        Animal animal2 = animalFactory.getAnimal("CAT");
        animal2.speak();
    }
}


/*In this example, the Animal interface represents the type of objects that the factory can create.
The Dog and Cat classes are concrete implementations of the Animal interface. The AnimalFactory class
is the factory class responsible for creating objects of type Animal. The FactoryPatternDemo class is
the client class that uses the factory to create Animal objects.*/