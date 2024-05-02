
import java.util.Scanner;

public class revisando {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Qual a sua comida favorita? ");
        String comida = scanner.nextLine();

        // Mostrando as respostas.

        System.out.println("Olá "+nome);
        System.out.println("Você tem "+idade+" anos.");
        System.out.println("Sua comida favorita é : "+comida);

    }
}
