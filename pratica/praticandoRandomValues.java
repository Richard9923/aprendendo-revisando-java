package pratica;
import java.util.Random;

public class praticandoRandomValues {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(0, 2)+1;
        double randomDouble = random.nextDouble();
        boolean randomBoolean = random.nextBoolean();

        System.out.println(randomNumber);
        System.out.println(randomDouble);
        System.out.println(randomBoolean);
        

    }

}
