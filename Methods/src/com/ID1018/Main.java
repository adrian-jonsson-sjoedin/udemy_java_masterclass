package com.ID1018;

public class Main {

    public static void main(String[] args) {

//        calculateScore(true, 800, 5, 100);
//        calculateScore(true,10000,8,200);

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);


        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score is " + highScore);

        int highScorePosition = calculatedHighScorePosition(calculateScore(true, 500, 5, 100)); //score=3000
        displayHighScorePosition("Adrian", highScorePosition);

        highScorePosition = calculatedHighScorePosition(800);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculatedHighScorePosition(100);
        displayHighScorePosition("Elias", highScorePosition);

        highScorePosition = calculatedHighScorePosition(50);
        displayHighScorePosition("Teo", highScorePosition);

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
            return finalScore;
        }
        return -1; //-1 is used to indicate an error or in searching algorithms an invalid value or a value not found
    }

    // Takes the players high score and assign it a position
    public static int calculatedHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if ((score >= 500) && (score < 1000)) { //can remove && (score < 1000) since we've already checked it above
            return 2;
        } else if ((score >= 100) && (score < 500)) { //can remove && (score < 500) since we've already checked it above
            return 3;
        } else {
            return 4;
        }
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " got position " + position + " on the high score table");
    }
}
