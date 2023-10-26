public class Dog extends Animal{

    private String earShape;
    private String tailShape;
    public Dog(){
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"),
                weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed); // this calls the move method from the parent class. If super.moves is all we have then overriding is redundant
//        System.out.println("Dogs walk, run and wag their tail.");// This will execute after the move method in the parent class has executed
        if (speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
        System.out.println();
    }
    @Override
    public void makeNoise() {
        if (this.type.equals("Wolf")) { // type is from the parent class
            System.out.print("Ow Wooooo! ");
        }
        bark();
        System.out.println();
    }
    private void bark() {
        System.out.print("Woof! ");
    }
    private void run() {
        System.out.println("Dog running ");
    }
    private void walk() {
        System.out.println("Dog walking ");
    }
    private void wagTail() {
        System.out.println("Tail wagging ");
    }
}
