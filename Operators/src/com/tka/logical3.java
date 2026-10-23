package com.tka;

public class logical3{
	public static void main(String args[]) {
		String name = "Srushti ";
		String name2= "srusjti";
		int age = 21;
		int marks = 45;
		boolean outcome = (name == name2 && age > marks || age <= marks || !(marks == age) );
		System.out.println(outcome);
		
		boolean outcome1 =(age >= 18 && marks >40 || !(age < 21) && marks != 21);
		System.out.println(outcome1);
		//                                                true && true || true && true
		// true 
		
		
		boolean outcome2 =(age > 18 && !(marks <= 45) || age == marks && name == name2);
		System.out.println(outcome2);
		//                                                true && false  ||  false 
		//false 
		
		
	}


	

}
