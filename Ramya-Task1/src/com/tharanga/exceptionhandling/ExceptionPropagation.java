package com.tharanga.exceptionhandling;

public class ExceptionPropagation {
	void m1()
	{
		int data = 50/0;
	}
	
	void n1()
	{
		m1();
	}
	
	void p1()
	{
		try {
			n1();
		}catch(Exception e)
		{
			System.out.println("Exception Handled");
		}
	}
		public static void main(String args[])
		{  
			ExceptionPropagation obj=new ExceptionPropagation();  
			   obj.p1();  
			   System.out.println("normal flow...");  
			  }  
		
	}

