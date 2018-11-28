package com.tharanga.arrays;

import java.util.Arrays;

public class SortArrayDemo {
	
	public static void main(String[] args) {
        int[] intArr = {1, 4, 2, 6, 3};
        String[] strArr = {"R", "A", "M","Y","A"};
        //sort int array
        Arrays.sort(intArr);
        Arrays.sort(strArr);
        
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(strArr));
    }
}
