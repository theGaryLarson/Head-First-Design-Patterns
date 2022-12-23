package com.patterns.visitor;

/**
 * The base visitor interface.
 */
public interface Visitor {
    /**
     * Visits a concrete element.
     * @param element the element to visit
     */
    void visit(ConcreteElementA element);
    
    /**
     * Visits another concrete element.
     * @param element the element to visit
     */
    void visit(ConcreteElementB element);
}
