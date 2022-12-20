package com.patterns.chainofresponsibility;

/**
 * The client class that sends requests to the chain of handlers.
 */
public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {
        // create the chain of handlers
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNext(handlerB);
        handlerB.setNext(new DefaultHandler());
        
        // send requests to the chain of handlers (all sent to first handler in the chain)
        handlerA.handleRequest("A");
        handlerA.handleRequest("B");
        handlerA.handleRequest("C");
        //optimize - my optimization that uses a map but no longer considered chaining
//        RequestHandler.handleRequest("A");
//        RequestHandler.handleRequest("B");
//        RequestHandler.handleRequest("C");
        
    }
}
/*In this example, the Client class sends requests to the chain of handlers by calling the
handleRequest method on the first handler in the chain, handlerA. If handlerA is able to
handle the request, it will do so and print a message to the console. If it is not able to handle
the request, it will pass the request to the next handler in the chain, handlerB. If handlerB is
able to handle the request, it will do so and print a message to the console. If it is not able
to handle the request, it will pass the request on to the next handler in the chain, terminating with
the defaultHandler.*/

