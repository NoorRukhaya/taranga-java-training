package com.tharanga.exceptionhandling;

import java.io.IOException;

public class ExceptionThrowsDemo {

	void method()throws IOException{  
		  System.out.println("device operation performed");  
		 }  
		}  
		class Testthrows3{  
		   public static void main(String args[])throws IOException{//declare exception  
			   ExceptionThrowsDemo m=new ExceptionThrowsDemo();  
		     m.method();  
		  
		    System.out.println("normal flow...");  
		  }  
	}


