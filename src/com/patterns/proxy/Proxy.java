package com.patterns.proxy;

/**
 * Proxy class.
 * Maintains a reference to the RealSubject and controls access to it.
 */
public class Proxy implements Subject {
    
    private RealSubject realSubject;
    
    @Override
    public void request() {
        // Perform some actions before forwarding the request to the real subject.
        System.out.println("Preprocessing before forwarding request.");
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
        // Perform some actions after forwarding the request to the real subject.
        System.out.println("Postprocessing after forwarding request.");
    }
}

