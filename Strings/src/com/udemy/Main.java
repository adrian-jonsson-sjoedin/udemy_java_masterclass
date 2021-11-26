package com.udemy;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is equal to "+myString);
        myString = myString + ", and this is more";
        System.out.println("myString is equal to "+myString);
        myString =myString +  " \u00A9 2019";
        System.out.println("myString is equal to "+myString);
        String numberString = "250.55";
        numberString = numberString + " 40.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString =lastString + myInt; //adding an integer to a string makes the integer to a string
        System.out.println("Last string is equal to " + lastString);
    }
}
