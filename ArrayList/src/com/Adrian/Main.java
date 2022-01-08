package com.Adrian;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList gl = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0 -> printInstructions();
                case 1 -> gl.printGroceryList();
                case 2 -> addItem();
                case 3 -> modifyItem();
                case 4 -> removeItem();
                case 5 -> searchForItem();
                case 6 -> processArrayList();
                case 7 -> quit = true;
            }
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(gl.getGroceryList());//saves and copies the array gl to newArray

        ArrayList<String> nextArray = new ArrayList<String>(gl.getGroceryList()); //does the same thing as above

        String[] myArray = new String[gl.getGroceryList().size()];//converts the arrayList to a regular array
        myArray = gl.getGroceryList().toArray(myArray);
    }

    public static void printInstructions() {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        gl.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
       // System.out.print("Enter the item number: ");
        System.out.print("Enter the item you wish to modify: ");
        //int itemNr = scanner.nextInt();
        String modifyItem = scanner.nextLine();
        //scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        //gl.modifyGroceryItem(itemNr - 1, newItem);
        gl.modifyGroceryItem(modifyItem, newItem);
    }

    public static void removeItem() {
       // System.out.print("Enter the item number: ");
        System.out.print("Enter the item name: ");
        //int itemNr = scanner.nextInt();
        String item = scanner.nextLine();
        //scanner.nextLine();
        //gl.removeGroceryItem(itemNr-1);
        gl.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.print("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (gl.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in your grocery list");
        } else {
            System.out.println("Item " + searchItem + " is not in your grocery list");
        }
    }

}
