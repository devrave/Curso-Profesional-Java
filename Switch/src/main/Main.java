package main;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        /*  Switch
        * Es más adecuado cuando tienes un conjunto limitado
        * de valores discretos (como números enteros, caracteres, o cadenas
        * específicas).
        * */

        String colorLuz = "Amarillo";

        switch (colorLuz) {
            case "Verde":
                System.out.println("Puede continuar");
                break;
            case "Amarillo":
                System.out.println("Alto parcial");
                break;
            case "Rojo":
                System.out.println("Alto total");
                break;
            default:
                System.out.println("Color no válido");
        }

        // Otro ejemplo con switch, el cual se encuentra disponible a partir de JAVA 12

        char calificacion = 'C';

        switch (calificacion){
            case 'A' -> System.out.println("Excelente");
            case 'B' , 'C' -> System.out.println("Bien hecho");
            case 'D' -> System.out.println("Aprobatorio");
            case 'F' -> System.out.println("Puedes mejorar");
            default ->  System.out.println("Calificación no válida");
        }
    }
}