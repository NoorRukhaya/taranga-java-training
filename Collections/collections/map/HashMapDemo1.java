package com.tharanga.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo1 {
	
	public static void main(String args[]){  
		
		  Map<Integer,String> map=new HashMap<Integer,String>();  
		  map.put(100,"Amit");  
		  map.put(101,"Vijay");  
		  map.put(102,"Ramya");  
		  
		  //Elements can traverse in any order  
		  for(Map.Entry m:map.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  }  
		  //key based removal
		  map.remove(100);  
		    System.out.println("Updated list of elements: "+map);  
		    //value-based removal  
		    map.remove(101);  
		    System.out.println("Updated list of elements: "+map);  
		    //key-value pair based removal  
		    map.remove(102, "Ramya");  
		    System.out.println("Updated list of elements: "+map);  
		 }  
}
