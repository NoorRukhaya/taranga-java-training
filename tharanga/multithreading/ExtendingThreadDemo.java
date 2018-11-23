package com.tharanga.multithreading;

/*  public class ExtendingThreadDemo extends Thread {
	public void run()
	{
		System.out.println("Thread is running");
	}
	public static void main(String[] args) {
		ExtendingThreadDemo demo = new ExtendingThreadDemo();
		demo.start();
		demo.start();  // Thread is already started so IllegalThreadStateException is coming
		
	}    */
  //Sleeping Method in Thread
   public class ExtendingThreadDemo extends Thread {
	public void run()
	{
		 for(int i=1;i<5;i++){  
			    try{Thread.sleep(500);}catch(InterruptedException e){System.out.println(e);}  
			    System.out.println(i);  
			  }  
			 }  
			 public static void main(String args[]){  
				 ExtendingThreadDemo t1=new ExtendingThreadDemo();  
				 ExtendingThreadDemo t2=new ExtendingThreadDemo();  
			   
			  t1.start();  
			  t2.start();  
			  /*
			    t1.run();  //t1 and t2 will be treated as normal object not thread object
                t2.run();
			   */
			 }  
	}

