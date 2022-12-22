package com.patterns.iterator;

/**
 * An interface for an iterator over a collection of objects.
 */
public interface Iterator {
    /**
     * Returns true if the iterator has more elements.
     * @return true if the iterator has more elements
     */
    boolean hasNext();
    
    /**
     * Returns the next element in the iteration.
     * @return the next element in the iteration
     */
    Object next();
}