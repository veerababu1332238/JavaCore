package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Eg2 {

	public static void main(String[] args) throws IOException {
		
//		int a = 10;
//		if(a < 20) {
//			System.out.println("If Block Executed 01");
//		}else {
//			System.out.println("Else Block Executed 01");
//		}
		
		//XXX Methods
		//Casting is not required in Scanner Class
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter any number: ");
//		int aa = scanner.nextInt();
//		if(aa < 20) {
//			System.out.println("If Block Executed 02");
//		}else {
//			System.out.println("Else Block Executed 02");
//		}
//		scanner.close();
		
		
		//BufferReader
		//Casting is required in Scanner Class
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter any number: ");
		String readLine = reader.readLine();
		int aaa = Integer.parseInt(readLine);
		System.out.println(aaa);
		if(aaa < 20) {
			System.out.println("If Block Executed 03");
		}else {
			System.out.println("Else Block Executed 03");
		}
		reader.close();
		
	}
}
