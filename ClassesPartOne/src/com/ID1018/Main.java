package com.ID1018;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car(); //need to initialize the class
        Car holden = new Car();
       // System.out.println("Model is "+ porsche.getModel());
        porsche.setModel("911");
        System.out.println("Model is "+ porsche.getModel());

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4.0);
        System.out.println("add = " + calculator.getAdditionResult());
        System.out.println("div = " + calculator.getDivisionResult());
    }
}
