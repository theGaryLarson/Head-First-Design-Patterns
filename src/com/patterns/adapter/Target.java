package com.patterns.adapter;

/**
 * The Target interface represents the interface that the client code expects.
 *
 * In the Adapter design pattern, the Target interface defines the methods that the Client
 * expects to be able to use when interacting with a particular class. In this example,
 * the Target interface defines a single method `getVector()` that returns a Vector2d
 * object.
 *
 * Classes that implement the Target interface are expected to be able to provide an
 * implementation of the `getVector()` method. In this way, the Client can use the Target
 * interface to interact with these classes without needing to know the specific details
 * of their implementation.
 */
public interface Target {
    
    /**
     * Gets a Vector2d object with the specified coordinates.
     *
     * @param x the x-coordinate of the vector
     * @param y the y-coordinate of the vector
     * @return a Vector2d object with the specified coordinates
     */
    Vector2d getVector(double x, double y);
}