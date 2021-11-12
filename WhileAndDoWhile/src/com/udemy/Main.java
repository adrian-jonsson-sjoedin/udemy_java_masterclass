package com.udemy;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        int doCount = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }
        do { // executes the code below before checking the while statement, so will always run at least once
            System.out.println("Count value was " + doCount);
            doCount++;
        } while (doCount != 6);


        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue; //if this is reached all code below will be skipped and the loop will go back to the beginning
            }
            System.out.println(number + " is an even number");
            evenNumbersFound++;
            if (evenNumbersFound >= 5) {
                break;
            }
        }
        System.out.println("total even number found " + evenNumbersFound);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0 ? true : false;
    }
}
