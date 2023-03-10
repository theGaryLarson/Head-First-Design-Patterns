package com.patterns.chainofresponsibility;

/**
 * A concrete handler that handles requests if it is able to, otherwise it passes
 * the request to the next handler in the chain.
 */
public class ConcreteHandlerA implements Handler {
    private Handler next;
    
    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            // handle the request
            //RequestBlob.Actor.secondAbil.Athletics.
            System.out.println("ConcreteHandlerA handled the request.");
        } else {
            // pass the request to the next handler
            next.handleRequest(request);
            // optimize - my optimization to handle requests that are not handled and to ensure the appropriate handler is called
            //  regardless of where it is passed in the chain
//            RequestHandler.handleRequest(request);
        }
    }
    
    @Override
    public void setNext(Handler handler) {
        next = handler;
    }
    
    // other methods...
}
