package main;

public class Perro extends Mascota{
    // clase hija

    public Perro(String nombre, String raza, int edad){
        super(nombre,raza,edad); // De esta manera llamo al constructor padre

    }
    @Override
    public void dormir(){
        System.out.println("El perro duerme");
    }



}
