package com.tharanga.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	
	public static void main(String args[])
	{
	String [] array = {"Ramya", "Chaitra", "Akash", "Suhas","Abhi"};
	List<String> list = new ArrayList <String>();
	list = Arrays.asList(array);
	System.out.println(list);
	System.out.println("Original ArrayList from Arrays.asList()");
    for (String str : list)
        System.out.println(" " + str);
}
}
