package test;

import domain.Jackal;

public class TestAnimal {

    public static void main(String[] args) {
        Jackal jackal = new Jackal("Loki");
        System.out.println(jackal);
        jackal.group();
        jackal.hunt();
        jackal.eat();
        jackal.speak();
        jackal.sleep();
        jackal.territoryDesignations();
        jackal.play();
    }
}
