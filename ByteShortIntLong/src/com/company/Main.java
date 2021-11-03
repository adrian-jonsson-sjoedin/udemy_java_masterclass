package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 1000;
        int myMinIntValue = Integer.MIN_VALUE; //integer occupies 32 bits
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted max value = " + (myMaxIntValue + 1)); //overflow
        System.out.println("Busted min value = " + (myMinIntValue - 1)); //underflow

        byte myMinByteValue = Byte.MIN_VALUE; //Byte occupies 8 bits
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE; //Short occupies 16 bits
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);

        long myLongValue = 100L; //must add a L at the end to make java treat it as a long and not integer
        long myMinLongValue = Long.MIN_VALUE; //Long occupies 64 bits
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myMinLongValue);
        System.out.println("Long maximum value = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2); //java defaults to integers so you need to specify the type
        short myNewShortValue = (short) (myMinShortValue / 2);//you want to use in an operation such as this one


    }
}

