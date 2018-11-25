package com.tharanga.multithreading;

public class DaemonThreadDemo extends Thread 
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread Working");
		}
		else
		{
			System.out.println("User Thread Working");
		}
	}
	
	public static void main(String args[])
	{
		DaemonThreadDemo t1 = new DaemonThreadDemo();
		DaemonThreadDemo t2 = new DaemonThreadDemo();
		DaemonThreadDemo t3 = new DaemonThreadDemo();
	//	t1.start(); If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException.
		
		t1.setDaemon(true); //set daemon thread
		
		t1.start();
		t2.start();
		t3.start();
	}
}
