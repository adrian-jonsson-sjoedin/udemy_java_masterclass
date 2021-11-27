package com.Adrian;

public class Main {

    public static void main(String[] args) {
        Window window = new Window(3000, 1000, "Triple isolated large window");
        Bed bed = new Bed("Best beds USA", "King Size", "Medium softness");

        Room bedroom = new Room(window, bed);
        System.out.println(bedroom.getWindow().getType());
        bedroom.infoBed();
    }
}
