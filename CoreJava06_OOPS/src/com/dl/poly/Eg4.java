package com.dl.poly;

class A{
	
	public void m1() {
		System.out.println("M1 Method of Class A");
	}
}

class B extends A{
	
	public void m1() {
		System.out.println("M1 Method of Class B");
	}
}

public class Eg4 {

	public static void main(String[] args) {

		//Method Overriding
		//Need two classes, Method Name must be same
		
		//Normal Class
		A a = new A();
		a.m1();
		
		//Inheritance
		B b = new B();
		b.m1();
		
		//Ploy
		A aa = new B();
		aa.m1();
		
	}

}