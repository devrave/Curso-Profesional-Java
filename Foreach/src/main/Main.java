package main;

public class Main {
    public static void main(String[] args) {
        // Foreach, nos permite recorres los elementos de una coleccion, en este caso de un arreglo
        //En el foreach, en el for declaramos unavariable que debe ser del mismo tipo del arreglo
        // Luego ponemos : y el arreglo que se va a recorrer.
        int calificaciones[] = {9,8,7,10,10,9,8,8,10,9};

        int suma = 0;

        for (int valorPorIndice : calificaciones){
            suma += valorPorIndice;

        }
        System.out.println(suma / calificaciones.length);
    }
}