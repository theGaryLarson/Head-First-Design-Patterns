package com.patterns.prototype;

/**
 * The client class that uses the prototype.
 */
public class PrototypeDemo {
    public static void main(String[] args) {
        // Create a prototype object
        ConcretePrototype prototype = new ConcretePrototype("prototype property 1", 123, true);
        
        // Clone the prototype object to create a new instance
        ConcretePrototype clone = prototype.clone();
        System.out.println(clone.getProperty1()); // Outputs "prototype property 1"
        System.out.println(clone.getProperty2()); // Outputs 123
        System.out.println(clone.isProperty3()); // Outputs true
    }
}
/*To use the prototype pattern in your code, you will need to do the following:

Create a prototype interface that defines the clone() method. This method should return an
instance of the prototype object.

Create a concrete prototype class that implements the prototype interface. This class should
define the properties and behavior of the object being cloned. It should also implement the
clone() method from the prototype interface, which should return a new instance of the concrete
prototype class with the same property values as the original object.

In the client class, create an instance of the concrete prototype class. This will be the prototype
object that will be used to create new instances through cloning.

To create a new instance of the object, call the clone() method on the prototype object.
This will return a new instance of the concrete prototype class with the same property
values as the original object.

You can then use the cloned object as you would any other object, modifying its property
values or calling its methods as needed.*/