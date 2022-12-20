package com.patterns.chainofresponsibility;

/**
 * The default handler that handles any requests that are not handled by the other
 * handlers in the chain.
 */
public class DefaultHandler implements Handler {
    @Override
    public void handleRequest(String request) {
        // handle the request in a default way, such as logging it or returning a default response
        System.out.println("DefaultHandler: Unhandled request - " + request);
    }
    
    @Override
    public void setNext(Handler handler) {
        // the default handler does not have a next handler, so this method can be left empty
    }
}
