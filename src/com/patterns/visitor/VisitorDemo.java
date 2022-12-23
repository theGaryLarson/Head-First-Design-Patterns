package com.patterns.visitor;

/**
 * The client code.
 */
public class VisitorDemo {
    public static void main(String[] args) {
        Element elementA = new ConcreteElementA(10);
        Element elementB = new ConcreteElementB(20);
        SumVisitor visitor = new SumVisitor();
        elementA.accept(visitor);
        elementB.accept(visitor);
        int total = visitor.getTotal();
        System.out.println("Total: " + total);  // Outputs "Total: 30"
    }
}
/*In this example, there are two concrete element implementations: ConcreteElementA
and ConcreteElementB. Both of these classes have a value field and a getValue method.
There is also a concrete visitor implementation called SumVisitor, which has a total
field and a getTotal method. The SumVisitor's visit methods add the element's value
to the total field.

The client code creates two Element instances, a SumVisitor instance,
and calls the accept method on each Element with the SumVisitor as an argument. This
causes the SumVisitor's visit methods to be called, adding the values of each Element
to the total field. Finally, the client code retrieves the total value by calling the
getTotal method on the SumVisitor and outputs it to the console.

This example demonstrates how the Visitor pattern can be used to perform an operation
on a set of elements without modifying the elements themselves. It also illustrates
how the Visitor pattern promotes the separation of concerns, as the Element classes
are responsible for storing and organizing data, while the SumVisitor is responsible
for performing an operation on that data.*/
