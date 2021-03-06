public class LeapYear {

    public static void main(String[] args) {
        boolean test = isLeapYear(2020);
        System.out.println(test);
        System.out.println(getDaysInMonth(11, 2021));
    }

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;
        } else if ((year % 4 == 0) && year % 100 != 0) {
            return true;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        int daysInMonth = 0;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        if (isLeapYear(year)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2:
                    return  29;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
            }
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return  31;
                case 2:
                    return  28;
                case 4:
                case 6:
                case 9:
                case 11:
                   return  30;
            }
        }
        return -1;
    }
}
