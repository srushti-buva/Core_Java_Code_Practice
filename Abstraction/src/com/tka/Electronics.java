package com.tka;

public class Electronics implements Purchase {
	double price = 2000;
	@Override
	 public double calculatePrice() {
		return price +(price * 18 /100);
		
	}
	@Override
	 public void displayDetails() {
		System.out.println("Electronics Price: "+price);
		System.out.println("Final Price: "+calculatePrice());
	}

}
