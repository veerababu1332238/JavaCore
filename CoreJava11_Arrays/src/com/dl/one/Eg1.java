package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {

		//Arrays are fixed in size
		//Arrays can hold same type of data(homogenious)
		
		//Create a array and provide size to it
		int a[] = new int[5];
		System.out.println(a);
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		//System.out.println(a[5]); //java.lang.ArrayIndexOutOfBoundsException
		
		//char
		char ch[] = new char[5];
		ch[0] = 'a';
		ch[1] = 'p';
		ch[2] = 'p';
		ch[3] = 'l';
		ch[4] = 'e';
		System.out.println(ch[0]);
		System.out.println(ch[1]);
		System.out.println(ch[2]);
		System.out.println(ch[3]);
		System.out.println(ch[4]);
		
		//Wrapper Class
		Integer i[] = new Integer[5];
		
		
	}

}