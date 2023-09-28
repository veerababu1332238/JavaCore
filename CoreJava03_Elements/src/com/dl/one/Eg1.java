package com.dl.one;

public class Eg1 {
	
	//Non Static
	int x = 100;
	int y = 200;
	
	//Static
	static int i = 300;
	static int j = 400;

	public static void main(String[] args) {

		// Variable : Variable holds the value and stores the value
		// Types of variables
		// 1.Instance Variables / Non Static Variable / Note: new ClassName();
		// 2.Static Variables / Note: className
		// 3.Local Variables

		// Local Variables
		int a = 500;
		int b = 600;
		System.out.println(a);
		System.out.println(b);

		//Instance Call
		Eg1 eg = new Eg1();
		System.out.println(eg.x);
		System.out.println(eg.y);
		
		System.out.println(new Eg1().x);
		System.out.println(new Eg1().y);
		
		//Static Call
		System.out.println(i);
		System.out.println(j);
		
		System.out.println(Eg1.i);
		System.out.println(Eg1.j);
		
	}

}
