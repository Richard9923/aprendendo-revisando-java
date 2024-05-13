package pratica.iinterface;

public class Main {
    public static void main(String[] args) {
        
        Fish fish = new Fish();
        Rabbit rabbit = new Rabbit();

        fish.hunt();
        fish.flee();
        rabbit.hunt();
        rabbit.flee();
    }
}
