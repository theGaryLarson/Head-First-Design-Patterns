package com.patterns.abstractfactory;

/**
 * The base abstract factory interface.
 */
public interface AbstractFactory {
    /**
     * Creates a product A.
     * @return the product A
     */
    ProductA createProductA();
    
    /**
     * Creates a product B.
     * @return the product B
     */
    ProductB createProductB();
}
