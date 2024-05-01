import java.util.Scanner;


public class squareRootProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x;
        double y;
        double z;

        System.out.println("Escolha o valor x:");
        x = scanner.nextDouble();

        System.out.println("Escolha o valor y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The result is : "+z);

        scanner.close();

    }
    
}
