package main;

public class Main {
    public static void main(String[] args) {
        // Modificadores de acceso / Encapsulamiento
        // Los modificadores de acceso dan mayor restricción a nuestro código
        // En java los modificadores de acceso son 4:

     /*
        Default: cualquier clase, objeto puede hacer uso de los atributo pero que se encuentren del mismo paquete
        public: lo mismo del default pero incluye que puede tener acceso tambien aun siendo de diferente paquete
        private: Solo puede ser usado dentro de la misma clase
        Protected:
      */


        Usuario codi = new Usuario();

        codi.username = "Codi";
        //codi.password = "Pass";

        System.out.println(codi.username);
        //System.out.println(codi.password);

        codi.saluda();




    }
}