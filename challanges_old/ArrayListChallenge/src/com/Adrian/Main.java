package com.Adrian;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("070 123 45 67");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        while (!quit) {
            System.out.println("Enter action: (6 to show available actions) ");
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0 -> {
                    System.out.println("Shutting down...");
                    quit = true;
                }
                case 1 -> mobilePhone.printContacts();
                case 2 -> addNewContact();
                case 3 -> updateContact();
                case 4 -> removeContact();
                case 5 -> queryContact();
                case 6 -> printActions();
            }
        }
    }

    private static  void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phoneNr = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNr);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New contact added. Name: " + name + ", phone: " + phoneNr);
        } else {
            System.out.println("Can not add " + name + ", contact already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter the name of the contact you wish to update: ");
        String currentContact = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(currentContact);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Enter the new contact: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new contact phone number");
        String newPhoneNr = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNr);
        if (mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record.");
        } else {
            System.out.println("Contact could not be updated");
        }
    }

    private static void removeContact() {
        System.out.println("Enter the name of the contact you wish to remove: ");
        String contactName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(contactName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Successfully removed contact");
        } else {
            System.out.println("Error removing contact");
        }
    }
    private static void queryContact() {
        System.out.println("Enter contact name: ");
        String contactName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(contactName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + ", Phone Number:  "
        + existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("Available actions: \nPress");
        System.out.print(
                "\t0 - to shutdown\n" +
                        "\t1 - to print contacts\n" +
                        "\t2 - to add a new contact\n" +
                        "\t3 - to update an existing contact\n" +
                        "\t4 - to remove an existing contact\n" +
                        "\t5 - query if a contact exists\n" +
                        "\t6 - to print a list of available actions");
        System.out.print("\nChoose your action: ");

    }

}
