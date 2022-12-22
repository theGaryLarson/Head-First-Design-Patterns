package com.patterns.decorator;

/**
 * The CompressedMessage class is a concrete decorator in the decorator design pattern.
 * It adds the ability to compress the content of a message to the decorated message.
 */
public class CompressedMessage extends MessageDecorator {
    /**
     * Constructor to create a new CompressedMessage decorator for the given message.
     *
     * @param message the message to be decorated
     */
    public CompressedMessage(Message message) {
        super(message);
    }
    
    /**
     * Returns the content of the decorated message, after compressing it.
     *
     * @return the content of the decorated message, after compressing it
     */
    @Override
    public String getContent() {
        // Compress the content of the message
        String compressedContent = compress(super.getContent());
        return compressedContent;
    }
    
    /**
     * Compresses the given content using a specific algorithm.
     *
     * @param content the content to be compressed
     * @return the compressed content
     */
    private String compress(String content) {
        // Implementation of compression algorithm goes here
        return "compress(" + content + ")";
    }
}