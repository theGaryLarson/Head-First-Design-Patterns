package com.patterns.state;

/**
 * A concrete implementation of the State interface.
 */
public class ConcreteStateA implements State {
    @Override
    public void handleAction(Context context) {
        System.out.println("Handling action in ConcreteStateA");
        context.setState(new ConcreteStateB());
    }
}
