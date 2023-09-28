package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		
		//Types of Casting
		//Implicit Casting, Explicit Casting
		//byte-short-int-long-float-double
		//-----------char
		byte b1 = 10;
		
		short s1 = b1;
		System.out.println(s1);
		
		int i1 = s1;
		System.out.println(i1);
		
		long l1 = i1;
		System.out.println(l1);
		
		float f1 = l1;
		System.out.println(f1);
		
		double d1 = f1;
		System.out.println(d1);
		
		char ch = 'A';
		//byte b11 = ch;
		//short s11 = ch;
		int i11 = ch;
		System.out.println(i11); // 65
		long l11 = ch;
		System.out.println(l11);
		float f11 = ch;
		System.out.println(f11);
		double d11 = ch;
		System.out.println(d11);
		
		
	}
}