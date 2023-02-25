package domain;


 /**
 * The class Jackal extends predator
 */ 
public class Jackal extends Predator {

    private String kind;


/** 
 *
 * Jackal
 *
 * @param name  the name
 * @param weight  the weight
 * @param kind  the kind
 */
    public Jackal(String name, int weight, String kind) { 

        this.name=name;
        this.weight=weight;
        this.kind=kind;
    }


/** 
 *
 * Jackal
 *
 *
 */
    public Jackal() { 

        this("God",20,"Ethiopian jackal");
    }


/** 
 *
 * Jackal
 *
 * @param name  the name
 */
    public Jackal(String name) { 

        this(name,20,"Ethiopian jackal");
    }
    

/** 
 *
 * Play
 *
 */
    public void play() { 

        System.out.println("Jackal is playing...");
    }


/** 
 *
 * Group
 *
 */
    public void group() { 

        System.out.println("Jackal grouping...");
    }


/** 
 *
 * Territory designations
 *
 */
    public void territoryDesignations() { 

        System.out.println("Jackal designates territory...");
    }

    @Override

/** 
 *
 * Hunt
 *
 */
    public void hunt() { 

        System.out.println("Jackal hunts for prey...");
    }

    @Override

/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

        return super.toString()+"\nKind:\t"+this.kind+"\nThis is Jackal";
    }

    @Override

/** 
 *
 * Sleep
 *
 */
    public void sleep() { 

        System.out.println("Jackal is sleeping...");
    }

    @Override

/** 
 *
 * Speak
 *
 */
    public void speak() { 

        System.out.println("Aw-Aww!");
    }

    @Override

/** 
 *
 * Eat
 *
 */
    public void eat() { 

        System.out.println("Jackal eats carrion...");
    }
    
    
}
