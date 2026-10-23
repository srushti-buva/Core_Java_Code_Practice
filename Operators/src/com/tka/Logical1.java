package com.tka;

public class Logical1 {
	public static void main(String args []) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		boolean result = ((a >= b && c >b) || b<= c || !(a == b) );
		//                                             false &&    true ||true || true
		//                        true &&true ||true
		//                        true && true
		// true
	   
		System.out.println(result);
		
		boolean result1 =(a >= 20 && b == c || !(a<= 10));
		System.out.println(result1);
		
		
		
		
		
	}

}
