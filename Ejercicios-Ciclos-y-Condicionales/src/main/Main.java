package main;

public class Main {
    public static void main(String[] args) {

        /*
        * Mostrar en consola el mensaje de "Aprobado" en caso la calificación
        * de un alumno sea mayor igual a 70, en caso contrario mostrar el mensaje "Reprobado".
        */
        int calificacion = 89;
        if(calificacion >= 70)
            System.out.println("Abrobado");
        else
            System.out.println("Reprobado");


        /*
        * Dado 3 números enteros, mostrar en consola los números de forma ascendente, de menor a mayor
          Ejemplo Números = 9, 50, 4 Salida = 4, 9, 50
        * */

        int num1 = 106, num2 = 1000, num3 = 1000;

        // comparaciones
        int menor, medio, mayor;
        if(num1 <= num2 && num1 <= num3){
            menor = num1;
            if(num2 <= num3){
                medio = num2;
                mayor = num3;
            }else {
                medio = num3;
                mayor = num2;
            }

        }else if(num2 <= num1 && num2 <= num3){
            menor = num2;
            if(num1 <= num3){
                medio = num1;
                mayor = num3;
            }else {
                medio = num3;
                mayor = num1;
            }

        }else {
            menor = num3;
            if(num1 <= num2){
                medio = num1;
                mayor = num2;
            }else {
                medio = num2;
                mayor = num1;
            }
        }
        // Mostrar resultado
        System.out.println("Números en orden ascendente: " + menor + ", " + medio + ", " + mayor);




        /*
        * imprimir en consola la tabla de multiplicar del número 9.
        */

        for (int i = 1, num = 9; i <= 9; i++){
            int operacion = num * i;
            String resultado = num + " * " + i + " = " + operacion;
            System.out.println(resultado);
        }


        /*Replicar la siguiente salida en consola.
            *
            **
            ***
            ****
            *****
            ******

         */

        int fila = 6;
        for (int i = 0; i < fila; i++){

            for (int j = 0; j <= i; j++){
                System.out.print("*");

            }
            System.out.println(); // Salto de línea después de cada fila
        }


        System.out.println();
        /*
        * Replicar la siguiente salida en consola.
        *
             *
            ***
           *****
          *******
         *********

        * */
        int altura = 5; // Número de filas

        for (int fila1 = 1; fila1 <= altura; fila1++) {
            // Imprimir espacios
            for (int espacio = 1; espacio <= (altura - fila1); espacio++) {
                System.out.print(" ");
            }

            // Imprimir asteriscos
            for (int asterisco = 1; asterisco <= (2 * fila1 - 1); asterisco++) {
                System.out.print("*");
            }

            // Nueva línea después de cada fila
            System.out.println();
        }


         //Imprimir en consola los primero diez números de la serie Fibonacci.

        int n = 10; // Número de términos de la serie que queremos imprimir
        System.out.println("Serie de Fibonacci (iterativa):");
        fibonacciIterativo(n);
    }

    public static void fibonacciIterativo(int n) {
        int a = 0, b = 1; // Los primeros dos términos de la serie
        System.out.print(a + " " + b); // Imprimimos los dos primeros términos

        for (int i = 2; i < n; i++) { // Inicia desde 2 porque los primeros dos ya están impresos
            int siguiente = a + b; // Suma de los dos anteriores
            System.out.print(" " + siguiente);
            a = b; // Actualizamos los valores
            b = siguiente;
        }
        System.out.println(); // Salto de línea al final




//        Dado un número saber si este es primo o no.


    }

}