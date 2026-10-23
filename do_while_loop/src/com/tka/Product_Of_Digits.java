package com.tka;

public class Product_Of_Digits {
	public static void main(String[] args) {
		int num = 234;
		int product = 1;
		do {
			int digit = num % 10;
			product = product * digit;
			num = num / 10;
		}while( num > 0);
		System.out.println(" Product of digits = "+ product);
	}

}
