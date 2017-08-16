package com.inheritance;

/**
 * Created by kloupos on 05/01/2017.
 */
public class Main {
    public static void main (String args[]) {
        Animal animal = new Animal("Animal",1,1,5,5);
//        animal.getBody();
//        animal.eat();

        Dog dog = new Dog("Kiriakos",15,23,2,4,1,20,"Brown");
//        System.out.println(dog.getName());

//        dog.chew();
//        dog.eat();
        dog.walk();
//        dog.run();

        Fish fish = new Fish("Willy",13,2,3,2);
        System.out.println(fish.getName());

        fish.swimm(13);
    }
}
