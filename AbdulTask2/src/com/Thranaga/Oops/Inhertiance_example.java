package com.Thranaga.Oops;

public class Inhertiance_example {
float salary=40000f;
}
class Employee extends Inhertiance_example{
	int bonus=10000;  
	 public static void main(String args[]){  
	    Employee p=new Employee();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);
}}