package com.tka;

public class Reverse_Number {
	public static void main(String[] args) {
		int n = 12345;
		int reverse = 0;
		for (; n> 0; n = n/10) {
			int digit = n % 10;
			reverse = reverse * 10 + digit;
		}
		System.out.println("Reverse = "+ reverse);
	}

}
