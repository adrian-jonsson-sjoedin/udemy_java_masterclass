import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int currentYear = 2023;
        try {
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException exception) {
            System.out.println(getInputFromScanner(currentYear));
        }
    }

    // Needs to be run from the terminal
    public static String getInputFromConsole(int currentYear) {
        String userName = System.console().readLine("Please enter your name: ");
        System.out.println("Hi " + userName + ", Thanks for taking the course");
        String dateOfBirth = System.console().readLine("What year where you born? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        return "You are " + age + " years old.";
    }

    //    Can be run from within the IDE
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String userName = scanner.nextLine();
        System.out.println("Hi " + userName + ", Thanks for taking the course");
        System.out.print("What year where you born? ");
        boolean isValidDOB = false;
        int age = 0;
        do {
            System.out.println("Enter a year of birth >= " + (currentYear - 125) + " and <= " + currentYear);
            try {
                age = checkData(currentYear, scanner.nextLine());
                isValidDOB = age < 0 ? false : true;
            } catch (NumberFormatException badUserData) {
                System.out.println("Invalid character entered. Please only use digits.");
            }
        }while (!isValidDOB);
        return "You are " + age + " years old.";
    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }
        return currentYear - dob;
    }
}