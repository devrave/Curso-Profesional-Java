package main;

public class Circulo {

    // Refactoricemos este código, mejorarlo

    /*
    public float pi = 3.14151926535f;
    public float radio = 0f;

    public Circulo(float radio){
        this.radio = radio;
    }

    public float area(){
        return pi * (radio * radio);
    }

     */

    // Al poner pi con static podemos hacer uso de este sin la necesidad de crear una instancia de la clase circulo

    public static final float pi = 3.14151926535f; // Al ser static este atributo le pertenece a la clase y no al objeto
    public float radio = 0f;

    public Circulo(float radio){
        this.radio = radio;
    }

    public static float area(float radio){
        return Circulo.pi * (radio * radio);
    }



}
