public class Customer {
    public String name;
    public double creditLimit;
    public String email;

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public Customer() {
        this("Anomynus", 666.999, "anon@proton.com");
    }

    public Customer(String name, String email) {
        this(name, 1000, email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
