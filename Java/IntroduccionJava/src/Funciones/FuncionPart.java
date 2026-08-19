package Funciones;

import java.util.Scanner;

public class FuncionPart {

    static boolean isPar(int numero){
        return (numero % 2 == 0) ? true : false;

    }
    public static void main(String[] args) {
        System.out.println("Proporciona un valor numerico: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Numero par? " + isPar(numero));
    }
}
