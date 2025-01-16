package main;

public class Main {
    public static void main(String[] args) {
        // Matriz, es una tabla que posee filas y columnas
        // arreglos bidimensionales, arreglos de dos dimensiones

        // Estructura de matrices: tipo de dato nombre de matriz [][]

        int matriz [][] = new int [4][3];

        int contador = 0;
        for (int filas = 0; filas < matriz.length; filas++){
            for(int columnas = 0; columnas < matriz[filas].length; columnas++){
               contador++;
               matriz[filas][columnas] =  contador;


            }
        }


//        matriz[0][0] = 1;
//        matriz[0][1] = 2;
//        matriz[0][2] = 3;
//
//        matriz[1][0] = 4;
//        matriz[1][1] = 5;
//        matriz[1][2] = 6;
//
//        matriz[2][0] = 7;
//        matriz[2][1] = 8;
//        matriz[2][2] = 9;
//
//        matriz[3][0] = 10;
//        matriz[3][1] = 11;
//        matriz[3][2] = 12;


        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length;j++){

                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println();

        // Foreach para arreglos bidimensionales

        for ( int fila[] : matriz ){
            for(int celda : fila){
                System.out.print(celda + " ");

            }

            System.out.println();

        }



    }
}