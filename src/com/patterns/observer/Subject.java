package com.patterns.observer;

/**
 * The subject in the Observer design pattern.
 *
 * <p>A subject maintains a list of its observers and provides an interface for adding or removing
 * observers. It also provides a method for updating its observers when its state changes.
 *
 * @see Observer
 */
public interface Subject {
    
    /**
     * Registers an observer with the subject.
     *
     * @param o the observer to register
     */
    void registerObserver(Observer o);
    
    /**
     * Removes an observer from the subject.
     *
     * @param o the observer to remove
     */
    void removeObserver(Observer o);
    
    /**
     * Notifies all registered observers when the subject's state changes.
     */
    void notifyObservers();
}