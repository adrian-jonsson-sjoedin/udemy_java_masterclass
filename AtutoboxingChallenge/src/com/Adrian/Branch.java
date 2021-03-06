package com.Adrian;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customer;


    public Branch(String name) {
        this.name = name;
        this.customer = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public boolean newCustomer(String customerName, double initialAmount) {
        if (findCustomer(customerName) == null) {
            this.customer.add(new Customer(customerName, initialAmount));
        return true;
        }
        System.out.println("Is already a customer");
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double amount) {
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            System.out.println(amount + " has been added to "+customerName+" account");
            return true;
        }
        System.out.println("Couldn't find a customer by tha name " + customerName);
        return false;
    }

    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customer.size(); i++) {
            Customer checkedCustomer = this.customer.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }
        return null;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }
}
