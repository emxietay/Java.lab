package vn.funix.fx22541.lab10_2;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private final boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel > 100 || tonerLevel < 0) {
            this.tonerLevel = -1;
        } else {
            this.tonerLevel = tonerLevel;
        }
        pagesPrinted = 0;
        this.duplex = duplex;
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode " + pages + " pages..");
        }
        pagesPrinted += pagesToPrint;
        return pagesToPrint;

    }

    public int addToner(int tonerAmount) {
        if (tonerAmount < 0 || tonerAmount > 100) {
            return -1;
        }
        if (tonerLevel + tonerAmount > 100) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return tonerLevel;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
