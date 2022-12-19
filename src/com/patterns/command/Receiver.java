package com.patterns.command;

/**
 * The Receiver class knows how to perform the operations associated with carrying out a request.
 */
class Receiver {
    /**
     * performs the requested action
     */
    void action() {
        System.out.println("requested action performed.");
    }
}
