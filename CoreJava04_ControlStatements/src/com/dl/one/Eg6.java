package com.dl.one;

import java.util.Scanner;

public class Eg6 {

	public static void main(String[] args) {
		
		//while loop
//		while (true) {
//			System.out.println("While loop ");
//		}
		
		int i = 0;
		while (i<=5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println(" ");
		
		i = 5;
		while (i >= 0) {
			System.out.println(i);
			i--;
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number ");
		int ii = scanner.nextInt();
		while (ii<=5) {
			System.out.println(ii);
			ii++;
		}
		scanner.close();
	}
}