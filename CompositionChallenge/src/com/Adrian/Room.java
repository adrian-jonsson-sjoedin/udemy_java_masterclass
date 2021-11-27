package com.Adrian;

public class Room {
    private Window window;
    private Bed bed;

    public Room(Window window, Bed bed) {
        this.window = window;
        this.bed = bed;
    }

    public void infoBed() {
        System.out.println("Info about your bed: " + bed.getMaker()+", " + bed.getSize() + ", " + bed.getSoftness());
    }

    public Window getWindow() {
        return window;
    }
}
