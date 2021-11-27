package com.Adrian;

public class Motherboard {
    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bio;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSlots, String bio) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bio = bio;
    }

    public void loadProgram(String programName) {
        System.out.println("Program is now loading");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSlots() {
        return cardSlots;
    }

    public String getBio() {
        return bio;
    }
}
