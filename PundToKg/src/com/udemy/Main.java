package com.udemy;

public class Main {

    public static void main(String[] args) {
	    double pounds;
        pounds = 200d;
        double converter = 0.45359237d;
        double poundsToKg = pounds * converter;
        System.out.println(pounds + "lb is " + poundsToKg + "kg,");
    }
}
