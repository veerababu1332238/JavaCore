package com.dl.one;

interface AAA{
	
	void m1();
	
}

interface BBB{
	
	void m2();
}

public class Eg6 implements AAA, BBB {

	public static void main(String[] args) {
		
		AAA a = new Eg6();
		a.m1();
		
		BBB b = new Eg6();
		b.m2();

	}

	@Override
	public void m2() {
		System.out.println("M1 Method");
		
	}

	@Override
	public void m1() {
		System.out.println("M2 Method");
		
	}

}