package com.patterns.builder;

/**
 * The class being built by the builder.
 */
public class Person {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String socialSecurityNumber;
    
    public Person(String name, int age, String gender, String address, String phoneNumber, String email, String socialSecurityNumber) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", address=" + address + ", phoneNumber=" + phoneNumber
                + ", email=" + email + ", socialSecurityNumber=" + socialSecurityNumber + "]";
    }
}
