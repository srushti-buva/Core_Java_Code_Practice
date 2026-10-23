
package com.tka;

public class NestedIfElseExample1 {

    public static void main(String[] args) {

        int age = 42;
        int creditScore = 800;
        int salary = 55000;

        if (age >= 24 && age <= 120) {
            System.out.println("You are eligible for loan");

            if (salary >= 45000 && creditScore >= 800) {
                System.out.println("You are eligible for getting loan upto 75 LPA");
            } else if (creditScore > 700) {
                System.out.println("You are eligible for getting loan upto 25 LPA");
            } else if (salary > 35000) {
                System.out.println("You are eligible for getting loan upto 30 LPA");
            } else {
                System.out.println("Not eligible...");
            }

        } else {
            System.out.println("Age cannot match");
        }
    }
}

