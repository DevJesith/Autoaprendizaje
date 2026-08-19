package Operadores;

import java.util.Scanner;

public class CalcularAreaPerimetro {
    public static void main(String[] args) {
        System.out.println("*** Calcular area y perimetro de un rectangulo ***");

        final var consola = new Scanner(System.in);

        // Datos
        System.out.print("Cuanto es la base del rectangulo?: ");
        var base = Integer.parseInt(consola.nextLine());

        System.out.print("Cuanto es la altura del rectangulo?: ");
        var altura = Integer.parseInt(consola.nextLine());

        //Calculo
        var area = base * altura;
        var perimetro = 2 * (base + altura);

        // Salida
        System.out.printf("""
                Area: %d
                Perimetro: %d
                """, area, perimetro);
    }
}
