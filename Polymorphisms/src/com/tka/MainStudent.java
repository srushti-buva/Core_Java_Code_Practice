package com.tka;

public class MainStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(101);
		Student s3 = new Student(102,"Srushti");
		s1.display();
		s2.display();
		s3.display();
	}

}
