package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		
		Eg5 userOne = new Eg5();
		userOne.createAccount("Sai Kiran", 98765433210L, "saikiran@gmail.com", "Hyd", "XYZ"); //Object1
		bankDetails("ICICI", "Hyd"); //Single Copy
		
		Eg5 userTwo = new Eg5();
		userTwo.createAccount("Sai Kumar", 98765433210L, "saikumar@gmail.com", "Hyd", "XYZ"); // Object1
		bankDetails("ICICI", "Hyd"); //Single Copy
		
		Eg5 userThree = new Eg5();
		userThree.createAccount("Sai Ram", 98765433210L, "sairam@gmail.com", "Hyd", "XYZ"); // Object1
		bankDetails("ICICI", "Hyd"); //Single Copy
		
	}
	
	//Methods
	//Instance Method (Need bank customers)
	public void createAccount(String userName, long userContact, String userEmail, String userAddress, String userPancard) {
		
		System.out.println("UserName: " + userName);
		System.out.println("UserContact: " + userContact);
		System.out.println("UserEmail: " + userEmail);
		System.out.println("UserAddress: " + userAddress);
		System.out.println("UserPancard: " + userPancard);
		
	}
	
	//Static Method (Need bank Details)
	public static void bankDetails(String bankName, String bankAddress) {
		
		System.out.println(bankName);
		System.out.println(bankAddress);
		System.out.println("");
	}
}
