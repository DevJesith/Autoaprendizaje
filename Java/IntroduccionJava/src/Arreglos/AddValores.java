package Arreglos;

import java.util.Scanner;

public class AddValores {
    public static void main(String[] args) {
        // Introducir valores a un arreglo
        var consola =  new Scanner(System.in);

        //Declarar el arreglo
        System.out.print("Proporciona el largo del arreglo: ");
        var largoArreglo = Integer.parseInt(consola.nextLine());

        //Creamos de manera dinamicas el arreglo
        var enteros = new int[largoArreglo];

        for (int i = 0; i < largoArreglo; i++) {
            System.out.print("Proporcionar enteros " + i + " = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }

        // Imprimir los valores
        System.out.println("Impresion del Arreglo: ");
        for (int i = 0; i < largoArreglo; i++) {
            System.out.println("enteros " + i + " = " + enteros[i]);
        }
    }
}
