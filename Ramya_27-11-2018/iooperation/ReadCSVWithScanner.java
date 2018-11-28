package com.tharanga.iooperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	
	 class Employee {

		private int id;
		private String name;
		private String role;
		private String salary;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		public String getSalary() {
			return salary;
		}
		public void setSalary(String salary) {
			this.salary = salary;
		}
		
		@Override
		public String toString(){
			return "\nID="+getId()+"::Name"+getName()+"::Role="+getRole()+"::Salary="+getSalary();
		}
	}

	 public class ReadCSVWithScanner {
	public static void main(String[] args) throws IOException {
		// open file input stream
		BufferedReader reader = new BufferedReader(new FileReader("D:\\aa\\aa.csv"));

		// read file line by line
		String line = null;
		Scanner scanner = null;
		int index = 0;
		List<Employee> empList = new ArrayList<>();

		while ((line = reader.readLine()) != null) {
			Employee emp = new Employee();
			scanner = new Scanner(line);
			scanner.useDelimiter(",");
			while (scanner.hasNext()) {
				String data = scanner.next();
				if (index == 0)
					emp.setId(Integer.parseInt(data));
				else if (index == 1)
					emp.setName(data);
				else if (index == 2)
					emp.setRole(data);
				else if (index == 3)
					emp.setSalary(data);
				else
					System.out.println("invalid data::" + data);
				index++;
			}
			index = 0;
			empList.add(emp);
		}
		
		//close reader
		reader.close();
		
		System.out.println(empList);
		
	}
}

