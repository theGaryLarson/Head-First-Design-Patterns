package com.patterns.decorator;

/**
 * The DecoratorDemo class is a client that uses the decorator design pattern to add new behavior
 * to an existing object dynamically, without using inheritance.
 */
public class DecoratorDemo {
    
    /**
     * Main method to run the client code.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Create a new TextMessage object
        Message message = new TextMessage("Hello, World!");
        
        // Wrap the TextMessage object in an EncryptedMessage and a CompressedMessage decorator, in that order
        message = new EncryptedMessage(message);
        message = new CompressedMessage(message);
        
        // Get the content of the decorated message
        String content = message.getContent();
        System.out.println(content);
    }
    
    /*In this example, the TextMessage class represents the original object that we want to add new behavior to.
     The MessageDecorator abstract class and the EncryptedMessage and CompressedMessage concrete decorator classes
     represent the wrapper classes that add new behavior to the original object. The Message interface represents
     the component interface that defines the common behavior of all objects in the system, including both the
     original object and the decorator objects.
     
     The client code in the Main class creates a new TextMessage object and then wraps it in an
     EncryptedMessage and a CompressedMessage decorator, in that order. When the getContent() method is called on the
     final message object, it will first call the getContent() method of the CompressedMessage decorator, which will
     in turn call the getContent() method of the EncryptedMessage decorator, which will in turn call the getContent()
     method of the original TextMessage object. This allows the EncryptedMessage and CompressedMessage decorators to
     modify the content of the message before it is returned to the client
     
     In summary, the Decorator pattern is a useful technique for adding new behavior to existing objects dynamically,
     without using inheritance. It can be a flexible alternative to inheritance, but it can also result in a large
     number of small, interconnected objects that can be more difficult to understand and maintain.
     */
}
