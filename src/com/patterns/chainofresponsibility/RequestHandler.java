package com.patterns.chainofresponsibility;

import java.util.HashMap;
import java.util.Map;

/**
 * my optimization of this code from chatgpt
 *
 * @author garyl
 *
 * A class that stores the mapping of requests to their corresponding handlers and
 * provides a method for handling requests.
 */
public class RequestHandler {
    private static Map<String, Handler> requestHandlers = new HashMap<>();
    static {
        requestHandlers.put("A", new ConcreteHandlerA());
        requestHandlers.put("B", new ConcreteHandlerB());
    }
    private static DefaultHandler defaultHandler = new DefaultHandler();
    
    public static void handleRequest(String request) {
        Handler handler = requestHandlers.get(request);
        if (handler != null) {
            handler.handleRequest(request);
        } else {
            defaultHandler.handleRequest(request);
        }
    }
}
