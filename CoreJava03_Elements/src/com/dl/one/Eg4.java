package com.dl.one;

public class Eg4 {
	
	//Object Creation is required to call Default Cons
	public Eg4() {
		System.out.println("Default Cons");
	}

	public Eg4(int a) {
		System.out.println("Para Cons");
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		//Object
		new Eg4();
		
		new Eg4(10);
		
	}
}
