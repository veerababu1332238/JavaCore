package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		//Explicit Casting
		//double-float-long-int-short-byte
	    //------------------char
		
		double d1 = 10;
		float f1 = (float)d1;
		System.out.println(f1);
		
		long l1 = (long)f1;
		System.out.println(l1);
		
		int i1 = (int)l1;
		System.out.println(i1);
		
		short s1 = (short)i1;
		System.out.println(s1);
		
		byte b1 = (byte)s1;
		System.out.println(b1);
		
		char ch = 'A';
		short s11 = (short)ch;
		System.out.println(s11);
		
		byte b11 = (byte)ch;
		System.out.println(b11);
		
	}
}