package com.tharanga.runabble;

public class HelloRun implements Runnable{
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
