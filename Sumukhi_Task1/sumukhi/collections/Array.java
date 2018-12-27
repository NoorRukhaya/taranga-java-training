package com.thranaga.collections;

import java.util.*;
    class TestJavaCollection1{  
		public static  void main (String args[]){  
		ArrayList<String> list=new ArrayList<String>();
		list.add("Praneet");
		list.add("Sumu");  
		list.add("Ravi");  
		list.add("Ajay");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		}  
	}
