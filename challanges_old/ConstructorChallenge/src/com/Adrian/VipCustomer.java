package com.Adrian;

public class VipCustomer {
    private String customerName;
    private String creditLimit;
    private String email;

    public VipCustomer() {
        this("No name given", "Default $10,000", "N/A");
    }

    public VipCustomer(String customerName, String creditLimit) {
        this(customerName, creditLimit, "default@email.com");
    }

    public VipCustomer(String customerName, String creditLimit, String email) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
