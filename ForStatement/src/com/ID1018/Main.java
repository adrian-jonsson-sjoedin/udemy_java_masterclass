package com.ID1018;

import java.awt.font.FontRenderContext;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000d, 2d));

        //for (init; termination; increment) { }
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello");
        }
        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + "% interest rate = " + String.format("%.2f", calculateInterest(10_000d, i)));
        }
        for (int i = 8; i >= 2; i--) {
            System.out.println("10,000 at " + i + "% interest rate = " + String.format("%.2f", calculateInterest(10_000d, i)));
        }
        int counter = 0;
        for (int i = 0; i < 22; i++) {
            if (counter == 3) {
                break;
            }
            if (isPrime(i)) {
                counter++;
                System.out.println(i + " is a prime number");
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
