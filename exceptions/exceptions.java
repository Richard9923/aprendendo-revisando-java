package exceptions;
import java.util.Scanner;
public class exceptions {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
        
        
        System.out.println("Enter a whole number to divide: ");
        int x = scanner.nextInt();

        System.out.println("Enter a whole number to divide: ");
        int y = scanner.nextInt();

        int z = x/y;
        System.out.println("Result: "+z);
        
    }
    catch(ArithmeticException e) {

        System.out.println("You can't divide by zero!");
        }
    catch(java.util.InputMismatchException e) {
        System.out.println("PLEASE ENTER A NUMBER!!");
    }
    catch(Exception e) {
        System.out.println("Something went wrong");

    }
    finally {
        scanner.close();
    }

    }
}
