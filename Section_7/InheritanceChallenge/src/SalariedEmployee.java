public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String dateOfBirth,
                            String hireDate, double annualSalary) {
        super(name, dateOfBirth, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary / 26; // You get paid biweekly in USA, meaning 26 times in a year
        double adjustedPay = isRetired ? 0.9 * payCheck : payCheck;
        return (int) adjustedPay;
    }


    public void retire() {
        terminate("12/12/2025");
        this.isRetired = true;
    }
}
