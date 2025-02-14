package main;

public class Gato extends Mascota {
    // clase hija

    public Gato(String nombre, String raza, int edad){
        super(nombre,raza,edad); // De esta manera llamo al constructor padre
    }

    @Override
    public void dormir(){
        System.out.println("El gato duerme");
    }


}
