package main;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //operadores Aritméticos
        int variableX = 50, variableY = 10;
        int resultado;



        resultado = variableX + variableY;
        System.out.println(resultado);


        resultado = variableX - variableY;
        System.out.println(resultado);

        resultado = variableX * variableY;
        System.out.println(resultado);

        resultado = variableX / variableY;
        System.out.println(resultado);

        variableX += 1;
        System.out.println(variableX);

        //Decrementa
        variableX--;
        System.out.println(variableX);

        // Incrementa
        variableX++;

        System.out.println(variableX);

        // Casting

        float variableZ = 5.5f;
        int variableX1 = 50, variableY2 = 10;
        int resultado1;

        resultado1 = variableX1 + (int)variableZ;
        System.out.println(resultado1);


        boolean resultado3;

        resultado3 = 5 > 5;
        System.out.println(resultado3);




    }
}