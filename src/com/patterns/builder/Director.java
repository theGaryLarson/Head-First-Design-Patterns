package com.patterns.builder;

/**
 * The director class, which controls the construction process.
 *
 * As you can see, the Director class has two construct methods:
 * one that takes in the required parameters for constructing a Person
 * object (name, age, and gender), and another that takes in all the
 * optional parameters as well (address, phone number, email, and social
 * security number). The Builder object is used to set the different parameters
 * of the Person object in both methods.
 */
public class Director {
    private Builder builder;
    
    public Director(Builder builder) {
        this.builder = builder;
    }
    
    /**
     * Constructs the product using the builder.
     */
    public void construct(String name, int age, String gender) {
        builder.setName(name);
        builder.setAge(age);
        builder.setGender(gender);
    }
    
    /**
     * Constructs the product using the builder, with optional parameters.
     */
    public void construct(String name, int age, String gender, String address, String phoneNumber, String email, String socialSecurityNumber) {
        builder.setName(name);
        builder.setAge(age);
        builder.setGender(gender);
        builder.setAddress(address);
        builder.setPhoneNumber(phoneNumber);
        builder.setEmail(email);
        builder.setSocialSecurityNumber(socialSecurityNumber);
    }
}