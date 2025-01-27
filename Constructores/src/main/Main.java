package main;

public class Main {
    public static void main(String[] args) {
        // Constructores
        Usuario codi = new Usuario("Codi","Passt");


//        codi.username = "Codi";
        //codi.password = "Pass"; // no es de acceso publico, por ende se debe acceder por medio de set y get
//        codi.setPassword("Passt");

        System.out.println(codi.username);
        System.out.println(codi.getPassword());

        codi.saluda();


    }
}