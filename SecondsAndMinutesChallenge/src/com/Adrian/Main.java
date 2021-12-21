package com.Adrian;

public class Main {

    public static void main(String[] args) {
        String time = getDurationString( 100000);
        System.out.println(time);
    }

    public static String getDurationString(long minutes, long seconds) {
        String message = "";
        if ((seconds < 0 || seconds > 59) || minutes < 0) {
            return "Invalid value";
        }
        long h = minutes / 60;
        long min = minutes % 60;
        message = h + "h " + min + "m " + seconds + "s";
        return message;
    }

    public static String getDurationString(long seconds) {
        String message = "";
        if (seconds < 0) {
            return "Invalid value";
        }
       long min = seconds / 60;
       long sec = seconds % 60;
        message = min + "m " + sec + "s";
        return getDurationString(min,sec);
    }

}
