package main;

public class Main {

    public static void main(String[] args){
        String [] nombres = {"Juan","Carlos","Pedro"};
        showElements(nombres);

    }

    public static void showElements(String[] array){
        for(String element : array){
            System.out.println(element);
        }
    }


}
