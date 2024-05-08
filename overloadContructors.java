public class overloadContructors {
    

    public static void main(String[] args) {
        
        pizza pizza = new pizza("thicc crust", "tomato", "peperonne");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
        
    }


}
