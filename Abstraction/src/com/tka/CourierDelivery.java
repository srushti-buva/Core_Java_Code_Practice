package com.tka;

public class CourierDelivery implements Delivery {
	int time = 60;
	@Override
	public int deliveryTime() {
		return time ;
	}

}
