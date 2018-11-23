package com.tharanga.multithreading;

public class JoinThreadDemo extends Thread {
	public void run(){  
		  for(int i=1;i<=5;i++){  
		   try{  
		    Thread.sleep(500);  
		   }catch(Exception e){System.out.println(e);}  
		  System.out.println(i);  
		  }  
		 }  
		public static void main(String args[]){  
			JoinThreadDemo t1=new JoinThreadDemo();  
			JoinThreadDemo t2=new JoinThreadDemo();  
			JoinThreadDemo t3=new JoinThreadDemo();  
		 t1.start();  
		 try{  
		  t1.join();  //when t1 completes its task then t2 and t3 starts executing
		  t1.join(1500); //,when t1 is completes its task for 1500 miliseconds(3 times) then t2 and t3 starts executing
		 }catch(Exception e){System.out.println(e);}  
		  
		 t2.start();  
		 t3.start();  
		
		 }  
}
