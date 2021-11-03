package com.udemy;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D'; //not the same as a string. Char can only save 1 character. Is 16 bit in size
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyright = '\u00A9';
        System.out.println(myCopyright);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOver21 = true;
    }
}
