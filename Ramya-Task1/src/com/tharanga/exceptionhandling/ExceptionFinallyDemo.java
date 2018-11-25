package com.tharanga.exceptionhandling;

public class ExceptionFinallyDemo {
	
	public static void main(String args[]){  
		
		//Java finally block is always executed whether exception is handled or not.
		  try{  
		   int data=25/5;  
		   System.out.println(data);  
		  }  
		  catch(NullPointerException e)
		  {
			  System.out.println(e);
		  }  
		  finally{System.out.println("finally block is always executed");}  
		  System.out.println("rest of the code...");  
		  }  

}
