package com.tka;

public class Car extends Vehicle {
	@Override
	void start() {
		super.start();
		System.out.println("Car Starts with a key");
	}

}
