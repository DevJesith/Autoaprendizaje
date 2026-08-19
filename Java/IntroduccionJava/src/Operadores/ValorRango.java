package Operadores;

import java.util.Scanner;

public class ValorRango {
    public static void main(String[] args) {
        // Definimos los limites
        final var MINIMO = 0;
        final var MAXIMO = 5;

        //Solicitar un favlor entre 0 y 5
        System.out.println("Proporciona un dato entre 0 y 5: ");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine() );

        // Verificar si el dato esta dentro de rango
        var estaDentroRango = dato >= MINIMO && dato<= MAXIMO;
        System.out.println("estaDentroRango = " + estaDentroRango);
    }
}
