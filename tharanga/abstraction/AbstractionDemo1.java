package com.tharanga.abstraction;

abstract class Bank
{
	abstract int getRateofInterest();
}

 class BOI extends Bank
{
	int getRateofInterest()
	{
		return 7;
	}
}
 
 class SBI extends Bank
 {
	 int getRateofInterest()
	 {
		 return 8;
	 }
 }
 
 class HDFC extends Bank
 {
	 int getRateofInterest()
	 {
		 return 9;
	 }
 }
 
public class AbstractionDemo1 {
	public static void main(String args[])
	{
		Bank b = new BOI();
		System.out.println("BOI Rate of Interest is: "+b.getRateofInterest()+" %");
		Bank s = new SBI();
		System.out.println("SBI Rate of Interest is: "+s.getRateofInterest()+" %");
		Bank h = new HDFC();
		System.out.println("HDFC Rate of Interest is: "+h.getRateofInterest()+" %");
	}
}
