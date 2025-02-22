package main;

public class Main {
    public static void main(String[] args) {
        //Clases y objetos

        // De esta manera instanciamos un objeto, la cual ya tiene creada su clase
        // Instanciar es solo crear un nuevo objeto
        Perro lassie = new Perro();
//        lassie.edad = 23;
//        lassie.nombre = "Lassie";
//        lassie.raza = "Collie";

        // Cuando llamamos a un metodo de un objeto que tiene parametros, se les debe poner los argumentos
        lassie.establecerAtributos("lassie", "Collie",4);

        hola.out.println("El nombre es: " + lassie.nombre);
        hola.out.println("La raza es : " + lassie.raza);
        System.out.println("La edad es : " + lassie.edad);

        lassie.comer();

        Perro juana = new Perro();
        juana.comer();

        Perro maya = new Perro();
        maya.ladrar();
        maya.comer();
        maya.dormir();









    }
}