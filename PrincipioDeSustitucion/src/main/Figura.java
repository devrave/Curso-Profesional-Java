package main;

public abstract class Figura { // la clase debe ser abstracta si posee tan siquiera un metodo abstracto

    private int numeroLados;

    public Figura(){
        this.numeroLados = 0;
    }



    public abstract float area();


}
