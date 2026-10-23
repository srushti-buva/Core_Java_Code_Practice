package com.tka;

public class Question7 {
	public static void main(String args[]) {
		int marks = 75;
		if(marks >= 90 && marks <= 100) {
			System.out.println(" Grade is A");
		}else if (marks >= 75 && marks <= 89) {
			System.out.println("Grade is B");
			
		}else if (marks >= 50 && marks <=74) {
			System.out.println("Grade is C");
		}else if (marks >= 35 && marks <= 49) {
			System.out.println("Grade is Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
