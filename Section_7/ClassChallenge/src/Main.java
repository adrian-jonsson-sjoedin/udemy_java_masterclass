public class Main {
    public static void main(String[] args) {
//        BankAccount account = new BankAccount(666, 1000, "Adrian",
//                "adrian@gmail.com", "0730111111");
        BankAccount account = new BankAccount();
//        account.setCustomerName("Adrian");
//        account.setAccountNumber(666);
//        account.setBalance(1000);

        System.out.println(account.getBalance());
        System.out.println(account.getCustomerName());
        System.out.println(account.getAccountNumber());
        account.deposit(1234);
        account.withdraw(456);
        account.withdraw(456);
        account.withdraw(456);
        account.withdraw(456);
        account.withdraw(4506);


    }
}