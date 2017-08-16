package com.inheritanceChallenge;

/**
 * Created by kloupos on 05/01/2017.
 */
public class Main{

    public static void main(String args[]) {

    /*
    Create Vehicle class add Car class witch inherits from vehicle
    Create another class with a specific type of Car that inherits from the Car class
    Add steering, changing parts, moving (speed)
    Whare to create the appropriate state and behaviours (fields and methods)
    Changing gears, inc/dec speed should be included
    For specific vehicle should add something specific for that type of car
     */
//        Outlander mine = new Outlander(36);
//        mine.steer(45);
//        mine.accelerate(30);
//
//        mine.accelerate(20);
//        mine.accelerate(-42);


        Fiat fiat = new Fiat();
        fiat.steer(20);
        System.out.println(fiat.getName());
//        fiat.get();
    }
}
