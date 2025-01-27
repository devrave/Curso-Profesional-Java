package main;

public class Usuario {

     /*
        Default: cualquier clase, objeto puede hacer uso de los atributo pero que se encuentren del mismo paquete
        public: lo mismo del default pero incluye que puede tener acceso tambien aun siendo de diferente paquete
        private: Solo puede ser usado dentro de la misma clase
        Protected
      */

    public String username;
    private String password;

    void saluda(){
        System.out.println("Hola, mi username es: " + this.username);
    }
}
