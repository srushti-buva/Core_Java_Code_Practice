

package com.tka;

public class AllMethods {

    // REVERSE NUMBER

    // Type 1: No parameter, no return
    void reverse1() {
        int num = 1234, rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reverse = " + rev);
    }

    // Type 2: Parameter, no return
    void reverse2(int num) {
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse = " + rev);
    }

    // Type 3: No parameter, return
    int reverse3() {
        int num = 1234, rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return rev;
    }

    // Type 4: Parameter, return
    int reverse4(int num) {
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return rev;
    }


    // FIBONACCI SERIES

    // Type 1
    void fibonacci1() {
        fibonacci2(7);
    }

    // Type 2
    void fibonacci2(int terms) {
        int a = 0, b = 1;

        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    // Type 3: Returns the 7th Fibonacci term
    int fibonacci3() {
        return fibonacci4(7);
    }

    // Type 4: Returns the nth Fibonacci term
    int fibonacci4(int terms) {
        int a = 0, b = 1, c = 0;

        if (terms <= 0) {
            return -1;
        }

        for (int i = 1; i < terms; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return a;
    }


    // PALINDROME NUMBER

    // Type 1
    void palindrome1() {
        palindrome2(121);
    }

    // Type 2
    void palindrome2(int num) {
        if (palindrome4(num)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    // Type 3
    boolean palindrome3() {
        return palindrome4(121);
    }

    // Type 4
    boolean palindrome4(int num) {
        int original = num;
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        return original == rev;
    }
}



