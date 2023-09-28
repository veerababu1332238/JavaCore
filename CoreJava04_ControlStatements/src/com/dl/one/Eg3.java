package com.dl.one;

import java.util.Scanner;

public class Eg3 {

	public static void main(String[] args) {

		// else if
//		double userSalary = 60000;
//		
//		if(userSalary == 10000) {
//			System.out.println("User Salary is " + userSalary);
//		}else if(userSalary == 20000) {
//			System.out.println("User Salary is " + userSalary);
//		}else if(userSalary == 30000) {
//			System.out.println("User Salary is " + userSalary);
//		}else if(userSalary == 40000) {
//			System.out.println("User Salary is " + userSalary);
//		}else if(userSalary == 50000) {
//			System.out.println("User Salary is " + userSalary);
//		}else {
//			System.out.println("User Salary is not validated");
//		}

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your Salary");
		double uSalary = scanner.nextDouble();
		if (uSalary == 10000) {
			System.out.println("User Salary is " + uSalary);
		} else if (uSalary == 20000) {
			System.out.println("User Salary is " + uSalary);
		} else if (uSalary == 30000) {
			System.out.println("User Salary is " + uSalary);
		} else if (uSalary == 40000) {
			System.out.println("User Salary is " + uSalary);
		} else if (uSalary == 50000) {
			System.out.println("User Salary is " + uSalary);
		} else {
			System.out.println("User Salary is not validated");
		}
		scanner.close();

	}
}
