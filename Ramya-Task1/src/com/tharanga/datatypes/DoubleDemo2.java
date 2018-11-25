package com.tharanga.datatypes;

public class DoubleDemo2 {

	public static void main(String[] args) {
		double number = -895.25;
		Double doubleInstance = new Double(number);      
		String numberAsString = doubleInstance.toString();
		System.out.println(numberAsString);

	}

}
