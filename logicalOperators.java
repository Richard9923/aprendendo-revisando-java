import java.util.Scanner;

public class logicalOperators {

    public static void main(String[] args) {
        
        // Java logical operators 
        // && = (AND) borth conditions must be true
        // || = (OR) either condition must be true
        // ! = (NOT) reverses boolean value of condition

        

    Scanner scanner = new Scanner(System.in);

    System.out.println("You are playing a game! Press q or Q to quit!");
    String response = scanner.next();

    if (response.equals("q") || response.equals("Q")) {
        System.out.println("You quit the game.");
    }
    else{
        System.out.println("You are still playing the game");
    }
    
    } 
}
