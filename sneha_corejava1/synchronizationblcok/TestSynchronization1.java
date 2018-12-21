package com.tharanga.synchronizationblcok;

public class TestSynchronization1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table1 obj = new Table1();//only one object  
		MyThread5 t1=new MyThread5(obj);  
		MyThread7 t2=new MyThread7(obj);  
		t1.start();  
		t2.start();

	}

}
