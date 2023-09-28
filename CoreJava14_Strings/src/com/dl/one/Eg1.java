package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		
		//String
		//Strings are sequence of characters
		char ch[] = {'s', 'a', 'i', 'k', 'i', 'r', 'a', 'n'};
		System.out.println(ch);
		
		//String is immutable, once we create we cannot modify it
		
		//Ways to create a String 
		//2 ways
		//Using Literal
		String s1 = "SaiKiran";
		System.out.println(s1);
		
		//Using new keyword
		String s2 = new String("SaiKiran");
		System.out.println(s2);

	}

}