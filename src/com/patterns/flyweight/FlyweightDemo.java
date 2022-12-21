package com.patterns.flyweight;

/**
 * The Client class uses the Flyweight objects.
 */
public class FlyweightDemo {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        
        Flyweight flyweight1 = flyweightFactory.getFlyweight("key1");
        Flyweight flyweight2 = flyweightFactory.getFlyweight("key2");
        Flyweight flyweight3 = flyweightFactory.getFlyweight("key1");
        
        flyweight1.operation(1);
        flyweight2.operation(2);
        flyweight3.operation(3);
        
        // Create an unshared flyweight
        Flyweight flyweight4 = new UnsharedConcreteFlyweight("unshared data");
        flyweight4.operation(4);
    }
}
/*In this example, the ConcreteFlyweight class represents the flyweight object that stores intrinsic
data, while the UnsharedConcreteFlyweight class represents a flyweight object that stores extrinsic
data. The FlyweightFactory class acts as a factory for creating flyweight objects, and the FlyweightDemo class
uses the flyweight objects.*/

/*OUTPUT:
Intrinsic Data: key1
Extrinsic Data: 1
Intrinsic Data: key2
Extrinsic Data: 2
Intrinsic Data: key1
Extrinsic Data: 3
Extrinsic Data: unshared data
Extrinsic State: 4

In this output, you can see that the first three lines show the intrinsic data of the flyweight
objects and the extrinsic data that was passed to the operation method. The last line shows the
extrinsic data of the unshared flyweight object and the extrinsic state that was passed to the
operation method.*/