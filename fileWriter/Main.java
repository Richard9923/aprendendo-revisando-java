package fileWriter;
import java.io.FileWriter;


public class Main {
    public static void main(String[] args) {   

        try {
            FileWriter writer = new FileWriter("poem.txt");
            writer.write("Roses are red \n Violets are blue ");
            writer.close();

            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
