package domain;

public class Jackal extends Predator {

    private String kind;

    public Jackal(String name, int weight, String kind) {
        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }

    public Jackal() {
        this("God",20,"Ethiopian jackal");
    }

    public Jackal(String name) {
        this(name,20,"Ethiopian jackal");
    }
    
    public void play() {
        System.out.println("Jackal is playing...");
    }

    public void group() {
        System.out.println("Jackal grouping...");
    }

    public void territoryDesignations() {
        System.out.println("Jackal designates territory...");
    }

    @Override
    public void hunt() {
        System.out.println("Jackal hunts for prey...");
    }

    @Override
    public String toString() {
        return super.toString()+"\nKind:\t"+this.kind+"\nThis is Jackal";
    }

    @Override
    public void sleep() {
        System.out.println("Jackal is sleeping...");
    }

    @Override
    public void speak() {
        System.out.println("Aw-Aww!");
    }

    @Override
    public void eat() {
        System.out.println("Jackal eats carrion...");
    }
    
    
}
