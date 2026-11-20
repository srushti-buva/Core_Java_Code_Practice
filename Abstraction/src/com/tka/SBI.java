package com.tka;

public class SBI implements Bank {
	 double balance = 5000;
	@Override
	public void deposit(double amount) {
	     balance = balance + amount;
	     System.out.println("Amount deposited: "+amount);
		
	}
	@Override
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Amount Withdraw: "+amount);
	}
	@Override
	public double getBalance() {
		return balance;
		
	}

}
