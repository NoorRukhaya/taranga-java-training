package com.tharanga.finalkeyword;

public class FinalDemo {

	 final int MAX_VALUE;
	 
	   FinalDemo(){
	      //It must be initialized in constructor
	      MAX_VALUE=100;
	   }
	   void myMethod(){  
	      System.out.println(MAX_VALUE);
	   }  
	   public static void main(String args[]){  
		   FinalDemo obj=new  FinalDemo();  
	      obj.myMethod();  
	   }  

}
