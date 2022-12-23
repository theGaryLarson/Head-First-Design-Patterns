package com.patterns.prototype;

/**
 * The concrete prototype class.
 */
public class ConcretePrototype implements Prototype {
    private String property1;
    private int property2;
    private boolean property3;
    
    public ConcretePrototype(String property1, int property2, boolean property3) {
        this.property1 = property1;
        this.property2 = property2;
        this.property3 = property3;
    }
    
    public String getProperty1() {
        return property1;
    }
    
    public void setProperty1(String property1) {
        this.property1 = property1;
    }
    
    public int getProperty2() {
        return property2;
    }
    
    public void setProperty2(int property2) {
        this.property2 = property2;
    }
    
    public boolean isProperty3() {
        return property3;
    }
    
    public void setProperty3(boolean property3) {
        this.property3 = property3;
    }
    
    @Override
    public ConcretePrototype clone() {
        return new ConcretePrototype(property1, property2, property3);
    }
}