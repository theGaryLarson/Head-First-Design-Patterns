package com.patterns.singleton;

/**
 * The Singleton class is a design pattern that ensures that a class has only
 * one instance and provides a global access point to it.
 */
public class Singleton {
    // Private inner class to hold the single instance of the outer class
    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }
    
    /**
     * Private constructor to prevent direct instantiation of the Singleton class.
     */
    private Singleton() {}
    
    /**
     * Public static method to get the single instance of the Singleton class.
     *
     * @return the single instance of the Singleton class
     */
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    /**
     *  Simulates work for demonstrating a call to the Singleton object.
     * @return message simulating work
     */
    public String doSomething() {
        return "...simulating work...";
    }

    /*In this example, the Singleton class is the singleton class, which is responsible for creating and managing
    the single instance of itself. The Singleton class has a private inner class called SingletonHolder, which holds
    the single instance of the Singleton class. The Singleton class also has a private constructor, which prevents
    direct instantiation of the class by clients.

    The Singleton class provides a public static method called getInstance(), which returns the single instance of
    the class. This method is used by clients to obtain the single instance of the Singleton class.

    The Client class is an example of a client that uses the singleton. It uses the getInstance() method to obtain
    the single instance of the Singleton class, and then uses that instance to perform some operation.*/
}