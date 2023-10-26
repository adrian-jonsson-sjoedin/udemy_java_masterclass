public class Animal {
    protected String type; //any subclass to this clas will have access to this field
    private String size;
    private double weight;

    public Animal() {

    }
    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    public void move(String speed) {
        System.out.println(type + " moves with the speed " + speed);
    }

    public void makeNoise() {
        System.out.println(type + " makes some kind of noise.");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }
}
