package com.Adrian;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArray = getIntegers(6);
        printArray(sortArray(myArray));
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values \r\n");
        int[] values = new int[number];
        for (int i = 0; i < values.length; i++) {
            values[i] += scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        System.out.println("The sorted array");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Index " + i + " has value " + array[i]);
        }
    }

    public static int[] sortArray(int[] array) {
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            sortedArray[i] = array[i]; //copies the array we get from terminal
        }                             //to the array sortedArray
        boolean flag = true;
        int temporary;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temporary = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temporary;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }
}
