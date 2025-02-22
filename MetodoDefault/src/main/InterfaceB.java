package main;

public interface InterfaceB {

    public abstract void mostrarMensaje();

    //Estructura de un metodo default

    // se pone tipo de modificador, default, tipo de dato de retorno, nombre

    public default void saluda(){
        System.out.println("Saludos a mi amigo desde una interfaz");
    }
}
