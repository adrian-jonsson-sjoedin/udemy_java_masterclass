public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(3823623);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");

        } else {
            String originalMinString = minutes + " min";
            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440;
            String yearsString = years + " y";
            String daysString = days + " d";
            System.out.println(originalMinString + " = " + yearsString + " and " + daysString);
        }
    }
}
