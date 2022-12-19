package com.patterns.bridge;

/**
 * The RefinedAbstraction class is a concrete implementation of the Abstraction interface.
 * It contains a reference to an Implementation object.
 */
public class RefinedAbstraction implements Abstraction {
    private Implementation implementation;
    
    public RefinedAbstraction(Implementation implementation) {
        this.implementation = implementation;
    }
    
    @Override
    public void operation() {
        // Delegate the call to the implementation
        implementation.operationImpl();
    }
}
