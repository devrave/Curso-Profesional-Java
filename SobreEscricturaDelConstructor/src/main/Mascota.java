package main;

import java.lang.ref.SoftReference;

public class Mascota {
    // Clase padre

    public String nombre, raza;
    public int edad;

    //A continuación ls sobreescritura de un constructor en la clase padre y es llamado desde la clase hija con super

    public Mascota(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;

    }


    public void dormir(){
        System.out.println("La mascota duerme");
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getRaza(){
        return raza;
    }

    public void setRaza(String raza){
        this.raza = raza;
    }


    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
}
