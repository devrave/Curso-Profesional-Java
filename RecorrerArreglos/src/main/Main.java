package main;

public class Main {
    public static void main(String[] args) {
        // Recorrer arreglos mediante el ciclo for
        int suma = 0;
        int calificaciones[] = {9, 8, 7, 10, 10, 9, 8, 8, 10, 9};

        // Calcular la suma de las calificaciones
        for (int i = 0; i < calificaciones.length; i++) { //lenght es una propiedad en los arreglos
            suma += calificaciones[i];
        }

        // Imprimir el promedio correctamente
        System.out.println(suma /  calificaciones.length); // Conversión a punto flotante


    }
}