package com.patterns.state;

/**
 * The State interface in the State pattern.
 */
public interface State {
    /**
     * Handles an action on the given context.
     * @param context the context on which the action is performed
     */
    void handleAction(Context context);
}