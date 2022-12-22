package com.patterns.state;

/**
 * A class that demonstrates the use of the State pattern.
 */
public class StateDemo {
    public static void main(String[] args) {
        Context context = new Context(new ConcreteStateA());
        context.performAction(); // Output: "Handling action in ConcreteStateA"
        context.performAction(); // Output: "Handling action in ConcreteStateB"
        context.performAction(); // Output: "Handling action in ConcreteStateA"
    }
}
/*In this example, the Context class represents the current state of an object and the State interface defines
 the behavior for different states. The ConcreteStateA and ConcreteStateB classes are concrete implementations
 of the State interface that define the behavior for the "A" and "B" states of the context, respectively.

The performAction() method of the Context class is used to perform an action on the context. When this method is
called, it delegates the handling of the action to the current state object through the handleAction() method of
the State interface. The current state object can then perform any state-specific behavior and, if necessary, change
the state of the context by calling the setState() method.*/