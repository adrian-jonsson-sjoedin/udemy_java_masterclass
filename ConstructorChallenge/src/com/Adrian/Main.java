package com.Adrian;

public class Main {

    public static void main(String[] args) {
        VipCustomer adrian = new VipCustomer();
        System.out.println(adrian.getCustomerName());
        System.out.println(adrian.getCreditLimit());
        System.out.println(adrian.getEmail());

        VipCustomer person2 = new VipCustomer("Bob", "25000");
        System.out.println(person2.getCustomerName());
        System.out.println(person2.getCreditLimit());
        System.out.println(person2.getEmail());

    }
}
