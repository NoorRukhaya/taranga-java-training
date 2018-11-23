package com.tharanga.thiskeyword;

public class ThisDemo2 
	{ 
	    int a; 
	    int b; 
	      
	    // Parameterized constructor 
	    ThisDemo2(int a, int b) 
	    { 
	        this.a = a; 
	        this.b = b; 
	    } 
	  
	    void display() 
	    { 
	        //Displaying value of variables a and b 
	        System.out.println("a = " + a + "  b = " + b); 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	    	ThisDemo2 object = new ThisDemo2(10, 20); 
	        object.display(); 
	    } 
	} 


