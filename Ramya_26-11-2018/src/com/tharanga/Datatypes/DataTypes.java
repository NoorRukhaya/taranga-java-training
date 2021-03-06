package com.tharanga.Datatypes;

public class DataTypes {
	
public static void main(String[] args) {
		
		char c = 'A';
		System.out.println(c); //prints A
		
		char c1 = '\u0041';
		System.out.println(c1); //prints A
		
		char c2 = 0;
		System.out.println("Default Value:"+c2+":"); // prints Default Value: :
		
		char c3 = 65;
		System.out.println(c3); //prints A
		
		char c4 = '\t';
		System.out.println("Tab Start:"+c4+":End"); //prints Tab Start:	:End
		
		byte b = 10;
		System.out.println(b); //prints 10
		
		byte b1 = (byte) 200;	
		System.out.println(b1); // prints -56
		//<0...>_11001000 (int), converted to 11001000 (byte) by stripping leading 24 bits
		// since left most bit is 1, we need to find the value
		// Ones complement 11001000 -1 = 11000111
		//invert digits 00111000 i.e 56, hence printing -56
		
		b1 = (byte) 0b11001000;
		System.out.println(b1); //prints -56
		
		byte b2 = (byte) 320; //256+64 i.e 00000000_00000000_00000001_01000000, byte 01000000
		//since leading bit is 0, nothing is required to determine value
		System.out.println(b2); //prints 64
		
		short s = 32;
		short s1 = 'A'; //implicit char to short conversion
		System.out.println(s1); //prints 65
		
		int i = 'A';
		System.out.println(i); //prints 65
		
		long l = 3200L;
		long l1 = 3200;
		System.out.println(l1);
		
		float f = 12.34f;
		System.out.println(f);
		//Examples
		byte x, y = 1, z = 2; 
		x = (byte) (y + z);
		System.out.println(x);
	}

}
