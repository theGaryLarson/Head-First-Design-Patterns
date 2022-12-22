package com.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * A concrete implementation of the Composite interface.
 */
public class ConcreteComposite implements Composite {
    private final List<Composite> children;
    private final int value;
    
    /**
     * Constructs a new ConcreteComposite with the given value.
     * @param value the value of the composite
     */
    public ConcreteComposite(int value) {
        this.children = new ArrayList<>();
        this.value = value;
    }
    
    @Override
    public void add(Composite child) {
        this.children.add(child);
    }
    
    @Override
    public void remove(Composite child) {
        this.children.remove(child);
    }
    
    @Override
    public List<Composite> getChildren() {
        return this.children;
    }
    
    @Override
    public int getValue() {
        return this.value;
    }

//    @Override
//    public Iterator<Composite> iterator() {
//        return new CompositeIterator(this);
//    }
}