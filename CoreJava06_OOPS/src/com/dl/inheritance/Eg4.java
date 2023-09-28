package com.dl.inheritance;

class Big{
	
	void m1() {
		System.out.println("M1 Method of Big");
	}
}

class Small extends Big{
	
	void m2() {
		System.out.println("M2 Method of Small");
	}
}
public class Eg4 {

	public static void main(String[] args) {
		
		//Normal Class
		Big a = new Big();
		a.m1();
		
		//Inheritance
		Small b = new Small();
		b.m1(); 
		b.m2();
		
		//Ploy
		Big b1 = new Small();
		b1.m1();
		
		//Casting
		//Small s1 = (Small)new Big(); //java.lang.ClassCastException
		Small s2 = (Small)b1;
		s2.m1();
		s2.m2();
		
	}
}
