package com.tharanga.multithrading;

public class HelloThread extends Thread {
	

	public void run() {
		for(int i=1;i<=5;i++)
		{
			System.out.println("hello");
			try{
				Thread.sleep(1000);
				}
				catch(Exception e)
				{
				}
		}
		
		// TODO Auto-generated method stub
		
	}
}
