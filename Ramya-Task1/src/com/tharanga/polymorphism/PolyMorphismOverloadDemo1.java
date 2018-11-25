package com.tharanga.polymorphism;

public class PolyMorphismOverloadDemo1 {
	 public int add(int a, int b) {
	        System.out.println("Two int parameter addition");
	        return a + b;
	    }
	 
	    public int add(int a, int b, int c) {
	        System.out.println("Three int parameter addition");
	        return a + b + c;
	    }
	 
	    public double add(double a, double b) {
	        System.out.println("Two double parameter addition");
	        return a + b;
	       
	    }
	    
	    public double add(double a, double b, double c) {
	        System.out.println("Three double parameter addition");
	        return a + b + c;
	    }
	    
	    public static void main(String[] args) {
	    	PolyMorphismOverloadDemo1 mo = new PolyMorphismOverloadDemo1();
	       
	        System.out.println(mo.add(1, 2));
	        
	        System.out.println(mo.add(1, 5, 3));
	        
	        System.out.println(mo.add(2.9, 5.8));
	       
	        System.out.println(mo.add(10.6, 20.89, 30.48));
	    }
}
