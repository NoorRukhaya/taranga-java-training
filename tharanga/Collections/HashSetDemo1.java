package com.tharanga.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	public static void main(String args[]){  
		
		  //Creating HashSet and adding elements  
		  HashSet<String> set=new HashSet<String>();  
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  // HashSet doesn't allow duplicate elements
		  set.add("Ajay"); 
		  
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  
		  }  
		  ArrayList<String> list=new ArrayList(set); //HashSet from another Collection
		  list.add("Gaurav");  
          Iterator<String> i=list.iterator();  
          while(i.hasNext())  
          {  
          System.out.println(i.next());  
          }  
	}
}
