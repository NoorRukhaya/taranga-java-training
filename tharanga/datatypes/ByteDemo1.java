package com.tharanga.datatypes;

public class ByteDemo1 {
	
	public static void main(String args[])
	{
		// Its minimum value is -128 and maximum value is 127. Its default value is 0.
	byte a=100;
	byte b=-128;
	System.out.println("The byte is: "+a);
	System.out.println("The byte is: "+b);
	
	byte c = (byte) (a+b);
	
	System.out.println("Sum of a and b : "+c);
}
}
