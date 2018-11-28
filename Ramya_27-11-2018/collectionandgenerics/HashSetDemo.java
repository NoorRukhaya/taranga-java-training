package com.tharanga.collectionandgenerics;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String args[]){  
		  HashSet<String> set=new HashSet<String>();  
		           set.add("Ramya");  
		           set.add("Vinutha");  
		           set.add("Aruna");  
		           set.add("Suhas");  
		           System.out.println("An initial list of elements: "+set);  
		           //Removing specific element from HashSet  
		           set.remove("Ramya");  
		           System.out.println("After invoking remove(object) method: "+set);  
		           HashSet<String> set1=new HashSet<String>();  
		           set1.add("Ajay");  
		           set1.add("Gautham");  
		           set.addAll(set1);  
		           System.out.println("Updated List: "+set);  
		           //Removing all the new elements from HashSet  
		           set.removeAll(set1);  
		           System.out.println("After invoking removeAll() method: "+set);  
		           //Removing elements on the basis of specified condition  
		           set.removeIf(str->str.contains("Vijay"));    
		           System.out.println("After invoking removeIf() method: "+set);  
		           //Removing all the elements available in the set  
		           set.clear();  
		           System.out.println("After invoking clear() method: "+set);  
		 }  
}
