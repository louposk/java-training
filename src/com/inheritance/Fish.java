package com.inheritance;

/**
 * Created by kloupos on 05/01/2017.
 */
public class Fish extends Animal {
    private int gills;
    private int eyes;

    public Fish(String name, int size, int weight, int gills, int eyes) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
    }

    private void rest(){

    }

    public void swimm(int speed) {
        moveBackFin();
        moveMuschles();

        super.move(speed);
    }

    private void moveBackFin() {
        System.out.println("Fish.moveBackFine() called");
    }

    private void moveMuschles() {
        System.out.println("Fish.moveMuschles() called");
    }

}
