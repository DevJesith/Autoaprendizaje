package Arreglos;

import java.util.Scanner;

public class SumaDiagonal {
    public static void main(String[] args) {
        System.out.println("*** Suma Diagonal ***");

        //Entrada
        var consola = new Scanner(System.in);

        int renglones, columnas;

        System.out.print("Ingresa el numero de renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa el numero de columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];

        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }

        int suma = 0;

        // Un solo bucle para la diagonal: ren y col avanzan al mismo tiempo (i, i)
//        for (int i = 0; i < renglones; i++) {
//            System.out.println("Matriz[" + i + "][" + i + "] = " + matriz[i][i]);
//            suma += matriz[i][i];
//        }

        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {

                if (ren == col){
                    suma += matriz[ren][col];
                }
            }
        }

        System.out.println("\nLa suma total de la diagonal es: " + suma);

    }
}
