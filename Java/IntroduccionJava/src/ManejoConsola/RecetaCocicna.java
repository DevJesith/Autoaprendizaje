package ManejoConsola;

import java.util.Scanner;

public class RecetaCocicna {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        // Entradas
        System.out.print("Ingrese el nombre del plato: ");
        var platatillo = consola.nextLine();

        System.out.print("Ingrese los ingredientes: ");
        var ingredientes = consola.nextLine();

        System.out.print("Ingrese el tiempo de preparacion (min): ");
        var tiempo = Integer.parseInt(consola.nextLine());

        System.out.print("Ingrese la dificultad: ");
        var dificultad = consola.nextLine();

        // Resultado
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("Nombre receta: " + platatillo);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparacion: " + tiempo);
        System.out.println("Dificultad: " + dificultad);
    }
}
