package main;

public class Usuario {
    public String username;
    private String password;

    //Constructor: Este en java tiene la finalidad de inicializar un objeto durante su creación
    // Es sintaticamente similar a un método
    // El constructor tendrá por nommbre el mismo de la clase

    public Usuario(String nusername, String password){
        this.username = nusername;
        this.password = password;
    }

    public void saluda(){
        System.out.println("Hola, mi username es: " + this.username);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;

    }
}
