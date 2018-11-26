package com.tharanga.Datatypes;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxing {
	public static void main(String[] args) {
		 
		    int a=50;  
		        Integer a2=new Integer(a);//Boxing  
		  
		        Integer a3=5;//Boxing  
		          
		        System.out.println(a2+" "+a3);  
		        
		        //Unboxing
		        
		        Integer i=new Integer(50);  
		        int x=i;  
		          
		        System.out.println(x);  
		 }   
}

