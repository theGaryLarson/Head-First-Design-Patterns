package com.patterns.mediator;

/**
 * The Client class demonstrates use of the Mediator pattern.
 */
public class MediatorDemo {
    public static void main(String[] args) {
        // create mediator
        ConcreteMediator mediator = new ConcreteMediator();
        
        // create colleagues
        ConcreteColleague colleague1 = new ConcreteColleague();
        ConcreteColleague colleague2 = new ConcreteColleague();
        
        // set mediator for colleagues
        colleague1.setMediator(mediator);
        colleague2.setMediator(mediator);
        
        // set colleagues for mediator
        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);
        
        // send messages through mediator
        colleague1.send("Hello, colleague 2!");
        colleague2.send("Hello, colleague 1!");
    }
}
/*In the example, the Mediator interface defines the method send, which takes a message and a
colleague as arguments and allows the mediator to send a message to a colleague. The Colleague
interface defines the methods receive, which takes a message as an argument and allows a colleague
to receive a message, and setMediator, which takes a mediator as an argument and allows a colleague
to set its mediator.

The ConcreteMediator class implements the Mediator interface and coordinates communication between
Colleague objects. It has two fields for storing references to the Colleague objects, colleague1 and
colleague2. The setColleague1 and setColleague2 methods allow the mediator to set these references.
The send method in the ConcreteMediator class receives a message and a colleague as arguments and sends
the message to the other colleague.

The ConcreteColleague class represents a Colleague that can communicate with other colleagues through a
mediator. It has a field for storing a reference to its mediator, and the setMediator method allows the
colleague to set this reference. The receive method in the ConcreteColleague class receives a message as
an argument and prints a message indicating that the colleague has received the message. The send method
in the ConcreteColleague class sends a message to the mediator, which will then forward the message to
the other colleague.

The Client class demonstrates how the mediator pattern can be used by creating a ConcreteMediator object
and two ConcreteColleague objects. It sets the mediator for the colleagues and the colleagues for the mediator,
and then sends messages between the colleagues through the mediator using the send method.*/