public class Main {
    public static void main(String[] args) {
        Printer duplex = new Printer(50, true);
        System.out.println(duplex.printPages(13));
        duplex.addToner(52);
    }
}