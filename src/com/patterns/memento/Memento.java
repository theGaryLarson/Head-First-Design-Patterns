package com.patterns.memento;

/**
 * The Memento class is a simple object that stores the state of the originator.
 * It has a private constructor and only the originator can create and access it through a public static factory method.
 */
class Memento {
    private final String state;
    
    /**
     * Constructs a Memento object with the given state.
     *
     * @param state the state of the originator
     */
    private Memento(String state) {
        this.state = state;
    }
    
    /**
     * Gets the state of the originator.
     *
     * @return the state of the originator
     */
    public String getState() {
        return state;
    }
    
    /**
     * Creates a new Memento object with the given state.
     *
     * @param state the state of the originator
     * @return the Memento object
     */
    public static Memento of(String state) {
        return new Memento(state);
    }
}