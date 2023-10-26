public class Main {
    public static void main(String[] args) {
        Employee adrian = new Employee("adrian", "07/04/1994", "01/02/2024");
        System.out.println(adrian);
        System.out.println("age = " + adrian.getAge());
        System.out.println("Pay = " + adrian.collectPay());

        SalariedEmployee tim = new SalariedEmployee("Tim", "07/04/1994",
                "01/02/2024", 36800);
        System.out.println(tim);
        System.out.println("age = " + tim.getAge());
        System.out.println("Pay = " + tim.collectPay());

        tim.retire();
        System.out.println("Tim's pension check = " + tim.collectPay());

        HourlyEmployee marry = new HourlyEmployee("Mary", "08/05/1998",
                "03/07/2022", 150);
        System.out.println(marry);
        System.out.println("Mary's paycheck is " + marry.collectPay());
        System.out.println("Mary's holiday pay is " + marry.getDoublePay());
    }
}