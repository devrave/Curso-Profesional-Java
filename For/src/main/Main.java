package main;

public class Main {
    public static void main(String[] args) {
        // Ciclo For
        /* Nos permite ejecutar un bloque de código de forma repetida,
        con este sabremos a ciencia cierta la cantidad de operaciones que se van a realizar
        */
        // For (Inicialización; Condición; iteración ){ }

        int num = 5;

        for(int i = 1; i <= num; i++){
            int resultado = num * i;
            System.out.println(num + " * " + i + " = " + resultado);

        }

        // Ejemplo: numeros pares del 1 al 100
        int numero = 100;
        for (int i = 1; i <= numero; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }

        }

    }
}