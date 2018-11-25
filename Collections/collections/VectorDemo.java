package com.tharanga.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String args[]){      
		
		  Vector<String> v=new Vector<String>();//creating vector  
		  v.add("ramya");//method of Collection  
		  v.addElement("mahesh");//method of Vector  
		  v.addElement("kumar");  
		  //traversing elements using Enumeration  
		  Enumeration e=v.elements();  
		  while(e.hasMoreElements()){  
		   System.out.println(e.nextElement());  
		  }  
		 }      
}
