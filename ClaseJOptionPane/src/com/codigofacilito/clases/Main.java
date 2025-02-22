package com.codigofacilito.clases;

import javax.swing.JOptionPane;
public class Main {

    public static void main(String[] args) {


        // OJO: showInputDialog simpre retorna un String y se manejan entradas
        String nombre = JOptionPane.showInputDialog(null, "Cual es tu nombre? ");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Cual es tu edad? "));

        // para dar salida con JOPtionPane

        String mensaje = "Hola " + "mi nombre es " + nombre + " y tengo " + edad + " años";
        JOptionPane.showMessageDialog(null,mensaje);



        System.out.println(nombre);
        System.out.println(edad);


    }
}