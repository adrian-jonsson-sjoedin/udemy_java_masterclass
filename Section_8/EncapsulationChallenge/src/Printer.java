public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : 0;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (this.tonerLevel + tonerAmount > 100 || this.tonerLevel + tonerAmount < 0) {
            System.out.println("Added toner amount makes total toner level fall outside accepted" +
                    " range. Toner amount not added.");
            return -1;
        } else {
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        }
    }

    public int printPages(int pagesToPrint) {
        if (this.duplex) {
            int total = pagesToPrint / 2 + pagesToPrint % 2;
            this.pagesPrinted = this.pagesPrinted + total;
            System.out.println("Duplex printer");
            return total;
        }
        return pagesToPrint;
    }
}
