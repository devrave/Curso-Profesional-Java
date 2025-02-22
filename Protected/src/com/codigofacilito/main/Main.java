package com.codigofacilito.main;


import com.codigofacilito.cursos.Java;

public class Main {
    public static void main(String[] args) {
     /*
     *Protected: Un elemento protected únicamente podrá ser utilizado
     por clases y objetos que se encuentren en el mismo paquete.
     *  */


        Java java = new Java();

        System.out.println(java.getTitulo());



    }
}