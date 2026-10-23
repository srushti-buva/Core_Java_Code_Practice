package com.tka;

public class Sum_Of_Digits {
	public static void main(String[] args) {
		int num = 34567;
		int sum = 0;
		while(num > 0) {
			int digit = num % 10;
			sum = sum + digit;
			num = num / 10;
			
		}
		System.out.println("Sum of digits = "+ sum);
	}

}
