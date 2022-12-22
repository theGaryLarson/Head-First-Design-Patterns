package com.patterns.command;

/**
 * The Invoker class represents the object that initiates the request. It maintains a reference
 * to the Command object and invokes the execute() method when the request is made.
 */
class Invoker {
    private Command command;
    
    void setCommand(Command command) {
        this.command = command;
    }
    
    void invoke() {
        command.execute();
    }
}