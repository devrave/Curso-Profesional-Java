package main;

public class Main {
    public static void main(String[] args) {

        // "Super" hace referencia a la clase padre

        Gato gato = new Gato("gato", "raza",2);
        Perro perro = new Perro("perro","raza",5);



        gato.dormir();
        perro.dormir();



    }
}