package com.tharanga.exceptionhandling;

public class ExceptionTryCatchDemo1 {

	public static void main(String[] args) {
		try{  
		        
		   int data=100/0;  
		   System.out.println(data); //ArithmetricException  
		   
		   String s=null;  
		   System.out.println(s.length());//NullPointerException  
		   
		   String s1="abc";  
		   int i=Integer.parseInt(s);//NumberFormatException 
		   
		   int a[]=new int[5];  
		   a[10]=50; //ArrayIndexOutOfBoundsException 
		   
		 }catch(ArithmeticException | NullPointerException | NumberFormatException |ArrayIndexOutOfBoundsException e)
		{
			 System.out.println(e);
			 System.out.println("Error");
		
	     }
	}
}


