package com.tharanga.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<String>();
		strList.add("RAMYA");
		strList.add("1");
		strList.add("2");
		strList.add("3");
		strList.add("A");
		strList.add("B");
		strList.add("C");
		
		String[] strArr = null;

		strArr = strList.toArray(new String[strList.size()]);
		System.out.println(Arrays.toString(strArr));
	}
}
