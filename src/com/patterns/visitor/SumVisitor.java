package com.patterns.visitor;

/**
 * A concrete visitor implementation that adds the element's value to a running total.
 */
public class SumVisitor implements Visitor {
    private int total;
    
    @Override
    public void visit(ConcreteElementA element) {
        total += element.getValue();
    }
    
    @Override
    public void visit(ConcreteElementB element) {
        total += element.getValue();
    }
    
    public int getTotal() {
        return total;
    }
}
