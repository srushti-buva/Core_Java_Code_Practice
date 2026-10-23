package com.tka;

public class NestedIfElseExample {
	public static void main(String args []) {
		int age = 45;
		int creditScore = 500;
		int salary = 45000;
		if(age >= 24) {
			System.out.println("You can apply for loan process");
			if(salary > 35000) {
				System.out.println("You are eligible for 2nd phase of loan");
			}else {
				System.out.println("Salary is greater than 35000");
			}
		}else {
			System.out.println("Age must be greater than 23");
		}
		
	}
	
}
