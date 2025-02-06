package main;

public class Main {
    public static void main(String[] args) {

        //Van a existir ocasiones en que los métodos de la clase padre no satisfaga las
        // necesidades de las clases hijas

        /*Polimorfismo o SobreEscritura de métodos:
        No es mas que la clase hija tome un metodo de la clase padre y
        la implemente de otra manera
        */


        Gato gato = new Gato("gato", "raza",2);
        Perro perro = new Perro("perro","raza",5);



        gato.dormir();
        perro.dormir();


    }
}