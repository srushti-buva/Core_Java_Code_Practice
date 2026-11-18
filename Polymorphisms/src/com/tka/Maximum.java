package com.tka;

public class Maximum {
	void max(int a ,int b) {
		if(a > b) {
			System.out.println("Maximum : "+a);
		}else {
			System.out.println("Maximum : "+b);
		}
	}
	void max(int a ,int b,int c) {
		if(a>b && a>c ) {
			System.out.println("Maximum : "+a);
		}else if(b>a && b>c) {
			System.out.println("Maximum : "+b);
		}else {
			System.out.println("Maximum : "+c);
		}
	}

}
