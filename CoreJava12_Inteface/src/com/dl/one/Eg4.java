package com.dl.one;

interface ParentOne{
	
	void m1();
	public void m2();
	public abstract void m3();
	public abstract void m4();
	
	
}
public class Eg4 implements ParentOne{

	public static void main(String[] args) {
		
		Eg4 eg4 = new Eg4();
		eg4.m1();
		eg4.m2();
		eg4.m3();
		eg4.m4();
		
		ParentOne p = new Eg4();
		p.m1();
		p.m2();
		p.m3();
		p.m4();

	}

	@Override
	public void m1() {
		System.out.println("M1 Method");
		
	}

	@Override
	public void m2() {
		System.out.println("M2 Method");
		
	}

	@Override
	public void m3() {
		System.out.println("M3 Method");
		
	}

	@Override
	public void m4() {
		System.out.println("M4 Method");
		
	}

}