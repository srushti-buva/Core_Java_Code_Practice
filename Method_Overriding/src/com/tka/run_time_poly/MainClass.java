package com.tka.run_time_poly;

public class MainClass {
	public static void main(String[] args) {
		//Employee e = new Employee();
		//double salary =e.calculateSalary();
		//System.out.println(salary);
		//System.out.println();
		
		
		//Dynamic Dispatch 
		//Employee e = new Developer();
		//double salary = e.calculateSalary();
		//System.out.println(salary);
		
		//Shape s = new Shape();
		//double result = s.calculateArea();
		//System.out.println(result);
		
		//Shape s = new Circle();
		//double result = s.calculateArea();
		//System.out.println(result);
		
		//Bank b = new SBI();
		//double interestRate = b.getInterestRate();
		//System.out.println(interestRate);
		//System.out.println("SBI Interest Rate : "+interestRate + "%");
		
		//Ticket t ;
		//t = new BusTicket();
		//System.out.println("Bus Fare : "+t.calculateFare());
		//t= new TrainTicket();
		//System.out.println("Train Ticket : "+t.calculateFare());
		Delivery d;

		

	        d = new Food();
	        System.out.println("Food Delivery: " + d.deliveryTime() + " minutes");

	        d = new Courier();
	        System.out.println("Courier Delivery: " + d.deliveryTime() + " minutes");
		
		
	}

}
