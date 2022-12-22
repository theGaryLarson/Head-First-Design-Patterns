package com.patterns.state;

/**
 * The context class in the State pattern.
 */
public class Context {
    private State state;
    
    /**
     * Constructs a new Context with the given initial state.
     * @param initialState the initial state of the context
     */
    public Context(State initialState) {
        this.state = initialState;
    }
    
    /**
     * Sets the state of the context.
     * @param state the new state of the context
     */
    public void setState(State state) {
        this.state = state;
    }
    
    /**
     * Performs an action on the context.
     */
    public void performAction() {
        state.handleAction(this);
    }
}