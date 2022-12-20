package com.patterns.chainofresponsibility;

/**
 * A concrete handler that handles requests if it is able to, otherwise it passes
 * the request to the next handler in the chain.
 */
public class ConcreteHandlerB implements Handler {
    private Handler next;
    
    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            // handle the request
            System.out.println("ConcreteHandlerB handled the request.");
        } else {
            // pass the request to the next handler
//            next.handleRequest(request);
            // optimize - my optimization to handle requests that are not handled and to ensure the appropriate handler is called
            //  regardless of where it is passed in the chain
            RequestHandler.handleRequest(request);
        }
    }
    
    @Override
    public void setNext(Handler handler) {
        next = handler;
    }
    
    // other methods...
}
