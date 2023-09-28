package com.dl.one;

public class Eg1 {
	
	private static int id = 101;
	private static String username = "Sai Kiran";
	static String email = "saikiran@gmail.com";
	static long contactNo = 9876543210L;
	protected String address = "Hyd";
	public String state = "TS";
	
	public static void main(String[] args) {

		//Modifiers
		//Private : Same Class and Same Package
		//Protected : Diff Package and Inheritance
		//Public : Diff Class and Diff Package
		//Default : Diff Classes and Same Package
		System.out.println(id);
		System.out.println(username);
		
	}

}