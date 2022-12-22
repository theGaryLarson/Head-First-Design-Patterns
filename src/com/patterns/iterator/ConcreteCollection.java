package com.patterns.iterator;

import java.util.List;

/**
 * A concrete implementation of the Collection interface.
 */
public class ConcreteCollection implements Collection {
    private List<Object> elements;
    
    /**
     * Constructs a new ConcreteCollection with the given list of elements.
     * @param elements the list of elements for the collection
     */
    public ConcreteCollection(List<Object> elements) {
        this.elements = elements;
    }
    
    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.elements);
    }
}
