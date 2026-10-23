package com.tka;

public class Even_Number {
	public static void main(String[] args) {
		for(int i = 1;i<=5;i++) {
			for(int j = 1; j<=10;j++) {
				int num=(i-1)*10+j;
				if(num % 2== 0) {
					System.out.print(num +"");
				}else {
					continue;
				}
			}
			System.out.println();
		}
	}

}
