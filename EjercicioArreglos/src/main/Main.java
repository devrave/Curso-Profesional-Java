package main;

public class Main {
    public static void main(String[] args) {
        // Ejercicio arreglos


        // numeros random
       int [] numeroGrande = new int [100];

       for (int i = 0; i < numeroGrande.length;i++){
           numeroGrande[i] = (int)(Math.random() * 100);
        System.out.print(numeroGrande[i] + " ");
       }
        System.out.println();

        for (int i = 0; i < numeroGrande.length;i++) {
            System.out.print(numeroGrande[i] + " ");


        }



       // for normal
        int [] numeros ={10,20,30,40,50};
        for(int i = 0; i < numeros.length;i++){
            System.out.print(numeros[i] + " ");

        }
        System.out.print("\\ ");

        int [] sumaNumeros = {1,2,3,4,5};
        int suma = 0;
        for (int i = 0; i < sumaNumeros.length; i++){
            suma += sumaNumeros[i];
        }
        System.out.println(suma);

        // Numero mayor y numero menor

        int [] rango = {3,5,6,2,76,85,23,5};

        int numMayor = rango[0];
        int numMenor = rango[0];

        for (int i = 0; i < rango.length; i++){
            if (rango[i] > numMayor){
                numMayor = rango[i];
            }
            if (rango[i] < numMenor){
                numMenor = rango[i];

            }
        }

        System.out.println("Numero mayor es: " + numMayor);
        System.out.println("Numero menor es: " + numMenor);





        // Numeros pares

        int [] numPares = {3,8,12,5,7,10};

        for(int i = 0; i < numPares.length; i++) {
            if (numPares[i] % 2 == 0) {
                System.out.print(numPares[i] + " ");
            }
        }

        System.out.println();
        //Numeros invertidos

        int[] numerosInvertidos = {1, 2, 3, 4, 5};
        for(int i = numerosInvertidos.length - 1; i >= 0; i--){
            System.out.print(numerosInvertidos[i]);


        }


        System.out.println();
        System.out.println();





        // foreach
        for (int numero : numeros){
            System.out.print(numero + " ");
        }

        System.out.print("\\ ");

        int [] sumaNumero = {1,2,3,4,5};
        int acum = 0;
        for(int num  : sumaNumero){
            acum += num;
        }
        System.out.println(acum);

        // Numeros pares

        int [] pares = {2,4,8,5,2,6,4};
        for (int i = 0; i < pares.length; i++){
            if (pares[i] % 2 == 0){
                boolean repetido = false;
                for(int j = 0; j < i; j++){
                    if(pares[i]== pares[j]){
                        repetido = true;
                    }

                }
                if(!repetido){
                    System.out.print(pares[i] + " ");

                }
            }

        }

    }
}