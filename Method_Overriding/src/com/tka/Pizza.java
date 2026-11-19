package com.tka;

public class Pizza extends Food {
	@Override
	void prepare() {
		super.prepare();
		System.out.println("Preparing Pizza");
	}
	

}
