import javax.swing.JOptionPane;


public class praticandoInpuComGUIPanel {
    
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual o seu nome? ");
        JOptionPane.showMessageDialog(null, "Olá "+nome+".");

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?" )) ;
        JOptionPane.showMessageDialog(null, "Você tem "+idade+" anos.");

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua altura? "));
        JOptionPane.showMessageDialog(null, "Você tem "+altura+"cm de altura." );

        String comida = JOptionPane.showInputDialog("Qual a sua comida favorita? ");
        JOptionPane.showMessageDialog(null, "Sua comida favorita: "+comida+".");

        JOptionPane.showMessageDialog(null, "Programa encerrado.");
    }
}
