package com.tharanga.multithreading;

class ImplimentingThread implements Runnable{  

public void run(){  
//System.out.println("Thread is running"); 
System.out.println(Thread.currentThread().getName());
}  
  
public static void main(String args[]){  
	
   /*	ImplimentingThread m1=new ImplimentingThread();  
        Thread p1 =new Thread(m1);  
         p1.start();  */
    //Group of Thread
    ImplimentingThread runnable = new ImplimentingThread();
    ThreadGroup tg1 = new ThreadGroup("Parent ThreadGroup"); 
    
    Thread t1 = new Thread(tg1, runnable,"one");  
    t1.start();  
    Thread t2 = new Thread(tg1, runnable,"two");  
    t2.start();  
    Thread t3 = new Thread(tg1, runnable,"three");  
    t3.start();  
         
    System.out.println("Thread Group Name: "+tg1.getName());  
   tg1.list();  
 }  
}  
