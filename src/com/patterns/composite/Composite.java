package com.patterns.composite;

import java.util.Iterator;
import java.util.List;

/**
 * An interface for a composite object in a tree-like structure.
 */
public interface Composite {
    /**
     * Adds a child to the composite.
     * @param child the child to add
     */
    void add(Composite child);
    
    /**
     * Removes a child from the composite.
     * @param child the child to remove
     */
    void remove(Composite child);
    
    /**
     * Returns the children of the composite.
     * @return the children of the composite
     */
    List<Composite> getChildren();
    
    /**
     * Returns the value of the composite.
     * @return the value of the composite
     */
    int getValue();
    
//    Iterator<Composite> iterator();
}