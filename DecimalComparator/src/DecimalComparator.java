public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        firstNumber = firstNumber * 1000;
        secondNumber = secondNumber * 1000;
        int firstNumberAsInt = (int) firstNumber;
        int secondNumberAsInt = (int) secondNumber;
        if (firstNumberAsInt == secondNumberAsInt) {
            System.out.println("They are the same up to three decimal places");
            return true;
        }
        System.out.println("They are not the same");
        return false;
    }
}
