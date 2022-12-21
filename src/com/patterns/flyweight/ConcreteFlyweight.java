package com.patterns.flyweight;

/**
 * The ConcreteFlyweight class implements the Flyweight interface and stores
 * the intrinsic data that is shared by all flyweight objects.
 */
public class ConcreteFlyweight implements Flyweight {
    private final String intrinsicData;
    
    public ConcreteFlyweight(String intrinsicData) {
        this.intrinsicData = intrinsicData;
    }
    
    @Override
    public void operation(int extrinsicState) {
        System.out.println("Intrinsic Data: " + intrinsicData);
        System.out.println("Extrinsic Data: " + extrinsicState);
    }
}
