package com.tharanga.oopsconcepts;

import java.util.Arrays;

public class NestedClass {


	static int data=30;  
	  static class Inner{  
	   void msg(){System.out.println("data is "+data);}  
	  }  
	  public static void main(String args[]){  
		  NestedClass.Inner obj=new NestedClass.Inner();  
	  obj.msg();  
	  }  
}

