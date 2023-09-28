package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		
		//Immutable
		String s1 = "Java";
		System.out.println(s1);
		
		String s2 = new String("Python");
		System.out.println(s2);
		
		//Mutable
		//synchronized
		//@since   1.0
		StringBuffer sb1 = new StringBuffer("JavaScript");
		System.out.println(sb1);
		System.out.println(sb1.append("ReactJS"));
		System.out.println(sb1);
		
		//not a synchronized
		//since       1.5
		StringBuilder sb2 = new StringBuilder("NodeJs");
		System.out.println(sb2);
		System.out.println(sb2.append("ReactNative"));
		System.out.println(sb2);

	}

}
