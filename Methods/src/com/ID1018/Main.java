package com.ID1018;

public class Main {

    public static void main(String[] args) {

//        calculateScore(true, 800, 5, 100);
//        calculateScore(true,10000,8,200);

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        calculateScore(gameOver, score, levelCompleted, bonus);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    //this is a new method that I've created. it is kinda the same thing as a function in python
    //use void if you don't want to return anything. if you want to return something replace the keyword void with the
    //datatype you wish to return. in this case an int.
    // as soon as the program hits the keyword return it will go back to the place in the main method where this method
    //was called
    public static int calculateScore(boolean statusOfGame, int score, int levelCompleted, int bonus) {
        if (statusOfGame) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score is " + finalScore);
            return finalScore;
        }
        return -1; //-1 is used to indicate an error or in searching algorithms an invalid value or a value not found
    }
}
