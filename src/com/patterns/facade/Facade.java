package com.patterns.facade;

/**
 * The Facade class provides a simplified interface to the complex system of classes.
 */
public class Facade {
    private final Subsystem1 subsystem1;
    private final Subsystem2 subsystem2;
    
    /**
     * Constructs a new Facade instance, initializing the subsystems.
     */
    public Facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
    }
    
    /**
     * Performs a complex operation using the subsystems.
     * @param input a string to be manipulated by the subsystems
     * @return the result of the manipulation
     */
    public String operation(String input) {
        String intermediateResult = subsystem1.reverse(input);
        intermediateResult = subsystem2.replaceVowels(intermediateResult);
        intermediateResult = subsystem1.toUpperCase(intermediateResult);
        return subsystem2.removeSpaces(intermediateResult);
    }
}