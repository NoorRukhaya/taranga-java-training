package com.tharanga.collectionandgenerics;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] args) 
	{
		List <String> names = new LinkedList<String>();
		names.add("Hai");
		names.add("Hello");
		names.add("World");
		
		// Getting ListIterator
		ListIterator<String> listIterator = names.listIterator();
		
		// Traversing elements
		System.out.println("Forward Direction Iteration:");
		while(listIterator.hasNext()){
			System.out.println(listIterator.next());			
		}	
		
		// Traversing elements
		System.out.println("Backward Direction Iteration:");
		while(listIterator.hasPrevious()){
			System.out.println(listIterator.previous());			
		}
	}
}
