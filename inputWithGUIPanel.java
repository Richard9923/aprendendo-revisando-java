
import javax.swing.JOptionPane;

public class inputWithGUIPanel {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name.");
        JOptionPane.showMessageDialog(null, "Hello "+name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age."));
        JOptionPane.showMessageDialog(null, "You have "+age+" years old.");




    }
    
}
