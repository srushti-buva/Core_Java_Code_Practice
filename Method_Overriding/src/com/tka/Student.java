package com.tka;

public class Student extends Person {
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Student Name : Rahul");
		System.out.println("Student Roll No : 101");
	}

}
