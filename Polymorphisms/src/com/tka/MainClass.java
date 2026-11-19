package com.tka;

public class MainClass {
	public static void main(String[] args) {
		System.out.println("Original Main Method");
		main(10);
		main("Java");
	}
	public static void main(int a) {
		System.out.println("Interger Main Method : "+ a);
	}
	public static void main(String name) {
		System.out.println("String Main Method : "+name);
	}

}
