package com.Adrian;

public class Main {

    public static void main(String[] args) {
//        Player player1 = new Player();
//        player1.name = "Adrian";
//        player1.name = "Glock 17";
//        player1.health = 100;
//
//        int damage = 50;
//        player1.loseHealth(damage);
//        System.out.println("Remaining health is " + player1.healthRemaining());
//
//        damage = 51;
//        player1.loseHealth(damage);
//        System.out.println("Remaining health is " + player1.healthRemaining());

        EnhancedPlayer player2 = new EnhancedPlayer("Adrian", 200, "Spear");
        System.out.println("Initial health is " + player2.getHealth());
        /*
        *Challenge solution under here
        */
        Printer printer1 = new Printer(10, true);
        System.out.println("Initial page count is " + printer1.getPagesPrinted());
        int pagesPrinted = printer1.printPage(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count is " + printer1.getPagesPrinted());

        pagesPrinted = printer1.printPage(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count is " + printer1.getPagesPrinted());
//        printer1.addToner(70);
//        for (int i = 0; i <= 3; i++) {
//            printer1.printPage();
//        }
//        System.out.println("Total pages printed is " + printer1.getTotalPrintedPages());


    }
}
