package com.dl.one;

public class Employee {

	//this() refers to the current class constructor
	public Employee() {
		this("Sai Kiran", 9876543210L);
		System.out.println("Default Cons");
	}

	public Employee(String empName, long empContact) {
		System.out.println(empName);
		System.out.println(empContact);
	}

	public static void main(String[] args) {

		new Employee();
	}
}
