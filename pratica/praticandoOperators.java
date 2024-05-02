package pratica;

public class praticandoOperators {
    public static void main(String[] args) {
        String jogar = "sair";
        String dia = "sabado";

        if (jogar == "sim" && dia == "sabado" ) {
            System.out.println("Você pode jogar.");
        }
        else if (jogar == "sair" || jogar == "quit") {
            System.out.println("Jogo encerrado.");

        }
        else if (jogar != "sair" && dia.equals("sabado")) {
            System.out.println("Vamos continuar o jogo.");
        }
        else{
            System.out.println("Hoje não");
        }
    }
}
