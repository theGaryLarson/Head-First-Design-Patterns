package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete subject class that implements the Subject interface.
 * Stores a list of observers and provides methods for attaching and detaching
 * observers, as well as for updating them when the subject's value changes.
 */
public class ConcreteSubject implements Subject {
    /** List of observers subscribed to this subject. */
    private final List<Observer> observers = new ArrayList<>();
    /** The value of this subject. */
    private int value;
    
    /**
     * Sets the value of this subject.
     *
     * @param value the new value of this subject
     */
    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
    
    /**
     * Attaches an observer to this subject.
     *
     * @param o the observer to attach
     */
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }
    
    /**
     * Detaches an observer from this subject.
     *
     * @param o the observer to detach
     */
    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
    
    /**
     * Notifies all observers of an update to this subject's value.
     */
    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(value);
        }
    }
}
