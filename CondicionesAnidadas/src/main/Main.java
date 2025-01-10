package main;

public class Main {
    public static void main(String[] args) {
        // Condiciones Anidadas
        /*
        * Ejercicio
        * El promedio mínimo de aprobar es de 7
        * Si el promedio es de diez = Muchas felicidades
        * Si el promedio es aprobatorio pero menor a diez = Felicidades
        * Si el promedio no es aprobatorio = Es necesario repasar bloques
        * */

        int promedio = 11;

        if (promedio >= 7) {
            if (promedio == 10) {
                System.out.println("¡Muchas felicidades! Obtuviste un promedio perfecto.");
            } else {
                System.out.println("¡Felicidades! Aprobaste.");
            }
        } else {
            System.out.println("Es necesario repasar bloques.");
        }

    }
}