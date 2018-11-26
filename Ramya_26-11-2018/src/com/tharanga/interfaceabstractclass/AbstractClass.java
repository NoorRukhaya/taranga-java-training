package com.tharanga.interfaceabstractclass;

abstract class Base { 
    abstract void fun(); 
} 

class Derived extends Base { 
    void fun() { System.out.println("Derived fun() called"); } 
} 

public class AbstractClass {
	public static void main(String args[]) {  
	      
        // Uncommenting the following line will cause compiler error as the  (can not instantiate the base)
        // line tries to create an instance of abstract class. 
     //    Base b = new Base(); 
  
        // We can have references of Base type. 
       Base b = new Derived(); 
        b.fun();  
    } 
}
