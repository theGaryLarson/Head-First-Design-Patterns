package com.patterns.builder;

/**
 * The interface for the builder.
 */
public interface Builder {
    /**
     * Sets the name of the person being built.
     *
     * @param name the name of the person
     */
    void setName(String name);
    
    /**
     * Sets the age of the person being built.
     *
     * @param age the age of the person
     */
    void setAge(int age);
    
    /**
     * Sets the gender of the person being built.
     *
     * @param gender the gender of the person
     */
    void setGender(String gender);
    
    /**
     * Sets the address of the person being built.
     *
     * @param address the address of the person
     */
    void setAddress(String address);
    
    /**
     * Sets the phone number of the person being built.
     *
     * @param phoneNumber the phone number of the person
     */
    void setPhoneNumber(String phoneNumber);
    
    /**
     * Sets the email of the person being built.
     *
     * @param email the email of the person
     */
    void setEmail(String email);
    
    /**
     * Sets the social security number of the person being built.
     *
     * @param socialSecurityNumber the social security number of the person
     */
    void setSocialSecurityNumber(String socialSecurityNumber);
    
    /**
     * Returns the built object.
     *
     * @return the built person
     */
    Person build();
}