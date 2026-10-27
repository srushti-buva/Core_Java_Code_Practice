package com.tka;

public class Main {
	public static void main(String[] args) {
		
		Practice_Session session = new Practice_Session();
		
	//1. ATM System
		System.out.println("=== ATM System ===");
		session.checkBalance();
		session.withdrawAmount(150);
		session.checkBalance();
		
		
	//2. Student Result
		System.out.println("\n=== Student Result ===");
		double percentage = session.calculatePercentage(85,90,78);
		System.out.println("Percentage: "+percentage);
		
		
	//3. Mobile Recharge
		System.out.println("\n=== Mobile Recharge ===");
		session.recharge(299);
		
		
	//4.Temperature Converter
		System.out.println("\n=== Temperature Converter ===");
		double fahrenheit = session.celciusToFahrenheit(25);
		System.out.println("Fahrenheit: " + fahrenheit);
		
		
	//5.Login System
		System.out.println("\n=== Login System ===");
		boolean result = session.login("admin","secure123");
		System.out.println("Login successful: "+result);
		
		
	//6.E-commerce Discount
		 System.out.println("\n=== Discount ===");
	        double finalPrice = session.calculateDiscount(1000);
	        System.out.println("Final Price: " + finalPrice);

	        // 7. Employee Salary
	        System.out.println("\n=== Employee Salary ===");
	        double salary = session.calculateSalary(20000);
	        System.out.println("Salary: " + salary);

	        // 8. Bank Interest
	        System.out.println("\n=== Bank Interest ===");
	        session.calculateInterest(10000, 5, 2);

	        // 9. Food Ordering
	        System.out.println("\n=== Food Ordering ===");
	        session.placeOrder("Pizza", 2);

	        // 10. Electricity Bill
	        System.out.println("\n=== Electricity Bill ===");
	        double bill = session.calculateBill(100);
	        System.out.println("Bill: " + bill);

	        // 11. Voting System
	        System.out.println("\n=== Voting System ===");
	        session.vote(17);
	        session.vote(21);

	        // 12. Ride Booking
	        System.out.println("\n=== Ride Booking ===");
	        session.calculateFare(10);

	        // 13. Password Checker
	        System.out.println("\n=== Password Checker ===");
	        System.out.println(session.checkPassword("123"));
	        System.out.println(session.checkPassword("supersecret"));
	    }
	
		
	}


