public class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private static int employeeNo = 1; // will share data across all instances of Employee
    // meaning that the first instance will be 1, the second instance will be 2 and so on
    // thanks to us incrementing employeeNo in the constructor.

    public Employee(String name, String dateOfBirth, String hireDate) {
        super(name, dateOfBirth);
        this.employeeId = employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}
