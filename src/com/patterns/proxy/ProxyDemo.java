package com.patterns.proxy;

/**
 * Client class.
 * Uses the Subject interface to access the real subject or proxy.
 */
public class ProxyDemo {
    
    public static void main(String[] args) {
        Subject subject = new Proxy();
        subject.request();
    }
}
/*demonstrates how the Proxy class can intercept a request to the RealSubject and perform some actions
before and after forwarding the request. It also shows how the client can use the Subject interface to
access the real subject or proxy without knowing the implementation details.*/
