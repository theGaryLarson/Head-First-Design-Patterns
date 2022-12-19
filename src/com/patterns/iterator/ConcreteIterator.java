package com.patterns.iterator;

import java.util.List;
import java.util.NoSuchElementException;

/**
 * A concrete implementation of the Iterator interface.
 */
public class ConcreteIterator implements Iterator {
    private final List<Object> elements;
    private int position;
    
    /**
     * Constructs a new ConcreteIterator with the given list of elements.
     * @param elements the list of elements to iterate over
     */
    public ConcreteIterator(List<Object> elements) {
        this.elements = elements;
        this.position = 0;
    }
    
    @Override
    public boolean hasNext() {
        return this.position < this.elements.size();
    }
    
    @Override
    public Object next() {
        if (this.hasNext()) {
            return this.elements.get(this.position++);
        }
        throw new NoSuchElementException();
    }
}
