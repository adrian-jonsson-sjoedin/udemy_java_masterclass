package com.ID1018;

public class Main {

    public static void main(String[] args) {
//        int switchValue = 3;
//        switch (switchValue) { //we're only testing the var. switchValue
//            case 1: //we're testing to see if tha var. entered into the switch func. is ==1
//                System.out.println("value was 1"); //the code to be executed if case was true
//                break;
//            case 2:
//                System.out.println("value was 2");
//                break;
//            case 3: case 4: case 5:
//                System.out.println("was a 3, 4 or 5");
//                System.out.println("actually it was a "+ switchValue);
//                break;
//            default: //what switch will do if no of the earlier cases was executed
//                System.out.println("was not 1 or 2");
//                break;
//        }
        char letter = 'B';
        switch (letter) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                System.out.println("Letter was " + letter);
                break;
            default:
                System.out.println("Letter was not A, B, C, D or E");
        }
        String month = "January";
        switch (month.toLowerCase()) { //converts the string to lower case. there's also a method to convert to upper case
            case "january": //need to make sure that we test for lower case now
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
        }

    }
}
