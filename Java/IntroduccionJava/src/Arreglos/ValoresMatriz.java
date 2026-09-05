package Arreglos;

import java.util.Scanner;

public class ValoresMatriz {
    public static void main(String[] args) {
        // Introducir valores a una matriz
        int renglones, columnas;

        var consola = new Scanner(System.in);

        //Definir la matriz
        System.out.println("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());

        var matriz = new int[renglones][columnas];

        //Solicitar los valores
        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }

        }

        // Iterar los valores
        for (int ren = 0; ren < renglones; ren++) {
            for (int col = 0; col < columnas; col++) {
                System.out.println("Matri[" + ren + "][" + col + "] = " + matriz[ren][col]);

            }

        }
    }
}
