package com.tka;

public class Sum_of_Odd_Numbers {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		do {
			sum = sum+i;
			i += 2;
		}while( i<= 20);
		
		System.out.println("Sum of odd numbers = "+ sum);
	}

}
