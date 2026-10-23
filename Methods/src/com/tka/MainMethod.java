

package com.tka;

public class MainMethod {

    public static void main(String[] args) {

        AllMethods obj = new AllMethods();

        // Reverse Number
        System.out.println("Reverse Number");

        obj.reverse1();
        obj.reverse2(5678);

        int r1 = obj.reverse3();
        System.out.println("Reverse = " + r1);

        int r2 = obj.reverse4(9876);
        System.out.println("Reverse = " + r2);


        // Fibonacci Series
        System.out.println("Fibonacci Series");

        obj.fibonacci1();
        obj.fibonacci2(5);

        int f1 = obj.fibonacci3();
        System.out.println("7th term = " + f1);

        int f2 = obj.fibonacci4(8);
        System.out.println("8th term = " + f2);


        // Palindrome Number
        System.out.println("Palindrome Number");

        obj.palindrome1();
        obj.palindrome2(123);

        boolean p1 = obj.palindrome3();

        if (p1) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        boolean p2 = obj.palindrome4(1331);

        if (p2) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}



