package com.Adrian;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("22B0", "Dell", "240V", dimensions);

        Monitor theMonitor = new Monitor("49inch Beast", "Asus", 49, new Resolution(2450, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-2000", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500,1200,"green");//access the program drawPixelAt() in class Monitor
//        thePC.getMotherboard().loadProgram("Linux");//access the program loadProgram() in class Motherboard
//        thePC.getTheCase().pressPowerButton();//access the program pressPowerButton in class Case

        thePC.powerUp();

    }
}
