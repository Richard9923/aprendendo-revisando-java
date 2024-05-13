package pratica.programinhaRandom;

public class Car {
    
    String name;
    int year;
    double preco;

    Car (String name, int year, double preco) {
        this.name = name;
        this.year = year;
        this.preco = preco;       
    }
    void go() {
        System.out.println(this.name+ " esta se movendo.");
    }
    void stop() {
        System.out.println(this.name+ " esta parando.");
    }
}
