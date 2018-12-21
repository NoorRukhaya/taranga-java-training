package com.tharanga.runabble;


public class RunnableThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 {
			Runnable obj1=new HiRun();
			Runnable obj2=new HelloRun();
			
			Thread t1=new Thread(obj1);
			Thread t2=new Thread(obj2);
			t1.start();
			t2.start();
		}
		
	}
}
			
			
			
			

	


	
