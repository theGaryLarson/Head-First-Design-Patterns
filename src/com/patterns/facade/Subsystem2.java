package com.patterns.facade;

/**
 * The Subsystem2 class represents one of the subsystems in the complex system.
 */
public class Subsystem2 {
    /**
     * Performs operation 1 of the subsystem.
     * @param input a string to be manipulated
     * @return the result of the manipulation
     */
    public String replaceVowels(String input) {
        // Replace all vowels in the input string with 'X'
        return input.replaceAll("[AEIOUaeiou]", "X");
    }
    
    /**
     * Performs operation 2 of the subsystem.
     * @param input a string to be manipulated
     * @return the result of the manipulation
     */
    public String removeSpaces(String input) {
        // Remove all spaces from the input string
        return input.replaceAll("\\s", "");
    }
}
