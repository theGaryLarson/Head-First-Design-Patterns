package com.geometry;

/**
 * The Vector3d class represents a 3D vector with x, y, and z coordinates.
 * Used to demonstrate Adapter Pattern
 */
public class Vector3d {
    private double x;
    private double y;
    private double z;
    
    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double getZ() {
        return z;
    }
}
