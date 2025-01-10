package main;

public class Main {
    public static void main(String[] args) {
        //Condicionales
        // if

        String colorLuz = "Verde";
        // recuerda, para comparar dos string usamos equals o equalsIgnoreCase
        if( colorLuz.equals("Verde")){
            System.out.println("Puede continuar");
        }else if(colorLuz.equals("Amarillo")){
            System.out.println("Alto parcial");
        }else if (colorLuz.equals("Rojo")){
            System.out.println("Alto total");
        }else{
            System.out.println("Color no válido");
        }
    }
}