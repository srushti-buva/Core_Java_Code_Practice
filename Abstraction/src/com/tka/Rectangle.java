package com.tka;

public class Rectangle implements Shape {
	@Override
	public void calculateArea() {
		double length = 10.0;
		double width = 5.0;
		System.out.println("Area of Rectangle is :"+(length * width));
		
	}

}
