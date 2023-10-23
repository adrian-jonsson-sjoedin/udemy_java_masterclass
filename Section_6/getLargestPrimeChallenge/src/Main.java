public class Main {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(82354324));    }
    // A function to print all prime factors
    // of a given number n
    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        int max = 0;
        // Print the number of 2s that divide n
        while (number % 2 == 0) {
            max = 2;
            System.out.print(2 + " ");
            number /= 2;
        }
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= number; i += 2) {
            // While i divides n, print i and divide n
            while (number % i == 0) {
                if (i > max) {
                    max = i;
                }
                System.out.print(i + " ");
                number /= i;
            }
        }
        // This condition is to handle the case when
        // n is a prime number greater than 2
        if (number > 2) {
            if (number > max) {
                max = number;
            }
            System.out.print(number);
        }
        System.out.println();
        System.out.println("largest prime was " + max);
        return max;
    }
}