package com.patterns.mediator;

/**
 * The ConcreteColleague class represents a Colleague that can communicate with other Colleagues through the Mediator.
 */
public class ConcreteColleague implements Colleague {
    private Mediator mediator;
    
    @Override
    public void receive(String message) {
        System.out.println("Colleague received message: " + message);
    }
    
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    
    public void send(String message) {
        System.out.println("Colleague sending message: " + message);
        mediator.send(message, this);
    }
}
