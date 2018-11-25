package com.tharanga.collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo3 {
	public static void main(String [] args)  
    {  
      ArrayList<String> al=new ArrayList<String>();  
      System.out.println("Is ArrayList Empty: "+al.isEmpty());  
      al.add("Ramya");    
      al.add("Vijay");    
        
      System.out.println("After Insertion");  
      System.out.println("Is ArrayList Empty: "+al.isEmpty());   
      
      System.out.println("Before update: "+al.get(1));   
      //Updating an element at specific position  
      al.set(1,"Gaurav");  
      System.out.println("After update: "+al.get(1)); 
      
      ArrayList<String> al2=new ArrayList<String>();  
      al2.add("Ramya");  
      al2.add("Hanumat");  
      al.retainAll(al2);  
      System.out.println("iterating the elements after retaining the elements of al2");  
      Iterator itr=al.iterator();  
      while(itr.hasNext()){  
       System.out.println(itr.next());  
      }  
      
    //Removing specific element from arraylist  
      al.remove("Vijay");  
      System.out.println("After invoking remove(object) method: "+al);   
      //Removing element on the basis of specific position  
      al.remove(0);  
      System.out.println("After invoking remove(index) method: "+al);   
   }  
}
