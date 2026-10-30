package com.jvl;
import java.util.Scanner;

public class MainClass {
	


	

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Account a1 = new Account();

	        System.out.print("Enter Account Balance: ");
	        double balance = sc.nextDouble();

	        Account a2 = new Account(balance);

	        System.out.println("Default Account:");
	        a1.display();

	        System.out.println("Parameterized Account:");
	        a2.display();

	        sc.close();
	    }
	}


