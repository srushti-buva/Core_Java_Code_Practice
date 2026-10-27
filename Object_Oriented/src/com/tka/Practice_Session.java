package com.tka;

public class Practice_Session {
	// 1.ATM System
	public double balance = 1000.00;
	public void checkBalance() {
		System.out.println("Account Balance: "+ balance);
	}
	
	
	
    public void withdrawAmount(double amount) {
    	if(amount > 0 && amount <= balance) {
    		balance = balance-amount;
    		System.out.println("Withdraw: "+amount);
    	}else {
    		System.out.println("Transaction Failed");
    	}
    }
    
    
    // 2.Student Result
    public double calculatePercentage(int m1,int m2,int m3) {
    	int totalMarks = m1+ m2 + m3;
    	return (totalMarks / 300.0) * 100;
    }
    
    
    //3.Mobile Recharge
    public void recharge(double amount) {
    	System.out.println("Recharge successful: "+amount);
    }
    
    
    //4.Temperature Converter
    public double celciusToFahrenheit(double c) {
    	return (c*9/5)+32;
    }
    
    
    //5.Login System
    public boolean login(String username,String password) {
    	return "admin".equals(username) && "secure123".equals(password);
    }
    
    
    //6.E-commerce Discount
    public double calculateDiscount(double price) {
    	double discount = price * 0.10;
    	return price - discount;
    }	
    	
    	
    //7. Employee Salary
    	 // 7. Employee Salary
        public double calculateSalary(double basic) {
            double hra = basic * 0.20;
            double da = basic * 0.50;
            return basic + hra + da;
        }

        // 8. Bank Interest
        public void calculateInterest(
                double principal, double rate, int time) {
            double interest = (principal * rate * time) / 100;
            System.out.println("Simple Interest: " + interest);
        }

        // 9. Food Ordering App
        public void placeOrder(String item, int quantity) {
            double pricePerItem = 100.0;
            double totalBill = pricePerItem * quantity;

            System.out.println("Item: " + item);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Bill: " + totalBill);
        }

        // 10. Electricity Bill
        public double calculateBill(int units) {
            double ratePerUnit = 4.5;
            return units * ratePerUnit;
        }

        // 11. Online Voting System
        public void vote(int age) {
            if (age >= 18) {
                System.out.println("Eligible to vote");
            } else {
                System.out.println("Not eligible to vote");
            }
        }

        // 12. Ride Booking App
        public void calculateFare(double distance) {
            double baseFare = 3.50;
            double costPerMile = 1.75;
            double fare = baseFare + (distance * costPerMile);

            System.out.println("Ride Fare: " + fare);
        }

        // 13. Password Strength Checker
        public String checkPassword(String password) {
            if (password != null && password.length() >= 8) {
                return "strong";
            } else {
                return "weak";
            }
        }
}
    	
       	
    	
    	
    



	