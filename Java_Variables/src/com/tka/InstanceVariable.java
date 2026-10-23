package com.tka;

public class InstanceVariable {

    // Instance variables
    int id = 101;
    String name = "Srushti";
    int age = 22;
    String city = "Pune";
    double salary = 45000.50;
    boolean active = true;
    char grade = 'A';
    String department = "IT";
    int experience = 1;
    double bonus = 5000.00;

    // Uninitialized instance variables
    int phoneNumber;
    String address;
    double hike;
    boolean married;
    char gender;

    public static void main(String[] args) {

        // Creating object
        InstanceVariable s = new InstanceVariable();

        // Printing initialized variables
        System.out.println("ID: " + s.id);
        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("City: " + s.city);
        System.out.println("Salary: " + s.salary);
        System.out.println("Active: " + s.active);
        System.out.println("Grade: " + s.grade);
        System.out.println("Department: " + s.department);
        System.out.println("Experience: " + s.experience);
        System.out.println("Bonus: " + s.bonus);

        // Printing uninitialized variables
        System.out.println("Phone Number: " + s.phoneNumber);
        System.out.println("Address: " + s.address);
        System.out.println("Hike: " + s.hike);
        System.out.println("Married: " + s.married);
        System.out.println("Gender: " + s.gender);
    }
}