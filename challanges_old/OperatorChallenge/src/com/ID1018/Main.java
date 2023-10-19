package com.ID1018;

public class Main {

    public static void main(String[] args) {
        double x = 20.00d;
        double y = 80.00d;
        double xyResults = 100.00d * (x + y);
        System.out.println("xyResults = " + xyResults);
        double remainder = xyResults % 40.00d;
        System.out.println("remainder = " + remainder);
        boolean zeroRemainder = (remainder == 0) ? true : false;
        System.out.println("zeroRemainder is " + zeroRemainder);
        if (!zeroRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
