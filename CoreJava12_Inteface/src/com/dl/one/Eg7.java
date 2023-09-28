package com.dl.one;

interface One{
	
	void m1();
	void m2();
	void m3();
	void m4();
	
}

abstract class OneImpl implements One{

	@Override
	public void m1() {
		System.out.println("M1 Mehtod");
		
	}

	@Override
	public void m2() {
		System.out.println("M2 Method");
		
	}
	
}

public class Eg7 extends OneImpl{

	public static void main(String[] args) {
		
		  OneImpl impl =  new Eg7();
		  impl.m1();
		  impl.m2();
		  impl.m2();
		  impl.m4();

	}

	@Override
	public void m3() {
		System.out.println("M3 Mehtod");
		
	}

	@Override
	public void m4() {
		System.out.println("M4 Mehtod");
		
	}

}