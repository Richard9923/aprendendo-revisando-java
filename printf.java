public class printf {
    
    public static void main(String[] args) {
        

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%3b", myBoolean);
        System.out.printf("%3c", myChar);
        System.out.printf("%3s", myString);
        System.out.printf("%3d", myInt);
        System.out.printf("%3f", myDouble); 

        System.out.printf("Hello %5s", myString);
        System.out.printf("You have this much money %.2f" ,myDouble);

        System.out.printf("You have this much money %,f" ,myDouble);



    }
}
