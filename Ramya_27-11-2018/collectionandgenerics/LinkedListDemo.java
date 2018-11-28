package com.tharanga.collectionandgenerics;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	public static void main(String[] args) 
	  {
		List names = new LinkedList();  //without Using Generics
	//	List<String> names = new LinkedList<>();  with Generics
		names.add("Ramya");
		names.add("is");
		names.add("a java Developer");
	    names.add(2018);
				
		System.out.println("LinkedList content: " + names);
		System.out.println("LinkedList size: " + names.size());
	  }
}
