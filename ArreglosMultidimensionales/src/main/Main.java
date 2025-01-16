package main;

public class Main {
    public static void main(String[] args) {
        //Arreglos Multidimensionales
        //Es un arreglo de arreglos de 3 a mas dimensiones

        int calificaciones[][] = new int [5][];

        calificaciones[0] = new int [1]; // E
        calificaciones[1] = new int [2]; // A
        calificaciones[2] = new int [3]; // D
        calificaciones[3] = new int [4]; // B
        calificaciones[4] = new int [5]; // C

        calificaciones[0][0] = 8;

        calificaciones[1][0] = 3;
        calificaciones[1][1] = 5;

        calificaciones[2][0] = 7;
        calificaciones[2][1] = 5;
        calificaciones[2][2] = 6;

        calificaciones[3][0] = 8;
        calificaciones[3][1] = 5;
        calificaciones[3][2] = 7;
        calificaciones[3][3] = 6;

        calificaciones[4][0] = 6;
        calificaciones[4][1] = 7;
        calificaciones[4][2] = 9;
        calificaciones[4][3] = 4;
        calificaciones[4][4] = 2;

        for(int[] alumno : calificaciones ){
            for(int nota : alumno){
                System.out.print(nota + " ");

            }
            System.out.println();
        }







    }
}