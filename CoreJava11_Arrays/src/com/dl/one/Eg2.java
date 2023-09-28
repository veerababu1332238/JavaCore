package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		//create array and initialize it
		int a[] = {10, 20, 30, 40, 50};
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		//providing negative and zero number as the size to array
		//int b[] = new int[-5];
		//b[-4] = -40;
		//System.out.println(b[-4]); //java.lang.NegativeArraySizeException
		
		
		//providing negative and zero number as the size to array
//		int c[] = new int[0];
//		c[0] = 10;
//		System.out.println(c[0]); //java.lang.ArrayIndexOutOfBoundsException
		
		//finding the length of an array
		System.out.println(a.length);  // 5
		System.out.println(a.length-1); //4
		System.out.println(a.length*2); //10
		System.out.println(a.length); // 5
		

	}

} 
