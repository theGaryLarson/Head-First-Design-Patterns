package com.patterns.bridge;

/**
 * The BridgeDemo class is the main entry point for the application. It creates an instance of a concrete
 * implementation of the Implementation interface and an instance of the RefinedAbstraction class,
 * passing in the concrete implementation as an argument. It then calls the operation method on the
 * abstraction object.
 */
public class BridgeDemo {
    public static void main(String[] args) {
        // Create a concrete implementation
        Implementation implementation = new ConcreteImplementationA();
        
        // Create an abstraction using the concrete implementation
        Abstraction abstraction = new RefinedAbstraction(implementation);
        
        // Call the operation on the abstraction
        abstraction.operation();
    }
}
