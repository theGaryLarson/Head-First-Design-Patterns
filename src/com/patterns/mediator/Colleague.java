package com.patterns.mediator;

/**
 * The Colleague interface defines the methods for communication with the Mediator.
 */
public interface Colleague {
    void receive(String message);
    void setMediator(Mediator mediator);
}
