package Ciclos;

import java.util.Scanner;

public class DibujarRectangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un triangulo ***");

        var consola = new Scanner(System.in);

        System.out.print("Proporciona el numero de filas: ");
        var numeroFilas = consola.nextInt();

        //Iterar sobre cada fila
        for (var fila = 1; fila <= numeroFilas; fila++) {
            var espacioBlanco = " ".repeat(numeroFilas - fila);
            var asteriscos = "*".repeat(2 * fila - 1);
            System.out.println(espacioBlanco + asteriscos);
        }
    }
}
