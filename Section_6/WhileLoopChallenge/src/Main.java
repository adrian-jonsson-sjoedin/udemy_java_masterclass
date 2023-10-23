public class Main {
    public static void main(String[] args) {
        int i = 4;
        int evenNumbersFound = 0;
        int oddNumbersFound = 0;
        while (i <= 20) {
            i++;
            if (!isEvenNumber(i)) {
                oddNumbersFound++;
                continue;
            }
            System.out.println(i + " is an even number");
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("Total number of even numbers found was " + evenNumbersFound);
        System.out.println("Total number of odd numbers found was " + oddNumbersFound);
    }
    public static boolean isEvenNumber(int numberToCheck) {
        return numberToCheck % 2 == 0;
    }
}