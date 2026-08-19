package Operadores;

import java.util.Scanner;

public class PrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema Prestamo libro ***");

        final var consola = new Scanner(System.in);

        final var DISTANCIA_PERMITIDA_KM = 3;

        System.out.print("Cuentas con credencial de estudiante?: ");
        var tienesCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("A cuanto km vives de la biblioteca?: ");
        var distanciaBibliotecaKM = Integer.parseInt(consola.nextLine());

        var elegiblePrestamo = tienesCredencial || distanciaBibliotecaKM <= DISTANCIA_PERMITIDA_KM;

        System.out.println("Eres elegible para prestamo de libros? " + elegiblePrestamo);
    }
}
