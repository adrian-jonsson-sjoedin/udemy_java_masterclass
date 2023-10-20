public class Main {
    public static void main(String[] args) {
        System.out.println("5,2 is " + convertToCentimeters(5,2) + "cm");
    }

    public static double convertToCentimeters(int heightInInches) {
        double conversionNumber = 2.54;
        return heightInInches * conversionNumber;
    }
    public static double convertToCentimeters(int heightInFeet, int remainingHeightInInches) {
        int feetToInchesConversionNumber = 12;
        int totalHeightInInches = heightInFeet * feetToInchesConversionNumber + remainingHeightInInches;
        return convertToCentimeters(totalHeightInInches);
    }
}