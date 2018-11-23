package com.thranaga.threading;

public class MultiThreadingEx extends Thread {

	// Java code for thread creation by extending 
	// the Thread class 
		public void run() 
		{ 
			try
			{ 
				// Displaying the thread that is running 
				System.out.println ("Thread " + 
					Thread.currentThread().getId() + 
					" is running"); 

			} 
			catch (Exception e) 
			{ 
				// Throwing an exception 
				System.out.println ("Exception is caught"); 
			} 
		} 
	} 

	// Main Class 
	class Multithread 
	{ 
		public static void main(String[] args) 
		{ 
			int n = 2; // Number of threads 
			for (int i=0; i<8; i++) 
			
			{ 
				MultiThreadingEx object = new MultiThreadingEx(); 
				object.start(); 
			} 
		} 
	} 

