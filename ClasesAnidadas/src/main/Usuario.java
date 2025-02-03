package main;

public class Usuario {

    // Clases anidadas, son clases dentro de otras clases
    public String username;

    public Usuario(String username){
        this.username = username;
    }

    public void establecerRol(){
        Administrador admin = new Administrador();
        admin.trabajar();

    }

    public class Administrador{
        public void trabajar(){
            System.out.println("El administrador " + username +" se encuentra trabjando!");
        }
    }

}
