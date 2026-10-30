package com.jre;

public class Rectangle {
	

	    int length;
	    int width;

	    Rectangle(int length, int width) {
	        this.length = length;
	        this.width = width;
	    }

	    void displayArea() {
	        int area = length * width;
	        System.out.println("Area of Rectangle: " + area);
	    }
	}


