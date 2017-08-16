package com.composition;

/**
 * Created by kloupos on 09/01/2017.
 */
public class Main {
    public static void main(String args[]) {
        Dimensions dimensions = new Dimensions(30, 20, 5);
        Case theCase = new Case("220b", "DELL","240W",dimensions);

//        Resolution nativeResolution = new Resolution(1900, 1414);
        Monitor monitor = new Monitor("27inch beast","Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("Gigabyte S33", "Gigabyte", 4, 6, "v.2.44");

        PC thePC = new PC(theCase,monitor,motherboard);
        thePC.powerUp();
//        thePC.getMonitor().drawPixelAt(1400,2110,"red");
//        thePC.getMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
    }
}
