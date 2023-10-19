package com.Adrian;

import java.util.Arrays;
import java.util.Scanner;

public class Burger {
    private String bun;
    private String protein;
    private String[] additions = new String[4];
    public double price;
    private String name;
    private boolean hasToppings = false;

    public Burger(String bun, String protein, double price) {
        this.bun = bun;
        this.protein = protein;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double orderPrice(String[] additions) {
        double priceToppings = 0;

        if (this.hasToppings) {
            for (int j = 0; j < additions.length; j++) {
                if (additions[j] == null) {
                    break;
                } else {
                    String currentTopping = additions[j].toLowerCase();
                    switch (currentTopping) {
                        case "tomato":
                            priceToppings += 1;
                            break;
                        case "bacon":
                        case "onion":
                            priceToppings += 3;
                            break;
                        case "cheese":
                        case "garlic":
                            priceToppings += 2;
                            break;
                        case "jalapeno":
                            priceToppings += 0.5;
                            break;
                        case "sweet":
                            priceToppings += 2.5;
                            break;
                        case "fresh":
                            priceToppings += 2.99;
                            break;
                        default:
                            priceToppings = 0;
                    }
                }
            }
        }
        return priceToppings;
    }

    public void checkout(double toppingPrice, String[] additions) {
        System.out.println("Your order is:");
        System.out.println("Regular " + protein + " burger in a " + getBun() + " bun with a base price of $" + price);
        System.out.print("With addition/s: ");
        for (int i = 0; i < additions.length; i++) {
            if (additions[i] != null) {
                String currentTopping = additions[i].toLowerCase();
                switch (currentTopping) {
                    case "tomato":
                        System.out.print(additions[i] + " $1.00 ");
                        break;
                    case "bacon":
                    case "onion":
                        System.out.print(additions[i] + " $3.00 ");
                        break;
                    case "cheese":
                    case "garlic":
                        System.out.print(additions[i] + " $2.00 ");
                        break;
                    case "jalapeno":
                        System.out.print(additions[i] + " $.50 ");
                        break;
                    case "sweet":
                        System.out.print(additions[i] + " $2.50 ");
                        break;
                    case "fresh":
                        System.out.print(additions[i] + " $2.99 ");
                        break;
                }
            }
        }
        System.out.println();
        System.out.println("Total price is $" + (getBasePrice() + toppingPrice));
    }

    public String[] chooseAdditions(String[] additions) {
        System.out.println("Toppings: Tomato $1, Bacon $3, Cheese $2, Jalapeno $0.5, Onion rings $3," +
                " Garlic mushrooms $2, Sweet Potato Fries $2.5, Fresh Sallad $2.99");
        Scanner scanner = new Scanner(System.in);
        String check;
        int i = 0;
        System.out.print("Do you want to add extra toppings to your burger? y/n: ");
        check = scanner.nextLine().toLowerCase();

        if (check.equals("y")) {
            System.out.println("Choose up to " + additions.length + " additions from the list above");
            this.hasToppings = true;
        } else {
            this.hasToppings = false;
        }


        while (check.equalsIgnoreCase("y") && i < additions.length) {
            additions[i] = scanner.next().toLowerCase();

            i++;
            scanner.nextLine();
            if (i < additions.length) {

                System.out.print("Do you want to add another addition to your burger? y/n: ");
                check = scanner.next();
            }
        }
        scanner.close();
        return additions;
    }


    public void printAdditions() {
        System.out.println(Arrays.toString(additions));
    }

    public double getBasePrice() {
        return price;
    }


    public String[] getAdditions() {
        return additions;
    }

    public String getProtein() {
        return protein;
    }

    public String getBun() {
        return bun;
    }
}
