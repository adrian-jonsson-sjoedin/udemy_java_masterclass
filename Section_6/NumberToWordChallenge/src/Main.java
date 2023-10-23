public class Main {
    public static void main(String[] args) {

        numberToWord(1263210);
    }

    public static void numberToWord(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int reversedNumber = reverse(number);
        int digitToPrint;
        int digitDifference = getDigitCount(number) - getDigitCount(reversedNumber);
        while (reversedNumber != 0) {
            digitToPrint = reversedNumber % 10;
            reversedNumber /= 10;
            String word = switch (digitToPrint) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> throw new IllegalStateException("Unexpected value: " + digitToPrint);
            };
            System.out.println(word);
        }
        while (digitDifference != 0) {
            System.out.println("Zero");
            digitDifference--;
        }
    }

    public static int getDigitCount(int number) {
        if (number == 0) {
            return 1;
        } else if (number < 0) {
            return -1;
        }
        int counter = 0;
        while (number != 0) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit; // move digits one step left and add the digit from number
            number /= 10; // remove last digit from number
        }
        return reversedNumber;
    }
}