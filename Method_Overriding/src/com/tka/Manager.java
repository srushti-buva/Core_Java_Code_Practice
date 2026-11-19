package com.tka;

public class Manager extends Employee {
	@Override
	void calculateSalary() {
		super.calculateSalary();
		System.out.println("Manager Salary :6000");
	}
	

}
