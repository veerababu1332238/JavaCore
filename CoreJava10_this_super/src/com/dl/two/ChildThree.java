package com.dl.two;

class ParentThree {

	public ParentThree() {
		System.out.println("Default Cons ParentThree");
	}
	
	public ParentThree(int a) {
		System.out.println("Para ParentThree " + a);
	}
}

public class ChildThree extends ParentThree {

	public ChildThree() {
		this(10, 20);
		System.out.println("Default Cons ChildThree");
	}
	
	public ChildThree(int a, int b) {
		super(10);
		System.out.println("Para ChildThree " + a + " " + b);
	}
	
	public static void main(String[] args) {
		
		new ChildThree();
	}
}