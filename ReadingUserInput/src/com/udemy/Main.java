package com.udemy;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //allows the user to typ input into the console to use in the program

        System.out.println("Enter your year of birth, four digits: ");

        boolean hasNextInt = scanner.hasNextInt(); //checks if next input entered is an integer and will return true if
        if (hasNextInt) {                           //it is an int and false if not
            int yob = scanner.nextInt(); //the users input automatically converts to an int and is stored in the var. yob
            scanner.nextLine(); //handle next line character (enter key). after reading in a number in a scanner there must
            //scanner.nextLine() to handle the enter-key stroke
            System.out.println("Enter your name: ");
            String name = scanner.nextLine(); //reads a LINE of input from the console
            int age = 2021 - yob;

            if (age >= 0 && age < 120) {
                System.out.println("Your name is " + name + " and you are " + age + " years old");
            } else {
                System.out.println("You entered an invalid year of birth");
            }
        } else {
            System.out.println("Unable to parse year of birth. You most likely entered a letter");
        }
        scanner.close(); //closes the scanner so it won't take up memory
    }
}
