import javax.swing.plaf.ScrollPaneUI;

public class Main {
    public static void main(String[] args) {
        //String como cadenas en java

        // Para saber la longitud se la cadena con el metodo lenght()
        String mensaje = "Estamos practicando java";
        System.out.println(mensaje.length());

        // obtener un carácter con respecto a su índice utilizando el método charAt()
        String hola = "Hola mundo";
        System.out.println(hola.charAt(9));

        /*Si no conocemos en que índice se encuentra un caracter, haremos uso de los
        métodos indexOf (Busca de izquierfa a derecha) o lastIndexOf (Busca de derecha a izquierda).
        */
        int lastChar = hola.lastIndexOf("o");
        System.out.println(lastChar);

        int firstChar = hola.indexOf("o");
        System.out.println(firstChar);

        /*
        Si queremos que la búsqueda comience a partir de un índice, colocaremos un segundo argumento,
        el índice a partir del cual se iniciará la búsqueda.
        */

        String mensaje1 = "Este mensaje posee muchas letras a";
        int indicePrimeraA = mensaje1.indexOf("a");
        System.out.println(indicePrimeraA);
        int indiceSegundaA = mensaje1.indexOf("a",indicePrimeraA +1);
        System.out.println(indiceSegundaA);

        //Si queremos obtener un sub String nos apoyaremos del método substring

        String mensaje2 = "Hola Mundo";
        int indiceLetraM = mensaje2.indexOf("M");


        String subString = mensaje2.substring(indiceLetraM);
        System.out.println(subString);

        //String.substring(indiceInicial, indiceFinal) retornar un sub String a partir del índice indicado hasta el índice final.
        String mensaje3 = "Hola Mundo";
        int indiceLetraM1 = mensaje3.indexOf("M");

        String subString1 = mensaje3.substring(indiceLetraM1, indiceLetraM1 + 2);
        System.out.println(subString1);




    }
}