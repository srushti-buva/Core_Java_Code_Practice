package com.tka;

public class IfElseIfLadderExample {
	public static void main(String args[]) {
		int marks = 60;
		if(marks >= 90) {
			System.out.println("Grade is A+");
		}else if (marks >= 80) {
			System.out.println("Grade is A");
		}else if (marks >=70) {
			System.out.println("Grade is B+");
		}else if (marks >= 60) {
			System.out.println("Greade is B");
		}else if (marks >= 35) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
	}

}
