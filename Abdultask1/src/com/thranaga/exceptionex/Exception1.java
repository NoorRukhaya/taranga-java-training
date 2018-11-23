package com.thranaga.exceptionex;

public class Exception1 {
	
		  public static void main(String args[]){  
		   try{  
		      //code that may raise exception  
		      int data=100/0;  
		      
		   }
		   catch(ArithmeticException e)
		   {
			   System.out.println(e);
			   }
		   try {
			   String s=null;  
			   System.out.println(s.length());
		   }
		   catch(Exception e) {
			   System.out.println(e);
		   }
		   //rest code of the program
		   finally {
			   System.out.println("rest of the code...");   
		   }
		    
		   
		  }  
		} 

