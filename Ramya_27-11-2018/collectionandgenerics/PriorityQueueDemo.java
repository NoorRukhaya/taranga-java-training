package com.tharanga.collectionandgenerics;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	
	public static void main(String args[])
	{
		PriorityQueue<String> tasks = new PriorityQueue<String>();
		tasks.add("task1");
		tasks.add("task4");
		tasks.add("task3");
		tasks.add("task2");
		tasks.add("task5");
		
		Iterator<String> itr = tasks.iterator();
		
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	Iterator<String> itr1 = tasks.iterator();
	
	}
}
