package com.dl.literals;

public class Eg1 {

	public static void main(String[] args) {
		
		//Literals 
		//Literals are constant values
		//Types of Literals
		
		//Integer Literals
		int a = 10;
		System.out.println(a);
		Integer aa = 10;
		System.out.println(aa);
		
		//Floating Point Literals
		float f1 = 10.0f;
		Float f2 = 20.0f;
		System.out.println(f1);
		System.out.println(f2);
		
		//Double
		
		//Character Literals
		char ch1 = 'A';
		Character ch2 = 'A';
		System.out.println(ch1);
		System.out.println(ch2);
		
		//Boolean Literals
		boolean b1 = true;
		Boolean b2 = true;
		System.out.println(b1);
		System.out.println(b2);
		
		//Binary, Octal, Hexadecimal
		//0b, base is 2, Numbers: 0, 1
		int b3 = 0b1010;
		System.out.println(b3);
		
		//Octal O, base 8, 0 to 7
		int oct = 0123;
		System.out.println(oct); //83
		
		//Prefix 0x, Base 16, 0 to 9, a to f
		int hex = 0XACE;
		System.out.println(hex);
	}
}
