package com.ID1018;

import java.util.Locale;

public class Car {

    private int doors; //for fields in a class you always go with private as a general rule
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model; //if we want to access the field we need to add "this." before
        }else{
            this.model = "Unknown";
        }

    }

    public String getModel() {
        return this.model;
    }
}
