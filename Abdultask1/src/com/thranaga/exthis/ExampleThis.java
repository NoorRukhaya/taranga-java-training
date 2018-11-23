package com.thranaga.exthis;

public class ExampleThis {

		//instance variable.
		int rollNo;
		String name;

		ExampleThis(String name, int rollNo){
		//local variable.
		this.name = name;
		this.rollNo = rollNo;
		}

		public void displayDetails(){
		System.out.println("RollNo = " + rollNo);
		System.out.println("name = " + name);
		}

			
		public static void main(String args[]){
		//creating Student class object.
		ExampleThis  stu1 = new ExampleThis("jai", 6);
		//method call
		stu1.displayDetails();
		}
		}
