package com.Adrian;

public class Vehicle {
    private String name;
    private int weight;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, int weight) {
        this.name = name;
        this.weight = weight;

        this.currentVelocity =0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("vehicle.steer(): Steering at " + currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection);
    }

    public void stop() {
        this.currentVelocity = 0;
        System.out.println("vehicle.stop() called");
    }
    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
