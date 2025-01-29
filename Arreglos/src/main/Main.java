package main;

public class Main {
    public static void main(String[] args) {
        //Arreglos

        // Declarar un arreglo en java, se representan mediante corchetes

        String nombres[]; //Declaración de un arreglo
        nombres = new String[3]; //inicializado de un arreglo


        nombres[0] = "Andres";
        nombres[0] = "Andres1";
        nombres[1] = "Andres2";
        nombres[0] = "Andres8";
        nombres[2] = "Andres8";
        //Lectura

        System.out.println(nombres[0] );
        System.out.println(nombres[1] );
        System.out.println(nombres[2] );

        // Null: No es un tipo de dato ni un objeto, este representa la ausencia de un valor.

        //otra manera de definir un arreglo
        String[] empresas = new String[2];
        empresas[0] = "procopal";
        empresas[1] ="pavimentar";
        System.out.println(empresas[0]);
        System.out.println(empresas[1]);

       // tercera manera de definir un arreglo en java,
       // Colocando los valores directamente en la declaración, esto es por ya conocemos los valores

        String apellidos[] = {
                "Andres",
                "Juan"
        };

        System.out.println(apellidos[0]);
        System.out.println(apellidos[1]);
    }
}