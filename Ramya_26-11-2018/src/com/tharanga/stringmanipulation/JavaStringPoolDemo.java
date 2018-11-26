package com.tharanga.stringmanipulation;

public class JavaStringPoolDemo {
	
	 // String Pool in java is a pool of Strings stored in Java Heap Memory
	public static void main(String[] args) {
        String s1 = "Cat";
        String s2 = "Cat";
        String s3 = new String("Cat");  
        /* If there is already a string literal “Cat” in the pool, then only one string “str” will be created in the pool. 
        total 2 string objects will be created   */
        
        System.out.println("s1 == s2 :"+(s1==s2));
        System.out.println("s1 == s3 :"+(s1==s3));
    }

}
