package com.patterns.memento;

/**
 * The MementoDemo class demonstrates the use of the Memento pattern.
 * This class creates an Originator and a Caretaker object, and then demonstrates how to use the
 * Memento pattern to save and restore the state of the originator.
 */
public class MementoDemo {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        
        // Change the state of the originator and save it in the caretaker
        originator.setState("State 1");
        caretaker.save(originator.createMemento());
        
        // Change the state of the originator and save it in the caretaker
        originator.setState("State 2");
        caretaker.save(originator.createMemento());
        
        // Change the state of the originator and save it in the caretaker
        originator.setState("State 3");
        caretaker.save(originator.createMemento());
        
        // Restore the originator to the state saved at index 1 in the caretaker
        originator.restore(caretaker.restore(1));
        System.out.println("Current state: " + originator.getState()); // Output: "Current state: State 2"
        
        // Restore the originator to the state saved at index 0 in the caretaker
        originator.restore(caretaker.restore(0));
        System.out.println("Current state: " + originator.getState()); // Output: "Current state: State 1"
    }
}

