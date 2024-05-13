package pratica.programinhaRandom;

public class randomPorgram {
    
    public static void main(String[] args) {
        
        Car car1 = new Car("Camaro", 2020, 30000);
        System.out.println(car1.name);
        System.out.println(car1.year);
        System.out.println(car1.preco);

        car1.go();
        car1.stop();

        Car car2 = new Car("Fusca", 1988, 7000);
        System.out.println(car2.name);
        System.out.println(car2.year);
        System.out.println(car2.preco);

        car2.go();
        car2.stop();

    }

    
    


}
