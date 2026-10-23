package com.tka;

public class NestedIfElseIfExample {
	public static void main(String args[]) {
		int age = 45;
		int creditScore = 500;
		int salary = 45000;
		if(age >= 24) {
			System.out.println("You can apply for loan process");
			if(salary > 35000) {
				System.out.println("You are eligible for  getting loan upto 30 LPA ");
			}else if (creditScore >= 700) {
				System.out.println("You are eligible for getting  loan upto 25LPA");
	
		    }else {
				System.out.println("Not eligible..");
			}
		}else {
			System.out.println("age is greater than 24");
		}
	 
	}

}
