package com.tka;

public class PhonePay implements Payment {
	@Override
	public void pay() {
		System.out.println("Payment using PhonePay");
	}

}
