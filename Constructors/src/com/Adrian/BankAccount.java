package com.Adrian;


public class BankAccount {
    private String accountNumb;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumb;

    public BankAccount() {
        this("Default account", 0d, "Default name", "Default email",
                "Default phone number");
        System.out.println("Empty constructor with default fields called ");
    }

    //major constructor. the other constructors will call this one
    public BankAccount(String accountNumb, double balance, String customerName, String email, String phoneNumb) {
        this.customerName = customerName;
        this.accountNumb = accountNumb;
        this.phoneNumb = phoneNumb;
        this.email = email;
        this.balance = balance;
        System.out.println("Account constructor with parameters called");
    }

    public BankAccount(String customerName, String email, String phoneNumb) {
        this("9999", 100, customerName, email, phoneNumb);

    }

    public void deposit(double moneyIn) {
        this.balance += moneyIn;
        System.out.println(moneyIn + ":- has been deposited into account " + this.accountNumb +
                '\n' + "New balance is " + this.balance + ":-");
    }

    public void withdraw(double moneyOut) {
        if ((this.balance - moneyOut) >= 0) {
            this.balance -= moneyOut;
        } else {
            System.out.println("Insufficient funds. No money was withdrawn");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumb() {
        return accountNumb;
    }

    public String getPhoneNumb() {
        return phoneNumb;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setAccountNumb(String accountNumb) {
        this.accountNumb = accountNumb;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumb(String phoneNumb) {
        this.phoneNumb = phoneNumb;
    }


}
