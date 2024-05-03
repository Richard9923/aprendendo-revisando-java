public class objectOriented {
    
    public static void main(String[] args) {
        
        Car mycar1 = new Car();

        System.out.println(mycar1.marca);
        System.out.println(mycar1.nome);
        System.out.println(mycar1.ano);
        System.out.println(mycar1.preco);

        mycar1.dirigir();
        mycar1.parar();


    }

}
