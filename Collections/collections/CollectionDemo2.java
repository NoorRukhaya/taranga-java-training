package com.tharanga.collections;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {  
    public String name;  
  public Student(String name) {  
    this.name = name;  
  }  
  public int compareTo(Student person) {  
    return name.compareTo(person.name);  
      
  }   
}  
public class CollectionDemo2 {
	public static void main(String[] args) {  
	      ArrayList<Student> al=new ArrayList<Student>();  
	      al.add(new Student("Viru"));  
	      al.add(new Student("Saurav"));  
	      al.add(new Student("Mukesh"));  
	      al.add(new Student("Tahir"));  
	      
	    Collections.sort(al);  
	    for (Student s : al) {  
	      System.out.println(s.name);  
	    }  
	  }  
}
