package com.patterns.facade;

public class FacadeDemo {
    
    public static void main(String[] args) {
        Facade facade = new Facade();
        String result = facade.operation("Hello world!");
        System.out.println("input = Hello world!");
        System.out.println("output = " + result);
    }
}
/*To use the Facade, a client would simply need to instantiate a Facade object and call the operation() method,
passing in a string as an argument This would invoke the various operations of the subsystems in the complex
system in a specific order, resulting in:
 a string that has been reversed
 had its vowels replaced with 'X'
 converted to uppercase
 and had all spaces removed.*/


