package com.patterns.builder;

/**
 * The class for the object being built.
 */
public class Person {
    private final String name;
    private final int age;
    private final String gender;
    private final String address;
    private final String phoneNumber;
    private final String email;
    private final String socialSecurityNumber;
    
    /**
     * Constructs a new Person.
     *
     * @param name the name of the person (required)
     * @param age the age of the person (required)
     * @param gender the gender of the person (required)
     * @param address the address of the person (optional)
     * @param phoneNumber the phone number of the person (optional)
     * @param email the email of the person (optional)
     * @param socialSecurityNumber the social security number of the person (optional)
     *
     * @throws IllegalArgumentException if name, age, or gender is null
     */
    public Person(String name, int age, String gender, String address, String phoneNumber, String email, String socialSecurityNumber) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (gender == null) {
            throw new IllegalArgumentException("Gender cannot be null");
        }
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    /**
     * Returns the name of the person.
     *
     * @return the name of the person
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the age of the person.
     *
     * @return the age of the person
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Returns the gender of the person.
     *
     * @return the gender of the person
     */
    public String getGender() {
        return gender;
    }
    
    /**
     * Returns the address of the person.
     *
     * @return the address of the person
     */
    public String getAddress() {
        return address;
    }
    
    /**
     * Returns the phone number of the person.
     *
     * @return the phone number of the person
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    /**
     * Returns the email of the person.
     *
     * @return the email of the person
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Returns the social security number of the person.
     *
     * @return the social security number of the person
     */
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }
    
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", socialSecurityNumber='" + socialSecurityNumber + '\'' +
                '}';
    }
}

