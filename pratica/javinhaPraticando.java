package pratica;
import java.util.Scanner;
import java.util.Random;


public class javinhaPraticando {
    
   static int pontosJogador = 0;
   static int pontosComputador = 0;
    public static void main(String[] args) {


        boolean jogoOn = true;

        while (jogoOn == true) {
           String resultado = gaming(playerChoice(), computerChoice());
           boolean resultadoDoJogo = resultado(resultado);
           jogoOn = resultadoDoJogo;
        }
        
    }

    public static String playerChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha entre pedra papel e tesoura.");
        return scanner.nextLine();
    }


    public static String computerChoice() {
        Random random = new Random();
        String[] computerOptions = {"pedra", "papel", "tesoura"};
        return computerOptions[random.nextInt(0, computerOptions.length)];
    } 


    public static String gaming( String player, String computer) {

        if (player.equals(computer)) {
            System.out.println("Foi empate! Escolha do jogador: "+player+". Escolha do computador: "+computer+".  ");
            return "empate";
        }
        else if(player.equals("pedra") && computer.equals("tesoura")) {
            System.out.println("Você ganhou! Escolha do jogador: "+player+". Escolha do computador: "+computer+".  ");
            return "venceu";
        }
        else if(player.equals("papel") && computer.equals("pedra")) {
            System.out.println("Você ganhou! Escolha do jogador: "+player+". Escolha do computador: "+computer+".  ");
            return "venceu";
        }
        else if(player.equals("tesoura") && computer.equals("papel")) {
            System.out.println("Você ganhou! Escolha do jogador: "+player+". Escolha do computador: "+computer+".  ");
            return "venceu";
        }
        else {
            System.out.println("Você perdeu. Escolha do jogador: "+player+". Escolha do computador: "+computer+".  ");
            return "perdeu";
        }
    }

    public static boolean resultado(String resultadoGaming){

        if (resultadoGaming.equals("venceu")) {
            pontosJogador += 1;

            if (pontosJogador == 3) {
                System.out.println("Você venceu o jogo.");
                System.out.println("Pontos do jogador: "+pontosJogador+".");
                System.out.println("Pontos do computador: "+pontosJogador+".");
                return false;
            }
            else {
                System.out.println("Continuando o  jogo.");
                return true;
            }
        }
        else if (resultadoGaming.equals("perdeu")) {
            pontosComputador += 1;

            if (pontosComputador == 3) {
                System.out.println("Você perdeu o jogo.");
                return false;
            }
            else {
                System.out.println("Continuando o jogo.");
                System.out.println("Pontos do jogador: "+pontosJogador+".");
                System.out.println("Pontos do computador: "+pontosJogador+".");
                return true;
            }
        }
        else {
            System.out.println("Ninguém pontuou.");
            System.out.println("Pontos do jogador: "+pontosJogador+".");
            System.out.println("Pontos do computador: "+pontosJogador+".");
            return true;
        }

    }

}
