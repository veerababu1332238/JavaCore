package com.dl.inheritance;

class GrandParent{
	
	void m1() {
		System.out.println("M1 Method");
	}
}

class Parent extends GrandParent{
	
	void m2() {
		System.out.println("M2 Method");
	}
}

class Child extends GrandParent {
	
	void m3() {
		System.out.println("M3 Method");
	}
}

public class Eg7 {

	public static void main(String[] args) {
		
		//Hierarchail
		Parent parent = new Parent();
		parent.m1(); 
		parent.m2();
		
		Child child = new Child();
		child.m1();
		child.m3();
	}
}