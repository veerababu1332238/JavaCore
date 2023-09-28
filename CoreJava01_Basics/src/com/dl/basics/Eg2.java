package com.dl.basics;

import java.util.Arrays;

public class Eg2 {

	public static void main(String[] args) {
		
		//Primitive Data types  // 8
		//Variable : It holds the values and store the value 
		
		//Numbers
		byte b = 10; 
		//byte is data type 
		//b is variable
		//= is operator
		//10 is value
		System.out.println(b);
		
		short s = 20;
		System.out.println(s);
		
		int i = 30;
		System.out.println(i);
		
		long l = 40l;
		System.out.println(l);
		
		//Floating Points
		float f = 10.0f;
		System.out.println(f);
		
		double d = 20.0d;
		System.out.println(d);
		
		//Characters
		char ch = 'A';
		System.out.println(ch);
		
		//Boolean
		boolean b1 = true;
		System.out.println(b1);
		
		//Non Primitive Data types
		String s1 = "Sai Kiran";
		System.out.println(s1);
		
		//Arrays
		int a[] = {10, 20, 30, 40, 50};
		System.out.println(Arrays.toString(a)); //[10, 20, 30, 40, 50]
		
	}

}
