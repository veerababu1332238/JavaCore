package com.dl.poly;

public class Eg3 {

	public static void main(String[] args) {

		//Constructor Overloading
		//One class, but args must be diff
		new Eg3();
		new Eg3(10);
		new Eg3(10L);
		
	}
	
	public Eg3() {
		System.out.println("Default Cons");
	}
	
	public Eg3(int a) {
		System.out.println("Para Cons int: " + a);
	}
	
	public Eg3(long l) {
		System.out.println("Para Cons long: " + l);
	}

}
