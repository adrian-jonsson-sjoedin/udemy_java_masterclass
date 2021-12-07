package com.Adrian;


import java.util.Scanner;

public class Main {
private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int count = readInteger();
       int[] array =  readElements(count);
        System.out.println("Minimum value = " +findMin(array));

    }

    private static int readInteger() {
        System.out.println("Enter how many elements you want your array to be: ");
        int count = scanner.nextInt();
        return count;
    }

    private static int[] readElements(int count) {
        System.out.println("Enter " + count + " integer values \r\n");
        int[] array = new int[count];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
