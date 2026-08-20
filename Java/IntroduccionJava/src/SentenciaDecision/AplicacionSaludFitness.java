package SentenciaDecision;

import java.util.Scanner;

public class AplicacionSaludFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fitness ***");

        // fundamentos.Constantes
        final var META_PASO_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04;

        // Pedimos valores
        var consola = new Scanner(System.in);

        System.out.print("Cual es tu nombre: ");
        var nombreUsuario = consola.nextLine();

        System.out.print("Cuantos pasos has caminod hoy?: ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        //Verificar si el usuario alcanzo la meta de pasos diarios
        var metaAlcanzado = (pasosDiarios >= META_PASO_DIARIO) ? "Si :)" : "No :(";

        // Calculamos las calorias quemadas
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        // Mostramos la informacion
        System.out.printf("""
                %nUsuario : %s
                Pasos daoos hpy: %d
                Calorias quemadas: %.2f kcal
                Meta de pasos diario alcanzada: %s
                ---------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombreUsuario, pasosDiarios, caloriasQuemadas, metaAlcanzado, META_PASO_DIARIO);


    }
}
