package com.dl.one;

interface AA{
	
	int a = 10; 
	public static final int b = 20;
	int c = 20;
	
}
public class Eg5 implements AA {

	public static void main(String[] args) {

		System.out.println(Eg5.a);
		System.out.println(Eg5.b);
		System.out.println(Eg5.c);
	}

}