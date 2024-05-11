package pratica;
import java.util.Scanner;
import java.util.Random;

public class passwordGenerator {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String [] letras = {"a", "e", "i", "o", "u"};
        char []  simbolos = {'!', '@', '#', '$'};
        int [] numeros = {1, 2, 3, 4};
    
        System.out.println("Quantas letras você quer na sua senha? ");
        int numLetras = scanner.nextInt();
            
        System.out.println("Quantos simbolos você quer na sua senha? ");
        int numSimbolos = scanner.nextInt();
            
        System.out.println("Quantos números você quer na sua senha? ");
        int numNumeros = scanner.nextInt();
    
        String password = "";
        
        for (int i = 0; i <= numLetras - 1 ; i++) {
          int randomNumber = random.nextInt(0, letras.length);
          String randomLetra = letras[randomNumber];
          password += randomLetra;
        }

        for (int i = 0; i <= numSimbolos - 1 ; i++) {
            int randomNumber = random.nextInt(0, simbolos.length);
            char randomSimbolo = simbolos[randomNumber];
            password += randomSimbolo;
          }

        for (int i = 0; i <= numNumeros - 1 ; i++) {
        int randomNumber = random.nextInt(0, numeros.length);
        int randomNumero = numeros[randomNumber];
        password += randomNumero;
        }
  
        String passwordFinal = embaralharString(password);
        System.out.println("Seu password: "+passwordFinal);

    }

    

    public static String embaralharString(String texto) {
        char[] chars = texto.toCharArray();
        Random rand = new Random();
        for (int i = 0; i < chars.length; i++) {
            int j = rand.nextInt(chars.length);
            // Troca o caractere na posição i com o caractere na posição j
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        return new String(chars);
    }

}
