package com.patterns.singleton;

/**
 * The Client class is an example of a client that uses the Singleton class.
 */
public class SingletonDemo {
    public static void main(String[] args) {
        // Get the single instance of the Singleton class
        Singleton singleton = Singleton.getInstance();
        
        // Use the singleton instance to perform some operation
        System.out.println(singleton.doSomething());
    }
}