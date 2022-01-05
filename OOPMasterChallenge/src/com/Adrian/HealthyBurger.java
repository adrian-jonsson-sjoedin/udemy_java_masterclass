package com.Adrian;

import java.util.Arrays;

public class HealthyBurger extends Burger{
    private String name;
    private String[] additions = new String[6];

    public HealthyBurger(String protein, double price) {
        super("Brown Rye Bread Roll", protein, price);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String[] getAdditions() {
        return additions;
    }

    @Override
    public String[] chooseAdditions(String[] additions) {
        this.additions = super.chooseAdditions(additions);
        return additions;
    }

    @Override
    public void printAdditions() {
        System.out.println(Arrays.toString(additions));
    }

    @Override
    public void checkout(double toppingPrice, String[] additions) {
        super.checkout(toppingPrice, additions);
    }

    @Override
    public double getBasePrice() {
        return super.getBasePrice();
    }


}
