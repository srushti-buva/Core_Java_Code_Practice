package com.tka;

public class Surgeon implements Doctor,Hospital{
	@Override
	public void treatPatient() {
		System.out.println("Surgeon Performs the surgery");
	}
	@Override
	public void hospitalDetails() {
		System.out.println("Hospital: City Care Hospital");
	}

}
