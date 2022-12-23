package com.patterns.abstractfactory;

/**
 * The client code.
 */
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();
    
        AbstractFactory factory2 = new ConcreteFactory2();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();
        
        // Use the products
        System.out.println("Product A1: " + productA1.getName());  // Outputs "Product A1: Product A1"
        System.out.println("Product B1: " + productB1.getName());  // Outputs "Product B1: Product B1"
    
        System.out.println("Product A2: " + productA2.getName());  // Outputs "Product A2: Product A2"
        System.out.println("Product B2: " + productB2.getName());  // Outputs "Product B2: Product B2"
    }
}
/*In this example, the ProductA and ProductB interfaces define a getName method, which returns a
string representation of the product. The `Concrete ProductA1, ConcreteProductA2, ConcreteProductB1,
and ConcreteProductB2classes implement the getName` method to return a unique string for each product.

The client code creates a ConcreteFactory1 and ConcreteFactory2 instance and uses them to create the products
ProductA1, ProductB1, ProductA2, and ProductB2 respectively. It then calls the getName method on
each product and outputs the result to the console. This demonstrates how the ProductA and ProductB objects
can be used in the client code.

This revised example still demonstrates the key features of the Abstract Factory pattern: it allows
you to create a set of related objects without specifying their concrete classes, and it promotes the
separation of concerns by separating the creation of objects from their use.*/
