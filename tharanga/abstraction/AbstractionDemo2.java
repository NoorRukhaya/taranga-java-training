package com.tharanga.abstraction;

abstract class Bike{  
	   Bike()
	       {
		   System.out.println("Inside bike");
		   }  
	   
	   abstract void run();  
	   
	    void changeGear()
	   {
		   System.out.println("Inside bike change Gear");
		}  
	 }  
	//Creating a Child class which inherits Abstract class  

class Honda extends Bike
	 {  
	 void run()
	 {
		 System.out.println("running safely..");
	 }  
	 }  
   public class AbstractionDemo2 {
	public static void main(String args[]){  
		  Bike obj = new Honda();  
		  obj.run();  
		  obj.changeGear();  
		 }  
}
