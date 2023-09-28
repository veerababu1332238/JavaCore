package com.dl.one;

public class UserProfile {

	// instance variables
	public String userName;
	public String email;
	public long contact;
	public String address;

	// this keyword will refer to the current class instance variables
	public UserProfile(String userName, String email, long contact, String address) {
		this.userName = userName;
		this.email = email;
		this.contact = contact;
		this.address = address;
	}

//	//properties are diff
//	public UserProfile(String uName, String mail, long con, String add) {
//		userName = uName;
//		email = mail;
//		contact = con;
//		address = add;
//	}

//	public UserProfile(String userName, String email, long contact, String address) {
//		userName = userName;
//		email = email;
//		contact = contact;
//		address = address;
//	}

	// instance method display()
	public void display() {
		System.out.println(userName);
		System.out.println(email);
		System.out.println(contact);
		System.out.println(address);
	}

	public static void main(String[] args) {

		UserProfile profile = new UserProfile("Sai Kiran", "sai@gmail.com", 9876543210L, "Hyd");
		profile.display();
	}
}
