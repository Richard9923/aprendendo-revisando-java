import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList <String> food = new ArrayList<String>();

        System.out.println(food);
        food.add("pizza");
        food.add("hotdog");
        food.add("pastel");

        food.set(1, "sushi");
        food.remove(2);



        for (int i=0; i<food.size(); i++) {
            System.out.println(food.get(i));

        }

    }
}