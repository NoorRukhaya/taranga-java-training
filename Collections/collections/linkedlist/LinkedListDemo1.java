package com.tharanga.collections.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
	 public static void main(String args[]){  
		  
		  LinkedList<String> ll=new LinkedList<String>();  
		           ll.add("Ramya");  
		           ll.add("Vijay");  
		           ll.add("Ajay");  
		           //Traversing the list of elements in reverse order  
		           Iterator i=ll.descendingIterator();  
		           while(i.hasNext())  
		           {  
		               System.out.println(i.next());  
		           } 
		           LinkedList<String> ll2=new LinkedList<String>();  
		           ll2.add("Ravi");  
		           ll2.add("Hanumat");  
		           
		           ll.addAll(ll2); 
		           System.out.println("Updated list : "+ll); 
		           ll.removeAll(ll2);
		           System.out.println("After invoking removeAll() method: "+ll);
		         //Removing first element from the list  
		              ll.removeFirst();  
		            //Removing first element from the list  
		              ll.removeLast(); 
		              ll.removeFirstOccurrence("Gaurav");  
		              System.out.println("After invoking removeFirstOccurrence() method: "+ll);  
		          //Removing last occurrence of element from the list  
		              ll.removeLastOccurrence("Harsh");  
		              System.out.println("After invoking removeLastOccurrence() method: "+ll);  
		  
		              //Removing all the elements available in the list       
		              ll.clear();  
		              System.out.println("After invoking clear() method: "+ll);   
		       }  
		             
		 }  

