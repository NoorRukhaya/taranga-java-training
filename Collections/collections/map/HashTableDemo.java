package com.tharanga.collections.map;

import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String args[]){  
	    Hashtable<Integer,String> map=new Hashtable<Integer,String>();          
	     map.put(100,"Am");    
	     map.put(102,"Ra");   
	     map.put(101,"Vi");    
	     map.put(103,"Rah");    
	     //Here, we specify the if and else statement as arguments of the method  
	     System.out.println(map.getOrDefault(101, "Not Found"));  
	     System.out.println(map.getOrDefault(105, "Not Found"));  
	 }  
}
