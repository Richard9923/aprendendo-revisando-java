package pratica;
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            for(int i = 0; i <=10; i++ ) {
                System.out.println("Contagem : "+i);
                for (int j = 0; j <= 20; j++) {
                    System.out.println("Contagem : "+j);
                    System.out.println("Você quer continuar a contagem? ");
            String encerrarContinuar = scanner.nextLine();
            System.out.println(encerrarContinuar);
            if (encerrarContinuar.equals("n")){
                System.out.println("Contagem encerrada em : "+j);
                break;
            }
            else {
                System.out.println("Contagem continuando...");
            }
      
                    
                }
            }

        }
        
    }
}
