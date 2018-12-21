package com.tharanga.synchronizationblcok;

public class MyThread5 extends Thread{
	Table1 t;  
	MyThread5(Table1 t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  

}
}
