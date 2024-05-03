
import java.util.ArrayList;

public class forEachLoop {
    
    public static void main(String[] args) {
        
        //String[] animals = {"cat", "dog", "bird"};
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("bird");

        for(String animal : animals ) {
            System.out.println(animal);
        }

    }

}
