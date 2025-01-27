package main;

public class Perro {

    // crear variables - atributos,son las caracteristicas de

    String nombre, raza;
    int edad;

    //Parámetros
    // En ocasiones nuestros métodos necesitaran valores de entrada para poder trabajar correctamente

    void establecerAtributos( String nombre, String  raza, int edad){
        nombre = this.nombre;
        raza = this.raza;
        edad = this.edad;
    }


   // vamos a añadir un par de acciones a nuestra clase Perro, recuerda que las acciones son métodos

    void comer(){
        System.out.println("El perro se encuentra comiendo");
    }

    void dormir(){
        System.out.println("El perro se encuentra durmiendo");
    }
    void ladrar(){
        System.out.println("El perro se encuentra ladrando");
    }






}
