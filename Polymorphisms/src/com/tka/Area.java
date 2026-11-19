package com.tka;

public class Area {
	void area(double radius) {
		double result = 3.14 * radius * radius;
		System.out.println("Area of Circle is :"+result);
	}
	void area(double length,double width) {
		double result = length* width;
		System.out.println("Area Of Rectangle is :"+result);
	}

}
