package com.tka;

public class Sum_Of_Even_Numbers {
	public static void main(String[] args) {
		int i =2;
		int sum = 0;
		while(i<= 20) {
			sum = sum +i;
			i+=2;
		}
		System.out.println("Sum = "+ sum);
	}

}
