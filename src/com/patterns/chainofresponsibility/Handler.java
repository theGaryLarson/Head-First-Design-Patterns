package com.patterns.chainofresponsibility;

/**
 * The base interface for objects in the chain.
 */
public interface Handler {
    /**
     * Handles the request.
     *
     * @param request the request to handle
     */
    void handleRequest(String request);
    
    /**
     * Sets the next handler in the chain.
     *
     * @param handler the next handler
     */
    void setNext(Handler handler);
}