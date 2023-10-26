public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());
        System.out.println("--------------------------");
        Customer customer1 = new Customer("Adrian", "adrian@gmail.com");
        System.out.println(customer1.getName());
        System.out.println(customer1.getEmail());
        System.out.println(customer1.getCreditLimit());
        System.out.println("--------------------------");
        Customer customer2 = new Customer("Tim", 1234, "tim@gmail.com");
        System.out.println(customer2.getName());
        System.out.println(customer2.getEmail());
        System.out.println(customer2.getCreditLimit());
    }
}