public class Main {
    public static void main(String[] args) {
       //Concatenar String
       // El metodo contac solo permite contcatenar dos string
        String nombre = "Andres";
        String apellido = "Cano Rave";
//        String nombreCompleto = nombre.concat(apellido);
//        System.out.println(nombreCompleto);
        // Concatenar con format
        String nombreCompleto = String.format("%s %s", nombre, apellido);
        System.out.println(nombreCompleto);

        //concatenar con el operador +

        String unir = nombre + " " + apellido;
        System.out.println(unir);
    }
}