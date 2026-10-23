package com.tka;

public class Prime_Numbers {
	public static void main(String[] args) {
		//outer loop used to check for rows
		for(int n= 2 ; n<= 100 ; n++) {
			int count = 0;
			
			for(int i = 1 ; i<=n ; i++) {
				if (n % i == 0) {
				count++;
				//count = count +1
			}
		}

        if (count == 2) {
            System.out.print(n + " ");
        }
    }
	}
}