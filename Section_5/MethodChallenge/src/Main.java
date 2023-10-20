public class Main {
    public static void main(String[] args) {
        displayHighScorePosition("Adrian", calculateHighScorePosition(1500));
        displayHighScorePosition("Adrian", calculateHighScorePosition(1000));
        displayHighScorePosition("Adrian", calculateHighScorePosition(500));
        displayHighScorePosition("Adrian", calculateHighScorePosition(100));
        displayHighScorePosition("Adrian", calculateHighScorePosition(25));

    }

    public static void displayHighScorePosition(String playerName, int scorePosition) {
        System.out.println(playerName + " managed to get into position " + scorePosition + " on the high score list");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}