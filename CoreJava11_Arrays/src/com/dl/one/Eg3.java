package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		
		System.out.println("For loop");
		int a[] = {10, 20, 30, 40, 50};
		
		//Itteration for, while, do-while, for-each (Arrays and Collections)
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("For loop");
		
		for (int i = 0; i < 2; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("For loop");
		
		for (int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		
		System.out.println("While Loop");
		
		int j = 0;
		while (j<5) {
			System.out.println(a[j]);
			j++;
		}
		
		System.out.println("Do While");
		
		int k = 0;
		do {
			System.out.println(a[k]);
			k++;
		} while (k<5);
		
		System.out.println("For Each");
		
		for (int i : a) {
			System.out.println(i);
		}
	}

}
