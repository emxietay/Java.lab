package vn.funix.fx22541.lab10_2;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(20, false);
        printer.addToner(20);
        printer.addToner(-20);
        printer.addToner(100);

        int pagesPrinted = printer.printPages(59);
        System.out.println("Printing " + pagesPrinted);
        pagesPrinted = printer.printPages(59);
        System.out.println("Pages printed was " + pagesPrinted + ", new total print count for printer = " + printer.getPagesPrinted());
        System.out.println("Toner level: " + printer.getTonerLevel());
    }


}
