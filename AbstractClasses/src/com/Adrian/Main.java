package com.Adrian;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();
        Raven raven = new Raven("Raven");
        raven.breathe();
        raven.eat();
        raven.fly();

        Penguin kingPenguin = new Penguin("King Penguin");
        kingPenguin.fly();
    }
}
