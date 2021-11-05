package com.ID1018;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 500;

        //How to use "if, else if and else"
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score is less tna 1000");
//        } else {
//            System.out.println("Your score is 5000 or more");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus); // the variable finalScore can only be accessed within this
            System.out.println("Your final score was " + finalScore);//code block
        }
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;
        boolean newGameOver = true;

        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score is= "+finalScore);
        }





    }





}
