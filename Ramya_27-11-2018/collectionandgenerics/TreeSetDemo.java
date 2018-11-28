package com.tharanga.collectionandgenerics;

import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

   
    public int compareTo(Person p) {
        return this.name.compareTo(p.name);
    }

    
    public String toString() {
        return this.name;
    }
}
public class TreeSetDemo {
	public static void main(String args[])
	{
		SortedSet<Person> sortedSet = new TreeSet<>();
		sortedSet.add(new Person(1, "Rakshi"));
		sortedSet.add(new Person(2, "Deepu"));
		sortedSet.add(new Person(3, "Prema"));
		sortedSet.add(new Person(4, "Lakshmi"));
		sortedSet.forEach(System.out::println);
	}
}
