package com.tharanga.synchronizationblcok;

public class MyThread7 extends Thread{
	Table1 t;  
	MyThread7(Table1 t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  

}
