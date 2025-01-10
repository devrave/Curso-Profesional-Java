package main;

public class Main {
    public static void main(String[] args) {
        // While, Nos permite un ciclo de codigo d euna forma repetida hasta que una condición se cumpla


        int contador = 1;
        while (contador < 11){
            System.out.println(contador + " - " + "Hola mundo");
            contador++;
        }

        //Ejemplo 2
        //Cuantos digitos tiene un numero

        int contador1 = 0;
        int numero = 55;

        while (numero > 0){
            // Al dividir el numero * 10 el ultimo numero a la derecha se va descartando
            /*Ejemplo:
                12345 / 10 = 1234 (se descarta el último dígito, 5).
                1234 / 10 = 123 (se descarta el 4).
                123 / 10 = 12 (se descarta el 3).
                12 / 10 = 1 (se descarta el 2).
                1 / 10 = 0 (se descarta el 1).

            * */
            numero = numero / 10;
            contador1++;

        }
        System.out.println("El numero posee " + contador1 + " digitos");



    }
}