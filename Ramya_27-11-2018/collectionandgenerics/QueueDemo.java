package com.tharanga.collectionandgenerics;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo {
	
	public static void main(String[] args) {  
		
		   //Creating Deque and adding elements  
		   Deque<String> deque = new ArrayDeque<String>();  
		   deque.add("Ramya");    
		   deque.add("Viji");     
		   deque.add("Abhi");  
		   deque.add("Abhi");
		   
		   //Traversing elements  
		   for (String str : deque) {  
		   System.out.println(str);  
		   }  
		   }  
}
