package com.Adrian;

public class DeluxHamburger extends Burger{
    private String drink;
    private String chips;

    public DeluxHamburger(String drink, String chips, String bun, String protein) {
        super(bun, protein, 15.99);
        this.drink = drink;
        this. chips = chips;
    }

    @Override
    public double getBasePrice() {
        System.out.println("Deluxe Hamburger set, " + getProtein() + " with " + drink + " and " + chips +" fries" +
                " cost $" + super.getBasePrice());
        return super.getBasePrice();
    }
}
