package main;

public class Usuario {

    //Método getter: Es aquel que retorna el valor de un atributo (para poder acceder)


    // Método setter: Aquel que establece un valor a un atributo (para poder modificar o ingresar valores)


    public String username;
    private String password;

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
