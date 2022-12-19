package com.patterns.adapter;

import com.geometry.Vector2d;
import com.geometry.Vector3d;

/**
 * The Adapter class is a class that adapts an Adaptee to the Target interface, enabling
 * the client code to use the Adaptee through the Target interface.
 *
 * In the Adapter design pattern, the Adapter class implements the Target interface and
 * wraps an instance of the Adaptee. The Adapter class provides an implementation of the
 * Target interface's methods that delegate to the Adaptee's methods.
 *
 * This enables the client code to use an instance of the Adapter as if it were a Target,
 * without needing to know that it is actually adapting an Adaptee.
 *
 * In this example, the Adapter class converts the Adaptee's 3-dimensional vector interface
 * into a 2-dimensional vector interface, by discarding the z-coordinate and returning a
 * new Vector2d object with the x- and y-coordinates of the Adaptee's Vector3d object.
 */
public class Adapter implements Target {
    /**
     * The Adaptee being adapted by this Adapter.
     */
    private Adaptee adaptee;
    
    /**
     * Constructs a new Adapter that wraps the specified Adaptee.
     *
     * @param adaptee the Adaptee to wrap
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
    
    /**
     * Gets a Vector2d object with the specified coordinates, using the Adaptee's
     * 3-dimensional vector interface.
     *
     * This method delegates to the Adaptee's `getVector()` method to obtain a
     * Vector3d object, and then discards the z-coordinate and returns a new Vector2d
     * object with the x- and y-coordinates of the Vector3d object.
     *
     * @param x the x-coordinate of the vector
     * @param y the y-coordinate of the vector
     * @return a Vector2d object with the specified coordinates
     */
    @Override
    public Vector2d getVector(double x, double y) {
        // Delegate to the Adaptee's getVector() method to obtain a Vector3d object
        Vector3d vec3d = adaptee.getVector(x, y, 0);
        
        // Discard the z-coordinate and return a new Vector2d object with the x- and y-coordinates
        return new Vector2d(vec3d.getX(), vec3d.getY());
    }
}