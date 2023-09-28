package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		//String Literals
		String s1 = "Java"; //1 (SCP)
		System.out.println(s1);
		
		//new keyword
		String s2 = new String("Java"); //2 (SCP) (Heap)
		System.out.println(s2);

		String s3 = "Java"; //1 (SCP)
		System.out.println(s3);
		
		//new keyword
		String s4 = new String("Java"); //2 (SCP) (Heap)
		System.out.println(s4);
		
		//content compariosn
		//literal
		System.out.println(s1.equals(s3));
		
		//new keyword
		System.out.println(s2.equals(s4));
		
		//ref compariosn
		//literals
		System.out.println(s1 == s3);
		
		//new keyword
		System.out.println(s2 == s4);
	}

}
