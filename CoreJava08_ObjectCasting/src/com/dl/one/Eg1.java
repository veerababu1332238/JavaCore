package com.dl.one;

class Big{
	
	public void m1() {
		System.out.println("M1 Method Big");
	}
}

class Small extends Big{
	
	public void m2() {
		System.out.println("M2 Method Small");
	}
	
}
public class Eg1 {
	public static void main(String[] args) {
		
		//Inheritance
		Small small = new Small();
		small.m1();
		small.m2();
		
		//Ploymorphsim
		Big big = new Small();
		big.m1();
		
		//Casting
		Small small2 = (Small)big;
		small2.m1();
		small2.m2();
		
		//Child c = (Child)new Parent();
		Small small3 = (Small)new Big();
		System.out.println(small3); //java.lang.ClassCastException
	}

}