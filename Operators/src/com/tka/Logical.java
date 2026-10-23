package com.tka;

public class Logical {
	public static void main(String args[]) {
		int age = 10;
		int marks = 40;
		boolean  result = (age >= 10 && marks >= 10 || !(marks < 10));
		
		//                         true && true ||true
		//                         true && true
		//                         true
		System.out.println(result);
		boolean outcome =((marks >= 10) || age != 10 || !(age == 10));
		System.out.println(outcome);
	    boolean result1 = (age <= 12 && marks == 20 || (marks == age));
	    System.out.println(result1);
	    
	
		
		
	}

}
