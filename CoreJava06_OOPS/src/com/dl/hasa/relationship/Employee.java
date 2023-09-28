package com.dl.hasa.relationship;

class Company{
	
	String companyName;
	String compnayAddress;
	
	public Company(String companyName, String compnayAddress) {
		this.companyName = companyName;
		this.compnayAddress = compnayAddress;
	}
}
public class Employee {
	
	int empId;
	String empUserName;
	String empEmail;
	Company company; // data member
	

	public Employee(int empId, String empUserName, String empEmail, Company company) {
		super();
		this.empId = empId;
		this.empUserName = empUserName;
		this.empEmail = empEmail;
		this.company = company;
	}
	
	public void display() {
		System.out.println(empId);
		System.out.println(empUserName);
		System.out.println(empEmail);
		System.out.println(company.companyName);
		System.out.println(company.compnayAddress);
	}

	public static void main(String[] args) {
		
		Company com = new Company("TCS", "Madhapur");
		Employee employee = new Employee(2476, "SaiKiran", "saikiran@gmail.com", com);
		employee.display();
	}
}
