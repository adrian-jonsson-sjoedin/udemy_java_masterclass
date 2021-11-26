package com.udemy;

public class Main {

    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString); //turns the string "2018" to a double. same exists for int etc.
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
        String sum = add("5","9");
        System.out.println(sum);
        String difference = subtract("4", "5");
        System.out.println(difference);

    }

    public static String add(String number1, String number2) {
        int numb1 = Integer.parseInt(number1);
        int numb2 = Integer.parseInt(number2);
        int sumInt = numb1 + numb2;
        return String.valueOf(sumInt);
    }

    public static String subtract(String number1, String number2) {
        int numb1 = Integer.parseInt(number1);
        int numb2 = Integer.parseInt(number2);
        int differenceInt;
        if (numb1 < numb2) {
            System.out.println("Number 1 needs to be equal or larger than number 2");
        } else {
            differenceInt = numb1 - numb2;
            return String.valueOf(differenceInt);
        }
        return "Negative integer result not allowed";
    }
}
