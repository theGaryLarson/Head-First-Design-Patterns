package com.patterns.builder;

/**
 * The concrete builder class.
 */
public class ConcreteBuilder implements Builder {
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;
    private String email;
    private String socialSecurityNumber;
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    
    /**
     * Returns the built object.
     */
    public Person build() {
        return new Person(name, age, gender, address, phoneNumber, email, socialSecurityNumber);
    }
}

