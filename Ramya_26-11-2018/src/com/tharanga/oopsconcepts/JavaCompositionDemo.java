package com.tharanga.oopsconcepts;

public class JavaCompositionDemo {

	public static void main(String[] args) {
		
		Person person = new Person();
        long salary = person.getSalary();
        System.out.println("Person Salary is: "+person.getSalary());
	}

}
