package com.tka;

public class GooglePay implements Payment{
	@Override
	 public void pay() {
		System.out.println("Pay using GooglePay ...using cashback 5000");
	}

}
