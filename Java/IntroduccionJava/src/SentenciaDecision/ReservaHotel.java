package SentenciaDecision;

import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de reserva de hotel ***");

        // Constante
        final var VISTA_AL_MAR = 190.50;
        final var SIN_VISTA_AL_MAR = 150.50;

        // Entradas
        var consola = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        var nombreCliente = consola.nextLine();

        System.out.print("Ingresa los dias de estadia: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("Tiene vista al mar el cuarto (true/false)?: ");
        var isViewMar = Boolean.parseBoolean(consola.nextLine());

        // Operacion
        var total = (isViewMar) ? diasEstadia * VISTA_AL_MAR : diasEstadia * SIN_VISTA_AL_MAR;


        //Resultado
        System.out.printf("""
                ---------- Detalles de la Reservacion ----------
                %nCliente: %s
                Dias de estadia: %s
                Costo total: $%.2f
                Habitacion con vista al mar: %s
                """, nombreCliente, diasEstadia, total,isViewMar ? "Si :)" : "No :)");
    }
}
