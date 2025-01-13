package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Do while
        /*
        * Nos permite ejecutar un bloque de codigo hasta que una condicion se cumpla,
        * sin embargo siempre se ejecuta una vez sin importar si la condcición se cumple o no.
        * */

        int contador = 0;
        do{
            System.out.println(contador);
            contador++;
        }
        while (contador < 10);

        //Ejemplo 2:

        Scanner scanner = new Scanner(System.in);
        String password;
        String correctPassword = "12345";

        do {
            System.out.print("Enter your password: ");
            password = scanner.nextLine();
            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password, try again.");
            }
        } while (!password.equals(correctPassword));

        System.out.println("Access granted!");
        scanner.close();
    }
}