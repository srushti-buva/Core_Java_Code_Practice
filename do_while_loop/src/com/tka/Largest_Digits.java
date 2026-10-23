package com.tka;

public class Largest_Digits {
	public static void main(String[] args) {
		int num = 123567;
		int largest = 0;
		do {
			int digit = num % 10;
			if( digit > largest) {
				largest = digit;
			}
			num = num / 10;
		}while (num > 0);
		
		System.out.println(" Largest digit is = "+ largest);
	}

}
