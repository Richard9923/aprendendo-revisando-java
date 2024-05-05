public class objectOriented {
    
    public static void main(String[] args) {
        
        Car mycar1 = new Car();
        celular celular1 = new celular();

        System.out.println(celular1.marca);
        System.out.println(celular1.nome);
        System.out.println(celular1.preco);

        celular1.ligar();
        celular1.desligar();

        System.out.println(mycar1.marca);
        System.out.println(mycar1.nome);
        System.out.println(mycar1.ano);
        System.out.println(mycar1.preco);

        mycar1.dirigir();
        mycar1.parar();

        


    }

}
