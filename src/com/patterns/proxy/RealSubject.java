package com.patterns.proxy;

/**
 * RealSubject class.
 * Defines the real object that the proxy represents.
 */
public class RealSubject implements Subject {
    
    @Override
    public void request() {
        System.out.println("Performing request on real subject.");
    }
}