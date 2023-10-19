public class PlayingCat {

    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        boolean isPlaying = true;
        if (isSummer) {
            if (temperature < 25 || temperature > 45) {
                isPlaying = false;
            }
        } else {
            if (temperature < 25 || temperature > 35) {
                isPlaying = false;
            }
        }
        return isPlaying;
    }
}
