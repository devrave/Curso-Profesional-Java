package main;

public class Main {
    public static void main(String[] args) {
        // Herencia

        Gato gato = new Gato("gato", "raza",2);
        Perro perro = new Perro("perro", "raza",2);

        gato.dormir();
        perro.dormir();


    }
}