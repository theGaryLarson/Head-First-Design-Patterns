package com.patterns.factory;

/**
 * A concrete implementation of {@link Animal} representing a dog.
 */
public class Dog implements Animal {
    /**
     * {@inheritDoc}
     */
    public void speak() {
        System.out.println("Woof!");
    }
}
