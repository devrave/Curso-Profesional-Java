package main;

public class Main {
    public static void main(String[] args) {
        //Multiples parametros

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.suma(3,2,3,4,3,2,4,4);
        System.out.println(resultado);

        float resultadoFloat = calculadora.suma(3.6f,2.4f,3.4f);
        System.out.println(resultadoFloat);

        int resultadoDouble = calculadora.suma(3,2,3,4,3,2,4,4);
        System.out.println(resultado);



    }
}