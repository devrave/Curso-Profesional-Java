package main;

public class Gato extends Mascota {
    // clase hija

    public Gato(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    @Override
    public void dormir(){
        System.out.println("El gato duerme");
    }


}
