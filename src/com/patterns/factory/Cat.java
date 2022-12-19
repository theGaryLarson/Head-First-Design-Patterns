package com.patterns.factory;

/**
 * A concrete implementation of {@link Animal} representing a cat.
 */
public class Cat implements Animal {
    /**
     * {@inheritDoc}
     */
    public void speak() {
        System.out.println("Meow!");
    }
}
