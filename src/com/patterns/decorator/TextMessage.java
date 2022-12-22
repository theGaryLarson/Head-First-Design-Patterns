package com.patterns.decorator;


/**
 * The TextMessage class is a concrete object in the decorator design pattern.
 * It represents a text message with a specific content.
 */
public class TextMessage implements Message {
    /**
     * The content of the text message.
     */
    private String content;
    
    /**
     * Constructor to create a new TextMessage object with the given content.
     *
     * @param content the content of the text message
     */
    public TextMessage(String content) {
        this.content = content;
    }
    
    /**
     * Returns the content of the text message.
     *
     * @return the content of the text message
     */
    @Override
    public String getContent() {
        return content;
    }
}

/*In this example, the TextMessage class is a concrete object in the decorator design pattern.
It represents a text message with a specific content.

The TextMessage class has a field called content that holds the content of the text message.
It has a constructor that takes a String object as an argument and assigns it to the content field.
It also has an overridden getContent() method, which returns the content of the text message.

The TextMessage class is a concrete implementation of the Message interface, which defines the common behavior
of all objects in the decorator pattern. It is the original object that we want to add new behavior to using
the decorator pattern.*/