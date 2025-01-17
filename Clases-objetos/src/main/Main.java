package main;

public class Main {
    public static void main(String[] args) {
        //Clases y objetos

        // De esta manera instanciamos un objeto, la cual ya tiene creada su clase
        // Instanciar es solo crear un nuevo objeto
        Perro lassie = new Perro();
        lassie.edad = 23;
        lassie.nombre = "Lassie";
        lassie.raza = "Collie";

        System.out.println("El nombre es: " + lassie.nombre);
        System.out.println("La raza es : " + lassie.raza);
        System.out.println("La edad es : " + lassie.edad);





    }
}