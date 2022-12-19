package com.patterns.command;

/**
 * The ConcreteCommand class represents a concrete implementation of the Command interface. It
 * defines a binding between the Receiver and an action.
 */
class ConcreteCommand implements Command {
    private final Receiver receiver;
    
    /**
     * Constructs a new ConcreteCommand object with the given Receiver.
     *
     * @param receiver the Receiver object that this command will be associated with
     */
    ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    
    
    /**
     * Executes the command by calling the action() method on the Receiver.
     */
    @Override
    public void execute() {
        receiver.action();
    }
}
