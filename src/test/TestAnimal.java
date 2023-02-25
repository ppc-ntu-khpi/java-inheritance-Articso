package test;

import domain.Jackal;


 /**
 * The class Test animal
 */ 
public class TestAnimal {


/** 
 *
 * Main
 *
 * @param args  the args
 */
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
