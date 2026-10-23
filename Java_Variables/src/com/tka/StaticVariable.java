package com.tka;

public class StaticVariable {

	
	    // 10 initialized global variables
	    static int id = 101;
	    static String name = "Srushti";
	    static int age = 22;
	    static String city = "Pune";
	    static double salary = 45000.50;
	    static boolean active = true;
	    static char grade = 'A';
	    static String department = "IT";
	    static int experience = 1;
	    static double bonus = 5000.00;

	    // 5 uninitialized global variables
	    static int phoneNumber;
	    static String address;
	    static double hike;
	    static boolean married;
	    static char gender;

	    public static void main(String[] args) {

	        // Printing 10 initialized variables
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("City: " + city);
	        System.out.println("Salary: " + salary);
	        System.out.println("Active: " + active);
	        System.out.println("Grade: " + grade);
	        System.out.println("Department: " + department);
	        System.out.println("Experience: " + experience);
	        System.out.println("Bonus: " + bonus);

	        // Printing 5 uninitialized variables
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Address: " + address);
	        System.out.println("Hike: " + hike);
	        System.out.println("Married: " + married);
	        System.out.println("Gender: " + gender);
	    }
	}





