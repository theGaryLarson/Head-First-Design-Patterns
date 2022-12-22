package com.patterns.bridge;

/**
 * The ConcreteImplementationA class is a concrete implementation of the Implementation interface.
 */
public class ConcreteImplementationA implements Implementation {
    @Override
    public void operationImpl() {
        // Implementation details
        System.out.println("Performing operation using implementation A");
    }
}
/*In this example, the Abstraction interface defines the operation that can be performed, and the
RefinedAbstraction class is a concrete implementation of the Abstraction interface. It contains a
reference to an Implementation object and delegates the call to the operationImpl method to this object.

The Implementation interface defines the implementation details of the operation, and the ConcreteImplementationA
and ConcreteImplementationB classes are concrete implementations of the Implementation interface. They provide
specific implementations for the operationImpl method.

The Client class is the main entry point for the application and creates an instance of a concrete
implementation of the Implementation interface. It then creates an instance of the RefinedAbstraction
class, passing in the concrete implementation as an argument. Finally, it calls the operation method
on the abstraction object, which in turn delegates the call to the operationImpl method of the concrete
implementation.

This example demonstrates how the Bridge pattern can be used to decouple an abstraction from its implementation,
allowing the two to vary independently. It also shows how the RefinedAbstraction class can use the operationImpl
method of the concrete implementation through delegation, without needing to know the specifics of the implementation.

This can be particularly useful when the implementation needs to be changed or updated frequently,
as it allows the abstraction to remain unchanged while the implementation is modified. It can also
improve the efficiency of the code by allowing the implementation to be optimized independently of
the abstraction.

However, it is important to note that the Bridge pattern can add an additional level of complexity
to the code, as it requires the creation of both an abstraction and an implementation. This can make
the code more difficult to understand and maintain.*/
