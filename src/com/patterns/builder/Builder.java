package com.patterns.builder;

/**
 * The interface for the builder.
 */
public interface Builder {
    void setName(String name);
    void setAge(int age);
    void setGender(String gender);
    void setAddress(String address);
    void setPhoneNumber(String phoneNumber);
    void setEmail(String email);
    void setSocialSecurityNumber(String socialSecurityNumber);
    /**
     * Returns the built object.
     */
    Person build();
}