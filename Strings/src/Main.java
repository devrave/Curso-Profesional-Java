import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // String = clase -> tipo de dato por referencia


        String mensaje = "Hola soy un string";
        String mensaje2 = new String("Texto");
       // Mñetodo length : longitud de una variable
        int longitud = mensaje.length();
        System.out.println(longitud);

        //Metodo contains : si un String contiene un substring
        //Ejemplo

        boolean contiene = mensaje.contains("Hola");
        System.out.println(contiene);

        // Metodo startsWith -> si un substring empieza
        System.out.println("---------------------------------------");
        System.out.println(mensaje.startsWith("Hola"));

        // Metodo endtsWith -> si un substring termina
        System.out.println(mensaje.endsWith("string"));

        // Metodo para unir un string (concatenar)

        String unionMensaje = mensaje.concat(" estamos en el curso de java");
        System.out.println(unionMensaje);


        //Metodos para dar formatos a nuestro String

        // toUpperCase() -> convertir a mayuscula
        String message = "Hola, soy un String     ";
        System.out.println(message);
        System.out.println(message.toUpperCase());

        // toLowerCase() -> convertir a minuscula
        System.out.println(message.toLowerCase());

        //trim -> para remover los espacios al inicio o al final del texto
        String espacio = message.trim();
        System.out.println(message.length());
        System.out.println(espacio.length());

        //Metodo format -> permite generar nuevos strings a partir de diferentes tipos de datos
        //Example 1
        String mensajeFormat = "";
        mensajeFormat = String.format("Hola como estas %s", "Andres");
        System.out.println(mensajeFormat);

        //Example 2
        float number = 23.54f;
        mensajeFormat = String.format("%.2f", number);
        System.out.println(mensajeFormat);
        // %d para enteros, %s para string, %f para flotantes, %b para booleano

        float pi = 3.14159265359f;

        String resultado = String.format("%1f - Decimales: %.2f", pi, pi);
        System.out.println(resultado);

        // Comparar cadenas con ayuda de los metodos -> iquals / equalsIgnoreCase
        // equals()
        //Sensible a mayúsculas y minúsculas.
        //Compara el contenido exacto de las cadenas, incluyendo las diferencias de caso.

        String cadena1 = "Hola";
        String cadena2 = "hola";

        // combinacion de equal con metodos de u
        boolean cadena =  cadena1.toUpperCase().equals(cadena2.toUpperCase());
        System.out.println(cadena);


        // equalsIgnoreCase()
        //No es sensible a mayúsculas y minúsculas.
        //Compara el contenido de las cadenas, ignorando si los caracteres están en mayúsculas o minúsculas.

        System.out.println(cadena1.equalsIgnoreCase(cadena2)); // true




















    }
}