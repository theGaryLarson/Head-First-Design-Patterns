package com.patterns.adapter;

import com.geometry.Vector2d;

/**
 * Demonstration class for the Adapter design pattern.
 *
 * The Adapter design pattern allows a class to be adapted to a different interface,
 * enabling it to be used in a scenario where it would otherwise be incompatible. In this
 * example, the Adaptee class has a method `getVector()` that returns a Vector2d object,
 * but the Client class expects a `Target` interface to be used. The Adapter class
 * implements the Target interface and wraps an instance of the Adaptee, providing an
 * implementation of the `getVector()` method that delegates to the Adaptee's method.
 *
 * This enables the Client to use an instance of the Adapter as if it were a Target,
 * without needing to know that it is actually adapting an Adaptee.
 */
public class AdapterDemo {
    /**
     * The main method for the AdapterDemo class.
     *
     * This method creates an Adaptee and an Adapter, and then passes the Adapter to the
     * Client. The Client calls the `getVector()` method on the Adapter, which delegates
     * to the Adaptee's `getVector()` method and returns the resulting Vector2d object.
     * The magnitude of the Vector2d is then calculated and printed to the console.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        // Create an Adaptee
        Adaptee adaptee = new Adaptee();
        
        // Create an Adapter that wraps the Adaptee
        Target target = new Adapter(adaptee);
        
        // Create a Client
        Client client = new Client();
        
        // Call the getVector() method on the Adapter, using the Adaptee's implementation
        Vector2d vec = client.getVector(target, 3, 4);
        
        // Calculate the magnitude of the Vector2d
        double magnitude = vec.magnitude();
        
        // Print the magnitude to the console
        System.out.println("Magnitude: " + magnitude);  // Outputs "Magnitude: 5.0"
    }
}

/*The AdapterDemo class demonstrates the usage of the Adapter pattern by using the Adaptee, Target, Vector2d,
and Adapter classes to convert a 3D vector into a 2D vector and calculate its magnitude.

The steps that the AdapterDemo class takes to implement the Adapter pattern:

1. The Adaptee class is instantiated. This class represents the class that has an incompatible interface
 with the client code.

2. The Adapter class is instantiated, passing in the Adaptee object as an argument.
This class converts the Adaptee's interface into the Target interface.

3. The Client class is instantiated. This class uses the Target interface to call the getVector method.

4. The getVector method of the Client class is called, passing in the Target object and the x and y coordinates
of the 3D vector as arguments.

5. The getVector method of the Target interface is called, which is implemented in the Adapter class.
This method calls the getVector method of the Adaptee class to retrieve the 3D vector and creates a
new Vector2d object using the x and y coordinates of the 3D vector.

6. The Vector2d object is returned to the Client class, which calls the magnitude method of the Vector2d class to calculate the magnitude of the 2D vector.

7. The magnitude of the 2D vector is printed to the console.*/
