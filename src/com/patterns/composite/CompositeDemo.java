package com.patterns.composite;

/**
 * A class that demonstrates the use of the Composite pattern.
 */
public class CompositeDemo {
    public static void main(String[] args) {
        // Create a composite node with two leaf nodes
        ConcreteComposite composite1 = new ConcreteComposite(1);
        composite1.add(new Leaf(2));
        composite1.add(new Leaf(3));
        
        // Create a composite node with two leaf nodes and add it to the root
        ConcreteComposite composite2 = new ConcreteComposite(4);
        composite2.add(new Leaf(5));
        composite2.add(new Leaf(6));
        composite1.add(composite2);
        
        // Create a composite node with a leaf node and add it to the root
        ConcreteComposite composite3 = new ConcreteComposite(7);
        composite3.add(new Leaf(8));
        composite1.add(composite3);
        
        // Print the value of each node in the tree
        printValues(composite1);
        System.out.println("Iterator Demo");
        System.out.println();
        for(Composite c : composite1.getChildren()) {
            printValues(c);
        }
        System.out.println("Removing --> composite1.getChildren().get(0) = " +
                composite1.getChildren().get(0).getValue());
        System.out.println("**Remember the value 1 is stored in the Composite and children are Leaf objects");
        composite1.remove(composite1.getChildren().get(0));
        printValues(composite1);
    }
    
    /**
     * Recursively prints the value of each node in the tree rooted at the given composite.
     * @param composite the root of the tree
     */
    public static void printValues(Composite composite) {
        System.out.println(composite.getValue());
        for (Composite child : composite.getChildren()) {
            printValues(child);
        }
    }
}

/*In the CompositeDemo class, the main() method creates a composite tree with a root node and several leaf nodes.
It then uses the printValues() method to recursively print the value of each node in the tree. The output of the
CompositeDemo class would be the numbers 1, 2, 3, 4, 5, 6, each printed on a separate line.*/

/*The add() and remove() methods of the Leaf class throw UnsupportedOperationException because the Leaf class
represents a leaf node in a tree-like structure, which cannot have children. Therefore, it does not make sense to
add or remove children from a leaf node.

In the Composite pattern, the Composite interface represents both composite objects (which can have children) and
leaf objects (which cannot have children). The Leaf class implements the Composite interface, but it does not provide
an implementation for the add() and remove() methods, because these methods do not make sense for a leaf object.
Instead, the Leaf class throws an UnsupportedOperationException when these methods are called, to indicate that the
operation is not supported.

This allows the client to treat both composite objects and leaf objects in a uniform manner, without needing to know
the specifics of the objects' implementations. The client can call the add() and remove() methods on both composite
and leaf objects, and the appropriate implementation will be used depending on the type of object.*/

