package com.Adrian;

public class Main {

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");//first name is set to an empty string
        person.setLastName("");//last name is set to an empty string
        person.setAge(10);
        System.out.println("fullName is " + person.getFullName());
        System.out.println("teen is " + person.isTeen());
        person.setFirstName("John");
        person.setAge(18);
        System.out.println("fullname is " + person.getFullName());
        System.out.println("teen " + person.isTeen());
        person.setLastName("Smith");
        System.out.println("fullname is " + person.getFullName());
    }
}
