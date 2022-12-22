package com.patterns.flyweight;

/**
 * The UnsharedConcreteFlyweight class stores extrinsic data that is specific
 * to each flyweight object. It is not shared among flyweight objects.
 */
public class UnsharedConcreteFlyweight implements Flyweight {
    private final String extrinsicData;
    
    public UnsharedConcreteFlyweight(String extrinsicData) {
        this.extrinsicData = extrinsicData;
    }
    
    @Override
    public void operation(int extrinsicState) {
        System.out.println("Extrinsic Data: " + extrinsicData);
        System.out.println("Extrinsic State: " + extrinsicState);
    }
}