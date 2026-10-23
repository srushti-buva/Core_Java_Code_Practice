package com.tka.vehicle;

public class MainClass {
	 public static void main(String[] args) {

	        Vehicle v1 = new Vehicle();

	        v1.vehicleName = "Tata Nexon";
	        v1.vehicleType = "SUV";
	        v1.modelYear = 2026;
	        v1.wheels = 4;
	        v1.price = 1200000;

	        v1.display();

	        System.out.println("--------------------------------");

	        Vehicle v2 = new Vehicle();

	        v2.vehicleName = "Honda Activa";
	        v2.vehicleType = "Scooter";
	        v2.modelYear = 2025;
	        v2.wheels = 2;
	        v2.price = 90000;

	        v2.display();
	    }
	}


