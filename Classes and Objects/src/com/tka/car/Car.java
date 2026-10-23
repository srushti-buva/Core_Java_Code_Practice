package com.tka.car;

public class Car {
	 String carName;
	    int modelYear;
	    int engineNo;
	    int seats;

	    public void engineWorking() {
	        System.out.println("Engine Working");
	    }

	    public void interior() {
	        System.out.println("Interior Details");
	    }

	    public void steering() {
	        System.out.println("Steering Details");
	    }

	    public void display() {
	        System.out.println("Car Name --> " + carName);
	        System.out.println("Model Year --> " + modelYear);
	        System.out.println("Engine No --> " + engineNo);
	        System.out.println("Seats --> " + seats);

	        engineWorking();
	        interior();
	        steering();
	    }
	}


