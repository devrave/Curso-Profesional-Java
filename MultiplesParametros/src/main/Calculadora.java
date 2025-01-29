package main;

public class Calculadora {

    //Multiples parametros

    public  int suma(int... numeros){ //n -> int Arregllo
        int suma = 0;
        System.out.println(numeros.length);
        for (int numero: numeros)
            suma += numero;

        return suma;
    }


    public float suma(float... numeros){
        float suma = 0;
        for(float numero : numeros)
            suma += numero;

        return suma;
    }


    public double suma(double... numeros){
        double suma = 0;
        for(double numero : numeros)
            suma += numero;

        return suma;
    }
}
