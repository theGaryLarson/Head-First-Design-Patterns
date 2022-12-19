package com.patterns.observer;

/**
 * Demonstrates the use of the Observer design pattern.
 *
 * The client code creates a {@link ConcreteSubject} and two {@link ConcreteObserver}s. It registers
 * the observers with the subject and updates the subject's value. The observers receive updates from
 * the subject and print the new value to the console. The client then removes one of the observers
 * and updates the subject again, resulting in only one observer receiving the update.
 *
 * @see ConcreteSubject
 * @see ConcreteObserver
 */
public class ObserverDemo {
    
    /**
     * Main method that runs the demonstration.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        
        subject.registerObserver(observer1);
        subject.registerObserver(observer2);
        
        subject.setValue(5);  // Output: "Observer received update: 5"
        subject.setValue(10); // Output: "Observer received update: 10"
        
        subject.removeObserver(observer1);
        
        subject.setValue(15); // Output: "Observer received update: 15"
    }
    /*In this example, we have a ConcreteSubject class that implements the Subject interface and maintains a list of
     Observer objects. The ConcreteSubject class has a setValue method that sets the value of the subject and notifies
     its observers of the change.
     
     We also have a ConcreteObserver class that implements the Observer interface and has
     an update method that is called when the subject's value changes. The update method prints a message to the
     console indicating that the observer has received an update.
     
     In the client code, we create an instance ofConcreteSubject and two instances of ConcreteObserver. We register the
     two observers with the subject and set the value of the subject several times. The observers are notified of the
     changes and print messages to the console indicating that they have received updates. Finally, we remove one of
     the observers and set the value of the subject again, which demonstrates that the removed observer is no longer
     notified of the change.*/
}
