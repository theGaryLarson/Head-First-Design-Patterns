package com.patterns.iterator;

/**
 * An interface for a collection of objects.
 */
public interface Collection {
    /**
     * Returns an iterator for the collection.
     * @return an iterator for the collection
     */
    Iterator iterator();
}
