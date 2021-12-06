package com.Adrian;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {// \r\n makes it so that we enter values
        System.out.println("Enter " + number + " integer values. \r\n");//on the next line
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i =0 ; i < array.length; i++) {
            sum += array[i];
        }
        return (double) sum /  (double)array.length;
    }
    public static void main(String[] args) {

        int[] myIntegers = getIntegers(5);
        for (int i = 0; i<myIntegers.length; i++) {
            System.out.println("Index " + i + ", typed value " + myIntegers[i]);
        }
        System.out.println("The average is "+ getAverage(myIntegers));


//        int[] myIntArray = new int[10]; //creates an array with 10 seperate integers, the value at each index is zero
//        myIntArray[5] = 50; // the indexing in an array starts on 0. so in this case the indexes are 0-9
//
//        int[]  myIntArray2 = {1,2,3,4,5,6,7,8,9,10};
//
//        double[] myDoubleArray = new double[10];
//
//        int[] myIntArray3 = new int[13];
//        for (int i=0; i<myIntArray3.length; i++) { // good idea to use .length
//            myIntArray3[i] = i*10;
//        }
//
//        for (int i = 0; i<=9; i++) {
//            System.out.println(myIntArray[i]);
//        }
//        for (int i = 0; i<=9; i++) {
//            System.out.println(myIntArray2[i]);
//        }
//
//        for (int i = 0; i<myIntArray3.length; i++) {
//            System.out.println(myIntArray3[i]);
//        }
//        int[] myIntArray4 = new int[7];
//        for (int i=0; i<myIntArray4.length; i++) { // good idea to use .length
//            myIntArray4[i] = i*2;
//        }
//        printArray(myIntArray4);
//    }
//
//    public static void printArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            System.out.println("Index " +i + " value is " + array[i]);
//        }
    }
}
