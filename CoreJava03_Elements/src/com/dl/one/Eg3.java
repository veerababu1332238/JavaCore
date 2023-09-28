package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		
		//Loading the object
		new Eg3();
		
	}
	
	static{
		int x = 10;
		System.out.println("Static Block");
		System.out.println(x);
	}
	
	{
		int a = 10;
		System.out.println("Instance Block");
		System.out.println(a);
	}
	
}
