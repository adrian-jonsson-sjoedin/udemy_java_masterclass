public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1236));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        int currentDigit = 0;
        int numb = number;
        while (numb > 0) {
            currentDigit = numb % 10;
            if ((currentDigit % 2) == 0) {
                sum += currentDigit;
            }
            numb = (numb - currentDigit) / 10;
        }
        return sum;
    }
}
