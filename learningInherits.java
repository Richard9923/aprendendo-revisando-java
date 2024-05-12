public class learningInherits {
    public static void main(String[] args) {
        

        Car car = new Car();
        Bicycle bike = new Bicycle();

        car.go();
        bike.stop();

        System.out.println(car.speed);
        System.out.println(bike.speed);
    }
}
