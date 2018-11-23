package com.tharanga.multithreading;

public class MultiThreadingDemo1 extends Thread {
	public void run()
	{
		System.out.println("Thread is running");
	//	System.out.println(Thread.currentThread().getName()); current Thread Method
		System.out.println(Thread.currentThread().getPriority()); 
	}
	public static void main(String[] args) {
		MultiThreadingDemo1 d1 = new MultiThreadingDemo1();
		MultiThreadingDemo1 d2 = new MultiThreadingDemo1();
		
		System.out.println("Name of d1: "+d1.getName());
		System.out.println("Name of d2: "+d2.getName());
		System.out.println("ID of d1: "+d1.getId());
		System.out.println("ID of d2: "+d2.getId());
		
		d1.start();
		d2.start();
		
		d1.setPriority(MIN_PRIORITY); //Priority of the thread
		d1.setPriority(MAX_PRIORITY);
		d1.setPriority(NORM_PRIORITY);
		
		d1.setName("Ramya");
		System.out.println("After changing Thread name is: "+d1.getName());
	}

}
