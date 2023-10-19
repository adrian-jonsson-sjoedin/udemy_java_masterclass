package com.Adrian;

class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;


    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        return "car.startEngine()";
    }

    public String accelerate() {
        return "car.accelerate()";
    }

    public String brake() {
        return "car.brake";
    }
}

class CRV extends Car {
    public CRV(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "CRV.startEngine()";
    }

    @Override
    public String accelerate() {
        return "CRV.accelerate()";
    }

    @Override
    public String brake() {
        return "CRV.brake()";
    }
}

class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford.startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ford.accelerate()";
    }

    @Override
    public String brake() {
        return "Ford.brake()";
    }
}

class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + ".startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden.accelerate()";
    }

    @Override
    public String brake() {
        return "Holden.brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        Car car = new Car(16, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());
        CRV crv = new CRV(10, "Honda CR-V");
        System.out.println(crv.startEngine());
        System.out.println(crv.accelerate());
        System.out.println(crv.brake());

        Ford ford = new Ford(10, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

       Holden holden = new Holden(10, "Holden Commadore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());
    }


}
