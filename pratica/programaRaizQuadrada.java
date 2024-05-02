package pratica;
import java.util.Scanner;
public class programaRaizQuadrada {
    public static void main(String[] args) {
        System.out.println("Programa raiz quadrada.");
        Scanner scanner = new Scanner(System.in);

        double x;
        double y;
        double z;

        System.out.println("Qual o número x? ");
        x = scanner.nextDouble();
        
        System.out.println("Qual o número y? ");
        y = scanner.nextDouble();

        System.out.println("Resultado: ");
        z = Math.sqrt((y*y)+(x*x));
        System.out.println("O resultado do cálculo é de : "+z);
       
        scanner.close();

    }
}
