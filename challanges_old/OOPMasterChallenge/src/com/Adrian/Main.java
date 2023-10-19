package com.Adrian;

public class Main {

    public static void main(String[] args) {
//        Burger burger1 = new Burger("Brichoe", "Beef", 10);
//        burger1.chooseAdditions(burger1.getAdditions());
//        burger1.printAdditions();
//        double toppingPrice = burger1.orderPrice(burger1.getAdditions());
//        burger1.checkout(toppingPrice);

        HealthyBurger hBurger1 = new HealthyBurger("chicken breast", 15);
        //chose the toppings
        hBurger1.chooseAdditions(hBurger1.getAdditions());
//        hBurger1.printAdditions();
        //calculate the total price for the toppings
        double toppingPrice = hBurger1.orderPrice(hBurger1.getAdditions());
        System.out.println(toppingPrice);
        //gets the checkout order
        hBurger1.checkout(toppingPrice, hBurger1.getAdditions());



//        DeluxHamburger dBurger1 = new DeluxHamburger("coke", "regular", "regular", "Beef");
//        dBurger1.getBasePrice();
    }
}
