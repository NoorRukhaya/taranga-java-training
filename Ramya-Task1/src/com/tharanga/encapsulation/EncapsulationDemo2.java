package com.tharanga.encapsulation;

public class EncapsulationDemo2 {

	public static void main(String[] args) {
		
		Accounts a1= new Accounts();
		a1.setAcc_no(24578963);
		a1.setName("Shubha");
		a1.setEmail("shubha12345@gmail.com");
		a1.setAmount(5000);
		System.out.println("Account Number is: "+a1.getAcc_no());
		System.out.println("Name is: "+a1.getName());
		System.out.println("Email is : "+a1.getEmail());
		System.out.println("Amount is : "+a1.getAmount());

	}
}
