package com.patterns.adapter;

import com.geometry.Vector2d;

/**
 * The Client class uses the Target interface to call the getVector method.
 */
public class Client {
    public Vector2d getVector(Target target, double x, double y) {
        return target.getVector(x, y);
    }
}