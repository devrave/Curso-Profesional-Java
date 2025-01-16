public class Main {
    public static void main(String[] args) {
        // insertar valores

        int valores[] = new int[10];


        // inserción de valores
        for(int indice = 0; indice < valores.length; indice++){
            valores[indice] = indice;
            System.out.println(valores[indice]);
        }

        // impresion de valores
        for(int  valor : valores){
            System.out.println(valor);
        }


    }
}