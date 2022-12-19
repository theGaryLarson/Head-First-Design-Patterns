package com.patterns.state;

/**
 * Another concrete implementation of the State interface.
 */
public class ConcreteStateB implements State {
    @Override
    public void handleAction(Context context) {
        System.out.println("Handling action in ConcreteStateB");
        context.setState(new ConcreteStateA());
    }
}
