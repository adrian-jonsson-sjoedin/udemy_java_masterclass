package com.ID1018;

public class Main {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(157);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet < 0 || (inches > 12 || inches < 0)) {
            System.out.println("Invalid value");
            return -1;
        }
        double feetAndInchesToCm = (feet * 12 + inches) * 2.54;
        System.out.println(feet + " ft, " + inches + " in = " + feetAndInchesToCm + " cm");
        return feetAndInchesToCm;

    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches <= 0) {
            System.out.println("Invalid value");
            return -1;
        }
        double remainingInches = inches % 12; // gives us the inches
        double feetInInches = (inches - remainingInches) /12; // gives us the feet
        System.out.println(inches + "inches is equal to " + feetInInches + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feetInInches, remainingInches);
    }
}
