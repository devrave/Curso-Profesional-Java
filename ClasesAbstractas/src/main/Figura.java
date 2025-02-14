package main;

public abstract class Figura { // la clase debe ser abstracta si posee tan siquiera un metodo abstracto

    private int numeroLados;

    public Figura(){
        this.numeroLados = 0;
    }


    /* Definir el metodo area como abstracto
    - Primero se debe eliminar el cuerpo del metodo
    */
    public abstract float area(); // Así es un métoso abstracto, ojo la case también debe ser abstracta


}
