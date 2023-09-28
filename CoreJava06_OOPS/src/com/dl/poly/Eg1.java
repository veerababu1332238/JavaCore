package com.dl.poly;

public class Eg1 {

	public static void main(String[] args) {
		
		//Method Overloading
		//One Class is enough
		//Method Name must be same, args can be diff
		Eg1 eg1 = new  Eg1();
		eg1.m1(10);
		eg1.m1(10L);
		eg1.m1(10d);
		
	}
	
	public void m1(int a) {
		System.out.println("Int: " + a);
	}
	
	public void m1(long l) {
		System.out.println("Long: " + l);
	}
	
	public void m1(double d) {
		System.out.println("Double: " + d);
	}
}