
import java.util.Random;

public class generatingRandomValues {
    
    public static void main(String[] args) {
        
        // Learning to generate random values in Java

        Random random = new Random();

        int randomNumber = random.nextInt(6)+1;
        double randomDouble = random.nextDouble();
        boolean randomBoolean = random.nextBoolean();

        System.out.println(randomNumber);
        System.out.println(randomDouble);
        System.out.println(randomBoolean);




    }
}
