package com.patterns.command;

/**
 * The CommandPatternDemo class represents the object that creates and uses the Command objects.
 */
class CommandDemo {
    
    /**
     * Demonstrates the use of the Command pattern by creating a Receiver, a ConcreteCommand
     * object that is associated with the Receiver, and an Invoker that is associated with the
     * ConcreteCommand. The Invoker is then used to invoke the command.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.invoke();
    }
}