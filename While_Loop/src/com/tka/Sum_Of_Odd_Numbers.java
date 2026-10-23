package com.tka;

public class Sum_Of_Odd_Numbers {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i<=20) {
			sum = sum+i;
			i+=2;   //i = i+2
		}
		System.out.println("Sum ="+ sum);
	}

}
