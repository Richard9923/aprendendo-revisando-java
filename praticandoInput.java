// importando elemento de input scanner

import java.util.Scanner;


public class praticandoInput {

    public static void main(String[] args){
        // Praticando input java
        // fazer quatro perguntas
        // nome, idade e comida favorita
        // mostrar todas as respostas em mensagens após.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();

        scanner.nextLine();


        System.out.println("Qual a sua comida favorita? ");
        String comida = scanner.nextLine();

        // Mostrando respostas

        System.out.println("Olá "+nome+".");
        System.out.println("Você tem "+idade+" anos.");
        System.out.println("Sua comida favorita: "+comida+". ");

        System.out.println("Programa encerrado.");

    }
    
}
