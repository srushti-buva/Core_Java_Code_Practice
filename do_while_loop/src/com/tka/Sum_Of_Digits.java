package com.tka;

public class Sum_Of_Digits {
	public static void main(String[] args) {
		int num = 123456;
		int sum = 0;
		do {
			int digit = num % 10;
			sum = sum+ digit;
			num = num / 10;
			
			
		}while( num != 0);
		System.out.println("Sum of digits = " + sum);
	}

}
