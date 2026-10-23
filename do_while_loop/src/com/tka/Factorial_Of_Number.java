package com.tka;

public class Factorial_Of_Number {
	public static void main(String[] args) {
		int num = 5;
		int i = 1;
		int fact = 1;
		do {
			fact = fact * i;
			i++;
		}while (i<= num);
		
		System.out.println(" Factorial of Five ="+ fact);
		
	}

}
