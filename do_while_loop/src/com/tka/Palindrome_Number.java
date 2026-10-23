package com.tka;

public class Palindrome_Number {
	public static void main(String[] args) {
		int n = 121;
		int original = n;
		int reverse = 0;
		do{
			int digit = n % 10;
			reverse = reverse * 10 + digit;
			n = n /10;
		} while( n > 0);
		
		if( original == reverse) {
			System.out.println(" Number is palindrome");
		}else {
			System.out.println(" Number is not palindrome");
		}
	}

}
