package com.tka;

public class Logical4 {
	public static void main(String args[]) {
		int a = 15; 
		int b = 25; 
		int c = 35; 
		int d = 45;
		
		boolean result = (a > b && !(c<= b) || a >b == c<b && !(a <= b));
		System.out.println(result);
		
	}

}
