package com.polymorphism;

class Movie {
    public String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return this.name;
    }
}
class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A shark bla bla";
    }
}

class IndependenceDate extends Movie {

    public IndependenceDate() {
        super("Independence Date");
    }

    @Override
    public String plot() {
        return "This is your day";
    }
}

class MyMovie extends Movie {
    public MyMovie() {
        super("My fav movie");
    }

    //No plot
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i <= 9; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie # " + i + " name is " + movie.getName() + " plot : " + movie.plot());
        }

    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random num generated " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDate();
            case 3:
                return new MyMovie();
        }

        return null;
    }
}























