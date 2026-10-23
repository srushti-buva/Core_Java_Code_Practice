package com.tka;

public class Increment4 {
	public static void main(String args[]) {
		int i = 4;
		int a = 3;
		i++;   // print 4 and store i = 5
		i--;  // print 5 and store i = 4
		a++;  // print 3 and store a = 4
		a--;  // print 4 and store a = 3
		System.out.println(a); // a = 3
		System.out.println(i); // i = 4
		System.out.println(i++ + a++);  //  use i = 4 and a = 3
		System.out.println(++i + ++a);  // use i = 6 and a = 5 
		i++;  // print 6 and store 7
		a++;  // print 5  and store 6
		++a;  // print 7 and store 6 
		++i;  // print 8 and store  7 
		System.out.println(a);  
		System.out.println(i);
		
		
	}

}
