package com.tka;

public class Circle implements Shape {
	@Override
	public void calculateArea() {
		double radius = 5;
		System.out.println("Area of Circle is :" +(3.14 * radius * radius));
		
	}

}
