package com.tharanga.exception;

 class Data {

	public void fruits() {
		System.out.println("fruits are eating");
	}
	/*
	public void drinking() {
 		System.out.println("Waters are Drinking");
 	}  */
}

public class NoSuchMethodErrorDemo {
	
	public static void main(String[] args) {

		Data d = new Data();
		d.fruits();
	//	d.drinking();  NoSuchMethodError Exception 

	}

}
