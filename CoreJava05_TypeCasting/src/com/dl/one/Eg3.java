package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		
		//byte-short-int-long-float-double
		//-----------char
		
		int a = 10;
		int b = 20;
		
		short s1 = (short)(a+b);
		System.out.println(s1);
		
		double d1 = 10;
		byte b1 = (byte)(short)(int)(long)(float)(double)d1;
		System.out.println(b1);
		
		short s11 = (byte)(short)(int)(long)(float)(double)d1;
		System.out.println(s11);
		
	}
}
