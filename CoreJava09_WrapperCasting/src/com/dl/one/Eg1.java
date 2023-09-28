package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		
		double d1 = 100.25;
		float f1 = (float)d1;
		System.out.println(f1);
		
		double d2 = 100.25;
		Float f2 = (float)d2;
		System.out.println(f2);
		
		Long l2 = (long)d2;
		System.out.println(l2);
		
		Double d3 = 100.25;
		Integer i1 = (Integer)d3.intValue();
		System.out.println(i1);
		
	}
}