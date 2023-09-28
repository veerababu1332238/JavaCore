package com.dl.inheritance;

class AA{
	
	void m1() {
		System.out.println("M1 Method");
	}
}

class BB extends AA{
	
	void m2() {
		System.out.println("M2 Method");
	}
}

class CC extends BB{
	
	void m3() {
		System.out.println("M3 Method");
	}
}
public class Eg5 {
	
	
	//Multilevel
	public static void main(String[] args) {

		CC cc = new CC();
		cc.m1();
		cc.m2(); 
		cc.m3();
	}

}
