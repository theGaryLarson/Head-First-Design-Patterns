package com.patterns.mediator;

/**
 * The Mediator interface defines the methods for communication between Colleague objects.
 */
public interface Mediator {
    void send(String message, Colleague colleague);
}
