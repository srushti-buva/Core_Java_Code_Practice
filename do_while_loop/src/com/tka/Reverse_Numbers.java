package com.tka;

public class Reverse_Numbers {
	public static void main(String[] args) {
		int num = 123456;
		int reverse = 0;
		do {
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num = num /10;
		}while( num != 0);
		
		System.out.println( "Reverse Number = "+ reverse);
	}

}
