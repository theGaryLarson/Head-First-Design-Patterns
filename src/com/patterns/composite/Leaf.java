package com.patterns.composite;

import java.util.Collections;
import java.util.List;

/**
 * A leaf object in a tree-like structure.
 */
public class Leaf implements Composite {
    private int value;
    
    /**
     * Constructs a new Leaf with the given value.
     * @param value the value of the leaf
     */
    public Leaf(int value) {
        this.value = value;
    }
    
    @Override
    public void add(Composite child) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public void remove(Composite child) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public List<Composite> getChildren() {
        return Collections.emptyList();
    }
    
    @Override
    public int getValue() {
        return this.value;
    }

//    @Override
//    public Iterator<Composite> iterator() {
//        return new Iterator<Composite>() {
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public Composite next() {
//                return null;
//            }
//        };
//    }
}