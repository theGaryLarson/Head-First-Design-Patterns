package com.patterns.decorator;

/**
 * The Message interface defines the common behavior of all objects in the decorator design pattern.
 */
public interface Message {
    /**
     * Returns the content of the message.
     *
     * @return the content of the message
     */
    String getContent();
}