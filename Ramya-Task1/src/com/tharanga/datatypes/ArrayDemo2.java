package com.tharanga.datatypes;

public class ArrayDemo2 {

	public static void main(String[] args)
	{
		int array1[ ] = {1,2,3,4,5,6,7,8,9,10};
		int array2[ ] = {15,16,17,18,19,20,21,22,23,24};

		/* Declaration of integer type array */
		
		int ans1[ ] = new int[10];
		int ans2[ ] = new int[10];
		int ans3[ ] = new int[10];
		int ans4[ ] = new int[10];
		
		//Addition
		for(int i = 0; i < 10; i++)
			ans1[i] = array1[i] + array2[i];
		System.out.println("Sum of two Array: ");
		for(int i = 0; i < 10; i++)
			System.out.print(" "+ans1[i]);
			System.out.println("\n");
			
		//Subtraction
		for(int i = 0; i < 10; i++)
			ans2[i] = array2[i] - array1[i];
		System.out.println("Difference of two Array:");
		for(int i = 0; i < 10; i++)
			System.out.print(" "+ans2[i]);
		System.out.println("\n");
		
		//Multiplication
		for(int i = 0; i < 10; i++)
			ans3[i] = array1[i] * array2[i];
		System.out.println("Multiplication of two Array:");
		for(int i = 0; i < 10; i++)
			System.out.print(" "+ans3[i]);
		System.out.println("\n");

	}

}
