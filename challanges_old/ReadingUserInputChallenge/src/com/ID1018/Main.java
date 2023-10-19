package com.ID1018;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;

        while (counter < 10) {

            System.out.println("Enter number # " + (counter + 1) + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                counter++;
                sum += scanner.nextInt();
                scanner.nextLine();
                System.out.println("The current sum is: " + sum);

            } else {
                scanner.nextLine();
                System.out.println("Invalid number");

            }

        }
        System.out.println("The final sum is: " + sum);

        scanner.close();
    }
}
