package com.patterns.builder;

/**
 * A demo class for the builder pattern.
 */
public class BuilderDemo {
    /**
     * The main method for the demo.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Create a ConcreteBuilder and a Director
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        
        // Construct a Person with only the required parameters
        director.construct("John Smith", 35, "Male");
        Person person1 = builder.build();
        System.out.println(person1);
        
        // Construct a Person with all the optional parameters
        director.construct("Jane Doe", 30, "Female", "123 Main St", "555-555-1212", "jane@example.com", "123-45-6789");
        Person person2 = builder.build();
        System.out.println(person2);
    }
}