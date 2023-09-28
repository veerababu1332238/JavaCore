package com.dl.abs;

abstract class Product {

	static int productPrice;
	static int discount;

	public void getDiscount(int offer) {
		discount = productPrice - offer;
		System.out.println("After discount product price is " + discount);
	}

	public void getUserDetails(String fname, String lname, String productName) {

		System.out.println("User FirstName: " + fname);
		System.out.println("User LastName" + lname);
		System.out.println("User ProductName: " + productName);
	}
}

class ProductImpl extends Product{
	

}
public class Eg7 {

	public static void main(String[] args) {

		ProductImpl impl = new ProductImpl();
		impl.getUserDetails("Sai", "Kiran", "Samsung");
		ProductImpl.productPrice = 12000;
		impl.getDiscount(2000);
	}

}
