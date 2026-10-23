package com.tka;

public class Sum_Of_Numbers {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		do {
			// System.out.println(i);
			sum = sum+ i;
			i++;
		}while( i <= 10);
		
		System.out.println(" Sum of Numbers = " +sum );
	}

}
