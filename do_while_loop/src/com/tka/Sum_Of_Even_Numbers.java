package com.tka;

public class Sum_Of_Even_Numbers {
	public static void main(String[] args) {
		int i = 2;
		int sum = 0;
		do {
			//System.out.println(i);
			sum = sum + i;
			i+=2;
		}while(i <= 20);
		System.out.println("Sum of Even Numbers =" + sum);
	}

}
