package com.tharanga.encapsulation;

public class EncapsulationDemo1 {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("Ramya");
		emp1.setAddress("Tumkur");
		emp1.setPhonenumber(7829096);
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getAddress());
		System.out.println(emp1.getPhonenumber());
		
		Employee emp2 = new Employee();
		emp2.setName("Chaitra");
		emp2.setAddress("Bangalore");
		emp2.setPhonenumber(12345);
		
		System.out.println(emp2.getName());
		System.out.println(emp2.getAddress());
		System.out.println(emp2.getPhonenumber());

	}

}
