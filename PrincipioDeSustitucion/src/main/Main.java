package main;

public class Main {
    public static void main(String[] args) {

        /*
        PRINCIPIO DE SUSTITUCION:

        Cuando utilizamos una subclase, es decir, una clase hija como una clase padre

         */

        //Para tener en cuenta, java genera un constructor por defecto

        // Podemos crear un arreglo de Figuras

        Figura figuras[] = new Figura[2];
        Figura circulo = new Circulo(9f);
        Figura triangulo = new Triangulo(10f,5f);

        figuras[0] = circulo;
        figuras[1] = triangulo;

        System.out.println(figuras[0].area());
        System.out.println(figuras[1].area());

        System.out.println(circulo.area());
        System.out.println(triangulo.area());
    }
}


