package com.tka;

public class MainClass {

    public static void main(String[] args) {

        Demo d = new Demo();

        // 1. Addition
        d.myMethod();

        // 2. Square
        d.myMethod(5);

        // 3. Addition of Two Numbers
        d.myMethod(10, 20);

        // 4. Square using double
        System.out.println(d.myMethod(5.5));

        // 5. Addition of Three Numbers
        d.myMethod(10, 20, 30);

        // 6. Square using float
        System.out.println(d.myMethod(4.5f));

        // 7. Square using long
        System.out.println(d.myMethod(10L));

        // 8. Square using short
        System.out.println(d.myMethod((short) 5));

        // 9. Addition of double Values
        System.out.println(d.myMethod(10.5, 20.5));

        // 10. Multiplication
        System.out.println(d.myMethod(2, 3, 4, 5));

        // 11. Factorial
        System.out.println(d.myMethod('F', 5));

        // 12. Sum of Natural Numbers
        System.out.println(d.myMethod(true, 10));

        // 13. Even or Odd
        System.out.println(d.myMethod("Even", 8));

        // 14. Reverse Number
        System.out.println(d.myMethod("Reverse", 1234L));

        // 15. Sum of Digits
        System.out.println(d.myMethod("Sum", 1234, true));

        // 16. Greatest of Two Numbers
        System.out.println(d.myMethod((byte) 10, (byte) 20));

        // 17. Greatest of Three Numbers
        System.out.println(d.myMethod(10, 25.5, 20));

        // 18. Rectangle Area
        System.out.println(d.myMethod("Rectangle", 10, 5));

        // 19. Simple Interest
        System.out.println(d.myMethod(1000.0, 5.0, 2.0));

        // 20. Celsius to Fahrenheit
        System.out.println(d.myMethod("Temperature", 25.0));

        // 21. Prime Number
        System.out.println(d.myMethod(7, true));

        // 22. Palindrome Number
        System.out.println(d.myMethod(121, 'P'));

        // 23. Power
        System.out.println(d.myMethod(2, 3, true));

        // 24. Leap Year
        System.out.println(d.myMethod(2024, "Year"));

        // 25. Percentage
        System.out.println(d.myMethod(80, 100, '%'));

        // 26. Swap Two Numbers
        d.myMethod(10, 20, false, 'S');

        // 27. Minimum of Three Numbers
        System.out.println(d.myMethod(10.0, 5.0, 8.0, true));

        // 28. Circle Area
        System.out.println(d.myMethod('C', 7.0));

        // 29. Fibonacci Series
        d.myMethod("Fibonacci", 10, 'F');

        // 30. Vowel Check
        System.out.println(d.myMethod('a'));
    }
}

