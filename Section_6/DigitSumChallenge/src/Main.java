public class Main {
    public static void main(String[] args) {
        System.out.println(sumDigits(18700));
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 9) { // bigger than 1 digit
            int rightmostDigit = number % 10;
            sum += rightmostDigit;
            number /= 10;
        }
        // add the last digit.
        sum += number;
        return sum;
    }
}
