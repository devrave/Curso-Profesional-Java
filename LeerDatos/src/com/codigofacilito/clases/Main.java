package com.codigofacilito.clases;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Clase Scanner

        Scanner sc = new Scanner(System.in);
        System.out.print("Cual es tu nombre: ");
        String nombre = sc.next();

        //nextInt, retorna un valor flotante
        System.out.print("Cual es tu edad: ");
        int  edad = sc.nextInt(); //Integer.parseInt(sc.next());


        //nextFloat, retorna un valor flotante
        System.out.print("Cual es tu altura: ");
        float altura = sc.nextFloat();
        sc.nextLine();

        //nextBoolean, retorna un valor flotante
        System.out.print("El curso es de tu agrado: ");
        boolean boole = sc.nextLine().equalsIgnoreCase("si"); //sc.nextBoolean();

        System.out.println("Hola: " + nombre +  " tu edad es: " + edad + " altura "+ altura + " Valor " + boole);

        sc.close();


    }
}