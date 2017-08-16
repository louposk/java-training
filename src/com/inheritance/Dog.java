package com.inheritance;

/**
 * Created by kloupos on 05/01/2017.
 */
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    //Call animal constructor

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); //Initialize Animal class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

//    public void eat() {
//        System.out.println("Our dog is eating");
//    }

    private void chew() {
        System.out.println("Dog chew");
    }

    @Override
    public void eat() {
        this.chew();
        System.out.println("Dog eating chewing");
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        super.move(10);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(20);
    }
    public void movelegs(int speed) {
        System.out.println("Dog.movelegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called. Dog moves " + speed);
        movelegs(3);
    }
}


