package com.dl.one;

import java.util.Scanner;

public class Eg5 {
	
	static Scanner scanner;

	public static void main(String[] args) {
		
		//Iteration Statements for, while, do-while, for each
		for(int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		
		System.out.println(" ");
		
		for(int i = 5; i >= 0; i--) {
			System.out.println(i);
		}
		
		scanner = new Scanner(System.in);
		System.out.println("Enetr a number ");
		int i = scanner.nextInt();
		for(System.out.println(i); i <= 10; i++) {
			System.out.println(i);
		}
		scanner.close();
	}

}
