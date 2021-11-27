package com.Adrian;

public class Bed {
    private String maker;
    private String size;
    private String softness;

    public Bed(String maker, String size, String softness) {
        this.maker = maker;
        this.size = size;
        this.softness = softness;
    }

    public String getMaker() {
        return maker;
    }

    public String getSize() {
        return size;
    }

    public String getSoftness() {
        return softness;
    }
}
