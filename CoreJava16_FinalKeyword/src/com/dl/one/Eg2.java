package com.dl.one;

class Parent {

	public final void m1() {

		System.out.println("M1 Method Parent");
	}

}

class Child extends Parent{
	
//	public void m1() {
//
//		System.out.println("M1 Method Child");
//	}
	
}
public class Eg2 {
	
	//if a method declared as final we cannot override it
	public static void main(String[] args) {
		
		Parent p = new Child();
		p.m1();
	}
}