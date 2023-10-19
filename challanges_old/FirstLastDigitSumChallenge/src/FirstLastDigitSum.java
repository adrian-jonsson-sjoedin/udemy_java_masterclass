public class FirstLastDigitSum {
    public static void main(String[] args) {
        sumFirstAndLastDigit(89420);
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;
        int firstDigit = 0;
        int numb = number;
        while (numb != 0) {
            firstDigit = numb;
            numb = (numb - (numb % 10)) / 10;
        }
        return lastDigit+firstDigit;
    }
}
