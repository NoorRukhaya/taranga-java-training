package com.tharanga.datatypes;

import java.util.Arrays;

public class ArrayDemo1 {
	
	public static void main(String args[])
	{
		
	// Converting int array to String in Java 
	int[] numbers = {1, 2, 3, 4, 5, 6, 7}; 
	System.out.println(numbers.toString()); 
	String str = Arrays.toString(numbers); 
	System.out.println("int array as String in Java : " + str); 
	
	// Converting char array to String in Java 
	char[] vowels = {'a', 'e', 'i', 'o', 'u'}; 
	System.out.println(vowels.toString()); 
	String charArrayAsString = Arrays.toString(vowels); 
	System.out.println("char array as String in Java : " + str); 
	
	// Converting byte array to String in Java 
	byte[] bytes = {(byte) 0x12, (byte) 0x14, (byte) 0x16, (byte) 0x20}; 
	System.out.println(bytes.toString()); 
	String byteArrayAsString = Arrays.toString(bytes); 
	System.out.println("byte array as String in Java : " + byteArrayAsString); 
	
	// Converting float array to String in Java 
	float[] floats = {0.01f, 0.02f, 0.03f, 0.04f}; 
	System.out.println(floats.toString()); 
	String floatString = Arrays.toString(floats); 
	System.out.println("float array as String in Java : " + floatString); 
	
	// Converting double array to String in Java 
	double[] values = {0.5, 1.0, 1.5, 2.0, 2.5}; 
	System.out.println(values.toString()); 
	String doubleString = Arrays.toString(values); 
	System.out.println("double array as String in Java : " + doubleString); 
	
	// Converting object array to String in Java 
	Object[] objects = {"abc", "cdf", "deg", "england", "india"}; 
	System.out.println(objects.toString()); 
	String objectAsString = Arrays.toString(objects); 
	System.out.println("object array as String in Java : " + objectAsString); 
	
	// Convert two dimensional array to String in Java 
	int[][] twoD = { {100, 200, 300, 400, 500}, {300, 600, 900, 700, 800},}; 
	System.out.println(twoD.toString()); String twoDimensions = Arrays.deepToString(twoD); 
	System.out.println("Two dimensional array as String in Java : " + twoDimensions); 
	
	// Convert three dimensional array to String in Java 
	int[][][] threeD = { { {11, 22, 33, 44, 55}, {32, 42, 52, 62, 72},}, { {1111, 2222, 3333, 4444, 5555}, {1001, 2001, 3001, 4001, 5001},} }; 
	System.out.println(threeD.toString()); 
	String threeDString = Arrays.deepToString(threeD); 
	System.out.println("3 dimensional array as String in Java : " + threeDString); 
	} 

	
}
