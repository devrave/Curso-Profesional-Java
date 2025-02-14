package main;

public class  Triangulo extends Figura {

    private  float  base, altura;


    @Override
    public float area() {
        return (base * altura)/2;
    }
}
