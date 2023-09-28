package com.dl.abs;

abstract class A{
	
	public void m1() {
		System.out.println("M1 Method Non ABS");
	}
	
	public abstract void m2();
}

class B extends A{

	@Override
	public void m2() {
		System.out.println("M2 Method Implementtaion");
	}
	
}

public class Eg1 {

	public static void main(String[] args) {
		
		//Abs Class can have Abstract Method and non Abstract Method
		B b = new B();
		b.m1(); 
		b.m2();
		
		A a = new B();
		a.m1(); 
		a.m2();
	}
}
