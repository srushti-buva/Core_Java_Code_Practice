package com.tka;

public class Increment5 {
	public static void main(String args[]) {
		int a = 5;
		int i = 6;
		i++;  // print i = 6 and store i = 7
		i--;  // print i = 7 and store i = 6
		a++;  // print a = 5 and store a = 6
		a--;  // print a = 6 and store a = 5
		System.out.println(i);   // print i = 6
		System.out.println(a);   // print a = 5
		i++;  // print i = 6 and store i = 7
		a--;  // print a = 5 and store a = 4
		System.out.println(++a + a + i + i--);  // use a = 5 +5 + 7 +7 = 24
		System.out.println(a-- + a + i + i--);  // use a = 5 + 4 + 6 + 6 =21
		System.out.println(a + 7);  // use a  4+7 = 11
		System.out.println(a + a --);  // use 4 + 4 =8  and store a = 3
		System.out.println(a + a+7 + a --); // use a = 3 +10 + 3 
		
		
	}

}
