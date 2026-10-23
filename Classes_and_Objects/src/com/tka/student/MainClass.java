package com.tka.student;

public class MainClass {
	  public static void main(String[] args) {

	        Student s1 = new Student();

	        s1.studentName = "Srushti";
	        s1.rollNo = 101;
	        s1.department = "Computer Engineering";
	        s1.percentage = 80.3;

	        s1.display();

	        System.out.println("----------------------");

	        Student s2 = new Student();

	        s2.studentName = "Priya";
	        s2.rollNo = 102;
	        s2.department = "IT";
	        s2.percentage = 85.5;

	        s2.display();
	    }
	}


