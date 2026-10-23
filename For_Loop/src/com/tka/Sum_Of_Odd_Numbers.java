package com.tka;

public class Sum_Of_Odd_Numbers {
	public static void main(String args[]) {
		int sum = 0;
		for(int i = 1;i<=20;i+=2) {
			sum = sum+i;
		}
		System.out.println("Sum of Odd Numbers ="+sum);
	}

}
