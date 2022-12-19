package com.patterns.decorator;

/**
 * The EncryptedMessage class is a concrete decorator in the decorator design pattern.
 * It adds the ability to encrypt the content of a message to the decorated message.
 */
public class EncryptedMessage extends MessageDecorator {
    /**
     * Constructor to create a new EncryptedMessage decorator for the given message.
     *
     * @param message the message to be decorated
     */
    public EncryptedMessage(Message message) {
        super(message);
    }
    
    /**
     * Returns the content of the decorated message, after encrypting it.
     *
     * @return the content of the decorated message, after encrypting it
     */
    @Override
    public String getContent() {
        // Encrypt the content of the message
        return encrypt(super.getContent());
    }
    
    /**
     * Encrypts the given content using a specific algorithm.
     *
     * @param content the content to be encrypted
     * @return the encrypted content
     */
    private String encrypt(String content) {
        // Implementation of encryption algorithm goes here
        return "encrypt(" + content + ")";
    }
}
