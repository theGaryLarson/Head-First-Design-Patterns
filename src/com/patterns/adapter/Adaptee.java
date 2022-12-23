package com.patterns.adapter;

/**
 * The Adaptee class represents the class that has an incompatible interface with the client code.
 *
 * In the Adapter design pattern, the Adaptee class defines the methods and functionality that
 * the client code is not able to use directly. In this example, the Adaptee class has a
 * 3-dimensional vector interface, represented by the `getVector()` method, which returns a
 * Vector3d object. However, the client code expects a 2-dimensional vector interface, and
 * therefore cannot use the Adaptee class directly.
 *
 * The Adapter class acts as a bridge between the Adaptee and the client code, providing an
 * implementation of the 2-dimensional vector interface that delegates to the Adaptee's
 * 3-dimensional vector interface. This enables the client code to use an instance of the Adapter
 * as if it were a 2-dimensional vector, without needing to know that it is actually adapting
 * an Adaptee.
 */
public class Adaptee {
    /**
     * Gets a Vector3d object with the specified coordinates.
     *
     * @param x the x-coordinate of the vector
     * @param y the y-coordinate of the vector
     * @param z the z-coordinate of the vector
     * @return a Vector3d object with the specified coordinates
     */
    public Vector3d getVector(double x, double y, double z) {
        return new Vector3d(x, y, z);
    }
}