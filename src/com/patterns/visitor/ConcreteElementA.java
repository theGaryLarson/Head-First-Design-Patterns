package com.patterns.visitor;

/**
 * A concrete element implementation.
 */
public class ConcreteElementA implements Element {
    private int value;
    
    public ConcreteElementA(int value) {
        this.value = value;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public int getValue() {
        return value;
    }
}
