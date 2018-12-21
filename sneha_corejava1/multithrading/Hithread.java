package com.tharanga.multithrading;

public class Hithread extends Thread{
	
		public void run()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println("hi");
				try{
				Thread.sleep(1000);
				}
				catch(Exception e)
				{
				}
			}
				
			}
		}
	


