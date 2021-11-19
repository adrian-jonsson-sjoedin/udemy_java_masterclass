package com.Adrian;

public class Main {

    public static void main(String[] args) {
        BankAccount account0 = new BankAccount();
        System.out.println(account0.getAccountNumb());

        BankAccount account1 = new BankAccount("1232456789", 1000,
                "Mark Smith", "email@email.com", "070-012 34 56");

        account1.deposit(200);

        BankAccount account2 = new BankAccount("Adrian", "adrian@email.com", "123");
        System.out.println(account2.getPhoneNumb() + " name " + account2.getCustomerName());
        System.out.println(account2.getAccountNumb());



        /* ****************** My code and testing of my class BankAccount ******************************
        BankAccount account1 = new BankAccount();
        account1.setAccountNumb("123456789");
        account1.setBalance(1000);
        account1.setCustomerName("Mark Smith");
        account1.setPhoneNumb("070-123-45-67");
        account1.setEmail("msmith@thisemaildontexist.com");
        System.out.println("Account: " + account1.getAccountNumb() + "belonging to " + account1.getCustomerName() +
                " has a balance of: "  + account1.getBalance() + " sek");
        account1.withdraw(1000);
        System.out.println("Account: " + account1.getAccountNumb() + " belonging to " + account1.getCustomerName() +
                " has a balance of: "  + account1.getBalance() + " sek");
         ***********************************************************************************************/
    }
}
