package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {

		//switch case
		//Cannot switch on a value of type double. Only convertible int values, strings or enum variables are permitted
		//Cannot switch on a value of type float. Only convertible int values, strings or enum variables are permitted
		//Cannot switch on a value of type long. Only convertible int values, strings or enum variables are permitted
		int userSalary = 60000;
		switch (userSalary) {
		case 10000:
			System.out.println("User Salry is " + userSalary);
			break;
		case 20000:
			System.out.println("User Salry is " + userSalary);
			break;
		case 30000:
			System.out.println("User Salry is " + userSalary);
			break;
		case 40000:
			System.out.println("User Salry is " + userSalary);
			break;
		case 50000:
			System.out.println("User Salry is " + userSalary);
			break;

		default:
			System.out.println("User Salry is out of range");
			break;
		}
	}

}
