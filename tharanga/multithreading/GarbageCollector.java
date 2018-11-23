package com.tharanga.multithreading;

public class GarbageCollector {
	public void finalize()
	{
		System.out.println("Garbage collected");
	}
	public static void main(String[] args) {
		
		/* Garbage collection is performed by a daemon thread called Garbage Collector(GC). 
		This thread calls the finalize() method before object is garbage collected */
		
		GarbageCollector s1 = new GarbageCollector();
		GarbageCollector s2 = new GarbageCollector();
		s1 = null;
		s2 = null;
		System.gc();
		

	}

}
