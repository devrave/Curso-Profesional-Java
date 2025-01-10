package main;

public class Main {
    public static void main(String[] args) {
        // Escope

        // promedio es una varibale que puedo utilizar en el main
        int promedio = 10;

        if (promedio > 7){
            // variable promedio solo la puedo utilizar en el bloque de la codicion if
            String mensaje = "Felicidades, tu promedio es de " + promedio;

            if (promedio == 10){
                System.out.println(mensaje);

            }

        }
    }
}