package com.patterns.iterator;

import java.util.Arrays;
import java.util.List;

/**
 * A class that demonstrates the use of the Iterator pattern.
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<Object> elements = Arrays.asList(1, 2, 3, 4, 5);
        ConcreteCollection collection = new ConcreteCollection(elements);
        
        // Iterate over the elements of the collection using the iterator
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }
        
        // Iterate over the elements of the collection using a for-each loop
        for (Object element : elements) {
            System.out.println(element);
        }
    }
}