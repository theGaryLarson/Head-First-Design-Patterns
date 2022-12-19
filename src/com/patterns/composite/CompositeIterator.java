package com.patterns.composite;

import java.util.Iterator;
import java.util.Stack;

/**
 * This is not needed and functionality has been commented out. It's here merely as a mental exercise and is a
 * distraction from the Composite Pattern. It is worth noting though. That we are still able to iterate over the
 * elements because they are stored in an ArrayList and we leverage its iterator.
 */
public class CompositeIterator implements Iterator<Composite> {
    private Stack<Iterator<Composite>> stack;
    private Composite current;
    
    public CompositeIterator(Composite root) {
        this.stack = new Stack<>();
        this.current = root;
    }
    
    @Override
    public boolean hasNext() {
        return !stack.isEmpty() || current != null;
    }
    
    @Override
    public Composite next() {
        while (current != null) {
            stack.push(current.getChildren().iterator());
            current = current.getChildren().iterator().next();
        }
        
        Iterator<Composite> it = stack.pop();
        Composite next = it.next();
        if (it.hasNext()) {
            current = it.next();
        } else {
            current = null;
        }
        return next;
    }
}
