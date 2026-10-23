package com.tka;

public class Question9 {
	public static void main(String args[]) {
		int a = 5;
		int b = 5;
		int c = 5;
		if (a == b && b==c) {
			System.out.println("Equilateral Triangle");
		}else if (a == b || b==c || a==c) {
			System.out.println("Isosceles Triangle");
		}else {
			System.out.println("Scalene Triangle");
		}
	}

}
