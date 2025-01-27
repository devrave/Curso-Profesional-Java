package main;

public class Main {
    public static void main(String[] args) {
   // Modificadores de acceso
        Usuario codi = new Usuario();

        codi.username = "Codi";
        //codi.password = "Pass";
        codi.setPassword("Passt");

        System.out.println(codi.username);
        System.out.println(codi.getPassword());

        codi.saluda();
    }
}