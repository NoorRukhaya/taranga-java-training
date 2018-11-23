package com.tharanga.finalex;

public class FinalEx {

	final Double PI=3.14;
	void area(int r)
	{
		double result=PI*r*r;
		System.out.println("Area of circle=" +result);
	}
	public static void main(String args[])
	{
		FinalEx obj=new FinalEx();
		obj.area(3);
	}
	}