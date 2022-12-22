package com.patterns.bridge;

/**
 * The ConcreteImplementationB class is a concrete implementation of the Implementation interface.
 */
public class ConcreteImplementationB implements Implementation {
    @Override
    public void operationImpl() {
        // Implementation details
        System.out.println("Performing operation using implementation B");
    }
}