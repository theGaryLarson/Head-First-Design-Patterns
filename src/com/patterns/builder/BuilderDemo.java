package com.patterns.builder;

public class BuilderDemo {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        
        // Construct a Person with only the required parameters
        director.construct("John Smith", 35, "Male");
        Person person1 = builder.build();
        System.out.println(person1);
        
        // Construct a Person with all of the optional parameters
        director.construct("Jane Doe", 30, "Female", "123 Main St", "555-555-1212", "jane@example.com", "123-45-6789");
        Person person2 = builder.build();
        System.out.println(person2);
    }
}
