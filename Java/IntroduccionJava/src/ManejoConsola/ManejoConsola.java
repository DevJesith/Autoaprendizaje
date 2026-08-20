package ManejoConsola;

import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        // Introduccir valores por consola
        Scanner scanner = new Scanner(System.in); // in - input - entrada de datos
        System.out.println("Ingrese su nombre: ");
        var nombre = scanner.nextLine();
        System.out.println("nombre: " + nombre);

    }
}
