package com.tka;

public class UPIPayment extends Payment {
	@Override
	void makePayment() {
		super.makePayment();
		System.out.println("Payment using UPI");
	}

}
