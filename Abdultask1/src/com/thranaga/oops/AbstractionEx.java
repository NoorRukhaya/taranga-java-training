package com.thranaga.oops;

	abstract class Sample{
	
	abstract void adding();
	
	void subtract() {
		int x=10,y=5;
		int sub=x-y;
		System.out.println("subraction="+sub);
	}
}
public class AbstractionEx extends Sample {

	void adding()
	{
		int a=10,b=10;
		int result=a+b;
		System.out.println("adding function="+result);
	}
	public static void main(String args[])
	{
		AbstractionEx obj=new AbstractionEx();
		obj.adding();
		obj.subtract();
	}
}
