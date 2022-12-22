package com.patterns.observer;

/**
 * Concrete observer class that implements the Observer interface.
 * Observes updates from the subject and stores the latest value.
 */
public class ConcreteObserver implements Observer {
    /** The latest value received from the subject. */
    private int value;
    
    /**
     * Receives an update from the subject.
     *
     * @param value the updated value from the subject
     */
    @Override
    public void update(int value) {
        this.value = value;
        System.out.println("Observer received update: " + value);
    }
}