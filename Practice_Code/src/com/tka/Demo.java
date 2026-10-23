package com.tka;

public class Demo {

    // 1. Addition - No Parameter, No Return
    public void myMethod() {
        int a = 10, b = 20;
        System.out.println( "The Addition of a and b =" +(a + b));
    }

    // 2. Square
    public void myMethod(int a) {
        System.out.println(a * a);
    }

    // 3. Addition of Two Numbers
    public void myMethod(int a, int b) {
        System.out.println(a + b);
    }

    // 4. Square using double
    public int myMethod(double a) {
        return (int) (a * a);
    }

    // 5. Addition of Three Numbers
    public void myMethod(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    // 6. Square using float
    public double myMethod(float a) {
        return a * a;
    }

    // 7. Square using long
    public long myMethod(long n) {
        return n * n;
    }

    // 8. Square using short
    public int myMethod(short n) {
        return n * n;
    }

    // 9. Addition of Two double Values
    public double myMethod(double a, double b) {
        return a + b;
    }

    // 10. Multiplication of Four Numbers
    public int myMethod(int a, int b, int c, int d) {
        return a * b * c * d;
    }

    // 11. Factorial
    public int myMethod(char ch, int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 12. Sum of Natural Numbers
    public int myMethod(boolean flag, int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // 13. Even or Odd
    public boolean myMethod(String text, int n) {
        return n % 2 == 0;
    }

    // 14. Reverse Number
    public long myMethod(String text, long n) {
        long rev = 0;
        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }

    // 15. Sum of Digits
    public int myMethod(String text, int n, boolean flag) {
        int sum = 0;
        n = Math.abs(n);
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // 16. Greatest of Two Numbers
    public int myMethod(byte a, byte b) {
        return a > b ? a : b;
    }

    // 17. Greatest of Three Numbers
    public double myMethod(int a, double b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // 18. Rectangle Area
    public int myMethod(String text, int length, int width) {
        return length * width;
    }

    // 19. Simple Interest
    public double myMethod(double p, double r, double t) {
        return p * r * t / 100;
    }

    // 20. Celsius to Fahrenheit
    public double myMethod(String text, double c) {
        return c * 9 / 5 + 32;
    }

    // 21. Prime Number
    public boolean myMethod(int n, boolean primeCheck) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // 22. Palindrome Number
    public boolean myMethod(int n, char check) {
        if (n < 0) {
            return false;
        }
        int original = n;
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return original == rev;
    }

    // 23. Power
    public int myMethod(int base, int exponent, boolean power) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    // 24. Leap Year
    public boolean myMethod(int year, String text) {
        return year % 400 == 0 ||
               (year % 4 == 0 && year % 100 != 0);
    }

    // 25. Percentage
    public double myMethod(int obtained, int total, char percent) {
        return obtained * 100.0 / total;
    }

    // 26. Swap Two Numbers
    public void myMethod(int a, int b, boolean swap, char ch) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }

    // 27. Minimum of Three Numbers
    public double myMethod(double a, double b, double c, boolean minimum) {
        return Math.min(a, Math.min(b, c));
    }

    // 28. Circle Area
    public double myMethod(char ch, double radius) {
        return 3.14 * radius * radius;
    }

    // 29. Fibonacci Series
    public void myMethod(String text, int n, char fib) {
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    // 30. Vowel Check
    public boolean myMethod(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}