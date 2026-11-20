package com.tka;

public class PartTimeEmployee implements Employee {
	int hours = 80;
	double hourlyRate = 200;
	
	@Override
	public double calculateSalary() {
		return hours * hourlyRate;
	}
	

}
