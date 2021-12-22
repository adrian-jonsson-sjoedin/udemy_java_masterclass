public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-11));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int num = number;
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            num = -1 * number;
            while (num>0) {
                reverse = reverse * 10;
                //modulo 10 gives me the last digit of a number
                int lastDigit = num % 10;
                reverse += lastDigit;
                //removes the last digit from the number
                num = (num - lastDigit) / 10;
            }
        } else {
            while (num>0) {
                reverse = reverse*10;
                //modulo 10 gives me the last digit of a number
                int lastDigit = num % 10;
                reverse += lastDigit;
                //removes the last digit from the number
                num = (num - lastDigit) / 10;
            }
        }
        if (isNegative) {
            reverse*=-1;
        }
        if (reverse == number) {
            return true;
        }
        return false;
    }
}
