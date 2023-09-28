package com.dl.abs;

public abstract class Eg3 {

	public static void main(String[] args) {
		
		//new Eg3(); //Cannot instantiate the type Eg3
	}
	
	{
		System.out.println("Instance Block");
	}
	
	
	static {
		System.out.println("Static Block");
	}
}
