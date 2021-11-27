package com.Adrian;

public class Window {
    private int height;
    private int width;
    private String type;

    public Window(int height, int width, String type) {
        this.height = height;
        this.width = width;
        this.type = type;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public String getType() {
        return type;
    }
}
