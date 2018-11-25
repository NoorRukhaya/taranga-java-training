package com.tharanga.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class CollectionFrameworkDemo {
	public static void main(String args[])
	{
		System.out.println("Array List");
		ArrayList<String> list1 = new ArrayList<String>(); //creating an Arraylist
		list1.add("Ramya");
		list1.add("Chaitra");
		list1.add("Bhagya");
		
		Iterator itr1 = list1.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("Linked List");
		LinkedList<String> al=new LinkedList<String>();  //creating Linkedlist
		al.add("Ravi");  
		al.add("Vijay");  
		al.add("Ravi");  
		al.add("Ajay");  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		} 
		
		System.out.println("Vector List");
		Vector<String> v=new Vector<String>();   //Creating Vector
		v.add("Ayush");  
		v.add("Amit");  
		v.add("Ashish");  
		v.add("Garima");  
		Iterator<String> itr=v.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		System.out.println("Stack List");
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr4=stack.iterator();  
		while(itr4.hasNext()){  
		System.out.println(itr4.next());  
		}  
		}  
	}

