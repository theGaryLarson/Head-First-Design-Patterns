package com.patterns.visitor;

/**
 * The base element interface.
 */
public interface Element {
    /**
     * Accepts a visitor.
     * @param visitor the visitor to accept
     */
    void accept(Visitor visitor);
    
    /**
     * Returns the element's value.
     * @return the element's value
     */
    int getValue();
}
