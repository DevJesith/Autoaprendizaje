package Funciones;

public class FuncionesRecursiva {

    //Funcion Recursiva
    static void funcionRecursiva(int numero){

        //Caso Base
        if (numero == 1)
            System.out.println(numero + " ");
        else {
            //Caso recusirva
            funcionRecursiva(numero - 1);
            System.out.println(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
