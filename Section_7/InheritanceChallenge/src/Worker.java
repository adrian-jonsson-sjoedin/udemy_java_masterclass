import java.time.LocalDate;

public class Worker {
    private String name;
    private String dateOfBirth; // assume format of DD/MM/YYYY
    protected String endDate; // assume format of DD/MM/YYYY

    public Worker(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Worker() {
    }

    public int getAge() {
        int birthdate = Integer.parseInt(this.dateOfBirth.substring(6));
        return 2023 - birthdate;
    }

    public double collectPay() {
       return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
