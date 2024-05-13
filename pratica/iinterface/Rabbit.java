package pratica.iinterface;

public class Rabbit implements Prey {
    
    public void hunt() {
        System.out.println("This Rabbit is hunting smaller fish");
    }

    public void flee() {
        System.out.println("This Rabbit is fleeing from a larger fish");
    }
}
