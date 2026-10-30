package com.jvk;

public class Car {
	

	

	    String model;
	    double price;

	    Car() {
	        System.out.println("Car Started");
	    }

	    Car(String model, double price) {
	        this.model = model;
	        this.price = price;
	    }

	    void display() {
	        System.out.println("Car Model: " + model);
	        System.out.println("Car Price: " + price);
	    }
	}


