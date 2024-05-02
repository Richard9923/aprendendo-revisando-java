
import javax.swing.JOptionPane;
import java.util.Scanner;


public class revisangoGUIpanel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa iniciado. ");
        
        String nome = JOptionPane.showInputDialog("Qual o seu nome? ");
        JOptionPane.showMessageDialog(null, "Olá "+nome);

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade? "));
        JOptionPane.showMessageDialog(null, "Você tem "+idade+" anos. ");

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura? "));
        JOptionPane.showMessageDialog(null, "Você tem "+altura+ "cm de altura.");

        System.out.println("Programa encerrado.");

    }
}
