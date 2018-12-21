package com.tharanga.strings;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Sachin";  
		   s.concat(" Tendulkar");//concat() method appends the string at the end 
		   //s=s.concat("Tendulkar");//to print sachintendulkar explicitly assign it to reference variable s.
		   System.out.println(s);//will print Sachin because strings are immutable objects
		   
		   
	}


}
