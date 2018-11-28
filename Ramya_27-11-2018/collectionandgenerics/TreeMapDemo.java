package com.tharanga.collectionandgenerics;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
		
		Map<Integer,String> map = new TreeMap<Integer, String>();
		
		map.put(10, "Ramya");
		map.put(1, "Chaitra");
		map.put(5, "Shivani");
		
		System.out.println(map);
		
		map = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer x, Integer y) {
				return (x > y) ? -1 : ((x == y) ? 0 : 1);
			}
			
		});
		map.put(10, "Ramya");
		map.put(1, "Chaitra");
		map.put(5, "Shivani");
		System.out.println(map);

	}
}
