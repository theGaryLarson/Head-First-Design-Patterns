package com.patterns.builder;

/**
 * The director class, which controls the construction process.
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
