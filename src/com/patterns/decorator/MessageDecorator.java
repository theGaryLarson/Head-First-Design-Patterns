package com.patterns.decorator;

/**
 * The MessageDecorator abstract class is a decorator in the decorator design pattern.
 * It provides the basic decorator functionality, which allows concrete decorator classes
 * to add new behavior to the decorated object.
 */
public abstract class MessageDecorator implements Message {
    /**
     * The decorated message object.
     */
    protected Message message;
    
    /**
     * Constructor to create a new MessageDecorator decorator for the given message.
     *
     * @param message the message to be decorated
     */
    public MessageDecorator(Message message) {
        this.message = message;
    }
    
    /**
     * Returns the content of the decorated message.
     *
     * @return the content of the decorated message
     */
    @Override
    public String getContent() {
        return message.getContent();
    }
}
