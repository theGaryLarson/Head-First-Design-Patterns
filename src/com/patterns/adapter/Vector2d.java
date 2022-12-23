package com.patterns.adapter;
/**
 * The Vector2d class represents a 2D vector with x and y coordinates.
 * Used to demonstrate Adapter Pattern
 */
public class Vector2d {
    private double x;
    private double y;
    
    public Vector2d(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double magnitude() {
        return Math.sqrt(x*x + y*y);
    }
}
