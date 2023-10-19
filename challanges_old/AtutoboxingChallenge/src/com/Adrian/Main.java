package com.Adrian;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("Swedbank");
        bank.addBranch("Stockholm");

        bank.addCustomer("Stockholm", "Adrian", 459.50);
        bank.addCustomer("Stockholm", "Tim", 50.05);
        bank.addCustomer("Stockholm", "Simon", 102.33);

        bank.addBranch("Uppsala");
        bank.addCustomer("Uppsala", "Bob", 13.37);

        bank.addCustomerTransaction("Stockholm", "Adrian", 100);
        bank.addCustomerTransaction("Stockholm", "Adrian", 10.11);
        bank.addCustomerTransaction("Stockholm", "Tim", 43.81);

        bank.listCustomers("Stockholm", false);
        bank.listCustomers("Stockholm", true);

        bank.listCustomers("Uppsala", true);

        if (!bank.addBranch("Stockholm")) {
            System.out.println("Stockholm branch already exists. Did not add another branch");
        }
    }


}
