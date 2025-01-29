package main;




public class Usuario {

    public String username;
    private String password;

    public Usuario(){
        this.password = "";
        this.username = "";

    }

    public Usuario(String username){
        this.password = "";
        this.username = username;

    }

    public Usuario(String username, String password){
        this.password = password;
        this.username = username;

    }



    public void saluda(){
        System.out.println("Hola, mi username es: " + username);
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(){

    }





}
