package com.tka;

public class Fibonacci_Series {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int i = 1;
		int next;
		do {
			System.out.println(a + " ");
			next = a + b ;
			a = b;
			b = next;
			i++;
			
		}while( i <= 10);
	}

}
