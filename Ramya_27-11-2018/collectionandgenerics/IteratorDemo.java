package com.tharanga.collectionandgenerics;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {
	
public static void main(String[] args) 
	  {
		List<String> names = new LinkedList<String>();
		names.add("Java");
		names.add("Programming");
		names.add("Language");
		
		// Getting Iterator
		Iterator<String> namesIterator = names.iterator();
			
		// Traversing elements
		while(namesIterator.hasNext()){
			System.out.println(namesIterator.next());			
		}	
}
}
