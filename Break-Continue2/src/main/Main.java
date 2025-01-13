package main;

public class Main {
    public static void main(String[] args) {
        //Break and Continue

        for (int s = 0; s < 3; s++ ){
            System.out.print("Siguiente " + s +": ");
            for (int j = 0; j < 20; j++){
                if (j == 10){
                    break;
                }
            System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("Ciclo completado");



        //continue, usado principalmente dentro de ciclos, se usa para  saltar a la siguiente iteración con respecto a esa condición
        for (int x = 0; x < 10; x++){
            if (x == 5){
                continue;
            }
            System.out.print(x);
        }

    }





}