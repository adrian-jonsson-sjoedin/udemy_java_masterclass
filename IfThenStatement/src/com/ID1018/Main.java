package com.ID1018;

public class Main {

    public static void main(String[] args) {
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens so lucky me that it wasn't one.");
        }

        int topScore = 80;
        if (topScore != 100) { // is topScore not equal to 100?
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60; // && is an AND operator
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Top score greater than second top score AND top score less than 100");
        }

        if ((topScore > secondTopScore) || (topScore < 80)) { // || is the OR operator
            System.out.println("Top score greater than second top score OR top score less than 100");
        }

        boolean isChar = false;
        if (isChar) { // the IF statement always check if the variable is True if nothing else is added
            System.out.println("This print should not be visible");
        }
        if (!isChar) { // the ! is the NOT operator. it tests the alternative value. so here it checks if isChar is false
            System.out.println("This print should be visible");//and if it is it executes the code bellow
        }
        isChar = true;
        boolean wasChar = isChar ? true : false; //Ternary Operator. checks the condition of isChar and then assigns
        if (wasChar) {                          //True to wasChar if isChar is True otherwise it assigns False to wasChar
            System.out.println("wasChar is true ");
        }
        System.out.println(wasChar);
    }
}
