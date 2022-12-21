package com.patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * The FlyweightFactory class acts as a factory for creating flyweight objects.
 */
public class FlyweightFactory {
    private final Map<String, Flyweight> flyweights = new HashMap<>();
    
    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight(key));
        }
        return flyweights.get(key);
    }
}
