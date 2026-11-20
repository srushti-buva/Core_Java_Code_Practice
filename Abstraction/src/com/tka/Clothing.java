package com.tka;

public class Clothing implements Purchase {
	double price = 2000;
	@Override
	public double calculatePrice() {
		return price +(price * 5/100);
	}
	@Override
	public void displayDetails() {
		System.out.println("Clothing Price: "+price);
		System.out.println("Final Price: "+calculatePrice());
	}
	

}
