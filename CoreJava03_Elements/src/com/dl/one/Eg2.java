package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		//Methods
		//1.Non Static / Instance Method
		//2.Static Method
		
		//Instance
		Eg2 eg2 = new Eg2();
		eg2.add(); 
		new Eg2().add();
		
		//Two ways
		delete();
		Eg2.delete();
	}
	
	//Instance Method / Non Static
	public void add() {
		System.out.println("add() Method");
	}
	
	//Static Method
	public static void delete() {
		System.out.println("delete() Method");
	}

}