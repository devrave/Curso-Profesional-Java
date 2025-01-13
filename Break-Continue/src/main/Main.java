package main;

public class Main {
    public static void main(String[] args) {
        // Break and Continue, sentencias de salto,
        // return tambien es una pero luego la veremos

        // Break tiene 3 usos,
        // 1- nos permite terminar una secuencia de instrucciones
        // 2- Nos permite salir de un ciclo (while, do-while, for)
        // foamr civilizada de goto "luego lo veremos"
        int valor = 10;

        switch (valor){

            case 10:
                System.out.println("Es 10");
                break;
            default:
                System.out.println("No es 10");

        }

        for (int i = 1; i < 101; i++){
            if (i == 50){
                break;
            }
            System.out.println(i);

        }
        System.out.println("Ciclo completado");





    }
}