package main;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Sobrecarga de métodos

         /*Es la posibilidad que tiene un lenguaje de programación de definir
         dos o más métodos con el mismo nombre en la misma clase

         Esto nace con el fin de que tengan comportamientos distintos.
        */

        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.suma(10.6,20);
        System.out.println("El resultado es : " + resultado);







    }
}