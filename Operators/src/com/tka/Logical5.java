package com.tka;

public class Logical5 {
	public static void main(String args[]) {
		int x = 12;
		int y = 45;
		int z = 60;
		boolean outcome = x++ <= y-- && x >y || !(y++ <= x++); 
		//      true       && false || true  
		//         true  && true 
		//true
		System.out.println(outcome);
		
		boolean outcome1 = y++ > x-- || x <= y && !(y>10) || x< 10 && y > 20 ;
		System.out.println(outcome1);
		
		boolean outcome2 = (y++ <= x++ && --x < y--) || !(z++ < y++) && x>y;
		System.out.println(outcome2);
			
		
	}

}
