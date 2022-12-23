package com.patterns.visitor;

/**
 * Another concrete element implementation.
 */
public class ConcreteElementB implements Element {
    private int value;
    
    public ConcreteElementB(int value) {
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
