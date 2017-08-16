package com.encaplulationChallenge;

/**
 * Created by kloupos on 01/02/2017.
 * Create a class that demonstrate proper encapsulation techniques
 * the class will be called Printer
 * It will simulate a real Computer Printer
 * It should have fields for the toner level, number of pages printed nad
 * also whether its a duplex printer (print both sides or single)
 * Add methods to fill up the toner (up to 100%), another method to
 * simulate printing a page (which should increase number of pages printed)
 * Decide on the scope, whether to use constructors, and anything else to use.
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("Initial page count " + printer.getPagesPrinted());

        printer.printPages(40);
        System.out.println("Now printed " + printer.getPagesPrinted() + " pages");

    }
}
