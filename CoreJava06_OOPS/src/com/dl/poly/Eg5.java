package com.dl.poly;

class AA {

	public AA() {
		System.out.println("Default Cons Class A");
	}
}

class BB extends AA {
	
	//No Constructor Overriding
//	public AA() {
//		System.out.println("Default Cons Class A");
//	}

	public BB() {
		System.out.println("Deafult Cons Class B");
	}
}

public class Eg5 {

	public static void main(String[] args) {

		new BB();
	}
}