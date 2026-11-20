package com.tka;

public class FoodDelivery implements Delivery {
	int time = 30;
	
	@Override
	public int deliveryTime() {
		//return 30;
		return time;
	}

}
