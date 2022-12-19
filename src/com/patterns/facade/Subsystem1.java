package com.patterns.facade;

/**
 * The Subsystem1 class represents one of the subsystems in the complex system.
 */
public class Subsystem1 {
    /**
     * Performs operation 1 of the subsystem.
     * @param input a string to be manipulated
     * @return the result of the manipulation
     */
    public String reverse(String input) {
        // Reverse the input string
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
    
    /**
     * Performs operation 2 of the subsystem.
     * @param input a string to be manipulated
     * @return the result of the manipulation
     */
    public String toUpperCase(String input) {
        // Convert the input string to uppercase
        return input.toUpperCase();
    }
}
