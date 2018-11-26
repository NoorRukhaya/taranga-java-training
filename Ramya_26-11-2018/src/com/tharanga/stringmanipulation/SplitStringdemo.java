package com.tharanga.stringmanipulation;

import java.util.Arrays;

public class SplitStringdemo {
	
	public static void main(String[] args) 
	{
		String line = "I am a embedded developer";

		String[] words = line.split(" ");

		String[] twoWords = line.split(" ", 3);

		System.out.println("String split with delimiter: " + Arrays.toString(words));

		System.out.println("String split into two: " + Arrays.toString(twoWords));

		// split string delimited with special characters
		String wordsWithNumbers = "my|favourate|subject|java";

		String[] numbers = wordsWithNumbers.split("\\|");

		System.out.println("String split with special character: " + Arrays.toString(numbers));

	}
}
