public class Main {
    public static void main(String[] args) {
        //This is not using encapsulation which is bad
        Player player = new Player();
        player.name = "Adrian";
        player.health = 20;
        player.weapon = "Spear";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());
        player.health = 200; // this bypass the check in healthRestore
        player.loseHealth(11);
        System.out.println("Remaining health = " + player.healthRemaining());

    }
}