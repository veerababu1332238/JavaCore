package com.dl.inheritance;

class A{
	
	void m1() {
		System.out.println("M1 Method of Class A");
	}
}

class B extends A{
	
	void m2() {
		System.out.println("M2 Method of Class B");
	}
}

//Inheritance
//Acquiring properties from one class to another class
public class Eg3 {

	public static void main(String[] args) {
		
		B b = new B();
		b.m1(); 
		b.m2();
	}
}