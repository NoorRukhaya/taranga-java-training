package com.tharanga.multithrading;

public class ThreadDemo {

	public static void main(String[] args) 	throws Exception {
		// TODO Auto-generated method stub
try {
	Hithread obj1=new Hithread();
	HelloThread obj2=new HelloThread();
	obj1.start();
	obj2.start();
	System.out.println(obj1.isAlive());
	obj1.join();
	obj2.join();
	System.out.println(obj2.isAlive());
	System.out.println("bye");
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}
}


