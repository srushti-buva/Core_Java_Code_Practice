package com.tka;

public class Product_Of_Digits {
	public static void main(String[] args) {
		int num = 1234;
		int product = 1;
		for(; num > 0; num = num/10) {
			product = product * (num % 10);
		}
		System.out.println("Product =" + product);
	}

}
