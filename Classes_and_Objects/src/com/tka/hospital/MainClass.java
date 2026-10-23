package com.tka.hospital;

public class MainClass {
	public static void main(String[] args) {

        Hospital h1 = new Hospital();

        h1.hospitalName = "Ruby Hall Clinic";
        h1.location = "Pune";
        h1.totalDoctors = 100;
        h1.totalBeds = 500;
        h1.department = "Cardiology";

        h1.display();

        System.out.println("--------------------------------");

        Hospital h2 = new Hospital();

        h2.hospitalName = "City Hospital";
        h2.location = "Kolhapur";
        h2.totalDoctors = 50;
        h2.totalBeds = 200;
        h2.department = "Orthopedics";

        h2.display();
    }

}
