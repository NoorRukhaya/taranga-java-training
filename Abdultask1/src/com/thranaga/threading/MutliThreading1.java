package com.thranaga.threading;

public class MutliThreading1 implements Runnable{ 
		public void run()
		{
		System.out.println("thread is running...");  
		}  
		  
		public static void main(String args[])
		{  
		MutliThreading1 m1=new MutliThreading1();  
		Thread t1 =new Thread(m1);  
		t1.start();  
		}  
		}  

