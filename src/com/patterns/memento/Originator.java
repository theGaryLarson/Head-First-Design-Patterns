package com.patterns.memento;

/**
 * The Originator class represents the object whose state needs to be saved and restored.
 * It has a createMemento() method that creates a Memento object and saves the current state of the originator.
 * It also has a restore(Memento m) method that restores the originator to the state saved in the Memento object.
 */
class Originator {
    private String state;
    
    /**
     * Sets the state of the originator.
     *
     * @param state the new state of the originator
     */
    public void setState(String state) {
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
     * Creates a Memento object and saves the current state of the originator.
     *
     * @return the Memento object
     */
    public Memento createMemento() {
        return Memento.of(state);
    }
    
    /**
     * Restores the originator to the state saved in the Memento object.
     *
     * @param m the Memento object
     */
    public void restore(Memento m) {
        state = m.getState();
    }
}