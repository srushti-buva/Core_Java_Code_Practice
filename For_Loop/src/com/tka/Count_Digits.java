package com.tka;

public class Count_Digits {
	public static void main(String[] args) {
		int num = 123456;
		int count = 0;
		for(; num>0 ;num = num /10) {
			count ++;
		}
		System.out.println("Digits = " + count);
	}

}
